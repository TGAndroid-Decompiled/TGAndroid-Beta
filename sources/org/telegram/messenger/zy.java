package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c80;
public final class zy extends c1 implements fs {
    public static final q5 J = new q5("mediaSendQueue");
    public static final ThreadPoolExecutor K;
    public static volatile zy[] L;
    public final a0.h E;
    public final HashMap F;
    public final HashMap G;
    public final a8.b8 H;
    public final HashMap I;
    public final HashMap f28477a;
    public final SparseArray f28478b;
    public final SparseArray f28479c;
    public final SparseArray d;
    public final SparseArray f28480e;
    public final a0.h f28481f;
    public final a0.h h;
    public final HashMap f28482n;
    public final HashMap f28483r;
    public final HashMap f28484s;
    public final HashMap f28485w;
    public final a0.h f28486x;
    public final HashMap f28487y;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        K = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        L = new zy[4];
    }

    public zy(int i7) {
        super(i7);
        this.f28477a = new HashMap();
        this.f28478b = new SparseArray();
        this.f28479c = new SparseArray();
        this.d = new SparseArray();
        this.f28480e = new SparseArray();
        this.f28481f = new a0.h();
        this.h = new a0.h();
        this.f28482n = new HashMap();
        this.f28483r = new HashMap();
        this.f28484s = new HashMap();
        this.f28485w = new HashMap();
        this.f28486x = new a0.h();
        this.f28487y = new HashMap();
        this.E = new a0.h();
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = new a8.b8(new hi.u0(this, 29));
        this.I = new HashMap();
        g0.g3(new xr(this, 12));
    }

    public static void B0(TLRPC.Message message, SerializedData serializedData) {
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia == null) {
            new TLRPC.TL_messageMediaEmpty().serializeToStream(serializedData);
        } else {
            messageMedia.serializeToStream(serializedData);
        }
        String str = message.message;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        serializedData.writeString(str);
        String str3 = message.attachPath;
        if (str3 != null) {
            str2 = str3;
        }
        serializedData.writeString(str2);
        int size = message.entities.size();
        serializedData.writeInt32(size);
        for (int i7 = 0; i7 < size; i7++) {
            message.entities.get(i7).serializeToStream(serializedData);
        }
    }

    public static zy C(int i7) {
        zy zyVar;
        zy zyVar2 = L[i7];
        if (zyVar2 == null) {
            synchronized (zy.class) {
                try {
                    zyVar = L[i7];
                    if (zyVar == null) {
                        zy[] zyVarArr = L;
                        zy zyVar3 = new zy(i7);
                        zyVarArr[i7] = zyVar3;
                        zyVar = zyVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return zyVar;
        }
        return zyVar2;
    }

    public static String D(c cVar, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z10, boolean z11) {
        String str;
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        PointF Q1 = org.telegram.ui.Cells.r1.Q1(photoSize.f28517w, photoSize.h, 0, 0);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                w7.G(cVar.f23343a);
                File J2 = w7.J(photoSize, null, z11, true);
                FileInputStream fileInputStream = new FileInputStream(J2);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / Q1.x, options.outHeight / Q1.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(J2);
                bitmapArr[0] = BitmapFactory.decodeStream(fileInputStream2, null, options);
                fileInputStream2.close();
            } catch (Throwable unused) {
            }
        }
        Locale locale = Locale.US;
        if (z10) {
            str = "%d_%d@%d_%d_b";
        } else {
            str = "%d_%d@%d_%d";
        }
        return String.format(locale, str, Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (Q1.x / g0.f24225p)), Integer.valueOf((int) (Q1.y / g0.f24225p)));
    }

    public static long E() {
        long j3 = 0;
        while (j3 == 0) {
            j3 = Utilities.f22875b.nextLong();
        }
        return j3;
    }

    public static TLRPC.PhotoSize G(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i7);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoPathSize) && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && photoSize.location != null) {
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        return photoSize;
                    }
                    TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                    tL_photoSize_layer127.type = photoSize.type;
                    tL_photoSize_layer127.f28517w = photoSize.f28517w;
                    tL_photoSize_layer127.h = photoSize.h;
                    tL_photoSize_layer127.size = photoSize.size;
                    byte[] bArr = photoSize.bytes;
                    tL_photoSize_layer127.bytes = bArr;
                    if (bArr == null) {
                        tL_photoSize_layer127.bytes = new byte[0];
                    }
                    TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                    tL_photoSize_layer127.location = tL_fileLocation_layer82;
                    TLRPC.FileLocation fileLocation = photoSize.location;
                    tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                    tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                    tL_fileLocation_layer82.local_id = fileLocation.local_id;
                    tL_fileLocation_layer82.secret = fileLocation.secret;
                    return tL_photoSize_layer127;
                }
            }
            return null;
        }
        return null;
    }

    public static CharSequence H(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        CharSequence n1 = g0.n1(charSequence);
        if (n1.length() == 0) {
            return n1;
        }
        while (charSequence.length() > 0 && charSequence.charAt(0) == '\n') {
            charSequence = charSequence.subSequence(1, charSequence.length());
        }
        while (charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            charSequence = charSequence.subSequence(0, charSequence.length() - 1);
        }
        return charSequence;
    }

    public static void K(java.util.ArrayList r96, final long r97, boolean r99, boolean r100, boolean r101, final org.telegram.messenger.c r102, long r103, final org.telegram.messenger.fj r105, final org.telegram.tgnet.TLRPC.TL_inputPollAnswer r106, final org.telegram.messenger.fj r107, final org.telegram.messenger.fj r108, final boolean r109, final int r110, final int r111, final org.telegram.tgnet.tl.TL_stories.StoryItem r112, final org.telegram.ui.rm r113, final org.telegram.messenger.bw r114, final long r115, final boolean r117, final long r118, final long r120, final org.telegram.messenger.kj r122, final sh.f r123, boolean r124, org.telegram.ui.Cells.aa r125, final boolean r126) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zy.K(java.util.ArrayList, long, boolean, boolean, boolean, org.telegram.messenger.c, long, org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, org.telegram.messenger.fj, org.telegram.messenger.fj, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.rm, org.telegram.messenger.bw, long, boolean, long, long, org.telegram.messenger.kj, sh.f, boolean, org.telegram.ui.Cells.aa, boolean):void");
    }

    public static void R(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j3, fj fjVar, fj fjVar2, org.telegram.ui.rm rmVar, boolean z10, int i7, int i10, bw bwVar, long j10, long j11, long j12) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        int i11 = 0;
        richMessage.rtl = false;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
            if (pageBlock != null) {
                richMessage.blocks.add(pageBlock);
            }
        }
        if (richMessage.blocks.isEmpty()) {
            return;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            richMessage.photos.addAll(arrayList2);
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            richMessage.documents.addAll(arrayList3);
        }
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList<TL_iv.PageBlock> arrayList5 = richMessage.blocks;
        int size2 = arrayList5.size();
        while (i11 < size2) {
            TL_iv.PageBlock pageBlock2 = arrayList5.get(i11);
            i11++;
            j(pageBlock2, identityHashMap);
        }
        xy c10 = xy.c(null, null, null, null, null, null, null, null, null, null, j3, null, fjVar, fjVar2, null, true, null, null, null, null, z10, i7, i10, 0, null, null, false, false);
        c10.Y = richMessage;
        c10.Z = arrayList4;
        c10.J = rmVar;
        c10.K = bwVar;
        c10.O = j10;
        c10.R = j11;
        c10.Q = j12;
        C(cVar.f23343a).r0(c10);
    }

    public static void S(final int i7, final long j3, final long j10, final long j11, final HashMap hashMap, final c cVar, final fj fjVar, final fj fjVar2, final bw bwVar, final TLRPC.BotInlineResult botInlineResult, final TL_stories.StoryItem storyItem, final org.telegram.ui.ActionBar.g2 g2Var, final org.telegram.ui.rm rmVar, final boolean z10) {
        xy d;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult == null) {
            return;
        }
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    String k10;
                    String str;
                    boolean z11;
                    char c10;
                    long j12;
                    char c11;
                    final String str2;
                    TLRPC.TL_document tL_document;
                    TLRPC.TL_photo tL_photo;
                    int i10;
                    Bitmap K2;
                    String str3;
                    int lastIndexOf;
                    int i11;
                    String str4;
                    TLRPC.BotInlineResult botInlineResult2;
                    TLRPC.TL_document tL_document2;
                    int i12;
                    TLRPC.InputPeer inputPeer;
                    long j13;
                    TLRPC.InputPeer inputPeer2;
                    boolean z12;
                    TLRPC.WebDocument webDocument;
                    long j14 = j3;
                    boolean C = n5.C(j14);
                    TLRPC.BotInlineResult botInlineResult3 = botInlineResult;
                    boolean equals = "game".equals(botInlineResult3.type);
                    final c cVar2 = cVar;
                    if (equals) {
                        if (!C) {
                            TLRPC.TL_game tL_game = new TLRPC.TL_game();
                            tL_game.title = botInlineResult3.title;
                            tL_game.description = botInlineResult3.description;
                            tL_game.short_name = botInlineResult3.f28490id;
                            TLRPC.Photo photo = botInlineResult3.photo;
                            tL_game.photo = photo;
                            if (photo == null) {
                                tL_game.photo = new TLRPC.TL_photoEmpty();
                            }
                            TLRPC.Document document = botInlineResult3.document;
                            if (document instanceof TLRPC.TL_document) {
                                tL_game.document = document;
                                tL_game.flags |= 1;
                            }
                            str4 = tL_game;
                            j12 = j14;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str2 = null;
                        } else {
                            return;
                        }
                    } else if (botInlineResult3 instanceof TLRPC.TL_botInlineMediaResult) {
                        TLRPC.Document document2 = botInlineResult3.document;
                        if (document2 != null) {
                            if (document2 instanceof TLRPC.TL_document) {
                                tL_document = (TLRPC.TL_document) document2;
                                j12 = j14;
                                z11 = C;
                                tL_photo = null;
                                str4 = null;
                                str2 = str4;
                            }
                            j12 = j14;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str4 = null;
                            str2 = null;
                        } else {
                            TLRPC.Photo photo2 = botInlineResult3.photo;
                            if (photo2 != null && (photo2 instanceof TLRPC.TL_photo)) {
                                tL_photo = (TLRPC.TL_photo) photo2;
                                j12 = j14;
                                z11 = C;
                                tL_document = null;
                                str4 = null;
                                str2 = str4;
                            }
                            j12 = j14;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str4 = null;
                            str2 = null;
                        }
                    } else {
                        TLRPC.WebDocument webDocument2 = botInlineResult3.content;
                        if (webDocument2 != null) {
                            String B = ec.B(webDocument2.url, null);
                            if (TextUtils.isEmpty(B)) {
                                k10 = w7.C(botInlineResult3.content.mime_type);
                            } else {
                                k10 = p5.c.k(".", B);
                            }
                            File file = new File(w7.z(4), Utilities.a(botInlineResult3.content.url) + k10);
                            if (file.exists()) {
                                str = file.getAbsolutePath();
                            } else {
                                str = botInlineResult3.content.url;
                            }
                            String str5 = str;
                            String str6 = botInlineResult3.type;
                            str6.getClass();
                            switch (str6.hashCode()) {
                                case -1890252483:
                                    z11 = C;
                                    if (str6.equals("sticker")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 102340:
                                    z11 = C;
                                    if (str6.equals("gif")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 3143036:
                                    z11 = C;
                                    if (str6.equals("file")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 93166550:
                                    z11 = C;
                                    if (str6.equals("audio")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 106642994:
                                    z11 = C;
                                    if (str6.equals("photo")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 112202875:
                                    if (str6.equals("video")) {
                                        z11 = C;
                                        c10 = 5;
                                        break;
                                    }
                                    z11 = C;
                                    c10 = 65535;
                                    break;
                                case 112386354:
                                    if (str6.equals("voice")) {
                                        c10 = 6;
                                        z11 = C;
                                        break;
                                    }
                                    z11 = C;
                                    c10 = 65535;
                                    break;
                                default:
                                    z11 = C;
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                    TLRPC.TL_document tL_document3 = new TLRPC.TL_document();
                                    j12 = j14;
                                    tL_document3.f28498id = 0L;
                                    tL_document3.size = 0L;
                                    tL_document3.dc_id = 0;
                                    tL_document3.mime_type = botInlineResult3.content.mime_type;
                                    tL_document3.file_reference = new byte[0];
                                    tL_document3.date = ConnectionsManager.getInstance(cVar2.f23343a).getCurrentTime();
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_document3.attributes.add(tL_documentAttributeFilename);
                                    String str7 = botInlineResult3.type;
                                    str7.getClass();
                                    switch (str7.hashCode()) {
                                        case -1890252483:
                                            if (str7.equals("sticker")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 102340:
                                            if (str7.equals("gif")) {
                                                c11 = 1;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3143036:
                                            if (str7.equals("file")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 93166550:
                                            if (str7.equals("audio")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112202875:
                                            if (str7.equals("video")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 112386354:
                                            if (str7.equals("voice")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    int i13 = 55;
                                    switch (c11) {
                                        case 0:
                                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                            tL_documentAttributeSticker.alt = "";
                                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                            tL_document3.attributes.add(tL_documentAttributeSticker);
                                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                            int[] g12 = fj.g1(botInlineResult3);
                                            tL_documentAttributeImageSize.f28499w = g12[0];
                                            tL_documentAttributeImageSize.h = g12[1];
                                            tL_document3.attributes.add(tL_documentAttributeImageSize);
                                            tL_documentAttributeFilename.file_name = "sticker.webp";
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K3 = ec.K(new File(w7.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + ec.B(botInlineResult3.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K3 != null) {
                                                        TLRPC.PhotoSize Z = ec.Z(K3, 90.0f, 90.0f, 55, false);
                                                        if (Z != null) {
                                                            tL_document3.thumbs.add(Z);
                                                            tL_document3.flags |= 1;
                                                        }
                                                        K3.recycle();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                a8.g(th2, true);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            tL_documentAttributeFilename.file_name = "animation.gif";
                                            if (str5.endsWith("mp4")) {
                                                tL_document3.mime_type = "video/mp4";
                                                tL_document3.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                            } else {
                                                tL_document3.mime_type = "image/gif";
                                            }
                                            if (z11) {
                                                i10 = 90;
                                            } else {
                                                i10 = 320;
                                            }
                                            try {
                                                if (str5.endsWith("mp4")) {
                                                    K2 = zy.r(1, str5);
                                                    if (K2 == null) {
                                                        TLRPC.WebDocument webDocument3 = botInlineResult3.thumb;
                                                        if ((webDocument3 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument3.mime_type)) {
                                                            String B2 = ec.B(botInlineResult3.thumb.url, null);
                                                            if (TextUtils.isEmpty(B2)) {
                                                                str3 = w7.C(botInlineResult3.thumb.mime_type);
                                                            } else {
                                                                str3 = "." + B2;
                                                            }
                                                            K2 = zy.r(1, new File(w7.z(4), Utilities.a(botInlineResult3.thumb.url) + str3).getAbsolutePath());
                                                        }
                                                    }
                                                } else {
                                                    float f10 = i10;
                                                    K2 = ec.K(str5, null, f10, f10, true);
                                                }
                                                if (K2 != null) {
                                                    float f11 = i10;
                                                    if (i10 > 90) {
                                                        i13 = 80;
                                                    }
                                                    TLRPC.PhotoSize Z2 = ec.Z(K2, f11, f11, i13, false);
                                                    if (Z2 != null) {
                                                        tL_document3.thumbs.add(Z2);
                                                        tL_document3.flags |= 1;
                                                    }
                                                    K2.recycle();
                                                    break;
                                                }
                                            } catch (Throwable th3) {
                                                a8.g(th3, true);
                                                break;
                                            }
                                            break;
                                        case 2:
                                            if (botInlineResult3.content.mime_type.lastIndexOf(47) != -1) {
                                                tL_documentAttributeFilename.file_name = "file." + botInlineResult3.content.mime_type.substring(lastIndexOf + 1);
                                                break;
                                            } else {
                                                tL_documentAttributeFilename.file_name = "file";
                                                break;
                                            }
                                        case 3:
                                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                            tL_documentAttributeAudio.duration = fj.f1(botInlineResult3);
                                            tL_documentAttributeAudio.title = botInlineResult3.title;
                                            int i14 = tL_documentAttributeAudio.flags;
                                            tL_documentAttributeAudio.flags = i14 | 1;
                                            String str8 = botInlineResult3.description;
                                            if (str8 != null) {
                                                tL_documentAttributeAudio.performer = str8;
                                                tL_documentAttributeAudio.flags = i14 | 3;
                                            }
                                            tL_documentAttributeFilename.file_name = "audio.mp3";
                                            tL_document3.attributes.add(tL_documentAttributeAudio);
                                            break;
                                        case 4:
                                            tL_documentAttributeFilename.file_name = "video.mp4";
                                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                                            int[] g13 = fj.g1(botInlineResult3);
                                            tL_documentAttributeVideo.f28499w = g13[0];
                                            tL_documentAttributeVideo.h = g13[1];
                                            tL_documentAttributeVideo.duration = fj.f1(botInlineResult3);
                                            tL_documentAttributeVideo.supports_streaming = true;
                                            tL_document3.attributes.add(tL_documentAttributeVideo);
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K4 = ec.K(new File(w7.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + ec.B(botInlineResult3.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K4 != null) {
                                                        TLRPC.PhotoSize Z3 = ec.Z(K4, 90.0f, 90.0f, 55, false);
                                                        if (Z3 != null) {
                                                            tL_document3.thumbs.add(Z3);
                                                            tL_document3.flags |= 1;
                                                        }
                                                        K4.recycle();
                                                        break;
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                a8.g(th4, true);
                                                break;
                                            }
                                            break;
                                        case 5:
                                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                                            tL_documentAttributeAudio2.duration = fj.f1(botInlineResult3);
                                            tL_documentAttributeAudio2.voice = true;
                                            tL_documentAttributeFilename.file_name = "audio.ogg";
                                            tL_document3.attributes.add(tL_documentAttributeAudio2);
                                            break;
                                    }
                                    if (tL_documentAttributeFilename.file_name == null) {
                                        tL_documentAttributeFilename.file_name = "file";
                                    }
                                    if (tL_document3.mime_type == null) {
                                        tL_document3.mime_type = "application/octet-stream";
                                    }
                                    if (tL_document3.thumbs.isEmpty()) {
                                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                                        int[] g14 = fj.g1(botInlineResult3);
                                        tL_photoSize.f28517w = g14[0];
                                        tL_photoSize.h = g14[1];
                                        tL_photoSize.size = 0;
                                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                                        tL_photoSize.type = "x";
                                        tL_document3.thumbs.add(tL_photoSize);
                                        tL_document3.flags |= 1;
                                    }
                                    str2 = str5;
                                    tL_document = tL_document3;
                                    tL_photo = null;
                                    break;
                                case 4:
                                    if (file.exists()) {
                                        i11 = 0;
                                        tL_photo = zy.C(cVar2.f23343a).A(str5, null, false);
                                    } else {
                                        i11 = 0;
                                        tL_photo = null;
                                    }
                                    if (tL_photo == null) {
                                        tL_photo = new TLRPC.TL_photo();
                                        tL_photo.date = ConnectionsManager.getInstance(cVar2.f23343a).getCurrentTime();
                                        tL_photo.file_reference = new byte[i11];
                                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                        int[] g15 = fj.g1(botInlineResult3);
                                        tL_photoSize2.f28517w = g15[i11];
                                        tL_photoSize2.h = g15[1];
                                        tL_photoSize2.size = 1;
                                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                        tL_photoSize2.type = "x";
                                        tL_photo.sizes.add(tL_photoSize2);
                                    }
                                    str2 = str5;
                                    j12 = j14;
                                    tL_document = null;
                                    break;
                                default:
                                    str2 = str5;
                                    j12 = j14;
                                    tL_photo = null;
                                    tL_document = null;
                                    break;
                            }
                            str4 = null;
                        }
                        j12 = j14;
                        z11 = C;
                        tL_photo = null;
                        tL_document = null;
                        str4 = null;
                        str2 = null;
                    }
                    final HashMap hashMap2 = hashMap;
                    if (hashMap2 != null && (webDocument = botInlineResult3.content) != null) {
                        hashMap2.put("originalPath", webDocument.url);
                    }
                    final TLRPC.TL_game tL_game2 = str4;
                    final Bitmap[] bitmapArr = new Bitmap[1];
                    final String[] strArr = new String[1];
                    if (z11 && tL_document != null) {
                        for (int i15 = 0; i15 < tL_document.attributes.size(); i15++) {
                            if (tL_document.attributes.get(i15) instanceof TLRPC.TL_documentAttributeVideo) {
                                TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo2 = (TLRPC.TL_documentAttributeVideo) tL_document.attributes.get(i15);
                                TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                                tL_documentAttributeVideo_layer159.flags = tL_documentAttributeVideo2.flags;
                                tL_documentAttributeVideo_layer159.round_message = tL_documentAttributeVideo2.round_message;
                                tL_documentAttributeVideo_layer159.supports_streaming = tL_documentAttributeVideo2.supports_streaming;
                                tL_documentAttributeVideo_layer159.duration = tL_documentAttributeVideo2.duration;
                                tL_documentAttributeVideo_layer159.f28499w = tL_documentAttributeVideo2.f28499w;
                                tL_documentAttributeVideo_layer159.h = tL_documentAttributeVideo2.h;
                                tL_document.attributes.set(i15, tL_documentAttributeVideo_layer159);
                            }
                        }
                    }
                    if (fj.s3(tL_document, false)) {
                        TLRPC.PhotoSize w10 = w7.w(tL_document.thumbs, 320, false, null, false);
                        w7.G(cVar2.f23343a);
                        File I = w7.I(tL_document);
                        if (!I.exists()) {
                            w7.G(cVar2.f23343a);
                            z12 = true;
                            I = w7.J(tL_document, null, true, true);
                        } else {
                            z12 = true;
                        }
                        inputPeer = null;
                        tL_document2 = tL_document;
                        botInlineResult2 = botInlineResult3;
                        boolean z13 = z12;
                        zy.w(cVar2, z11, tL_document2, I.getAbsolutePath(), null, 0L, false);
                        strArr[0] = zy.D(cVar2, w10, bitmapArr, z13, z13);
                        i12 = z13;
                    } else {
                        botInlineResult2 = botInlineResult3;
                        tL_document2 = tL_document;
                        i12 = 1;
                        inputPeer = null;
                    }
                    if (!n5.C(j12)) {
                        j13 = j12;
                        inputPeer2 = mp.u1(cVar2.f23343a).l1(j13);
                    } else {
                        j13 = j12;
                        inputPeer2 = inputPeer;
                    }
                    if (inputPeer2 != null && inputPeer2.user_id != 0 && mp.u1(cVar2.f23343a).d2(inputPeer2.user_id) != null && mp.u1(cVar2.f23343a).d2(inputPeer2.user_id).voice_messages_forbidden && tL_document2 != null) {
                        boolean Q4 = fj.Q4(tL_document2);
                        org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                        if (Q4) {
                            g0.g3(new ln(i12, g2Var2));
                            return;
                        } else if (fj.i4(tL_document2)) {
                            g0.g3(new ln(2, g2Var2));
                            return;
                        }
                    }
                    final fj fjVar3 = fjVar;
                    final fj fjVar4 = fjVar2;
                    final long j15 = j13;
                    final boolean z14 = z10;
                    final int i16 = i7;
                    final bw bwVar2 = bwVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.rm rmVar2 = rmVar;
                    final long j16 = j10;
                    final long j17 = j11;
                    final TLRPC.TL_document tL_document4 = tL_document2;
                    final TLRPC.BotInlineResult botInlineResult4 = botInlineResult2;
                    final TLRPC.TL_photo tL_photo2 = tL_photo;
                    g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            xy xyVar;
                            TLRPC.TL_document tL_document5 = TLRPC.TL_document.this;
                            long j18 = j15;
                            fj fjVar5 = fjVar3;
                            fj fjVar6 = fjVar4;
                            TLRPC.BotInlineResult botInlineResult5 = botInlineResult4;
                            HashMap hashMap3 = hashMap2;
                            boolean z15 = z14;
                            int i17 = i16;
                            if (tL_document5 != null) {
                                Bitmap[] bitmapArr2 = bitmapArr;
                                if (bitmapArr2[0] != null) {
                                    String[] strArr2 = strArr;
                                    if (strArr2[0] != null) {
                                        ec.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                    }
                                }
                                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult5.send_message;
                                xyVar = xy.f(tL_document5, null, str2, j18, fjVar5, fjVar6, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap3, z15, i17, 0, 0, botInlineResult5, null, false);
                            } else {
                                TLRPC.TL_photo tL_photo3 = tL_photo2;
                                String str9 = null;
                                if (tL_photo3 != null) {
                                    TLRPC.WebDocument webDocument4 = botInlineResult5.content;
                                    if (webDocument4 != null) {
                                        str9 = webDocument4.url;
                                    }
                                    String str10 = str9;
                                    TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult5.send_message;
                                    xyVar = xy.c(null, botInlineMessage3.message, null, tL_photo3, null, null, null, null, null, null, j18, str10, fjVar5, fjVar6, null, true, null, botInlineMessage3.entities, botInlineMessage3.reply_markup, hashMap3, z15, i17, 0, 0, botInlineResult5, null, false, false);
                                } else {
                                    TLRPC.TL_game tL_game3 = tL_game2;
                                    if (tL_game3 != null) {
                                        xyVar = xy.c(null, null, null, null, null, null, null, tL_game3, null, null, j18, null, fjVar5, fjVar6, null, true, null, null, botInlineResult5.send_message.reply_markup, hashMap3, z15, i17, 0, 0, null, null, false, false);
                                    } else {
                                        xyVar = null;
                                    }
                                }
                            }
                            if (xyVar != null) {
                                xyVar.K = bwVar2;
                                xyVar.H = storyItem2;
                                xyVar.J = rmVar2;
                                xyVar.Q = j16;
                                xyVar.R = j17;
                                zy.C(cVar2.f23343a).r0(xyVar);
                            }
                        }
                    });
                }
            }).run();
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
            if (n5.C(j3)) {
                for (int i10 = 0; i10 < botInlineResult.send_message.entities.size(); i10++) {
                    TLRPC.MessageEntity messageEntity = botInlineResult.send_message.entities.get(i10);
                    if (messageEntity instanceof TLRPC.TL_messageEntityUrl) {
                        tL_webPagePending = new TLRPC.TL_webPagePending();
                        String str = botInlineResult.send_message.message;
                        int i11 = messageEntity.offset;
                        tL_webPagePending.url = str.substring(i11, messageEntity.length + i11);
                        break;
                    }
                }
            }
            tL_webPagePending = null;
            TLRPC.TL_webPagePending tL_webPagePending2 = tL_webPagePending;
            TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
            xy b10 = xy.b(botInlineMessage2.message, j3, fjVar, fjVar2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z10, i7, 0, null, false);
            b10.K = bwVar;
            b10.J = rmVar;
            b10.Q = j10;
            b10.R = j11;
            C(cVar.f23343a).r0(b10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
            TL_iv.RichMessage richMessage = botInlineMessage.rich_message;
            xy c10 = xy.c(null, null, null, null, null, null, null, null, null, null, j3, null, fjVar, fjVar2, null, true, null, null, botInlineMessage.reply_markup, hashMap, z10, i7, 0, 0, null, null, false, false);
            c10.Y = richMessage;
            c10.K = bwVar;
            c10.J = rmVar;
            c10.Q = j10;
            c10.R = j11;
            C(cVar.f23343a).r0(c10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageWidget) {
            TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineMessage;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            xy d2 = xy.d(tL_messageMediaWidget, j3, fjVar, fjVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i7);
            d2.f28152b = tL_botInlineMessageWidget.message;
            d2.f28170w = tL_botInlineMessageWidget.entities;
            d2.L = tL_botInlineMessageWidget.invert_media;
            d2.K = bwVar;
            d2.J = rmVar;
            d2.Q = j10;
            d2.R = j11;
            C(cVar.f23343a).r0(d2);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            TLRPC.BotInlineMessage botInlineMessage3 = botInlineResult.send_message;
            tL_messageMediaVenue.geo = botInlineMessage3.geo;
            tL_messageMediaVenue.address = botInlineMessage3.address;
            tL_messageMediaVenue.title = botInlineMessage3.title;
            tL_messageMediaVenue.provider = botInlineMessage3.provider;
            String str2 = botInlineMessage3.venue_type;
            tL_messageMediaVenue.venue_id = str2;
            tL_messageMediaVenue.venue_type = str2;
            if (str2 == null) {
                tL_messageMediaVenue.venue_type = "";
            }
            xy d10 = xy.d(tL_messageMediaVenue, j3, fjVar, fjVar2, botInlineMessage3.reply_markup, hashMap, z10, i7);
            d10.K = bwVar;
            d10.J = rmVar;
            d10.Q = j10;
            d10.R = j11;
            C(cVar.f23343a).r0(d10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
            if (botInlineMessage.period == 0 && botInlineMessage.proximity_notification_radius == 0) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                tL_messageMediaGeo.geo = botInlineMessage4.geo;
                tL_messageMediaGeo.heading = botInlineMessage4.heading;
                d = xy.d(tL_messageMediaGeo, j3, fjVar, fjVar2, botInlineMessage4.reply_markup, hashMap, z10, i7);
            } else {
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.BotInlineMessage botInlineMessage5 = botInlineResult.send_message;
                int i12 = botInlineMessage5.period;
                if (i12 == 0) {
                    i12 = 900;
                }
                tL_messageMediaGeoLive.period = i12;
                tL_messageMediaGeoLive.geo = botInlineMessage5.geo;
                tL_messageMediaGeoLive.heading = botInlineMessage5.heading;
                tL_messageMediaGeoLive.proximity_notification_radius = botInlineMessage5.proximity_notification_radius;
                d = xy.d(tL_messageMediaGeoLive, j3, fjVar, fjVar2, botInlineMessage5.reply_markup, hashMap, z10, i7);
            }
            d.K = bwVar;
            d.J = rmVar;
            d.Q = j10;
            d.R = j11;
            C(cVar.f23343a).r0(d);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            TLRPC.BotInlineMessage botInlineMessage6 = botInlineResult.send_message;
            tL_user.phone = botInlineMessage6.phone_number;
            tL_user.first_name = botInlineMessage6.first_name;
            tL_user.last_name = botInlineMessage6.last_name;
            TLRPC.RestrictionReason restrictionReason = new TLRPC.RestrictionReason();
            restrictionReason.text = botInlineResult.send_message.vcard;
            restrictionReason.platform = "";
            restrictionReason.reason = "";
            tL_user.restriction_reason.add(restrictionReason);
            xy g10 = xy.g(tL_user, j3, fjVar, fjVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i7, 0);
            g10.K = bwVar;
            g10.J = rmVar;
            g10.Q = j10;
            g10.R = j11;
            C(cVar.f23343a).r0(g10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
            if (n5.C(j3)) {
                return;
            }
            TLRPC.TL_botInlineMessageMediaInvoice tL_botInlineMessageMediaInvoice = (TLRPC.TL_botInlineMessageMediaInvoice) botInlineResult.send_message;
            TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice = new TLRPC.TL_messageMediaInvoice();
            tL_messageMediaInvoice.shipping_address_requested = tL_botInlineMessageMediaInvoice.shipping_address_requested;
            tL_messageMediaInvoice.test = tL_botInlineMessageMediaInvoice.test;
            tL_messageMediaInvoice.title = tL_botInlineMessageMediaInvoice.title;
            tL_messageMediaInvoice.description = tL_botInlineMessageMediaInvoice.description;
            TLRPC.WebDocument webDocument = tL_botInlineMessageMediaInvoice.photo;
            if (webDocument != null) {
                tL_messageMediaInvoice.webPhoto = webDocument;
                tL_messageMediaInvoice.flags |= 1;
            }
            tL_messageMediaInvoice.currency = tL_botInlineMessageMediaInvoice.currency;
            tL_messageMediaInvoice.total_amount = tL_botInlineMessageMediaInvoice.total_amount;
            tL_messageMediaInvoice.start_param = "";
            xy c11 = xy.c(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j3, null, fjVar, fjVar2, null, true, null, null, botInlineResult.send_message.reply_markup, hashMap, z10, i7, 0, 0, null, null, false, false);
            c11.K = bwVar;
            c11.J = rmVar;
            c11.Q = j10;
            c11.R = j11;
            C(cVar.f23343a).r0(c11);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
            TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
            tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
            TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
            xy b11 = xy.b(botInlineMessage7.message, j3, fjVar, fjVar2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, hashMap, z10, i7, 0, null, false);
            b11.K = bwVar;
            b11.J = rmVar;
            b11.Q = j10;
            b11.R = j11;
            b11.L = botInlineResult.send_message.invert_media;
            C(cVar.f23343a).r0(b11);
        }
    }

    public static void T(c cVar, String str, String str2, Uri uri, String str3, String str4, long j3, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem, org.telegram.ui.rm rmVar, boolean z10, org.telegram.ui.Cells.aa aaVar, bw bwVar) {
        ArrayList arrayList;
        if ((str == null || str2 == null) && uri == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (uri != null) {
            arrayList = new ArrayList();
            arrayList.add(uri);
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = arrayList;
        if (str != null) {
            arrayList2.add(str);
            arrayList3.add(str2);
        }
        V(0, j3, 0L, 0L, 0L, str3, str4, arrayList2, arrayList3, arrayList4, null, null, null, cVar, fjVar, fjVar2, null, null, bwVar, storyItem, aaVar, rmVar, null, z10, false);
    }

    public static int U(org.telegram.messenger.c r42, java.lang.String r43, java.lang.String r44, android.net.Uri r45, java.lang.String r46, final long r47, final org.telegram.messenger.fj r49, final org.telegram.messenger.fj r50, final org.telegram.tgnet.tl.TL_stories.StoryItem r51, final org.telegram.ui.rm r52, final java.util.ArrayList r53, final org.telegram.messenger.fj r54, long[] r55, boolean r56, java.lang.CharSequence r57, final boolean r58, int r59, final int r60, java.lang.Integer[] r61, boolean r62, final org.telegram.messenger.bw r63, final long r64, final boolean r66, final long r67, final long r69, final org.telegram.messenger.kj r71, final sh.f r72, final int r73) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zy.U(org.telegram.messenger.c, java.lang.String, java.lang.String, android.net.Uri, java.lang.String, long, org.telegram.messenger.fj, org.telegram.messenger.fj, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.rm, java.util.ArrayList, org.telegram.messenger.fj, long[], boolean, java.lang.CharSequence, boolean, int, int, java.lang.Integer[], boolean, org.telegram.messenger.bw, long, boolean, long, long, org.telegram.messenger.kj, sh.f, int):int");
    }

    public static void V(final int i7, final long j3, final long j10, final long j11, final long j12, final String str, final String str2, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final ArrayList arrayList5, final ArrayList arrayList6, final c cVar, final fj fjVar, final fj fjVar2, final fj fjVar3, final kj kjVar, final bw bwVar, final TL_stories.StoryItem storyItem, final org.telegram.ui.Cells.aa aaVar, final org.telegram.ui.rm rmVar, final sh.f fVar, final boolean z10, final boolean z11) {
        if (arrayList != null || arrayList2 != null || arrayList3 != null) {
            if (arrayList != null && arrayList2 != null && arrayList.size() != arrayList2.size()) {
                return;
            }
            Utilities.f22877e.c(new Runnable() {
                @Override
                public final void run() {
                    int i10;
                    boolean z12;
                    String str3;
                    ArrayList arrayList7;
                    String str4;
                    long j13;
                    boolean z13;
                    boolean z14;
                    int i11;
                    c cVar2;
                    Uri uri;
                    long j14;
                    int i12;
                    String str5;
                    kj kjVar2;
                    long j15;
                    int i13;
                    ArrayList arrayList8;
                    boolean z15;
                    ArrayList arrayList9;
                    boolean z16;
                    int i14;
                    long[] jArr = new long[1];
                    Integer[] numArr = new Integer[1];
                    long j16 = j3;
                    boolean C = n5.C(j16);
                    ArrayList arrayList10 = arrayList;
                    String str6 = str;
                    sh.f fVar2 = fVar;
                    c cVar3 = cVar;
                    int i15 = i7;
                    String str7 = str2;
                    fj fjVar4 = fjVar;
                    fj fjVar5 = fjVar2;
                    TL_stories.StoryItem storyItem2 = storyItem;
                    String str8 = str7;
                    org.telegram.ui.rm rmVar2 = rmVar;
                    ArrayList arrayList11 = arrayList4;
                    fj fjVar6 = fjVar3;
                    boolean z17 = z10;
                    org.telegram.ui.Cells.aa aaVar2 = aaVar;
                    bw bwVar2 = bwVar;
                    org.telegram.ui.Cells.aa aaVar3 = aaVar2;
                    int i16 = i15;
                    long j17 = j10;
                    boolean z18 = z11;
                    String str9 = str6;
                    long j18 = j17;
                    long j19 = j11;
                    long j20 = j12;
                    kj kjVar3 = kjVar;
                    if (arrayList10 != null) {
                        int size = arrayList10.size();
                        int i17 = 0;
                        i10 = 0;
                        int i18 = 0;
                        z12 = true;
                        while (i17 < size) {
                            org.telegram.ui.Cells.aa aaVar4 = aaVar3;
                            if (i17 == 0) {
                                str5 = str9;
                            } else {
                                str5 = null;
                            }
                            boolean z19 = z18;
                            if (!C && size > 1 && i18 % 10 == 0 && fVar2 == null) {
                                kjVar2 = kjVar3;
                                j15 = j16;
                                long j21 = jArr[0];
                                if (j21 != 0) {
                                    i13 = i16;
                                    zy.z(cVar3, j21, i13);
                                } else {
                                    i13 = i16;
                                }
                                jArr[0] = Utilities.f22875b.nextLong();
                                i18 = 0;
                            } else {
                                kjVar2 = kjVar3;
                                j15 = j16;
                                i13 = i16;
                            }
                            int i19 = i18 + 1;
                            long j22 = jArr[0];
                            if ((fVar2 == null && i19 == 10) || i17 == size - 1) {
                                arrayList8 = arrayList11;
                                z15 = true;
                            } else {
                                arrayList8 = arrayList11;
                                z15 = false;
                            }
                            String str10 = (String) arrayList10.get(i17);
                            kj kjVar4 = kjVar2;
                            String str11 = (String) arrayList2.get(i17);
                            int i20 = i19;
                            String str12 = str8;
                            if (i17 == 0) {
                                arrayList9 = arrayList8;
                            } else {
                                arrayList9 = null;
                            }
                            String str13 = str9;
                            if (aaVar4 == null) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            long j23 = j18;
                            if (!z12) {
                                j18 = 0;
                            }
                            ArrayList arrayList12 = arrayList5;
                            if (arrayList12 != null) {
                                i14 = ((Integer) arrayList12.get(i17)).intValue();
                            } else {
                                i14 = -1;
                            }
                            int i21 = i17;
                            int i22 = size;
                            long j24 = j15;
                            ArrayList arrayList13 = arrayList10;
                            ArrayList arrayList14 = arrayList8;
                            int i23 = i13;
                            j16 = j24;
                            i10 = zy.U(cVar3, str10, str11, null, str12, j16, fjVar4, fjVar5, storyItem2, rmVar2, arrayList9, fjVar6, jArr, z15, str5, z17, i23, 0, numArr, z16, bwVar2, j18, z19, j19, j20, kjVar4, fVar2, i14);
                            c cVar4 = cVar3;
                            long j25 = jArr[0];
                            i20 = (j22 != j25 || j25 == -1) ? 1 : 1;
                            if (i10 != 0 && z15 && fVar2 == null && j25 != 0) {
                                zy.z(cVar4, j25, i23);
                                jArr[0] = 0;
                                i20 = 0;
                            }
                            int i24 = i21 + 1;
                            i16 = i23;
                            cVar3 = cVar4;
                            str8 = str12;
                            kjVar3 = kjVar4;
                            z12 = false;
                            arrayList10 = arrayList13;
                            arrayList11 = arrayList14;
                            str9 = str13;
                            j18 = j23;
                            aaVar3 = aaVar4;
                            i17 = i24;
                            z18 = z19;
                            size = i22;
                            i18 = i20;
                        }
                    } else {
                        i10 = 0;
                        z12 = true;
                    }
                    boolean z20 = z18;
                    c cVar5 = cVar3;
                    ArrayList arrayList15 = arrayList10;
                    kj kjVar5 = kjVar3;
                    String str14 = str8;
                    ArrayList arrayList16 = arrayList11;
                    org.telegram.ui.Cells.aa aaVar5 = aaVar3;
                    int i25 = i16;
                    String str15 = str9;
                    long j26 = j18;
                    ArrayList arrayList17 = arrayList3;
                    if (arrayList17 != null) {
                        jArr[0] = 0;
                        int size2 = arrayList17.size();
                        boolean z21 = z20;
                        int i26 = 0;
                        int i27 = 0;
                        while (i26 < arrayList17.size()) {
                            if (i26 == 0 && (arrayList15 == null || arrayList15.size() == 0)) {
                                str3 = str15;
                            } else {
                                str3 = null;
                            }
                            if (i26 == 0 && (arrayList15 == null || arrayList15.size() == 0)) {
                                arrayList7 = arrayList16;
                            } else {
                                arrayList7 = null;
                            }
                            ArrayList arrayList18 = arrayList7;
                            if (!C && size2 > 1 && i27 % 10 == 0 && fVar2 == null) {
                                str4 = str14;
                                j13 = j16;
                                long j27 = jArr[0];
                                if (j27 != 0) {
                                    zy.z(cVar5, j27, i25);
                                }
                                jArr[0] = Utilities.f22875b.nextLong();
                                i27 = 0;
                            } else {
                                str4 = str14;
                                j13 = j16;
                            }
                            int i28 = i27 + 1;
                            long j28 = jArr[0];
                            if ((fVar2 == null && i28 == 10) || i26 == size2 - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            Uri uri2 = (Uri) arrayList17.get(i26);
                            if (aaVar5 == null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z12) {
                                i11 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j16 = j13;
                                j14 = j26;
                            } else {
                                i11 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j16 = j13;
                                j14 = 0;
                            }
                            ArrayList arrayList19 = arrayList17;
                            ArrayList arrayList20 = arrayList6;
                            if (arrayList20 != null) {
                                i12 = ((Integer) arrayList20.get(i26)).intValue();
                            } else {
                                i12 = -1;
                            }
                            int i29 = i26;
                            int i30 = i25;
                            int i31 = i28;
                            str14 = str4;
                            boolean z22 = z21;
                            int i32 = i11;
                            i10 = zy.U(cVar2, null, null, uri, str14, j16, fjVar4, fjVar5, storyItem2, rmVar2, arrayList18, fjVar6, jArr, z13, str3, z17, i30, 0, numArr, z14, bwVar2, j14, z22, j19, j20, kjVar5, fVar2, i12);
                            i25 = i30;
                            long j29 = jArr[0];
                            if (j28 != j29 || j29 == -1) {
                                i31 = 1;
                            }
                            if (i10 != 0 && z13 && fVar2 == null && j29 != 0) {
                                zy.z(cVar2, j29, i25);
                                jArr[0] = 0;
                                i27 = 0;
                            } else {
                                i27 = i31;
                            }
                            i26 = i29 + 1;
                            cVar5 = cVar2;
                            z21 = z22;
                            z12 = false;
                            size2 = i32;
                            arrayList17 = arrayList19;
                        }
                    }
                    c cVar6 = cVar5;
                    int i33 = i10;
                    if (aaVar5 != null) {
                        ((t0.h) aaVar5.f30491b).k();
                    }
                    if (i33 != 0) {
                        g0.g3(new x0(i33, cVar6, 13));
                    }
                }
            });
        }
    }

    public static void W(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CharSequence charSequence, String str, long j3, fj fjVar, fj fjVar2, boolean z10, int i7) {
        c cVar2;
        CharSequence charSequence2;
        ArrayList arrayList4;
        String str2 = null;
        if (charSequence != null) {
            CharSequence[] charSequenceArr = {charSequence};
            cVar2 = cVar;
            ArrayList Y = ri.d0(cVar2.f23343a).Y(charSequenceArr, true, true);
            charSequence2 = charSequenceArr[0];
            arrayList4 = Y;
        } else {
            cVar2 = cVar;
            charSequence2 = charSequence;
            arrayList4 = null;
        }
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        V(i7, j3, 0L, 0L, 0L, str2, str, arrayList, arrayList2, arrayList3, arrayList4, null, null, cVar2, fjVar, fjVar2, null, null, null, null, null, null, null, z10, false);
    }

    public static void X(final c cVar, final ArrayList arrayList, final long j3, final fj fjVar, final fj fjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.rm rmVar, final boolean z10, boolean z11, final fj fjVar3, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final boolean z12, final int i7, final int i10, final boolean z13, final org.telegram.ui.Cells.aa aaVar, final bw bwVar, final long j10, final boolean z14, final long j11, final long j12, final kj kjVar, final sh.f fVar, final boolean z15) {
        final boolean z16;
        final long j13;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        boolean z17 = false;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((yy) arrayList.get(i11)).h > 0) {
                    z16 = false;
                    break;
                }
                i11++;
            } else {
                z16 = z11;
                break;
            }
        }
        if (fVar != null) {
            j13 = fVar.f57575c;
        } else {
            j13 = 0;
        }
        if (j13 != 0) {
            z17 = true;
        }
        final boolean z18 = z17;
        J.c(new Runnable() {
            @Override
            public final void run() {
                zy.K(arrayList, j3, z10, z16, z18, cVar, j13, fjVar3, tL_inputPollAnswer, fjVar, fjVar2, z12, i7, i10, storyItem, rmVar, bwVar, j10, z14, j11, j12, kjVar, fVar, z15, aaVar, z13);
            }
        });
    }

    public static void Y(c cVar, Uri uri, long j3, fj fjVar, fj fjVar2, org.telegram.ui.Cells.aa aaVar, fj fjVar3, boolean z10, int i7, bw bwVar) {
        Z(cVar, null, null, uri, j3, fjVar, fjVar2, null, null, null, aaVar, 0, fjVar3, null, z10, i7, false, null, bwVar, 0L, 0L, 0L, null);
    }

    public static void Z(c cVar, String str, String str2, Uri uri, long j3, fj fjVar, fj fjVar2, org.telegram.ui.rm rmVar, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.Cells.aa aaVar, int i7, fj fjVar3, d20 d20Var, boolean z10, int i10, boolean z11, CharSequence charSequence, bw bwVar, long j10, long j11, long j12, kj kjVar) {
        ?? obj = new Object();
        obj.f28311c = str;
        obj.f28312e = str2;
        obj.f28309a = uri;
        if (charSequence != null) {
            obj.d = charSequence.toString();
        }
        obj.f28315i = arrayList;
        obj.h = i7;
        if (arrayList2 != null) {
            obj.f28316j = new ArrayList(arrayList2);
        }
        obj.f28317k = d20Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(obj);
        X(cVar, arrayList3, j3, fjVar, fjVar2, null, rmVar, z11, false, fjVar3, null, z10, i10, 0, false, aaVar, bwVar, j10, false, j11, j12, kjVar, null, false);
    }

    public static void a0(c cVar, CharSequence charSequence, long j3, long j10, boolean z10, int i7, int i10) {
        tr.a0(cVar.f23343a).f27149a.c(new gw(charSequence, cVar, j10, j3, z10, i7, i10, 1));
    }

    public static void b0(final int i7, final int i10, final int i11, final long j3, final long j10, final long j11, final long j12, final CharSequence charSequence, final String str, final String str2, final ArrayList arrayList, final c cVar, final fj fjVar, final fj fjVar2, final fj fjVar3, final kj kjVar, final bw bwVar, final d20 d20Var, final TLRPC.Photo photo, final TL_stories.StoryItem storyItem, final org.telegram.ui.rm rmVar, final boolean z10, final boolean z11, final boolean z12) {
        if (str != null && str.length() != 0) {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iy.run():void");
                }
            }).start();
        }
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.x5 x5Var : (org.telegram.ui.Components.x5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.x5.class)) {
                if (x5Var.fromEmojiKeyboard) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void i(TL_iv.RichText richText) {
        if (richText != null) {
            richText.parentRichText = null;
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                i(richText2);
            }
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            if (arrayList != null) {
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    TL_iv.RichText richText3 = arrayList.get(i7);
                    i7++;
                    i(richText3);
                }
            }
        }
    }

    public static void j(TL_iv.PageBlock pageBlock, IdentityHashMap identityHashMap) {
        Field[] fields;
        Field[] fields2;
        if (pageBlock != null && identityHashMap.put(pageBlock, Boolean.TRUE) == null) {
            for (Field field : pageBlock.getClass().getFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(pageBlock);
                        if (obj instanceof TL_iv.RichText) {
                            i((TL_iv.RichText) obj);
                        } else if (obj instanceof TL_iv.PageBlock) {
                            j((TL_iv.PageBlock) obj, identityHashMap);
                        } else if (obj instanceof TL_iv.PageCaption) {
                            i(((TL_iv.PageCaption) obj).text);
                            i(((TL_iv.PageCaption) obj).credit);
                        } else if (obj instanceof List) {
                            for (Object obj2 : (List) obj) {
                                if (obj2 instanceof TL_iv.PageBlock) {
                                    j((TL_iv.PageBlock) obj2, identityHashMap);
                                } else if (obj2 instanceof TL_iv.RichText) {
                                    i((TL_iv.RichText) obj2);
                                } else if ((obj2 instanceof TL_iv.PageListItem) || (obj2 instanceof TL_iv.PageListOrderedItem)) {
                                    for (Field field2 : obj2.getClass().getFields()) {
                                        if (!Modifier.isStatic(field2.getModifiers())) {
                                            try {
                                                Object obj3 = field2.get(obj2);
                                                if (obj3 instanceof TL_iv.RichText) {
                                                    i((TL_iv.RichText) obj3);
                                                } else if (obj3 instanceof List) {
                                                    for (Object obj4 : (List) obj3) {
                                                        if (obj4 instanceof TL_iv.PageBlock) {
                                                            j((TL_iv.PageBlock) obj4, identityHashMap);
                                                        }
                                                    }
                                                }
                                            } catch (IllegalAccessException unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (IllegalAccessException unused2) {
                    }
                }
            }
        }
    }

    public static ArrayList l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) arrayList.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.f28499w = documentAttribute.f28499w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    arrayList2.add(tL_documentAttributeVideo_layer159);
                } else {
                    arrayList2.add(documentAttribute);
                }
            }
        }
        return arrayList2;
    }

    public static void m(long j3, long j10, File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            channel.position(j3);
            ByteBuffer allocate = ByteBuffer.allocate(262144);
            while (j10 > 0) {
                allocate.clear();
                allocate.limit((int) Math.min(allocate.capacity(), j10));
                int read = channel.read(allocate);
                if (read <= 0) {
                    break;
                }
                allocate.flip();
                channel2.write(allocate);
                j10 -= read;
            }
            channel2.force(true);
            channel2.close();
            channel.close();
        } catch (Throwable th2) {
            if (channel != null) {
                try {
                    channel.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static TL_iv.TL_inputRichMessage m0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        TL_iv.TL_inputRichMessage tL_inputRichMessage = new TL_iv.TL_inputRichMessage();
        if (richMessage != null) {
            tL_inputRichMessage.rtl = richMessage.rtl;
            tL_inputRichMessage.blocks = new ArrayList<>(richMessage.blocks.size());
            for (int i7 = 0; i7 < richMessage.blocks.size(); i7++) {
                tL_inputRichMessage.blocks.add(y0(richMessage.blocks.get(i7)));
            }
            ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputRichMessage.flags |= 4;
                ArrayList<TLRPC.Photo> arrayList3 = richMessage.photos;
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    TLRPC.Photo photo = arrayList3.get(i10);
                    i10++;
                    TLRPC.Photo photo2 = photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f28511id = photo2.f28516id;
                    tL_inputPhoto.access_hash = photo2.access_hash;
                    byte[] bArr = photo2.file_reference;
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    tL_inputPhoto.file_reference = bArr;
                    tL_inputRichMessage.photos.add(tL_inputPhoto);
                }
            }
            ArrayList<TLRPC.Document> arrayList4 = richMessage.documents;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                tL_inputRichMessage.flags |= 8;
                ArrayList<TLRPC.Document> arrayList5 = richMessage.documents;
                int size2 = arrayList5.size();
                int i11 = 0;
                while (i11 < size2) {
                    TLRPC.Document document = arrayList5.get(i11);
                    i11++;
                    TLRPC.Document document2 = document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f28504id = document2.f28498id;
                    tL_inputDocument.access_hash = document2.access_hash;
                    byte[] bArr2 = document2.file_reference;
                    if (bArr2 == null) {
                        bArr2 = new byte[0];
                    }
                    tL_inputDocument.file_reference = bArr2;
                    tL_inputRichMessage.documents.add(tL_inputDocument);
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputRichMessage.flags |= 16;
                tL_inputRichMessage.users.addAll(arrayList);
            }
        }
        return tL_inputRichMessage;
    }

    public static d20 n(long j3, String str) {
        int i7;
        int i10;
        float f10;
        int[] iArr = new int[11];
        AnimatedFileNative.d(str, iArr, j3);
        if (iArr[0] == 0) {
            if (s2.f26829a) {
                a8.b("video hasn't avc1 atom");
                return null;
            }
            return null;
        }
        long length = new File(str).length();
        int E = MediaController.E(str);
        if (E == -1) {
            E = iArr[3];
        }
        float f11 = iArr[4];
        long j10 = iArr[5];
        int i11 = iArr[7];
        d20 d20Var = new d20();
        d20Var.f23587a = -1L;
        d20Var.f23589b = -1L;
        d20Var.f23599m = E;
        d20Var.f23601o = str;
        d20Var.f23602p = j3;
        d20Var.f23600n = i11;
        d20Var.f23604r = (long) Math.ceil(f11);
        boolean z10 = true;
        int i12 = iArr[1];
        d20Var.h = i12;
        d20Var.f23597k = i12;
        int i13 = iArr[2];
        d20Var.f23595i = i13;
        d20Var.f23598l = i13;
        d20Var.f23594g = iArr[8];
        d20Var.v = f11 * 1000.0f;
        float max = Math.max(i12, i13);
        float f12 = 1280.0f;
        if (max > 1280.0f) {
            i7 = 4;
        } else if (max > 854.0f) {
            i7 = 3;
        } else if (max > 640.0f) {
            i7 = 2;
        } else {
            i7 = 1;
        }
        a6 q10 = a6.q(i10.f24637t0);
        int e10 = t0.e();
        if (e10 == 1) {
            i10 = q10.p().h;
        } else if (e10 == 2) {
            i10 = q10.o().h;
        } else {
            i10 = q10.n().h;
        }
        int round = Math.round(i10 / (100.0f / i7));
        if (round > i7) {
            round = i7;
        }
        if (new File(str).length() < 1048576000) {
            if (round == i7 && Math.max(d20Var.h, d20Var.f23595i) <= 1280) {
                z10 = false;
            } else {
                if (round != 1) {
                    if (round != 2) {
                        if (round == 3) {
                            f12 = 848.0f;
                        }
                    } else {
                        f12 = 640.0f;
                    }
                } else {
                    f12 = 432.0f;
                }
                int i14 = d20Var.h;
                int i15 = d20Var.f23595i;
                if (i14 > i15) {
                    f10 = i14;
                } else {
                    f10 = i15;
                }
                float f13 = f12 / f10;
                d20Var.f23597k = Math.round((i14 * f13) / 2.0f) * 2;
                d20Var.f23598l = Math.round((d20Var.f23595i * f13) / 2.0f) * 2;
            }
            E = MediaController.Q(d20Var.f23595i, d20Var.h, E, d20Var.f23598l, d20Var.f23597k);
        } else {
            z10 = false;
        }
        if (!z10) {
            d20Var.f23597k = d20Var.h;
            d20Var.f23598l = d20Var.f23595i;
            d20Var.f23599m = E;
            d20Var.f23603q = length;
        } else {
            d20Var.f23599m = E;
            d20Var.f23603q = a8.p0.f(f11 / 1000.0f, MediaController.v(d20Var.f23597k, d20Var.f23598l, E, false), 8.0f, (float) j10);
        }
        if (d20Var.f23603q == 0) {
            d20Var.f23603q = 1L;
        }
        return d20Var;
    }

    public static Bitmap r(int i7, String str) {
        float f10;
        if (i7 == 2) {
            f10 = 1920.0f;
        } else if (i7 == 3) {
            f10 = 96.0f;
        } else {
            f10 = 512.0f;
        }
        Bitmap s5 = s(str, 0L, null, false);
        if (s5 != null) {
            int width = s5.getWidth();
            int height = s5.getHeight();
            float f11 = width;
            if (f11 > f10 || height > f10) {
                float max = Math.max(width, height) / f10;
                return Bitmap.createScaledBitmap(s5, (int) (f11 / max), (int) (height / max), true);
            }
        }
        return s5;
    }

    public static Bitmap s(String str, long j3, int[] iArr, boolean z10) {
        if (z10) {
            org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
            Bitmap q10 = b6Var.q(j3, z10);
            if (iArr != null) {
                iArr[0] = b6Var.d[2];
            }
            b6Var.u();
            if (q10 == null) {
                return s(str, j3, iArr, false);
            }
            return q10;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j3, 1);
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(j3, 3);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            throw th2;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused3) {
            return bitmap;
        }
    }

    public static void w(c cVar, boolean z10, TLObject tLObject, String str, Uri uri, long j3, boolean z11) {
        int i7;
        boolean z12;
        TLRPC.PhotoSize b02;
        TLRPC.PhotoSize b03;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize w10 = w7.w(tL_photo.sizes, 90, false, null, false);
            if (!(w10 instanceof TLRPC.TL_photoStrippedSize) && !(w10 instanceof TLRPC.TL_photoPathSize)) {
                w7.G(cVar.f23343a);
                z12 = w7.J(w10, null, true, true).exists();
            } else {
                z12 = true;
            }
            TLRPC.PhotoSize w11 = w7.w(tL_photo.sizes, g0.Z0(z11), false, null, false);
            w7.G(cVar.f23343a);
            boolean exists = w7.J(w11, null, false, true).exists();
            if (!z12 || !exists) {
                Bitmap K2 = ec.K(str, uri, g0.Z0(false), g0.Z0(false), true);
                if (K2 == null) {
                    K2 = ec.K(str, uri, 800.0f, 800.0f, true);
                }
                Bitmap bitmap = K2;
                if (!exists && (b03 = ec.b0(w11, bitmap, Bitmap.CompressFormat.JPEG, g0.Z0(false), g0.Z0(false), 80, false, 101, 101, false)) != w11) {
                    tL_photo.sizes.add(0, b03);
                }
                if (!z12 && (b02 = ec.b0(w10, bitmap, Bitmap.CompressFormat.JPEG, 90.0f, 90.0f, 55, true, 0, 0, false)) != w10) {
                    tL_photo.sizes.add(0, b02);
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        } else if (tLObject instanceof TLRPC.TL_document) {
            TLRPC.TL_document tL_document = (TLRPC.TL_document) tLObject;
            if ((fj.K4(tL_document) || fj.M3(tL_document)) && fj.W2(tL_document)) {
                int i10 = 320;
                TLRPC.PhotoSize w12 = w7.w(tL_document.thumbs, 320, false, null, false);
                if (!(w12 instanceof TLRPC.TL_photoStrippedSize) && !(w12 instanceof TLRPC.TL_photoPathSize)) {
                    w7.G(cVar.f23343a);
                    if (!w7.J(w12, null, true, true).exists()) {
                        Bitmap s5 = s(str, j3, null, false);
                        if (s5 == null) {
                            s5 = r(1, str);
                        }
                        Bitmap bitmap2 = s5;
                        if (z10) {
                            i10 = 90;
                        }
                        ArrayList<TLRPC.PhotoSize> arrayList = tL_document.thumbs;
                        float f10 = i10;
                        if (i10 > 90) {
                            i7 = 80;
                        } else {
                            i7 = 55;
                        }
                        int i11 = i7;
                        ThreadLocal threadLocal = ec.I;
                        arrayList.set(0, ec.b0(w12, bitmap2, Bitmap.CompressFormat.JPEG, f10, f10, i11, false, 0, 0, true));
                    }
                }
            }
        }
    }

    public static void x(String str, TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo, d20 d20Var) {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            try {
                mediaMetadataRetriever = new MediaMetadataRetriever();
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (extractMetadata != null) {
                tL_documentAttributeVideo.f28499w = Integer.parseInt(extractMetadata);
            }
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (extractMetadata2 != null) {
                tL_documentAttributeVideo.h = Integer.parseInt(extractMetadata2);
            }
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata3 != null) {
                tL_documentAttributeVideo.duration = Long.parseLong(extractMetadata3) / 1000.0d;
            }
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
            if (extractMetadata4 != null) {
                int intValue = Utilities.z(extractMetadata4).intValue();
                if (d20Var == null && (intValue == 90 || intValue == 270)) {
                    int i7 = tL_documentAttributeVideo.f28499w;
                    tL_documentAttributeVideo.f28499w = tL_documentAttributeVideo.h;
                    tL_documentAttributeVideo.h = i7;
                }
            }
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        } catch (Exception e12) {
            e = e12;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            a8.g(e, true);
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
            }
            try {
                MediaPlayer create = MediaPlayer.create(t0.f27013b, Uri.fromFile(new File(str)));
                if (create != null) {
                    tL_documentAttributeVideo.duration = create.getDuration() / 1000.0d;
                    tL_documentAttributeVideo.f28499w = create.getVideoWidth();
                    tL_documentAttributeVideo.h = create.getVideoHeight();
                    create.release();
                }
            } catch (Exception e14) {
                a8.g(e14, true);
            }
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (Exception e15) {
                    a8.g(e15, true);
                }
            }
            throw th;
        }
    }

    public static boolean x0(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str != null) {
            try {
                BitmapFactory.decodeFile(str, options);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        } else {
            try {
                InputStream openInputStream = t0.f27013b.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    openInputStream.close();
                }
            } catch (Exception unused) {
            }
        }
        if (options.outWidth < 800 && options.outHeight < 800) {
            return true;
        }
        return false;
    }

    public static TL_iv.PageBlock y0(TL_iv.PageBlock pageBlock) {
        TLRPC.InputGeoPoint inputGeoPoint;
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            TL_iv.inputPageBlockMap inputpageblockmap = new TL_iv.inputPageBlockMap();
            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
            if (!(geoPoint instanceof TLRPC.TL_geoPoint)) {
                inputGeoPoint = new TLRPC.TL_inputGeoPointEmpty();
            } else {
                TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                tL_inputGeoPoint.lat = geoPoint.lat;
                tL_inputGeoPoint._long = geoPoint._long;
                int i7 = geoPoint.accuracy_radius;
                if (i7 != 0) {
                    tL_inputGeoPoint.flags |= 1;
                    tL_inputGeoPoint.accuracy_radius = i7;
                }
                inputGeoPoint = tL_inputGeoPoint;
            }
            inputpageblockmap.geo = inputGeoPoint;
            inputpageblockmap.zoom = pageblockmap.zoom;
            inputpageblockmap.f28715w = pageblockmap.f28717w;
            inputpageblockmap.h = pageblockmap.h;
            inputpageblockmap.caption = pageblockmap.caption;
            return inputpageblockmap;
        }
        return pageBlock;
    }

    public static void z(c cVar, long j3, int i7) {
        g0.g3(new di.c9(cVar, j3, i7, 6));
    }

    public final TLRPC.TL_photo A(String str, Uri uri, boolean z10) {
        TLRPC.PhotoSize b02;
        Bitmap K2 = ec.K(str, uri, g0.Z0(z10), g0.Z0(z10), true);
        if (K2 == null) {
            K2 = ec.K(str, uri, 800.0f, 800.0f, true);
        }
        Bitmap bitmap = K2;
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize Z = ec.Z(bitmap, 90.0f, 90.0f, 55, true);
        if (Z != null) {
            arrayList.add(Z);
        }
        if (z10) {
            b02 = ec.b0(null, bitmap, Bitmap.CompressFormat.JPEG, g0.Z0(z10), g0.Z0(z10), 99, false, 101, 101, false);
        } else {
            b02 = ec.b0(null, bitmap, Bitmap.CompressFormat.JPEG, g0.Z0(z10), g0.Z0(z10), 80, false, 101, 101, false);
        }
        if (b02 != null) {
            arrayList.add(b02);
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        getUserConfig().v(false);
        TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
        tL_photo.date = getConnectionsManager().getCurrentTime();
        tL_photo.sizes = arrayList;
        tL_photo.file_reference = new byte[0];
        return tL_photo;
    }

    public final void A0(ly lyVar, TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        int i7 = ks.W1;
        if (inputMedia != null) {
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.media = inputMedia;
            TLObject tLObject = lyVar.f25576c;
            if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
                int i10 = 0;
                while (true) {
                    if (i10 >= tL_messages_sendMultiMedia.multi_media.size()) {
                        break;
                    } else if (tL_messages_sendMultiMedia.multi_media.get(i10).media == inputMedia) {
                        f0((TLRPC.Message) lyVar.f25596z.get(i10), lyVar.H);
                        getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                boolean z10 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                if (z10) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
                    TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
                    if (inputMedia2 instanceof TLRPC.TL_inputMediaPaidMedia) {
                        tL_messages_uploadMedia.peer = tL_messages_sendMedia.peer;
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia2;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= tL_inputMediaPaidMedia.extended_media.size()) {
                                break;
                            } else if (tL_inputMediaPaidMedia.extended_media.get(i11) == inputMedia) {
                                f0((TLRPC.Message) lyVar.f25596z.get(i11), lyVar.H);
                                getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (z10) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject;
                    TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                    if (inputMedia3 instanceof TLRPC.TL_inputMediaPoll) {
                        tL_messages_uploadMedia.peer = tL_messages_sendMedia2.peer;
                        int a10 = sh.d.a((TLRPC.TL_inputMediaPoll) inputMedia3, inputMedia);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= lyVar.C.size()) {
                                break;
                            } else if (((Integer) lyVar.C.get(i12)).intValue() == a10) {
                                f0((TLRPC.Message) lyVar.f25596z.get(i12), lyVar.H);
                                getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                boolean z11 = tLObject instanceof TL_ephemeral.TL_sendMessage;
                if (z11) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
                    TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
                    if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                        tL_messages_uploadMedia.peer = tL_sendMessage.peer;
                        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= tL_inputMediaPaidMedia2.extended_media.size()) {
                                break;
                            } else if (tL_inputMediaPaidMedia2.extended_media.get(i13) == inputMedia) {
                                f0((TLRPC.Message) lyVar.f25596z.get(i13), lyVar.H);
                                getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                if (z11) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject;
                    TLRPC.InputMedia inputMedia5 = tL_sendMessage2.media;
                    if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                        tL_messages_uploadMedia.peer = tL_sendMessage2.peer;
                        int a11 = sh.d.a((TLRPC.TL_inputMediaPoll) inputMedia5, inputMedia);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= lyVar.C.size()) {
                                break;
                            } else if (((Integer) lyVar.C.get(i14)).intValue() == a11) {
                                f0((TLRPC.Message) lyVar.f25596z.get(i14), lyVar.H);
                                getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_uploadMedia, new fx(this, inputMedia, lyVar, 1));
        } else if (inputEncryptedFile != null) {
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) lyVar.d;
            int i15 = 0;
            while (true) {
                if (i15 >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                    break;
                } else if (tL_messages_sendEncryptedMultiMedia.files.get(i15) == inputEncryptedFile) {
                    f0((TLRPC.Message) lyVar.f25596z.get(i15), lyVar.H);
                    getNotificationCenter().k(i7, str, -1L, -1L, Boolean.FALSE);
                    break;
                } else {
                    i15++;
                }
            }
            t0(lyVar, false);
        }
    }

    public final qy B(long j3) {
        return (qy) this.E.f(j3);
    }

    public final Boolean F(fj fjVar, TLRPC.TodoItem todoItem) {
        return (Boolean) this.I.get(Integer.valueOf(Objects.hash(Long.valueOf(fj.B0(fjVar.f24073k)), Integer.valueOf(fjVar.e1()), Integer.valueOf(todoItem.f28639id))));
    }

    public final long I(long j3) {
        return ((Long) this.f28486x.g(0L, j3)).longValue();
    }

    public final boolean J(int i7) {
        if (this.f28479c.indexOfKey(i7) < 0 && this.d.indexOfKey(i7) < 0) {
            return false;
        }
        return true;
    }

    public final void L(ly lyVar) {
        M(lyVar, -1);
    }

    public final void M(ly lyVar, int i7) {
        boolean z10;
        int i10;
        TLObject tLObject;
        boolean z11;
        TLRPC.InputFile inputFile;
        String str;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputMedia inputMedia2;
        fj fjVar;
        TLRPC.PhotoSize photoSize;
        ArrayList arrayList;
        ?? r22;
        TLRPC.MessageExtendedMedia messageExtendedMedia;
        TLRPC.MessageMedia messageMedia;
        TLRPC.InputMedia inputMedia3;
        TLRPC.PhotoSize photoSize2;
        int i11;
        TLRPC.InputMedia inputMedia4;
        TLRPC.InputPeer inputPeer2;
        String str2;
        d20 d20Var;
        TLRPC.InputMedia d;
        TLRPC.InputMedia inputMedia5;
        String str3;
        TLRPC.PhotoSize photoSize3;
        final zy zyVar = this;
        final ly lyVar2 = lyVar;
        int i12 = lyVar2.f25577e;
        boolean z12 = false;
        boolean z13 = true;
        if (i12 == 0) {
            String str4 = lyVar2.f25583l;
            if (str4 != null) {
                zyVar.e0(str4, lyVar2);
                ec.D().L(zyVar.currentAccount, lyVar2.f25583l, "file");
            } else if (lyVar2.f25576c != null) {
                w7.G(zyVar.currentAccount);
                String file = w7.I(lyVar2.f25579g).toString();
                zyVar.e0(file, lyVar2);
                zyVar.getFileLoader().h0(false, 16777216, file, true);
                zyVar.h0(lyVar2.f25584m);
            } else {
                w7.G(zyVar.currentAccount);
                String file2 = w7.I(lyVar2.f25579g).toString();
                if (lyVar2.d != null && (photoSize3 = lyVar2.f25579g) != null && photoSize3.location.dc_id != 0) {
                    File file3 = new File(file2);
                    if (!file3.exists()) {
                        w7.G(zyVar.currentAccount);
                        file2 = w7.J(lyVar2.f25579g, null, true, true).toString();
                        file3 = new File(file2);
                    }
                    if (!file3.exists()) {
                        zyVar.e0(w7.r(null, lyVar2.f25579g), lyVar2);
                        zyVar.getFileLoader().V(fc.f(lyVar2.f25579g, lyVar2.h), lyVar2.K, "jpg", 3, 0);
                        return;
                    }
                }
                zyVar.e0(file2, lyVar2);
                zyVar.getFileLoader().h0(true, 16777216, file2, true);
                zyVar.h0(lyVar2.f25584m);
            }
        } else if (i12 == 1) {
            d20 d20Var2 = lyVar2.f25586o;
            if (d20Var2 != null && d20Var2.c() && lyVar2.f25587p) {
                fj fjVar2 = lyVar2.f25584m;
                String str5 = fjVar2.f24073k.attachPath;
                TLRPC.Document F0 = fjVar2.F0();
                if (str5 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w7.z(4));
                    sb2.append("/");
                    sb2.append(F0.f28498id);
                    sb2.append(".");
                    if (lyVar2.f25586o.N) {
                        str3 = "webm";
                    } else {
                        str3 = "mp4";
                    }
                    sb2.append(str3);
                    str5 = sb2.toString();
                }
                zyVar.e0(str5, lyVar2);
                lyVar2.f25586o.getClass();
                MediaController.B().h0(lyVar2.f25584m, false, true, false);
                zyVar.h0(lyVar2.f25584m);
                return;
            }
            d20 d20Var3 = lyVar2.f25586o;
            if (d20Var3 != null) {
                TLRPC.InputFile inputFile2 = d20Var3.f23608w;
                if (inputFile2 != null) {
                    i11 = 4;
                    TLObject tLObject2 = lyVar2.f25576c;
                    if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                        inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject2).media;
                    } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                        inputMedia5 = ((TL_ephemeral.TL_sendMessage) tLObject2).media;
                    } else if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
                        inputMedia5 = ((TLRPC.TL_messages_addPollAnswer) tLObject2).answer.input_media;
                    } else {
                        inputMedia5 = ((TLRPC.TL_messages_editMessage) tLObject2).media;
                    }
                    inputMedia5.file = inputFile2;
                    d20Var3.f23608w = null;
                } else {
                    i11 = 4;
                    if (d20Var3.f23609x != null) {
                        TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) lyVar2.d;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                        decryptedMessageMedia.size = d20Var3.f23603q;
                        decryptedMessageMedia.key = d20Var3.f23610y;
                        decryptedMessageMedia.iv = d20Var3.f23611z;
                        xv secretChatHelper = zyVar.getSecretChatHelper();
                        fj fjVar3 = lyVar2.f25584m;
                        secretChatHelper.j(tL_decryptedMessage, fjVar3.f24073k, lyVar2.f25585n, lyVar2.f25586o.f23609x, lyVar2.f25578f, fjVar3);
                        lyVar2.f25586o.f23609x = null;
                        return;
                    }
                }
            } else {
                i11 = 4;
            }
            TLObject tLObject3 = lyVar2.f25576c;
            if (tLObject3 != null) {
                if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject3;
                    inputMedia4 = tL_messages_sendMedia.media;
                    inputPeer2 = tL_messages_sendMedia.peer;
                } else if (tLObject3 instanceof TL_ephemeral.TL_sendMessage) {
                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject3;
                    inputMedia4 = tL_sendMessage.media;
                    inputPeer2 = tL_sendMessage.peer;
                } else if (tLObject3 instanceof TLRPC.TL_messages_addPollAnswer) {
                    TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject3;
                    inputMedia4 = tL_messages_addPollAnswer.answer.input_media;
                    inputPeer2 = tL_messages_addPollAnswer.peer;
                } else {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject3;
                    inputMedia4 = tL_messages_editMessage.media;
                    inputPeer2 = tL_messages_editMessage.peer;
                }
                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                    if (!tL_inputMediaPaidMedia.extended_media.isEmpty()) {
                        inputMedia4 = tL_inputMediaPaidMedia.extended_media.get(0);
                    }
                }
                if ((inputMedia4 instanceof TLRPC.TL_inputMediaPoll) && (d = sh.d.d((TLRPC.TL_inputMediaPoll) inputMedia4)) != null) {
                    inputMedia4 = d;
                }
                TLRPC.InputFile inputFile3 = inputMedia4.file;
                if (inputFile3 == null && !(inputMedia4 instanceof TLRPC.TL_inputMediaDocument) && lyVar2.f25587p) {
                    fj fjVar4 = lyVar2.f25584m;
                    String str6 = fjVar4.f24073k.attachPath;
                    TLRPC.Document F02 = fjVar4.F0();
                    TLRPC.TL_document tL_document = lyVar2.f25584m.E1;
                    if (tL_document != null) {
                        F02 = tL_document;
                    }
                    if (str6 == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w7.z(i11));
                        sb3.append("/");
                        str6 = a8.p0.r(sb3, F02.f28498id, ".mp4");
                    }
                    String str7 = str6;
                    zyVar.e0(str7, lyVar2);
                    d20 d20Var4 = lyVar2.f25584m.f24101r0;
                    if (d20Var4 == null || !d20Var4.P) {
                        if (d20Var4 != null && d20Var4.c()) {
                            zyVar.getFileLoader().g0(str7, false, false, F02.size, 33554432, false);
                        } else {
                            zyVar.getFileLoader().h0(false, 33554432, str7, false);
                        }
                    }
                    zyVar.h0(lyVar2.f25584m);
                    return;
                }
                TLRPC.InputPhoto inputPhoto = inputMedia4.video_cover;
                if (inputPhoto == null && lyVar2.f25581j == null && lyVar2.f25580i != null && lyVar2.f25588q) {
                    String str8 = w7.z(i11) + "/" + lyVar2.f25580i.location.volume_id + "_" + lyVar2.f25580i.location.local_id + ".jpg";
                    zyVar.e0(str8, lyVar2);
                    zyVar.getFileLoader().h0(false, 16777216, str8, true);
                    zyVar.h0(lyVar2.f25584m);
                    return;
                } else if (lyVar2.f25582k && (inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputFile3 != null && lyVar2.f25581j != null) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = inputPeer2;
                    inputMedia4.flags &= -65;
                    inputMedia4.video_cover = null;
                    tL_messages_uploadMedia.media = inputMedia4;
                    final boolean z14 = inputMedia4.spoiler;
                    final int i13 = inputMedia4.ttl_seconds;
                    zyVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error) {
                            g0.g3(new di.da(zy.this, tLObject4, lyVar2, z14, i13));
                        }
                    });
                    return;
                } else if (inputPhoto == null && lyVar2.f25581j != null && lyVar2.f25588q) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia2 = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia2.peer = inputPeer2;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = lyVar2.f25581j;
                    tL_messages_uploadMedia2.media = tL_inputMediaUploadedPhoto;
                    zyVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia2, new fx(zyVar, inputMedia4, lyVar2, 0));
                    return;
                } else {
                    fj fjVar5 = lyVar2.f25584m;
                    if (fjVar5 != null && (d20Var = fjVar5.f24101r0) != null && d20Var.N) {
                        str2 = "webp";
                    } else {
                        str2 = "jpg";
                    }
                    String str9 = w7.z(i11) + "/" + lyVar2.f25579g.location.volume_id + "_" + lyVar2.f25579g.location.local_id + "." + str2;
                    zyVar.e0(str9, lyVar2);
                    zyVar.getFileLoader().h0(false, 16777216, str9, true);
                    zyVar.h0(lyVar2.f25584m);
                    return;
                }
            }
            fj fjVar6 = lyVar2.f25584m;
            String str10 = fjVar6.f24073k.attachPath;
            TLRPC.Document F03 = fjVar6.F0();
            if (str10 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(w7.z(i11));
                sb4.append("/");
                str10 = a8.p0.r(sb4, F03.f28498id, ".mp4");
            }
            if (lyVar2.d != null && F03.dc_id != 0) {
                File file4 = new File(str10);
                if (!file4.exists()) {
                    w7 fileLoader = zyVar.getFileLoader();
                    TLRPC.Message message = lyVar2.f25584m.f24073k;
                    fileLoader.getClass();
                    file4 = w7.M(message, false, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message2 = lyVar2.f25584m.f24073k;
                        String absolutePath = file4.getAbsolutePath();
                        message2.attachPath = absolutePath;
                        lyVar2.f25584m.f24128y0 = true;
                        str10 = absolutePath;
                    }
                }
                if (file4 == null || (!file4.exists() && lyVar2.f25584m.F0() != null)) {
                    w7 fileLoader2 = zyVar.getFileLoader();
                    TLRPC.Document F04 = lyVar2.f25584m.F0();
                    fileLoader2.getClass();
                    file4 = w7.J(F04, null, false, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message3 = lyVar2.f25584m.f24073k;
                        String absolutePath2 = file4.getAbsolutePath();
                        message3.attachPath = absolutePath2;
                        lyVar2.f25584m.f24128y0 = true;
                        str10 = absolutePath2;
                    }
                }
                if (file4 == null || (!file4.exists() && lyVar2.f25584m.F0() != null)) {
                    w7 fileLoader3 = zyVar.getFileLoader();
                    TLRPC.Document F05 = lyVar2.f25584m.F0();
                    fileLoader3.getClass();
                    file4 = w7.J(F05, null, true, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message4 = lyVar2.f25584m.f24073k;
                        String absolutePath3 = file4.getAbsolutePath();
                        message4.attachPath = absolutePath3;
                        lyVar2.f25584m.f24128y0 = true;
                        str10 = absolutePath3;
                    }
                }
                if (file4 == null || !file4.exists()) {
                    zyVar.e0(w7.r(null, F03), lyVar2);
                    zyVar.getFileLoader().W(F03, lyVar2.K, 3, 0);
                    return;
                }
            }
            String str11 = str10;
            zyVar.e0(str11, lyVar2);
            d20 d20Var5 = lyVar2.f25584m.f24101r0;
            if (d20Var5 == null || !d20Var5.P) {
                if (d20Var5 != null && d20Var5.c()) {
                    zyVar.getFileLoader().g0(str11, true, false, F03.size, 33554432, false);
                } else {
                    zyVar.getFileLoader().h0(true, 33554432, str11, false);
                }
            }
            zyVar.h0(lyVar2.f25584m);
        } else if (i12 == 2) {
            String str12 = lyVar2.f25583l;
            if (str12 != null) {
                zyVar.e0(str12, lyVar2);
                ec.D().L(zyVar.currentAccount, lyVar2.f25583l, "gif");
                return;
            }
            TLObject tLObject4 = lyVar2.f25576c;
            if (tLObject4 != null) {
                if (tLObject4 instanceof TLRPC.TL_messages_sendMedia) {
                    inputMedia3 = ((TLRPC.TL_messages_sendMedia) tLObject4).media;
                } else if (tLObject4 instanceof TL_ephemeral.TL_sendMessage) {
                    inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject4).media;
                } else if (tLObject4 instanceof TLRPC.TL_messages_addPollAnswer) {
                    inputMedia3 = ((TLRPC.TL_messages_addPollAnswer) tLObject4).answer.input_media;
                } else {
                    inputMedia3 = ((TLRPC.TL_messages_editMessage) tLObject4).media;
                }
                if (inputMedia3.file == null) {
                    String str13 = lyVar2.f25584m.f24073k.attachPath;
                    zyVar.e0(str13, lyVar2);
                    w7 fileLoader4 = zyVar.getFileLoader();
                    if (lyVar2.f25576c != null) {
                        z13 = false;
                    }
                    fileLoader4.h0(z13, 67108864, str13, false);
                    zyVar.h0(lyVar2.f25584m);
                    return;
                } else if (inputMedia3.thumb == null && (photoSize2 = lyVar2.f25579g) != null && !(photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                    String str14 = w7.z(4) + "/" + lyVar2.f25579g.location.volume_id + "_" + lyVar2.f25579g.location.local_id + ".jpg";
                    zyVar.e0(str14, lyVar2);
                    zyVar.getFileLoader().h0(false, 16777216, str14, true);
                    zyVar.h0(lyVar2.f25584m);
                    return;
                } else {
                    return;
                }
            }
            fj fjVar7 = lyVar2.f25584m;
            String str15 = fjVar7.f24073k.attachPath;
            TLRPC.Document F06 = fjVar7.F0();
            if (lyVar2.d != null && F06.dc_id != 0) {
                File file5 = new File(str15);
                if (!file5.exists()) {
                    w7 fileLoader5 = zyVar.getFileLoader();
                    TLRPC.Message message5 = lyVar2.f25584m.f24073k;
                    fileLoader5.getClass();
                    file5 = w7.M(message5, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message6 = lyVar2.f25584m.f24073k;
                        String absolutePath4 = file5.getAbsolutePath();
                        message6.attachPath = absolutePath4;
                        lyVar2.f25584m.f24128y0 = true;
                        str15 = absolutePath4;
                    }
                }
                if (file5 == null || (!file5.exists() && lyVar2.f25584m.F0() != null)) {
                    w7 fileLoader6 = zyVar.getFileLoader();
                    TLRPC.Document F07 = lyVar2.f25584m.F0();
                    fileLoader6.getClass();
                    file5 = w7.J(F07, null, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message7 = lyVar2.f25584m.f24073k;
                        String absolutePath5 = file5.getAbsolutePath();
                        message7.attachPath = absolutePath5;
                        lyVar2.f25584m.f24128y0 = true;
                        str15 = absolutePath5;
                    }
                }
                if (file5 == null || (!file5.exists() && lyVar2.f25584m.F0() != null)) {
                    w7 fileLoader7 = zyVar.getFileLoader();
                    TLRPC.Document F08 = lyVar2.f25584m.F0();
                    fileLoader7.getClass();
                    file5 = w7.J(F08, null, true, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message8 = lyVar2.f25584m.f24073k;
                        String absolutePath6 = file5.getAbsolutePath();
                        message8.attachPath = absolutePath6;
                        lyVar2.f25584m.f24128y0 = true;
                        str15 = absolutePath6;
                    }
                }
                if (file5 == null || !file5.exists()) {
                    zyVar.e0(w7.r(null, F06), lyVar2);
                    zyVar.getFileLoader().W(F06, lyVar2.K, 3, 0);
                    return;
                }
            }
            zyVar.e0(str15, lyVar2);
            zyVar.getFileLoader().h0(true, 67108864, str15, false);
            zyVar.h0(lyVar2.f25584m);
        } else if (i12 == 3) {
            String str16 = lyVar2.f25584m.f24073k.attachPath;
            zyVar.e0(str16, lyVar2);
            w7 fileLoader8 = zyVar.getFileLoader();
            if (lyVar2.f25576c == null) {
                z12 = true;
            }
            fileLoader8.h0(z12, 50331648, str16, true);
            zyVar.h0(lyVar2.f25584m);
        } else if (i12 == 4) {
            if (i7 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!lyVar2.f25587p && !lyVar2.f25588q) {
                if (!lyVar2.f25594x.isEmpty()) {
                    TLRPC.Message message9 = ((fj) i5.c.h(1, lyVar2.f25594x)).f24073k;
                    if (lyVar2.G != 0) {
                        z12 = true;
                    }
                    zyVar.f0(message9, z12);
                }
            } else {
                if (i7 < 0) {
                    i10 = lyVar2.f25594x.size() - 1;
                } else {
                    i10 = i7;
                }
                fj fjVar8 = (fj) lyVar2.f25594x.get(i10);
                TLRPC.Document F09 = fjVar8.F0();
                if (F09 == null && (fj.m1(fjVar8) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) fj.m1(fjVar8);
                    if (i10 >= tL_messageMediaPaidMedia.extended_media.size()) {
                        messageExtendedMedia = null;
                    } else {
                        messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i10);
                    }
                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                        messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                    } else {
                        messageMedia = null;
                    }
                    F09 = messageMedia == null ? null : messageMedia.document;
                }
                if (F09 == null && (fj.m1(fjVar8) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.MessageMedia f10 = sh.d.f((TLRPC.TL_messageMediaPoll) fj.m1(fjVar8), ((Integer) lyVar2.C.get(i10)).intValue());
                    if (f10 == null) {
                        F09 = null;
                    } else {
                        F09 = f10.document;
                    }
                }
                if (F09 != null) {
                    d20 d20Var6 = lyVar2.f25586o;
                    if (d20Var6 != null && d20Var6.c() && lyVar2.f25587p) {
                        String str17 = fjVar8.f24073k.attachPath;
                        if (str17 == null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(w7.z(4));
                            sb5.append("/");
                            str17 = a8.p0.r(sb5, F09.f28498id, ".mp4");
                        }
                        zyVar.e0(str17, lyVar2);
                        lyVar2.E.put(fjVar8, str17);
                        lyVar2.E.put(str17 + "_i", fjVar8);
                        TLRPC.PhotoSize photoSize4 = lyVar2.f25579g;
                        if (photoSize4 != null && photoSize4.location != null) {
                            lyVar2.E.put(p5.c.v(str17, "_t"), lyVar2.f25579g);
                        }
                        TLRPC.PhotoSize photoSize5 = lyVar2.f25580i;
                        if (photoSize5 != null && photoSize5.location != null) {
                            lyVar2.E.put(p5.c.v(str17, "_ct"), lyVar2.f25580i);
                        }
                        lyVar2.f25586o.getClass();
                        MediaController.B().h0(fjVar8, false, true, false);
                        lyVar2.f25584m = fjVar8;
                        zyVar.h0(fjVar8);
                    } else {
                        String str18 = fjVar8.f24073k.attachPath;
                        if (str18 != null) {
                            str = "_ct";
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(w7.z(4));
                            sb6.append("/");
                            str = "_ct";
                            str18 = a8.p0.r(sb6, F09.f28498id, ".mp4");
                        }
                        TLObject tLObject5 = lyVar2.f25576c;
                        if (tLObject5 != null) {
                            if (tLObject5 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject5;
                                inputPeer = tL_messages_sendMultiMedia.peer;
                                inputMedia = tL_messages_sendMultiMedia.multi_media.get(i10).media;
                            } else if (tLObject5 instanceof TLRPC.TL_messages_sendMedia) {
                                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject5;
                                inputPeer = tL_messages_sendMedia2.peer;
                                TLRPC.InputMedia inputMedia6 = tL_messages_sendMedia2.media;
                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia6).extended_media.get(i10);
                                } else {
                                    if (inputMedia6 instanceof TLRPC.TL_inputMediaPoll) {
                                        inputMedia = sh.d.e((TLRPC.TL_inputMediaPoll) inputMedia6, ((Integer) lyVar2.C.get(i10)).intValue());
                                    }
                                    inputMedia = null;
                                }
                            } else if (tLObject5 instanceof TL_ephemeral.TL_sendMessage) {
                                TL_ephemeral.TL_sendMessage tL_sendMessage2 = (TL_ephemeral.TL_sendMessage) tLObject5;
                                inputPeer = tL_sendMessage2.peer;
                                TLRPC.InputMedia inputMedia7 = tL_sendMessage2.media;
                                if (inputMedia7 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    inputMedia = ((TLRPC.TL_inputMediaPaidMedia) inputMedia7).extended_media.get(i10);
                                } else {
                                    if (inputMedia7 instanceof TLRPC.TL_inputMediaPoll) {
                                        inputMedia = sh.d.e((TLRPC.TL_inputMediaPoll) inputMedia7, ((Integer) lyVar2.C.get(i10)).intValue());
                                    }
                                    inputMedia = null;
                                }
                            } else {
                                inputMedia = null;
                                inputPeer = null;
                            }
                            if (inputMedia != null && inputMedia.file == null && !(inputMedia instanceof TLRPC.TL_inputMediaDocument) && lyVar2.f25587p) {
                                zyVar.e0(str18, lyVar2);
                                lyVar2.E.put(fjVar8, str18);
                                lyVar2.E.put(str18, inputMedia);
                                lyVar2.E.put(str18 + "_i", fjVar8);
                                TLRPC.PhotoSize photoSize6 = lyVar2.f25579g;
                                if (photoSize6 != null && photoSize6.location != null) {
                                    lyVar2.E.put(p5.c.v(str18, "_t"), lyVar2.f25579g);
                                }
                                TLRPC.PhotoSize photoSize7 = lyVar2.f25580i;
                                if (photoSize7 != null && photoSize7.location != null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(w7.z(4));
                                    sb7.append("/");
                                    sb7.append(lyVar2.f25580i.location.volume_id);
                                    sb7.append("_");
                                    String n10 = a8.p0.n(lyVar2.f25580i.location.local_id, ".jpg", sb7);
                                    lyVar2.E.put(p5.c.v(str18, str), lyVar2.f25580i);
                                    lyVar2.E.put(n10 + "_doc", str18);
                                }
                                d20 d20Var7 = fjVar8.f24101r0;
                                if (d20Var7 != null && d20Var7.c()) {
                                    zyVar.getFileLoader().g0(str18, false, false, F09.size, 33554432, false);
                                } else {
                                    zyVar.getFileLoader().h0(false, 33554432, str18, false);
                                }
                                zyVar.h0(fjVar8);
                            } else {
                                String str19 = str;
                                String str20 = str18;
                                TLRPC.PhotoSize photoSize8 = lyVar2.f25580i;
                                if (photoSize8 != null) {
                                    photoSize = photoSize8;
                                    if (lyVar2.f25581j == null && inputMedia != null && inputMedia.video_cover == null) {
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append(w7.z(4));
                                        sb8.append("/");
                                        TLRPC.InputMedia inputMedia8 = inputMedia;
                                        sb8.append(lyVar2.f25580i.location.volume_id);
                                        sb8.append("_");
                                        sb8.append(lyVar2.f25580i.location.local_id);
                                        sb8.append(".jpg");
                                        String sb9 = sb8.toString();
                                        zyVar.e0(sb9, lyVar2);
                                        TLRPC.PhotoSize photoSize9 = lyVar2.f25580i;
                                        if (photoSize9 != null && photoSize9.location != null) {
                                            StringBuilder sb10 = new StringBuilder();
                                            sb10.append(w7.z(4));
                                            sb10.append("/");
                                            sb10.append(lyVar2.f25580i.location.volume_id);
                                            sb10.append("_");
                                            String n11 = a8.p0.n(lyVar2.f25580i.location.local_id, ".jpg", sb10);
                                            lyVar2.E.put(p5.c.v(str20, str19), lyVar2.f25580i);
                                            lyVar2.E.put(n11 + "_doc", str20);
                                        }
                                        lyVar2.E.put(sb9 + "_o", str20);
                                        lyVar2.E.put(str20 + "_i", fjVar8);
                                        lyVar2.E.put(fjVar8, sb9);
                                        lyVar2.E.put(sb9, inputMedia8);
                                        zyVar.getFileLoader().h0(false, 16777216, sb9, true);
                                        zyVar.h0(fjVar8);
                                    } else {
                                        inputMedia2 = inputMedia;
                                        fjVar = fjVar8;
                                    }
                                } else {
                                    inputMedia2 = inputMedia;
                                    fjVar = fjVar8;
                                    photoSize = photoSize8;
                                }
                                if (photoSize != null && lyVar2.f25581j != null && inputMedia2 != null && inputMedia2.video_cover == null && (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputMedia2.file != null && (lyVar2.f25576c instanceof TLRPC.TL_messages_sendMultiMedia) && (arrayList = lyVar2.D) != null && i10 >= 0 && i10 < arrayList.size() && Boolean.TRUE.equals(lyVar2.D.get(i10))) {
                                    TLRPC.InputFile inputFile4 = lyVar2.f25581j;
                                    inputMedia2.flags &= -65;
                                    inputMedia2.video_cover = null;
                                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia3 = new TLRPC.TL_messages_uploadMedia();
                                    tL_messages_uploadMedia3.peer = inputPeer;
                                    tL_messages_uploadMedia3.media = inputMedia2;
                                    ConnectionsManager connectionsManager = zyVar.getConnectionsManager();
                                    gx gxVar = new gx(i10, 0, this, inputMedia2, lyVar2, str20, inputFile4);
                                    lyVar2 = lyVar2;
                                    connectionsManager.sendRequest(tL_messages_uploadMedia3, gxVar);
                                    r22 = 0;
                                    zyVar = this;
                                    lyVar2.f25586o = r22;
                                    lyVar2.f25579g = r22;
                                    lyVar2.f25580i = r22;
                                    inputFile = r22;
                                } else {
                                    TLRPC.InputMedia inputMedia9 = inputMedia2;
                                    if (lyVar2.f25580i != null && lyVar2.f25581j != null && inputMedia9 != null && inputMedia9.video_cover == null) {
                                        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia4 = new TLRPC.TL_messages_uploadMedia();
                                        tL_messages_uploadMedia4.peer = inputPeer;
                                        TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto2 = new TLRPC.TL_inputMediaUploadedPhoto();
                                        tL_inputMediaUploadedPhoto2.file = lyVar2.f25581j;
                                        tL_messages_uploadMedia4.media = tL_inputMediaUploadedPhoto2;
                                        zyVar = this;
                                        getConnectionsManager().sendRequest(tL_messages_uploadMedia4, new yn(zyVar, inputMedia9, lyVar2, str20, fjVar, 4));
                                    } else {
                                        zyVar = this;
                                        if (lyVar2.f25579g != null) {
                                            String str21 = w7.z(4) + "/" + lyVar2.f25579g.location.volume_id + "_" + lyVar2.f25579g.location.local_id + ".jpg";
                                            zyVar.e0(str21, lyVar2);
                                            lyVar2.E.put(str21 + "_o", str20);
                                            lyVar2.E.put(fjVar, str21);
                                            lyVar2.E.put(str21, inputMedia9);
                                            zyVar.getFileLoader().h0(false, 16777216, str21, true);
                                            zyVar.h0(fjVar);
                                        }
                                    }
                                }
                            }
                        } else {
                            String str22 = str18;
                            zyVar.e0(str22, lyVar2);
                            lyVar2.E.put(fjVar8, str22);
                            lyVar2.E.put(str22, ((TLRPC.TL_messages_sendEncryptedMultiMedia) lyVar2.d).files.get(i10));
                            lyVar2.E.put(str22 + "_i", fjVar8);
                            TLRPC.PhotoSize photoSize10 = lyVar2.f25579g;
                            if (photoSize10 != null && photoSize10.location != null) {
                                lyVar2.E.put(p5.c.v(str22, "_t"), lyVar2.f25579g);
                            }
                            d20 d20Var8 = fjVar8.f24101r0;
                            if (d20Var8 != null && d20Var8.c()) {
                                zyVar.getFileLoader().g0(str22, true, false, F09.size, 33554432, false);
                            } else {
                                zyVar.getFileLoader().h0(true, 33554432, str22, false);
                            }
                            zyVar.h0(fjVar8);
                        }
                    }
                    r22 = 0;
                    lyVar2.f25586o = r22;
                    lyVar2.f25579g = r22;
                    lyVar2.f25580i = r22;
                    inputFile = r22;
                } else {
                    String str23 = lyVar2.f25583l;
                    if (str23 != null) {
                        zyVar.e0(str23, lyVar2);
                        lyVar2.E.put(fjVar8, lyVar2.f25583l);
                        lyVar2.E.put(lyVar2.f25583l, fjVar8);
                        ec.D().L(zyVar.currentAccount, lyVar2.f25583l, "file");
                        inputFile = null;
                        lyVar2.f25583l = null;
                    } else {
                        TLObject tLObject6 = lyVar2.f25576c;
                        if (tLObject6 instanceof TLRPC.TL_messages_sendMultiMedia) {
                            tLObject = ((TLRPC.TL_messages_sendMultiMedia) tLObject6).multi_media.get(i10).media;
                        } else {
                            boolean z15 = tLObject6 instanceof TLRPC.TL_messages_sendMedia;
                            if (z15) {
                                TLRPC.InputMedia inputMedia10 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                                if (inputMedia10 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia10).extended_media.get(i10);
                                }
                            }
                            if (z15) {
                                TLRPC.InputMedia inputMedia11 = ((TLRPC.TL_messages_sendMedia) tLObject6).media;
                                if (inputMedia11 instanceof TLRPC.TL_inputMediaPoll) {
                                    tLObject = sh.d.e((TLRPC.TL_inputMediaPoll) inputMedia11, ((Integer) lyVar2.C.get(i10)).intValue());
                                }
                            }
                            boolean z16 = tLObject6 instanceof TL_ephemeral.TL_sendMessage;
                            if (z16) {
                                TLRPC.InputMedia inputMedia12 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                                if (inputMedia12 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                    tLObject = ((TLRPC.TL_inputMediaPaidMedia) inputMedia12).extended_media.get(i10);
                                }
                            }
                            if (z16) {
                                TLRPC.InputMedia inputMedia13 = ((TL_ephemeral.TL_sendMessage) tLObject6).media;
                                if (inputMedia13 instanceof TLRPC.TL_inputMediaPoll) {
                                    tLObject = sh.d.e((TLRPC.TL_inputMediaPoll) inputMedia13, ((Integer) lyVar2.C.get(i10)).intValue());
                                }
                            }
                            tLObject = ((TLRPC.TL_messages_sendEncryptedMultiMedia) lyVar2.d).files.get(i10);
                        }
                        w7.G(zyVar.currentAccount);
                        String file6 = w7.I(lyVar2.f25579g).toString();
                        zyVar.e0(file6, lyVar2);
                        lyVar2.E.put(file6, tLObject);
                        lyVar2.E.put(fjVar8, file6);
                        w7 fileLoader9 = zyVar.getFileLoader();
                        if (lyVar2.d != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        fileLoader9.h0(z11, 16777216, file6, true);
                        zyVar.h0(fjVar8);
                        inputFile = null;
                        lyVar2.f25579g = null;
                    }
                }
                lyVar2.f25581j = inputFile;
                lyVar2.f25587p = false;
                lyVar2.f25588q = false;
            }
            zyVar.t0(lyVar2, z10);
        } else if (i12 == 5) {
            String str24 = "stickerset_" + lyVar2.f25584m.e1();
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = (TLRPC.InputStickerSet) lyVar2.K;
            zyVar.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ci(zyVar, lyVar2, str24, 10));
            zyVar.e0(str24, lyVar2);
        }
    }

    public final void N(TLObject tLObject, fj fjVar, String str, ly lyVar, Object obj, HashMap hashMap, boolean z10) {
        O(tLObject, fjVar, str, null, false, lyVar, obj, hashMap, z10);
    }

    public final void O(TLObject tLObject, final fj fjVar, final String str, final ly lyVar, final boolean z10, final ly lyVar2, final Object obj, final HashMap hashMap, final boolean z11) {
        ly y10;
        ArrayList arrayList;
        TLObject tLObject2 = tLObject;
        if (tLObject2 instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject;
            TLRPC.InputMedia inputMedia = tL_messages_addPollAnswer.answer.input_media;
            if (!(inputMedia instanceof TLRPC.TL_inputMediaUploadedDocument) && !(inputMedia instanceof TLRPC.TL_inputMediaUploadedPhoto)) {
                tLObject2 = tLObject;
            } else {
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = tL_messages_addPollAnswer.peer;
                tL_messages_uploadMedia.media = tL_messages_addPollAnswer.answer.input_media;
                getConnectionsManager().sendRequest(tL_messages_uploadMedia, new hx(this, tL_messages_addPollAnswer, tLObject, fjVar, str, lyVar, z10, lyVar2, obj, hashMap, z11));
                return;
            }
        }
        int i7 = 0;
        boolean z12 = false;
        if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage) && z10 && (y10 = y(fjVar.e1(), fj.B0(fjVar.f24073k))) != null) {
            if (lyVar != null) {
                z12 = lyVar.H;
            }
            ?? obj2 = new Object();
            obj2.f25953a = tLObject2;
            obj2.f25954b = fjVar;
            obj2.d = str;
            obj2.f25958g = lyVar2;
            obj2.h = obj;
            obj2.f25959i = z12;
            if (y10.f25575b == null) {
                y10.f25575b = new ArrayList();
            }
            y10.f25575b.add(obj2);
            if (lyVar != null && (arrayList = lyVar.f25575b) != null) {
                y10.f25575b.addAll(arrayList);
                return;
            }
            return;
        }
        TLRPC.Message message = fjVar.f24073k;
        f0(message, z11);
        di.y8 y11 = di.y8.y(this.currentAccount, false);
        hw hwVar = new hw(this, tLObject2, fjVar, str, lyVar, z10, lyVar2, obj, hashMap, z11, 1);
        if (fjVar.f24073k != null) {
            int e12 = fjVar.e1();
            if (di.y8.o(tLObject) > 0 && y11.Q.remove(Integer.valueOf(e12))) {
                y11.R.put(Integer.valueOf(e12), hwVar);
                return;
            }
        }
        if (f2.b(this.currentAccount).a(tLObject, Collections.singletonList(fjVar), new hw(this, tLObject, fjVar, str, lyVar, z10, lyVar2, obj, hashMap, z11, 2))) {
            if (bg.x.g(this.currentAccount).a(tLObject, Collections.singletonList(fjVar), new w10() {
                @Override
                public final void a(Object obj3) {
                    boolean z13 = z11;
                    zy.this.O((TLObject) obj3, fjVar, str, lyVar, z10, lyVar2, obj, hashMap, z13);
                }
            })) {
                ConnectionsManager connectionsManager = getConnectionsManager();
                hx hxVar = new hx(this, tLObject, fjVar, str, lyVar, z10, lyVar2, obj, hashMap, z11, message);
                o oVar = new o(6, this, message);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    i7 = 128;
                }
                message.reqId = connectionsManager.sendRequest(tLObject, hxVar, oVar, i7 | 68);
                if (lyVar != null) {
                    lyVar.d();
                }
            }
        }
    }

    public final void P(final TLObject tLObject, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ly lyVar, final boolean z10) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            f0(((fj) arrayList.get(i7)).f24073k, z10);
        }
        if (!di.y8.y(this.currentAccount, false).c(tLObject, arrayList, new Runnable(this) {
            public final zy f28461b;

            {
                this.f28461b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        this.f28461b.P(tLObject, arrayList, arrayList2, arrayList3, lyVar, z10);
                        return;
                    default:
                        this.f28461b.P(tLObject, arrayList, arrayList2, arrayList3, lyVar, z10);
                        return;
                }
            }
        }) || !f2.b(this.currentAccount).a(tLObject, arrayList, new Runnable(this) {
            public final zy f28461b;

            {
                this.f28461b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        this.f28461b.P(tLObject, arrayList, arrayList2, arrayList3, lyVar, z10);
                        return;
                    default:
                        this.f28461b.P(tLObject, arrayList, arrayList2, arrayList3, lyVar, z10);
                        return;
                }
            }
        }) || !bg.x.g(this.currentAccount).a(tLObject, arrayList, new w10() {
            @Override
            public final void a(Object obj) {
                boolean z11 = z10;
                zy.this.P((TLObject) obj, arrayList, arrayList2, arrayList3, lyVar, z11);
            }
        })) {
            return;
        }
        getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                ArrayList arrayList4;
                boolean z11;
                boolean z12;
                boolean[] zArr;
                Object obj;
                zy zyVar = zy.this;
                TLObject tLObject3 = tLObject;
                ArrayList arrayList5 = arrayList;
                ArrayList arrayList6 = arrayList2;
                boolean z13 = z10;
                if (tL_error != null && q8.r(tL_error.text)) {
                    int c10 = q8.c(tL_error.text);
                    ArrayList arrayList7 = arrayList3;
                    arrayList4 = arrayList6;
                    z11 = z13;
                    ly lyVar2 = lyVar;
                    if (arrayList7 != null) {
                        ArrayList arrayList8 = new ArrayList(arrayList7);
                        if (c10 >= 0) {
                            for (int i10 = 0; i10 < arrayList8.size(); i10++) {
                                if (c10 == i10) {
                                    obj = arrayList8.get(i10);
                                } else {
                                    obj = null;
                                }
                                arrayList8.set(i10, obj);
                            }
                        }
                        zyVar.getFileRefController().u(new Object[]{tLObject3, arrayList5, arrayList4, arrayList8, lyVar2, Boolean.valueOf(z11)}, arrayList8);
                        return;
                    } else if (lyVar2 != null) {
                        if (c10 >= 0 && (zArr = lyVar2.f25590s) != null && c10 < zArr.length) {
                            z12 = zArr[c10];
                        } else {
                            z12 = lyVar2.f25589r;
                        }
                        if (!z12) {
                            if (c10 < 0) {
                                lyVar2.f25589r = true;
                            } else {
                                if (lyVar2.f25590s == null) {
                                    lyVar2.f25590s = new boolean[lyVar2.f25594x.size()];
                                }
                                lyVar2.f25590s[c10] = true;
                            }
                            g0.g3(new a5(zyVar, tLObject3, c10, lyVar2, arrayList5, z11));
                            return;
                        }
                    }
                } else {
                    arrayList4 = arrayList6;
                    z11 = z13;
                }
                g0.g3(new nx(zyVar, tL_error, tLObject2, z11, arrayList5, arrayList4, tLObject3));
            }
        }, (QuickAckDelegate) null, 68);
    }

    public final void Q(long j3, Uri uri, ArrayList arrayList, c80 c80Var) {
        if (this.E.f(j3) != null) {
            c80Var.run(0L);
            return;
        }
        if (n5.z(j3)) {
            long j10 = -j3;
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j10));
            if (O0 != null && !O0.megagroup) {
                getMessagesController().T(null, j10, null, new mh(this, uri, arrayList, c80Var), null);
                return;
            }
        }
        new Thread(new hm(this, arrayList, j3, uri, c80Var, 3)).start();
    }

    public final void a(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_forwardMessages.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = l1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_forwardMessages.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = l1;
        }
    }

    public final void b(TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendInlineBotResult.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = l1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = l1;
            tL_messages_sendInlineBotResult.flags |= 1;
        }
    }

    public final void c(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = l1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = l1;
            tL_messages_sendMedia.flags |= 1;
        }
    }

    public final void c0(fj fjVar, long j3, long j10, long j11, kj kjVar) {
        TLRPC.WebPage webPage;
        if (fjVar != null) {
            TLRPC.Message message = fjVar.f24073k;
            TLRPC.MessageMedia messageMedia = message.media;
            ArrayList arrayList = null;
            r4 = null;
            r4 = null;
            HashMap hashMap = null;
            arrayList = null;
            if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty) && !(messageMedia instanceof TLRPC.TL_messageMediaWebPage) && !(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                if (n5.C(j3)) {
                    TLRPC.Message message2 = fjVar.f24073k;
                    if (message2.peer_id != null) {
                        TLRPC.MessageMedia messageMedia2 = message2.media;
                        if ((messageMedia2.photo instanceof TLRPC.TL_photo) || (messageMedia2.document instanceof TLRPC.TL_document)) {
                            hashMap = new HashMap();
                            hashMap.put("parentObject", "sent_" + fjVar.f24073k.peer_id.channel_id + "_" + fjVar.e1() + "_" + fj.B0(fjVar.f24073k) + "_" + fjVar.D + "_" + fjVar.S1());
                        }
                    }
                }
                HashMap hashMap2 = hashMap;
                TLRPC.Message message3 = fjVar.f24073k;
                TLRPC.MessageMedia messageMedia3 = message3.media;
                TLRPC.Photo photo = messageMedia3.photo;
                if (photo instanceof TLRPC.TL_photo) {
                    xy c10 = xy.c(null, message3.message, null, (TLRPC.TL_photo) photo, null, null, null, null, null, null, j3, null, fjVar.C, null, null, true, null, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, fjVar, null, false, false);
                    c10.Q = j10;
                    c10.R = j11;
                    c10.T = kjVar;
                    r0(c10);
                    return;
                }
                TLRPC.Document document = messageMedia3.document;
                if (document instanceof TLRPC.TL_document) {
                    xy f10 = xy.f((TLRPC.TL_document) document, null, message3.attachPath, j3, fjVar.C, null, message3.message, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, fjVar, null, false);
                    f10.Q = j10;
                    f10.R = j11;
                    f10.T = kjVar;
                    r0(f10);
                } else if (!(messageMedia3 instanceof TLRPC.TL_messageMediaVenue) && !(messageMedia3 instanceof TLRPC.TL_messageMediaGeo)) {
                    if (messageMedia3.phone_number != null) {
                        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                        TLRPC.MessageMedia messageMedia4 = fjVar.f24073k.media;
                        tL_userContact_old2.phone = messageMedia4.phone_number;
                        tL_userContact_old2.first_name = messageMedia4.first_name;
                        tL_userContact_old2.last_name = messageMedia4.last_name;
                        tL_userContact_old2.f28641id = messageMedia4.user_id;
                        xy g10 = xy.g(tL_userContact_old2, j3, fjVar.C, null, null, null, true, 0, 0);
                        g10.R = j11;
                        g10.T = kjVar;
                        g10.Q = j10;
                        r0(g10);
                    } else if (!n5.C(j3)) {
                        q0(f3.i(fjVar), j3, true, false, true, 0, 0, null, -1, j10, j11, kjVar);
                    }
                } else {
                    xy d = xy.d(messageMedia3, j3, fjVar.C, null, null, null, true, 0);
                    d.Q = j10;
                    d.R = j11;
                    d.T = kjVar;
                    r0(d);
                }
            } else if (message.message != null) {
                if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                    webPage = messageMedia.webpage;
                } else {
                    webPage = null;
                }
                ArrayList<TLRPC.MessageEntity> arrayList2 = message.entities;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList = new ArrayList();
                    for (int i7 = 0; i7 < fjVar.f24073k.entities.size(); i7++) {
                        TLRPC.MessageEntity messageEntity = fjVar.f24073k.entities.get(i7);
                        if ((messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            arrayList.add(messageEntity);
                        }
                    }
                }
                xy b10 = xy.b(fjVar.f24073k.message, j3, fjVar.C, null, webPage, true, arrayList, null, null, true, 0, 0, null, false);
                b10.Q = j10;
                b10.R = j11;
                b10.T = kjVar;
                r0(b10);
            } else if (n5.C(j3)) {
                q0(f3.i(fjVar), j3, true, false, true, 0, 0, null, -1, j10, j11, kjVar);
            }
        }
    }

    public final void d(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = l1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMessage.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = l1;
            tL_messages_sendMessage.flags |= 1;
        }
    }

    public final void d0(int i7) {
        SparseArray sparseArray = this.f28478b;
        int size = sparseArray.size();
        sparseArray.remove(i7);
        if (size != 0 && sparseArray.size() == 0) {
            tr messagesStorage = getMessagesStorage();
            messagesStorage.f27149a.c(new pq(messagesStorage, 22));
        }
    }

    @Override
    public final void didReceivedNotification(int r43, int r44, java.lang.Object... r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zy.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j3) {
        if (j3 != 0) {
            TLRPC.InputPeer l1 = getMessagesController().l1(j3);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMultiMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = l1;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = l1;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    public final void e0(String str, ly lyVar) {
        HashMap hashMap = this.f28477a;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(lyVar);
    }

    public final void f(ArrayList arrayList) {
        HashMap hashMap;
        int i7;
        int i10;
        int i11;
        int i12;
        long j3;
        fj fjVar;
        int i13;
        String G;
        TLRPC.Message message;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        long j10 = 0;
        int i16 = 0;
        boolean z11 = false;
        while (true) {
            int size = arrayList.size();
            hashMap = this.f28477a;
            if (i16 >= size) {
                break;
            }
            fj fjVar2 = (fj) arrayList.get(i16);
            if (fjVar2.f24102r1) {
                i11 = 1;
            } else {
                i11 = i14;
            }
            long B0 = fj.B0(fjVar2.f24073k);
            arrayList4.add(Integer.valueOf(fjVar2.e1()));
            if (fj.b4(fjVar2.f24073k)) {
                i15 = fj.I1(fjVar2.f24073k);
            }
            TLRPC.Message i02 = i0(fjVar2.e1(), fjVar2.f24102r1);
            if (i02 != null) {
                getConnectionsManager().cancelRequest(i02.reqId, true);
            }
            di.y8 y10 = di.y8.y(this.currentAccount, z10);
            di.t8 t8Var = y10.N;
            ArrayList arrayList5 = arrayList4;
            if (t8Var != null && t8Var.f9802b == fj.B0(fjVar2.f24073k)) {
                di.t8 t8Var2 = y10.N;
                int e12 = fjVar2.e1();
                di.s8 s8Var = t8Var2.f9814p;
                org.telegram.ui.Components.zb zbVar = t8Var2.d;
                i12 = i16;
                HashSet hashSet = t8Var2.f9809k;
                j3 = B0;
                if (!t8Var2.f9812n && !t8Var2.f9813o) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            fjVar = (fj) it.next();
                            Iterator it2 = it;
                            if (fjVar.e1() == e12) {
                                hashSet.remove(fjVar);
                                break;
                            }
                            it = it2;
                        } else {
                            fjVar = null;
                            break;
                        }
                    }
                    if (hashSet.isEmpty()) {
                        t8Var2.f9812n = true;
                        t8Var2.f9803c.b();
                        y10.N = null;
                    } else {
                        t8Var2.f9806g--;
                        if (fjVar != null && (message = fjVar.f24073k) != null) {
                            t8Var2.h -= message.paid_message_stars;
                        }
                        di.x8 x8Var = t8Var2.f9805f;
                        if (x8Var != null) {
                            x8Var.f42399b = 3000L;
                            g0.r(s8Var);
                            g0.h3(s8Var, 3000L);
                        }
                        org.telegram.ui.Components.n6 n6Var = zbVar.f42811b;
                        int i17 = t8Var2.f9806g;
                        if (i17 == 1) {
                            G = gd.N0(2131747509, null);
                            i13 = 0;
                        } else {
                            i13 = 0;
                            G = gd.G(i17, "PaidMessageSentTitle", new Object[0]);
                        }
                        n6Var.setText(G);
                        zbVar.f42812c.setText(g0.W2(gd.H(',', "PaidMessageSentSubtitle", Math.max(i13, (int) t8Var2.h))));
                        zbVar.f42810a.d();
                    }
                }
            } else {
                i12 = i16;
                j3 = B0;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayList arrayList6 = (ArrayList) entry.getValue();
                int i18 = 0;
                while (true) {
                    if (i18 < arrayList6.size()) {
                        ly lyVar = (ly) arrayList6.get(i18);
                        if (lyVar.f25577e == 4) {
                            fj fjVar3 = null;
                            int i19 = 0;
                            while (true) {
                                if (i19 < lyVar.f25594x.size()) {
                                    fjVar3 = (fj) lyVar.f25594x.get(i19);
                                    if (fjVar3.e1() == fjVar2.e1()) {
                                        j0(fjVar2.e1(), fjVar2.f24102r1);
                                        break;
                                    }
                                    i19++;
                                } else {
                                    i19 = -1;
                                    break;
                                }
                            }
                            if (i19 >= 0) {
                                lyVar.f25594x.remove(i19);
                                lyVar.f25596z.remove(i19);
                                lyVar.B.remove(i19);
                                if (!lyVar.f25595y.isEmpty()) {
                                    lyVar.f25595y.remove(i19);
                                }
                                TLObject tLObject = lyVar.f25576c;
                                if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media.remove(i19);
                                } else {
                                    boolean z12 = tLObject instanceof TLRPC.TL_messages_sendMedia;
                                    if (z12) {
                                        TLRPC.InputMedia inputMedia = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia).extended_media.remove(i19);
                                        }
                                    }
                                    if (z12) {
                                        TLRPC.InputMedia inputMedia2 = ((TLRPC.TL_messages_sendMedia) tLObject).media;
                                        if (inputMedia2 instanceof TLRPC.TL_inputMediaPoll) {
                                            sh.d.i((TLRPC.TL_inputMediaPoll) inputMedia2, ((Integer) lyVar.C.get(i19)).intValue());
                                        }
                                    }
                                    boolean z13 = tLObject instanceof TL_ephemeral.TL_sendMessage;
                                    if (z13) {
                                        TLRPC.InputMedia inputMedia3 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia3 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                            ((TLRPC.TL_inputMediaPaidMedia) inputMedia3).extended_media.remove(i19);
                                        }
                                    }
                                    if (z13) {
                                        TLRPC.InputMedia inputMedia4 = ((TL_ephemeral.TL_sendMessage) tLObject).media;
                                        if (inputMedia4 instanceof TLRPC.TL_inputMediaPoll) {
                                            sh.d.i((TLRPC.TL_inputMediaPoll) inputMedia4, ((Integer) lyVar.C.get(i19)).intValue());
                                        }
                                    }
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) lyVar.d;
                                    tL_messages_sendEncryptedMultiMedia.messages.remove(i19);
                                    tL_messages_sendEncryptedMultiMedia.files.remove(i19);
                                }
                                MediaController.B().i(fjVar2);
                                String str = (String) lyVar.E.get(fjVar3);
                                if (str != null) {
                                    arrayList2.add(str);
                                }
                                if (lyVar.f25594x.isEmpty()) {
                                    lyVar.d();
                                } else {
                                    if (lyVar.G == fjVar2.e1()) {
                                        fj fjVar4 = (fj) i5.c.h(1, lyVar.f25594x);
                                        lyVar.G = fjVar4.e1();
                                        fjVar4.f24073k.params.put("final", "1");
                                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                        tL_messages_messages.messages.add(fjVar4.f24073k);
                                        getMessagesStorage().h1(-2, 0, i11, lyVar.f25574a, 0L, tL_messages_messages, false);
                                    }
                                    if (!arrayList3.contains(lyVar)) {
                                        arrayList3.add(lyVar);
                                    }
                                }
                            }
                        } else if (lyVar.f25584m.e1() == fjVar2.e1()) {
                            j0(fjVar2.e1(), fjVar2.f24102r1);
                            arrayList6.remove(i18);
                            lyVar.d();
                            MediaController.B().i(lyVar.f25584m);
                            if (arrayList6.size() == 0) {
                                arrayList2.add((String) entry.getKey());
                                if (lyVar.d != null) {
                                    z11 = true;
                                }
                            }
                        } else {
                            i18++;
                        }
                    }
                }
            }
            i16 = i12 + 1;
            i14 = i11;
            arrayList4 = arrayList5;
            j10 = j3;
            z10 = false;
        }
        ArrayList arrayList7 = arrayList4;
        for (int i20 = 0; i20 < arrayList2.size(); i20++) {
            String str2 = (String) arrayList2.get(i20);
            if (str2.startsWith("http")) {
                ec.D().g(str2);
            } else {
                getFileLoader().b(str2, z11);
            }
            hashMap.remove(str2);
        }
        int size2 = arrayList3.size();
        for (int i21 = 0; i21 < size2; i21++) {
            t0((ly) arrayList3.get(i21), false);
        }
        if (arrayList.size() == 1 && ((fj) arrayList.get(0)).Y2() && ((fj) arrayList.get(0)).D1 != null) {
            l0((fj) arrayList.get(0));
        } else if (arrayList.size() != 1 || !((fj) arrayList.get(0)).Y2() || !((fj) arrayList.get(0)).T3()) {
            if (!arrayList.isEmpty() && fj.d5(((fj) arrayList.get(0)).f24073k)) {
                i10 = 9;
            } else if (!arrayList.isEmpty() && fj.b4(((fj) arrayList.get(0)).f24073k)) {
                i10 = 5;
            } else {
                if (i14 != 0) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                getMessagesController().Z(arrayList7, null, null, j10, i15, false, i7);
            }
            i7 = i10;
            getMessagesController().Z(arrayList7, null, null, j10, i15, false, i7);
        }
    }

    public final void f0(TLRPC.Message message, boolean z10) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            g0.g3(new lw(this, message, z10, 2));
        } else {
            g0(message, z10);
        }
    }

    public final void g(fj fjVar) {
        ArrayList i7 = f3.i(fjVar);
        if (fjVar != null && fjVar.D == 29) {
            ly lyVar = null;
            for (Map.Entry entry : this.f28477a.entrySet()) {
                ArrayList arrayList = (ArrayList) entry.getValue();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ly lyVar2 = (ly) arrayList.get(i10);
                    if (lyVar2.f25577e == 4) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= lyVar2.f25594x.size()) {
                                break;
                            } else if (((fj) lyVar2.f25594x.get(i11)).e1() == fjVar.e1()) {
                                lyVar = lyVar2;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (lyVar != null) {
                        break;
                    }
                }
            }
            if (lyVar != null) {
                i7.clear();
                i7.addAll(lyVar.f25594x);
            }
        }
        f(i7);
    }

    public final void g0(TLRPC.Message message, boolean z10) {
        boolean z11;
        if (message != null) {
            int i7 = message.f28513id;
            if (i7 > 0) {
                this.d.put(i7, message);
                return;
            }
            SparseArray sparseArray = this.f28479c;
            if (sparseArray.indexOfKey(i7) >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j0(message.f28513id, z10);
            sparseArray.put(message.f28513id, message);
            if (!z10 && !z11 && !fj.c3(message)) {
                long B0 = fj.B0(message);
                a0.h hVar = this.f28481f;
                hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
                getNotificationCenter().k(ks.n1, new Object[0]);
            }
        }
    }

    public final void h0(fj fjVar) {
        boolean z10;
        if (fjVar != null && fjVar.e1() <= 0 && !fjVar.f24102r1) {
            TLRPC.Message message = fjVar.f24073k;
            int i7 = message.f28513id;
            SparseArray sparseArray = this.f28480e;
            if (sparseArray.indexOfKey(i7) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sparseArray.put(message.f28513id, message);
            if (!z10 && !fj.c3(message)) {
                long B0 = fj.B0(message);
                a0.h hVar = this.h;
                hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
                getNotificationCenter().k(ks.n1, new Object[0]);
            }
        }
    }

    public final TLRPC.Message i0(int i7, boolean z10) {
        if (i7 > 0) {
            SparseArray sparseArray = this.d;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i7);
            if (message != null) {
                sparseArray.remove(i7);
            }
            return message;
        }
        SparseArray sparseArray2 = this.f28479c;
        TLRPC.Message message2 = (TLRPC.Message) sparseArray2.get(i7);
        if (message2 != null) {
            sparseArray2.remove(i7);
            if (!z10) {
                long B0 = fj.B0(message2);
                a0.h hVar = this.f28481f;
                Integer num = (Integer) hVar.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        hVar.l(B0);
                    } else {
                        hVar.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(ks.n1, new Object[0]);
                }
            }
        }
        return message2;
    }

    public final void j0(int i7, boolean z10) {
        if (i7 <= 0 && !z10) {
            SparseArray sparseArray = this.f28480e;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i7);
            if (message != null) {
                sparseArray.remove(i7);
                long B0 = fj.B0(message);
                a0.h hVar = this.h;
                Integer num = (Integer) hVar.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        hVar.l(B0);
                    } else {
                        hVar.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(ks.n1, new Object[0]);
                }
            }
        }
    }

    public final void k(fj fjVar, TLRPC.Updates updates, boolean z10) {
        int i7;
        if (fjVar == null) {
            return;
        }
        long B0 = fj.B0(fjVar.f24073k);
        long j3 = fjVar.f24073k.random_id;
        boolean z11 = true;
        TLRPC.Message message = null;
        if (updates != null) {
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    TLRPC.Update update = arrayList.get(i10);
                    i10++;
                    TLRPC.Update update2 = update;
                    if (update2 instanceof TL_update.TL_updateMessageID) {
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                        if (tL_updateMessageID.random_id == j3) {
                            i7 = tL_updateMessageID.f28750id;
                            break;
                        }
                    }
                } else {
                    i7 = 0;
                    break;
                }
            }
            for (int i11 = 0; i11 < updates.updates.size(); i11++) {
                TLRPC.Update update3 = updates.updates.get(i11);
                if (update3 instanceof TL_update.TL_updateNewMessage) {
                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update3;
                    TLRPC.Message message2 = tL_updateNewMessage.message;
                    if ((message2.action instanceof TLRPC.TL_messageActionGramTransfer) && message2.out && n5.o(message2.peer_id) == B0 && (i7 == 0 || message2.f28513id == i7)) {
                        updates.updates.remove(i11);
                        Utilities.d.c(new ay(this, tL_updateNewMessage, 1));
                        message = message2;
                        break;
                    }
                }
            }
            if (message != null) {
                for (int size2 = updates.updates.size() - 1; size2 >= 0; size2--) {
                    TLRPC.Update update4 = updates.updates.get(size2);
                    if ((update4 instanceof TL_update.TL_updateMessageID) && ((TL_update.TL_updateMessageID) update4).random_id == j3) {
                        updates.updates.remove(size2);
                    }
                }
            }
        } else {
            i7 = 0;
        }
        TLRPC.Message message3 = message;
        int i12 = fjVar.f24073k.local_id;
        if (i12 >= 0) {
            i12 = fjVar.e1();
        }
        int i13 = i12;
        if (message3 == null) {
            if (fjVar.e1() > 0) {
                d0(i13);
                i0(i13, false);
                return;
            }
            if (!z10 && i7 == 0) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.f28513id = i13;
                tL_messageService.dialog_id = B0;
                getMessagesStorage().N0(0, tL_messageService);
                fjVar.f24073k.send_state = 2;
                fjVar.M1 = true;
                getNotificationCenter().k(ks.M, Integer.valueOf(i13));
            } else {
                tr messagesStorage = getMessagesStorage();
                messagesStorage.f27149a.c(new bq(messagesStorage, j3, B0, Integer.valueOf(i13), i13, fjVar.f24073k.date));
                fjVar.f24073k.send_state = 0;
                fjVar.M1 = true;
                getNotificationCenter().k(ks.J, Integer.valueOf(i13));
            }
            d0(i13);
            i0(i13, false);
            return;
        }
        message3.dialog_id = B0;
        message3.local_id = 0;
        message3.send_state = 0;
        Integer num = (Integer) getMessagesController().Q.get(Long.valueOf(B0));
        if (num == null) {
            num = Integer.valueOf(getMessagesStorage().U(B0, true));
            getMessagesController().Q.put(Long.valueOf(B0), num);
        }
        if (num.intValue() >= message3.f28513id) {
            z11 = false;
        }
        message3.unread = z11;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(message3);
        getMessagesStorage().f27149a.c(new jm(this, j3, B0, i13, message3, arrayList2, fjVar));
    }

    public final boolean k0(long j3, fj fjVar, boolean z10) {
        long j10;
        int i7 = 0;
        if (fjVar.e1() >= 0) {
            if (fjVar.Y2()) {
                t(fjVar, null, null, null, null, null, null, null, true, fjVar.t2(), fjVar);
                return false;
            }
        } else {
            TLRPC.Message message = fjVar.f24073k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                if (z10) {
                    k(fjVar, null, false);
                }
            } else {
                boolean z11 = messageAction instanceof TLRPC.TL_messageEncryptedAction;
                int i10 = ks.f25283s;
                if (z11) {
                    TLRPC.EncryptedChat c12 = getMessagesController().c1(Integer.valueOf((int) (fj.B0(message) & 4294967295L)));
                    if (c12 == null) {
                        getMessagesStorage().N0(fjVar.f24102r1 ? 1 : 0, fjVar.f24073k);
                        fjVar.f24073k.send_state = 2;
                        getNotificationCenter().k(ks.M, Integer.valueOf(fjVar.e1()));
                        d0(fjVar.e1());
                        return false;
                    }
                    TLRPC.Message message2 = fjVar.f24073k;
                    if (message2.random_id == 0) {
                        message2.random_id = E();
                    }
                    TLRPC.DecryptedMessageAction decryptedMessageAction = fjVar.f24073k.action.encryptedAction;
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        getSecretChatHelper().z(c12, fjVar.f24073k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                        getSecretChatHelper().t(c12, null, fjVar.f24073k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                        getSecretChatHelper().r(c12, fjVar.f24073k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        getSecretChatHelper().w(c12, fjVar.f24073k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                        getSecretChatHelper().u(c12, null, fjVar.f24073k);
                        return true;
                    } else {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                            xv secretChatHelper = getSecretChatHelper();
                            TLRPC.Message message3 = fjVar.f24073k;
                            secretChatHelper.getClass();
                            if (c12 instanceof TLRPC.TL_encryptedChat) {
                                TLRPC.DecryptedMessage tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                                if (message3 != null) {
                                    tL_decryptedMessageService.action = message3.action.encryptedAction;
                                } else {
                                    TLRPC.DecryptedMessageAction tL_decryptedMessageActionScreenshotMessages = new TLRPC.TL_decryptedMessageActionScreenshotMessages();
                                    tL_decryptedMessageService.action = tL_decryptedMessageActionScreenshotMessages;
                                    tL_decryptedMessageActionScreenshotMessages.random_ids = null;
                                    message3 = secretChatHelper.d(c12, tL_decryptedMessageActionScreenshotMessages);
                                    fj fjVar2 = new fj(secretChatHelper.currentAccount, message3, false, false);
                                    fjVar2.f24073k.send_state = 1;
                                    fjVar2.X1 = true;
                                    secretChatHelper.getMessagesController().x5(0, message3.dialog_id, f3.i(fjVar2));
                                    secretChatHelper.getNotificationCenter().k(i10, new Object[0]);
                                }
                                TLRPC.Message message4 = message3;
                                tL_decryptedMessageService.random_id = message4.random_id;
                                secretChatHelper.j(tL_decryptedMessageService, message4, c12, null, null, null);
                                return true;
                            }
                        } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionTyping)) {
                            if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) {
                                getSecretChatHelper().y(c12, 0, 0, fjVar.f24073k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                                getSecretChatHelper().s(c12, fjVar.f24073k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                                getSecretChatHelper().p(c12, fjVar.f24073k, 0L);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                                getSecretChatHelper().x(c12, fjVar.f24073k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                                getSecretChatHelper().q(c12, fjVar.f24073k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) {
                                getSecretChatHelper().v(c12, fjVar.f24073k);
                            }
                        }
                        return true;
                    }
                }
                if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
                    TLRPC.User c22 = getMessagesController().c2(Long.valueOf(fj.B0(fjVar.f24073k)));
                    int N1 = fjVar.N1();
                    TLRPC.Message message5 = fjVar.f24073k;
                    if (c22 != null && N1 != 0 && c22.f28641id != getUserConfig().e()) {
                        TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
                        tL_inputPeerUser.access_hash = c22.access_hash;
                        tL_inputPeerUser.user_id = c22.f28641id;
                        if (message5 != null) {
                            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                            tL_inputReplyToMessage.reply_to_msg_id = N1;
                            tL_messages_sendScreenshotNotification.reply_to = tL_inputReplyToMessage;
                            tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        } else {
                            message5 = new TLRPC.TL_messageService();
                            message5.random_id = E();
                            message5.dialog_id = c22.f28641id;
                            message5.unread = true;
                            message5.out = true;
                            int j11 = getUserConfig().j();
                            message5.f28513id = j11;
                            message5.local_id = j11;
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            message5.from_id = tL_peerUser;
                            tL_peerUser.user_id = getUserConfig().e();
                            message5.flags |= 264;
                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                            message5.reply_to = tL_messageReplyHeader;
                            tL_messageReplyHeader.flags |= 16;
                            tL_messageReplyHeader.reply_to_msg_id = N1;
                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                            message5.peer_id = tL_peerUser2;
                            tL_peerUser2.user_id = c22.f28641id;
                            message5.date = getConnectionsManager().getCurrentTime();
                            message5.action = new TLRPC.TL_messageActionScreenshotTaken();
                            getUserConfig().v(false);
                        }
                        tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        fj fjVar3 = new fj(this.currentAccount, message5, false, true);
                        fjVar3.f24073k.send_state = 1;
                        fjVar3.X1 = true;
                        getMessagesController().x5(0, message5.dialog_id, f3.i(fjVar3));
                        getNotificationCenter().k(i10, new Object[0]);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(message5);
                        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                        N(tL_messages_sendScreenshotNotification, fjVar3, null, null, null, null, false);
                    }
                }
                if (z10) {
                    this.f28478b.put(fjVar.e1(), fjVar);
                }
                long B0 = fj.B0(fjVar.f24073k);
                TLRPC.Message message6 = fjVar.f24073k;
                String str = message6.attachPath;
                TLRPC.ReplyMarkup replyMarkup = message6.reply_markup;
                HashMap<String, String> hashMap = message6.params;
                boolean z12 = !message6.silent;
                if (fjVar.f24102r1) {
                    i7 = message6.date;
                }
                xy c10 = xy.c(null, null, null, null, null, null, null, null, null, null, B0, str, null, null, null, true, fjVar, null, replyMarkup, hashMap, z12, i7, 0, 0, null, null, false, false);
                TLRPC.Message message7 = fjVar.f24073k;
                if (message7 != null) {
                    TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message7.quick_reply_shortcut;
                    if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                        c10.M = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                    }
                    c10.N = fj.I1(message7);
                    c10.Q = fjVar.f24073k.paid_message_stars;
                }
                TLRPC.Message message8 = fjVar.f24073k;
                if (message8 != null) {
                    j10 = message8.ephemeralReceiverBotId;
                } else {
                    j10 = 0;
                }
                c10.X = j10;
                c10.Q = j3;
                r0(c10);
                return true;
            }
        }
        return false;
    }

    public final void l0(fj fjVar) {
        fjVar.f24098q1 = true;
        TLRPC.Message message = fjVar.f24073k;
        message.media = fjVar.D1;
        message.message = fjVar.C1;
        ArrayList<TLRPC.MessageEntity> arrayList = fjVar.F1;
        message.entities = arrayList;
        message.attachPath = fjVar.G1;
        message.send_state = 0;
        if (arrayList != null) {
            message.flags |= 128;
        } else {
            message.flags &= -129;
        }
        fjVar.D1 = null;
        fjVar.C1 = null;
        fjVar.F1 = null;
        fjVar.G1 = null;
        fjVar.f24101r0 = null;
        fjVar.D = -1;
        fjVar.L5();
        fjVar.f24131z = null;
        if (fjVar.D != 0) {
            fjVar.k0();
        } else {
            fjVar.S1 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(fjVar.f24073k);
        getMessagesStorage().j1(arrayList2, false, true, false, 0, false, fjVar.f24102r1 ? 1 : 0, 0L);
        getNotificationCenter().k(ks.m0, Long.valueOf(fj.B0(fjVar.f24073k)), f3.i(fjVar));
    }

    public final void n0(boolean z10, fj fjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, org.telegram.ui.bn bnVar) {
        boolean z11;
        int i7;
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (fjVar != null && keyboardButtonProto != null && bnVar != null) {
            if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                i7 = 3;
                z11 = false;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                z11 = false;
                i7 = 1;
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                z11 = z10;
                i7 = 2;
            } else {
                z11 = z10;
                i7 = 0;
            }
            String str = fj.B0(fjVar.f24073k) + "_" + fjVar.e1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i7;
            this.f28483r.put(str, Boolean.TRUE);
            HashMap hashMap = this.f28484s;
            List list = (List) hashMap.get(fj.B0(fjVar.f24073k) + "_" + fjVar.e1());
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                hashMap.put(fj.B0(fjVar.f24073k) + "_" + fjVar.e1(), arrayList);
                list = arrayList;
            }
            list.add(str);
            TLObject[] tLObjectArr = new TLObject[1];
            hx hxVar = new hx(this, str, list, z11, fjVar, keyboardButtonProto, bnVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10);
            if (z11) {
                getMessagesStorage().M(str, hxVar);
                return;
            }
            TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
            if (tL_inlineButtonTypeUrlAuth != null) {
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.peer = getMessagesController().l1(fj.B0(fjVar.f24073k));
                tL_messages_requestUrlAuth.msg_id = fjVar.e1();
                tL_messages_requestUrlAuth.button_id = tL_inlineButtonTypeUrlAuth.button_id;
                tL_messages_requestUrlAuth.flags |= 2;
                tLObjectArr[0] = tL_messages_requestUrlAuth;
                getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, hxVar, 2);
            } else if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                if ((fjVar.f24073k.media.flags & 4) == 0) {
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                    tL_inputInvoiceMessage.msg_id = fjVar.e1();
                    tL_inputInvoiceMessage.peer = getMessagesController().o1(fjVar.f24073k.peer_id);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                    JSONObject u10 = ki.t2.u(null, false);
                    if (u10 != null) {
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                        tL_dataJSON.data = u10.toString();
                        tL_payments_getPaymentForm.flags |= 1;
                    }
                    tLObjectArr[0] = tL_payments_getPaymentForm;
                    getConnectionsManager().sendRequest(tL_payments_getPaymentForm, hxVar, 2);
                    return;
                }
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = fjVar.f24073k.media.receipt_msg_id;
                tL_payments_getPaymentReceipt.peer = getMessagesController().o1(fjVar.f24073k.peer_id);
                tLObjectArr[0] = tL_payments_getPaymentReceipt;
                getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, hxVar, 2);
            } else if (fj.c3(fjVar.f24073k)) {
                TL_ephemeral.TL_getCallbackAnswer tL_getCallbackAnswer = new TL_ephemeral.TL_getCallbackAnswer();
                tL_getCallbackAnswer.peer = getMessagesController().l1(fj.B0(fjVar.f24073k));
                tL_getCallbackAnswer.f28710id = fjVar.P0();
                tL_getCallbackAnswer.data = keyboardButtonProto.getData();
                getConnectionsManager().sendRequest(tL_getCallbackAnswer, hxVar, 2);
            } else {
                TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
                tL_messages_getBotCallbackAnswer.peer = getMessagesController().l1(fj.B0(fjVar.f24073k));
                tL_messages_getBotCallbackAnswer.msg_id = fjVar.e1();
                tL_messages_getBotCallbackAnswer.game = cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class);
                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) cg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
                if (tL_inlineButtonTypeCallback != null && tL_inlineButtonTypeCallback.requires_password) {
                    if (inputCheckPasswordSRP != null) {
                        tL_inputCheckPasswordEmpty = inputCheckPasswordSRP;
                    } else {
                        tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_messages_getBotCallbackAnswer.password = tL_inputCheckPasswordEmpty;
                    tL_messages_getBotCallbackAnswer.flags |= 4;
                }
                if (keyboardButtonProto.getData() != null) {
                    tL_messages_getBotCallbackAnswer.flags |= 1;
                    tL_messages_getBotCallbackAnswer.data = keyboardButtonProto.getData();
                }
                getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, hxVar, 2);
            }
        }
    }

    public final TLRPC.TL_inputReplyToMessage o(TLRPC.TL_messageReplyHeader tL_messageReplyHeader) {
        TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
        tL_inputReplyToMessage.reply_to_msg_id = tL_messageReplyHeader.reply_to_msg_id;
        int i7 = tL_messageReplyHeader.flags;
        if ((i7 & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i7 & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = mp.u1(this.currentAccount).o1(tL_messageReplyHeader.reply_to_peer_id);
        }
        if (tL_messageReplyHeader.quote) {
            ArrayList<TL_iv.RichText> arrayList = tL_messageReplyHeader.quote_rich;
            if (arrayList != null) {
                tL_inputReplyToMessage.quote_rich = arrayList;
            } else if ((tL_messageReplyHeader.flags & 64) != 0) {
                tL_inputReplyToMessage.flags |= 4;
                tL_inputReplyToMessage.quote_text = tL_messageReplyHeader.quote_text;
            }
            if (arrayList == null && (tL_messageReplyHeader.flags & 128) != 0) {
                tL_inputReplyToMessage.flags |= 8;
                tL_inputReplyToMessage.quote_entities = tL_messageReplyHeader.quote_entities;
            }
            if ((tL_messageReplyHeader.flags & 1024) != 0) {
                tL_inputReplyToMessage.flags |= 16;
                tL_inputReplyToMessage.quote_offset = tL_messageReplyHeader.quote_offset;
            }
        }
        if ((tL_messageReplyHeader.flags & 2048) != 0) {
            tL_inputReplyToMessage.flags |= 64;
            tL_inputReplyToMessage.todo_item_id = tL_messageReplyHeader.todo_item_id;
        }
        byte[] bArr = tL_messageReplyHeader.poll_option;
        if (bArr != null) {
            tL_inputReplyToMessage.poll_option = bArr;
        }
        return tL_inputReplyToMessage;
    }

    public final void o0(fj fjVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        if (fjVar != null && keyboardButtonProto != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fj.B0(fjVar.f24073k));
            sb2.append("_");
            sb2.append(fjVar.e1());
            sb2.append("_");
            sb2.append(Utilities.f(keyboardButtonProto.getData()));
            sb2.append("_");
            if (cg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                str = "1";
            } else {
                str = "0";
            }
            sb2.append(str);
            this.f28482n.put(sb2.toString(), fjVar);
            this.H.o();
        }
    }

    public final TLRPC.TL_inputReplyToStory p(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.f28731id;
        tL_inputReplyToStory.peer = getMessagesController().l1(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    public final void p0(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j3, long j10) {
        long E;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null && tL_inputMediaGame != null) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
            tL_messages_sendMedia.peer = inputPeer;
            if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                tL_messages_sendMedia.silent = mp.u1(this.currentAccount).f25753g7.getBoolean("silent_" + (-inputPeer.channel_id), false);
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                tL_messages_sendMedia.silent = mp.u1(this.currentAccount).f25753g7.getBoolean("silent_" + (-inputPeer.chat_id), false);
            } else {
                tL_messages_sendMedia.silent = mp.u1(this.currentAccount).f25753g7.getBoolean("silent_" + inputPeer.user_id, false);
            }
            if (j3 != 0) {
                E = j3;
            } else {
                E = E();
            }
            tL_messages_sendMedia.random_id = E;
            tL_messages_sendMedia.message = "";
            tL_messages_sendMedia.media = tL_inputMediaGame;
            long M = v3.M(getMessagesController().O0(Long.valueOf(inputPeer.chat_id)), getMessagesController().P0(inputPeer.chat_id), false);
            if (M != i10.i(this.currentAccount).e()) {
                tL_messages_sendMedia.send_as = getMessagesController().l1(M);
            }
            long P1 = getMessagesController().P1(n5.n(inputPeer));
            if (P1 <= 0) {
                P1 = n5.k(getMessagesController().P2(n5.n(inputPeer)));
            }
            if (P1 > 0) {
                tL_messages_sendMedia.flags |= 2097152;
                tL_messages_sendMedia.allow_paid_stars = P1;
            }
            if (j10 == 0) {
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    nativeByteBuffer.writeInt32(3);
                    nativeByteBuffer.writeInt64(j3);
                    inputPeer.serializeToStream(nativeByteBuffer);
                    tL_inputMediaGame.serializeToStream(nativeByteBuffer);
                } catch (Exception e11) {
                    e = e11;
                    nativeByteBuffer2 = nativeByteBuffer;
                    a8.g(e, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j10 = getMessagesStorage().z(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_sendMedia, new x4(this, j10, 4));
                }
                j10 = getMessagesStorage().z(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_sendMedia, new x4(this, j10, 4));
        }
    }

    public final fj q(TLRPC.User user, String str, long j3, String str2, boolean z10, boolean z11, long j10) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        int j11 = getUserConfig().j();
        tL_messageService.f28513id = j11;
        tL_messageService.local_id = j11;
        tL_messageService.random_id = j10;
        tL_messageService.dialog_id = user.f28641id;
        tL_messageService.out = true;
        tL_messageService.unread = true;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.flags |= 256;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_messageService.peer_id = tL_peerUser2;
        tL_peerUser2.user_id = user.f28641id;
        tL_messageService.date = getConnectionsManager().getCurrentTime();
        tL_messageService.send_state = 1;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = new TLRPC.TL_messageActionGramTransfer();
        tL_messageActionGramTransfer.amount = j3;
        tL_messageActionGramTransfer.peer_address = str;
        tL_messageActionGramTransfer.transaction_id = "";
        tL_messageActionGramTransfer.comment = str2;
        tL_messageActionGramTransfer.comment_encrypted = z10;
        tL_messageActionGramTransfer.comment_encrypted_preparing = z11;
        tL_messageService.action = tL_messageActionGramTransfer;
        getUserConfig().v(false);
        fj fjVar = new fj(this.currentAccount, tL_messageService, false, true);
        fjVar.X1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
        getMessagesController().x5(0, user.f28641id, f3.i(fjVar));
        getNotificationCenter().k(ks.f25283s, new Object[0]);
        f0(tL_messageService, false);
        return fjVar;
    }

    public final int q0(final java.util.ArrayList r59, long r60, final boolean r62, final boolean r63, final boolean r64, final int r65, final int r66, final org.telegram.messenger.fj r67, final int r68, long r69, final long r71, final org.telegram.messenger.kj r73) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zy.q0(java.util.ArrayList, long, boolean, boolean, boolean, int, int, org.telegram.messenger.fj, int, long, long, org.telegram.messenger.kj):int");
    }

    public final void r0(org.telegram.messenger.xy r106) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zy.r0(org.telegram.messenger.xy):void");
    }

    public final void s0(fj fjVar, ArrayList arrayList, ch.p0 p0Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.di diVar) {
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        if (fjVar != null && g2Var != null) {
            TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
            TLRPC.Message message = fjVar.f24073k;
            if (message.isThreadMessage && message.fwd_from != null) {
                tL_messages_sendReaction.peer = getMessagesController().l1(fjVar.Z0());
                tL_messages_sendReaction.msg_id = fjVar.f24073k.fwd_from.saved_from_msg_id;
            } else {
                tL_messages_sendReaction.peer = getMessagesController().l1(fj.B0(fjVar.f24073k));
                tL_messages_sendReaction.msg_id = fjVar.e1();
            }
            tL_messages_sendReaction.add_to_recent = z11;
            if (z11 && p0Var != null) {
                ArrayList arrayList2 = ri.d0(this.currentAccount).F1;
                if (p0Var.f5470f != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji.emoticon = p0Var.f5470f;
                    tL_reactionCustomEmoji = tL_reactionEmoji;
                } else {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji2.document_id = p0Var.f5471g;
                    tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
                }
                arrayList2.add(0, tL_reactionCustomEmoji);
            }
            if (!arrayList.isEmpty()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ch.p0 p0Var2 = (ch.p0) arrayList.get(i7);
                    if (p0Var2.f5471g != 0) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji3 = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji3.document_id = p0Var2.f5471g;
                        tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji3);
                        tL_messages_sendReaction.flags |= 1;
                    } else if (p0Var2.f5470f != null) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji2.emoticon = p0Var2.f5470f;
                        tL_messages_sendReaction.reaction.add(tL_reactionEmoji2);
                        tL_messages_sendReaction.flags |= 1;
                    }
                }
            }
            if (z10) {
                tL_messages_sendReaction.flags |= 2;
                tL_messages_sendReaction.big = true;
            }
            getConnectionsManager().sendRequest(tL_messages_sendReaction, new t4(9, this, diVar));
        }
    }

    public final void t(org.telegram.messenger.fj r33, org.telegram.tgnet.TLRPC.TL_inputPollAnswer r34, org.telegram.tgnet.TLRPC.TL_photo r35, org.telegram.messenger.d20 r36, org.telegram.tgnet.TLRPC.TL_document r37, java.lang.String r38, org.telegram.tgnet.TLRPC.PhotoSize r39, java.util.HashMap r40, boolean r41, boolean r42, java.lang.Object r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zy.t(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.messenger.d20, org.telegram.tgnet.TLRPC$TL_document, java.lang.String, org.telegram.tgnet.TLRPC$PhotoSize, java.util.HashMap, boolean, boolean, java.lang.Object):void");
    }

    public final void t0(org.telegram.messenger.ly r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zy.t0(org.telegram.messenger.ly, boolean):void");
    }

    public final void u(fj fjVar, org.telegram.ui.ActionBar.g2 g2Var, int i7, int i10) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            if (fj.c3(fjVar.f24073k)) {
                TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
                tL_editMessage2.f28576id = fj.S(fjVar.e1());
                tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
                tL_editMessage2.welcome = true;
                tL_editMessage = tL_editMessage2;
            } else {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.f28576id = fjVar.e1();
                tL_editMessage = tL_messages_editMessage;
            }
            tL_editMessage.peer = getMessagesController().l1(fj.B0(fjVar.f24073k));
            TLRPC.Message message = fjVar.f24073k;
            if (message != null && (message.flags & 1073741824) != 0) {
                tL_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                tL_editMessage.flags |= 131072;
            }
            if (i7 != 0) {
                tL_editMessage.schedule_date = i7;
                int i11 = tL_editMessage.flags;
                tL_editMessage.flags = 32768 | i11;
                if (i10 != 0) {
                    tL_editMessage.schedule_repeat_period = i10;
                    tL_editMessage.flags = i11 | 294912;
                }
            }
            getConnectionsManager().sendRequest(tL_editMessage, new ci(this, g2Var, tL_editMessage, 11));
        }
    }

    public final void u0(TLRPC.Document document, String str, final long j3, final CharSequence charSequence, final d20 d20Var, final fj fjVar, final fj fjVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.rm rmVar, final bj bjVar, final boolean z10, final int i7, final int i10, boolean z11, final Object obj, final bw bwVar, final long j10, final long j11, final kj kjVar, final boolean z12) {
        final TLRPC.Document document2;
        TLRPC.PhotoSize photoSize;
        byte[] bArr;
        if (document == null) {
            return;
        }
        HashMap hashMap = null;
        if (n5.C(j3)) {
            if (getMessagesController().c1(Integer.valueOf((int) (j3 & 4294967295L))) == null) {
                return;
            }
            document2 = new TLRPC.TL_document_layer82();
            document2.f28498id = document.f28498id;
            document2.access_hash = document.access_hash;
            document2.date = document.date;
            document2.mime_type = document.mime_type;
            byte[] bArr2 = document.file_reference;
            document2.file_reference = bArr2;
            if (bArr2 == null) {
                document2.file_reference = new byte[0];
            }
            document2.size = document.size;
            document2.dc_id = document.dc_id;
            document2.attributes = new ArrayList<>();
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.f28499w = documentAttribute.f28499w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    document2.attributes.add(tL_documentAttributeVideo_layer159);
                } else {
                    document2.attributes.add(documentAttribute);
                }
            }
            if (document2.mime_type == null) {
                document2.mime_type = "";
            }
            TLRPC.PhotoSize w10 = w7.w(document.thumbs, 10, false, null, false);
            if ((w10 instanceof TLRPC.TL_photoSize) || (w10 instanceof TLRPC.TL_photoSizeProgressive) || (w10 instanceof TLRPC.TL_photoStrippedSize)) {
                w7.G(this.currentAccount);
                File J2 = w7.J(w10, null, true, true);
                if ((w10 instanceof TLRPC.TL_photoStrippedSize) || J2.exists()) {
                    try {
                        if (w10 instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize = new TLRPC.TL_photoStrippedSize();
                            bArr = w10.bytes;
                        } else {
                            TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                            J2.length();
                            byte[] bArr3 = new byte[(int) J2.length()];
                            new RandomAccessFile(J2, "r").readFully(bArr3);
                            photoSize = tL_photoCachedSize;
                            bArr = bArr3;
                        }
                        TLRPC.TL_fileLocation_layer82 tL_fileLocation_layer82 = new TLRPC.TL_fileLocation_layer82();
                        TLRPC.FileLocation fileLocation = w10.location;
                        tL_fileLocation_layer82.dc_id = fileLocation.dc_id;
                        tL_fileLocation_layer82.volume_id = fileLocation.volume_id;
                        tL_fileLocation_layer82.local_id = fileLocation.local_id;
                        tL_fileLocation_layer82.secret = fileLocation.secret;
                        photoSize.location = tL_fileLocation_layer82;
                        photoSize.size = w10.size;
                        photoSize.f28517w = w10.f28517w;
                        photoSize.h = w10.h;
                        photoSize.type = w10.type;
                        photoSize.bytes = bArr;
                        document2.thumbs.add(photoSize);
                        document2.flags |= 1;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
            }
            if (document2.thumbs.isEmpty()) {
                TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                tL_photoSizeEmpty.type = "s";
                document2.thumbs.add(tL_photoSizeEmpty);
            }
        } else {
            document2 = document;
        }
        if (fj.s3(document2, false)) {
            J.c(new Runnable() {
                @Override
                public final void run() {
                    String str2;
                    final Bitmap[] bitmapArr = new Bitmap[1];
                    final TLRPC.Document document3 = document2;
                    String q10 = fc.b(document3).q(null, null, false);
                    if ("video/mp4".equals(document3.mime_type)) {
                        str2 = ".mp4";
                    } else if ("video/x-matroska".equals(document3.mime_type)) {
                        str2 = ".mkv";
                    } else {
                        str2 = "";
                    }
                    File file = new File(w7.z(3), p5.c.v(q10, str2));
                    if (!file.exists()) {
                        file = new File(w7.z(2), p5.c.v(q10, str2));
                    }
                    final zy zyVar = zy.this;
                    zy.w(zyVar.getAccountInstance(), false, document3, file.getAbsolutePath(), null, 0L, false);
                    final String[] strArr = {zy.D(zyVar.getAccountInstance(), w7.w(document3.thumbs, 320, false, null, false), bitmapArr, true, true)};
                    final long j12 = j3;
                    final d20 d20Var2 = d20Var;
                    final fj fjVar3 = fjVar;
                    final fj fjVar4 = fjVar2;
                    final boolean z13 = z10;
                    final int i12 = i7;
                    final int i13 = i10;
                    final Object obj2 = obj;
                    final bj bjVar2 = bjVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.rm rmVar2 = rmVar;
                    final bw bwVar2 = bwVar;
                    final long j13 = j10;
                    final long j14 = j11;
                    final kj kjVar2 = kjVar;
                    final CharSequence charSequence2 = charSequence;
                    final boolean z14 = z12;
                    g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            d20 d20Var3;
                            zy zyVar2 = zy.this;
                            zyVar2.getClass();
                            Bitmap[] bitmapArr2 = bitmapArr;
                            if (bitmapArr2[0] != null) {
                                String[] strArr2 = strArr;
                                if (strArr2[0] != null) {
                                    ec.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                }
                            }
                            TLRPC.TL_document tL_document = (TLRPC.TL_document) document3;
                            long j15 = j12;
                            String str3 = null;
                            if (n5.C(j15)) {
                                d20Var3 = null;
                            } else {
                                d20Var3 = d20Var2;
                            }
                            xy f10 = xy.f(tL_document, d20Var3, null, j15, fjVar3, fjVar4, null, null, null, null, z13, i12, i13, 0, obj2, bjVar2, false);
                            f10.H = storyItem2;
                            f10.J = rmVar2;
                            f10.K = bwVar2;
                            f10.Q = j13;
                            f10.R = j14;
                            f10.T = kjVar2;
                            CharSequence charSequence3 = charSequence2;
                            if (charSequence3 != null) {
                                str3 = charSequence3.toString();
                            }
                            f10.f28152b = str3;
                            f10.L = z14;
                            zyVar2.r0(f10);
                        }
                    });
                }
            });
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap = new HashMap();
            hashMap.put("query", str);
        }
        xy f10 = xy.f((TLRPC.TL_document) document2, null, null, j3, fjVar, fjVar2, null, null, null, hashMap, z10, i7, i10, 0, obj, bjVar, z11);
        f10.H = storyItem;
        f10.J = rmVar;
        f10.K = bwVar;
        f10.Q = j10;
        f10.R = j11;
        f10.T = kjVar;
        f10.L = z12;
        r0(f10);
    }

    public final void v(fj fjVar, TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (fjVar != null && richMessage != null && fjVar.f24073k != null) {
            if (fjVar.Y2() && fjVar.f24073k.reqId != 0) {
                getConnectionsManager().cancelRequest(fjVar.f24073k.reqId, true);
                fjVar.f24073k.reqId = 0;
            }
            if (fj.c3(fjVar.f24073k)) {
                TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
                tL_editMessage2.f28576id = fj.S(fjVar.e1());
                tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
                tL_editMessage2.welcome = true;
                tL_editMessage = tL_editMessage2;
            } else {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.f28576id = fjVar.e1();
                tL_editMessage = tL_messages_editMessage;
            }
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = tL_editMessage;
            tL_messages_editMessage2.peer = getMessagesController().l1(fj.B0(fjVar.f24073k));
            tL_messages_editMessage2.rich_message = m0(arrayList, richMessage);
            int i7 = tL_messages_editMessage2.flags;
            tL_messages_editMessage2.flags = 8388608 | i7;
            if (fjVar.f24102r1) {
                tL_messages_editMessage2.schedule_date = fjVar.f24073k.date;
                tL_messages_editMessage2.flags = i7 | 8421376;
            }
            TLRPC.Message message = fjVar.f24073k;
            if ((message.flags & 1073741824) != 0) {
                tL_messages_editMessage2.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                tL_messages_editMessage2.flags |= 131072;
            }
            message.rich_message = richMessage;
            message.send_state = 3;
            int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage2, new r4(fjVar, this, tL_messages_editMessage2, g2Var, z10));
            TLRPC.Message message2 = fjVar.f24073k;
            if (message2 != null) {
                message2.reqId = sendRequest;
            }
            getNotificationCenter().k(ks.m0, Long.valueOf(fj.B0(fjVar.f24073k)), f3.i(fjVar));
        }
    }

    public final void v0(TLRPC.Document document, String str, long j3, fj fjVar, fj fjVar2, TL_stories.StoryItem storyItem, org.telegram.ui.rm rmVar, bj bjVar, boolean z10, int i7, int i10, boolean z11, Object obj, bw bwVar, long j10, long j11, kj kjVar) {
        u0(document, str, j3, null, null, fjVar, fjVar2, storyItem, rmVar, bjVar, z10, i7, i10, z11, obj, bwVar, j10, j11, kjVar, false);
    }

    public final int w0(fj fjVar, ArrayList arrayList, Runnable runnable) {
        byte[] bArr;
        if (fjVar != null) {
            String str = "poll_" + fjVar.D1();
            if (!this.f28483r.containsKey(str)) {
                TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
                tL_messages_sendVote.msg_id = fjVar.e1();
                tL_messages_sendVote.peer = getMessagesController().l1(fj.B0(fjVar.f24073k));
                if (arrayList != null) {
                    bArr = new byte[arrayList.size()];
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) arrayList.get(i7);
                        if (pollAnswer != null) {
                            tL_messages_sendVote.options.add(pollAnswer.option);
                            bArr[i7] = pollAnswer.option[0];
                        }
                    }
                } else {
                    bArr = new byte[0];
                }
                this.f28485w.put(str, bArr);
                return getConnectionsManager().sendRequest(tL_messages_sendVote, new q6(this, fjVar, str, runnable, 5));
            }
        }
        return 0;
    }

    public final ly y(int i7, long j3) {
        int i10;
        ly lyVar = null;
        int i11 = Integer.MIN_VALUE;
        for (Map.Entry entry : this.f28477a.entrySet()) {
            ArrayList arrayList = (ArrayList) entry.getValue();
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ly lyVar2 = (ly) arrayList.get(i12);
                int i13 = lyVar2.f25577e;
                if ((i13 == 4 || i13 == 0) && lyVar2.f25574a == j3) {
                    fj fjVar = lyVar2.f25584m;
                    if (fjVar != null) {
                        i10 = fjVar.e1();
                    } else {
                        ArrayList arrayList2 = lyVar2.f25594x;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            i10 = ((fj) i5.c.h(1, lyVar2.f25594x)).e1();
                        } else {
                            i10 = 0;
                        }
                    }
                    if (i10 != 0 && i10 > i7 && lyVar == null && i11 < i10) {
                        lyVar = lyVar2;
                        i11 = i10;
                    }
                }
            }
        }
        return lyVar;
    }

    public final void z0(org.telegram.messenger.fj r28, org.telegram.tgnet.TLRPC.Message r29, int r30, java.util.List r31, boolean r32, int r33, java.util.HashMap r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zy.z0(org.telegram.messenger.fj, org.telegram.tgnet.TLRPC$Message, int, java.util.List, boolean, int, java.util.HashMap):void");
    }
}
