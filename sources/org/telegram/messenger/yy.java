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
import org.telegram.ui.w70;
public final class yy extends c1 implements cs {
    public static final p5 J = new p5("mediaSendQueue");
    public static final ThreadPoolExecutor K;
    public static volatile yy[] L;
    public final a0.h E;
    public final HashMap F;
    public final HashMap G;
    public final l2.e H;
    public final HashMap I;
    public final HashMap f26678a;
    public final SparseArray f26679b;
    public final SparseArray f26680c;
    public final SparseArray d;
    public final SparseArray f26681e;
    public final a0.h f26682f;
    public final a0.h h;
    public final HashMap f26683n;
    public final HashMap f26684r;
    public final HashMap f26685s;
    public final HashMap f26686w;
    public final a0.h f26687x;
    public final HashMap f26688y;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        K = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        L = new yy[4];
    }

    public yy(int i3) {
        super(i3);
        this.f26678a = new HashMap();
        this.f26679b = new SparseArray();
        this.f26680c = new SparseArray();
        this.d = new SparseArray();
        this.f26681e = new SparseArray();
        this.f26682f = new a0.h();
        this.h = new a0.h();
        this.f26683n = new HashMap();
        this.f26684r = new HashMap();
        this.f26685s = new HashMap();
        this.f26686w = new HashMap();
        this.f26687x = new a0.h();
        this.f26688y = new HashMap();
        this.E = new a0.h();
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = new l2.e(new gi.w5(this, 26));
        this.I = new HashMap();
        g0.h3(new vs(this, 12));
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
        for (int i3 = 0; i3 < size; i3++) {
            message.entities.get(i3).serializeToStream(serializedData);
        }
    }

    public static yy C(int i3) {
        yy yyVar;
        yy yyVar2 = L[i3];
        if (yyVar2 == null) {
            synchronized (yy.class) {
                try {
                    yyVar = L[i3];
                    if (yyVar == null) {
                        yy[] yyVarArr = L;
                        yy yyVar3 = new yy(i3);
                        yyVarArr[i3] = yyVar3;
                        yyVar = yyVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return yyVar;
        }
        return yyVar2;
    }

    public static String D(c cVar, TLRPC.PhotoSize photoSize, Bitmap[] bitmapArr, boolean z10, boolean z11) {
        String str;
        if (photoSize == null || photoSize.location == null) {
            return null;
        }
        PointF P1 = org.telegram.ui.Cells.q1.P1(photoSize.f27026w, photoSize.h, 0, 0);
        if (bitmapArr != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                w7.G(cVar.f21919a);
                File K2 = w7.K(photoSize, null, z11, true);
                FileInputStream fileInputStream = new FileInputStream(K2);
                BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                float max = Math.max(options.outWidth / P1.x, options.outHeight / P1.y);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                options.inJustDecodeBounds = false;
                options.inSampleSize = (int) max;
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                FileInputStream fileInputStream2 = new FileInputStream(K2);
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
        return String.format(locale, str, Long.valueOf(photoSize.location.volume_id), Integer.valueOf(photoSize.location.local_id), Integer.valueOf((int) (P1.x / g0.f22607p)), Integer.valueOf((int) (P1.y / g0.f22607p)));
    }

    public static long E() {
        long j10 = 0;
        while (j10 == 0) {
            j10 = Utilities.f21385b.nextLong();
        }
        return j10;
    }

    public static TLRPC.PhotoSize G(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i3);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoPathSize) && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && photoSize.location != null) {
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        return photoSize;
                    }
                    TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                    tL_photoSize_layer127.type = photoSize.type;
                    tL_photoSize_layer127.f27026w = photoSize.f27026w;
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
        CharSequence n12 = g0.n1(charSequence);
        if (n12.length() == 0) {
            return n12;
        }
        while (charSequence.length() > 0 && charSequence.charAt(0) == '\n') {
            charSequence = charSequence.subSequence(1, charSequence.length());
        }
        while (charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            charSequence = charSequence.subSequence(0, charSequence.length() - 1);
        }
        return charSequence;
    }

    public static void K(java.util.ArrayList r96, final long r97, boolean r99, boolean r100, boolean r101, final org.telegram.messenger.c r102, long r103, final org.telegram.messenger.zi r105, final org.telegram.tgnet.TLRPC.TL_inputPollAnswer r106, final org.telegram.messenger.zi r107, final org.telegram.messenger.zi r108, final boolean r109, final int r110, final int r111, final org.telegram.tgnet.tl.TL_stories.StoryItem r112, final org.telegram.ui.mm r113, final org.telegram.messenger.zv r114, final long r115, final boolean r117, final long r118, final long r120, final org.telegram.messenger.ej r122, final th.f r123, boolean r124, org.telegram.ui.Components.y00 r125, final boolean r126) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.K(java.util.ArrayList, long, boolean, boolean, boolean, org.telegram.messenger.c, long, org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, org.telegram.messenger.zi, org.telegram.messenger.zi, boolean, int, int, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.mm, org.telegram.messenger.zv, long, boolean, long, long, org.telegram.messenger.ej, th.f, boolean, org.telegram.ui.Components.y00, boolean):void");
    }

    public static void R(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, zi ziVar, zi ziVar2, org.telegram.ui.mm mmVar, boolean z10, int i3, int i10, zv zvVar, long j11, long j12, long j13) {
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
        wy c2 = wy.c(null, null, null, null, null, null, null, null, null, null, j10, null, ziVar, ziVar2, null, true, null, null, null, null, z10, i3, i10, 0, null, null, false, false);
        c2.Y = richMessage;
        c2.Z = arrayList4;
        c2.J = mmVar;
        c2.K = zvVar;
        c2.O = j11;
        c2.R = j12;
        c2.Q = j13;
        C(cVar.f21919a).r0(c2);
    }

    public static void S(final int i3, final long j10, final long j11, final long j12, final HashMap hashMap, final c cVar, final zi ziVar, final zi ziVar2, final zv zvVar, final TLRPC.BotInlineResult botInlineResult, final TL_stories.StoryItem storyItem, final org.telegram.ui.ActionBar.d2 d2Var, final org.telegram.ui.mm mmVar, final boolean z10) {
        wy d;
        TLRPC.TL_webPagePending tL_webPagePending;
        if (botInlineResult == null) {
            return;
        }
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    String f10;
                    String str;
                    boolean z11;
                    char c2;
                    long j13;
                    char c10;
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
                    long j14;
                    TLRPC.InputPeer inputPeer2;
                    boolean z12;
                    TLRPC.WebDocument webDocument;
                    long j15 = j10;
                    boolean C = m5.C(j15);
                    TLRPC.BotInlineResult botInlineResult3 = botInlineResult;
                    boolean equals = "game".equals(botInlineResult3.type);
                    final c cVar2 = cVar;
                    if (equals) {
                        if (!C) {
                            TLRPC.TL_game tL_game = new TLRPC.TL_game();
                            tL_game.title = botInlineResult3.title;
                            tL_game.description = botInlineResult3.description;
                            tL_game.short_name = botInlineResult3.f26999id;
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
                            j13 = j15;
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
                                j13 = j15;
                                z11 = C;
                                tL_photo = null;
                                str4 = null;
                                str2 = str4;
                            }
                            j13 = j15;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str4 = null;
                            str2 = null;
                        } else {
                            TLRPC.Photo photo2 = botInlineResult3.photo;
                            if (photo2 != null && (photo2 instanceof TLRPC.TL_photo)) {
                                tL_photo = (TLRPC.TL_photo) photo2;
                                j13 = j15;
                                z11 = C;
                                tL_document = null;
                                str4 = null;
                                str2 = str4;
                            }
                            j13 = j15;
                            z11 = C;
                            tL_photo = null;
                            tL_document = null;
                            str4 = null;
                            str2 = null;
                        }
                    } else {
                        TLRPC.WebDocument webDocument2 = botInlineResult3.content;
                        if (webDocument2 != null) {
                            String B = zb.B(webDocument2.url, null);
                            if (TextUtils.isEmpty(B)) {
                                f10 = w7.C(botInlineResult3.content.mime_type);
                            } else {
                                f10 = t4.c.f(".", B);
                            }
                            File file = new File(w7.z(4), Utilities.a(botInlineResult3.content.url) + f10);
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
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 102340:
                                    z11 = C;
                                    if (str6.equals("gif")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3143036:
                                    z11 = C;
                                    if (str6.equals("file")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 93166550:
                                    z11 = C;
                                    if (str6.equals("audio")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 106642994:
                                    z11 = C;
                                    if (str6.equals("photo")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 112202875:
                                    if (str6.equals("video")) {
                                        z11 = C;
                                        c2 = 5;
                                        break;
                                    }
                                    z11 = C;
                                    c2 = 65535;
                                    break;
                                case 112386354:
                                    if (str6.equals("voice")) {
                                        c2 = 6;
                                        z11 = C;
                                        break;
                                    }
                                    z11 = C;
                                    c2 = 65535;
                                    break;
                                default:
                                    z11 = C;
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 5:
                                case 6:
                                    TLRPC.TL_document tL_document3 = new TLRPC.TL_document();
                                    j13 = j15;
                                    tL_document3.f27007id = 0L;
                                    tL_document3.size = 0L;
                                    tL_document3.dc_id = 0;
                                    tL_document3.mime_type = botInlineResult3.content.mime_type;
                                    tL_document3.file_reference = new byte[0];
                                    tL_document3.date = ConnectionsManager.getInstance(cVar2.f21919a).getCurrentTime();
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_document3.attributes.add(tL_documentAttributeFilename);
                                    String str7 = botInlineResult3.type;
                                    str7.getClass();
                                    switch (str7.hashCode()) {
                                        case -1890252483:
                                            if (str7.equals("sticker")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 102340:
                                            if (str7.equals("gif")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 3143036:
                                            if (str7.equals("file")) {
                                                c10 = 2;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 93166550:
                                            if (str7.equals("audio")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 112202875:
                                            if (str7.equals("video")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 112386354:
                                            if (str7.equals("voice")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    int i13 = 55;
                                    switch (c10) {
                                        case 0:
                                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                                            tL_documentAttributeSticker.alt = "";
                                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                                            tL_document3.attributes.add(tL_documentAttributeSticker);
                                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                            int[] h12 = zi.h1(botInlineResult3);
                                            tL_documentAttributeImageSize.f27008w = h12[0];
                                            tL_documentAttributeImageSize.h = h12[1];
                                            tL_document3.attributes.add(tL_documentAttributeImageSize);
                                            tL_documentAttributeFilename.file_name = "sticker.webp";
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K3 = zb.K(new File(w7.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + zb.B(botInlineResult3.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K3 != null) {
                                                        TLRPC.PhotoSize Z = zb.Z(K3, 90.0f, 90.0f, 55, false);
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
                                                    K2 = yy.r(1, str5);
                                                    if (K2 == null) {
                                                        TLRPC.WebDocument webDocument3 = botInlineResult3.thumb;
                                                        if ((webDocument3 instanceof TLRPC.TL_webDocument) && "video/mp4".equals(webDocument3.mime_type)) {
                                                            String B2 = zb.B(botInlineResult3.thumb.url, null);
                                                            if (TextUtils.isEmpty(B2)) {
                                                                str3 = w7.C(botInlineResult3.thumb.mime_type);
                                                            } else {
                                                                str3 = "." + B2;
                                                            }
                                                            K2 = yy.r(1, new File(w7.z(4), Utilities.a(botInlineResult3.thumb.url) + str3).getAbsolutePath());
                                                        }
                                                    }
                                                } else {
                                                    float f11 = i10;
                                                    K2 = zb.K(str5, null, f11, f11, true);
                                                }
                                                if (K2 != null) {
                                                    float f12 = i10;
                                                    if (i10 > 90) {
                                                        i13 = 80;
                                                    }
                                                    TLRPC.PhotoSize Z2 = zb.Z(K2, f12, f12, i13, false);
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
                                            tL_documentAttributeAudio.duration = zi.g1(botInlineResult3);
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
                                            int[] h13 = zi.h1(botInlineResult3);
                                            tL_documentAttributeVideo.f27008w = h13[0];
                                            tL_documentAttributeVideo.h = h13[1];
                                            tL_documentAttributeVideo.duration = zi.g1(botInlineResult3);
                                            tL_documentAttributeVideo.supports_streaming = true;
                                            tL_document3.attributes.add(tL_documentAttributeVideo);
                                            try {
                                                if (botInlineResult3.thumb != null) {
                                                    Bitmap K4 = zb.K(new File(w7.z(4), Utilities.a(botInlineResult3.thumb.url) + "." + zb.B(botInlineResult3.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                                    if (K4 != null) {
                                                        TLRPC.PhotoSize Z3 = zb.Z(K4, 90.0f, 90.0f, 55, false);
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
                                            tL_documentAttributeAudio2.duration = zi.g1(botInlineResult3);
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
                                        int[] h14 = zi.h1(botInlineResult3);
                                        tL_photoSize.f27026w = h14[0];
                                        tL_photoSize.h = h14[1];
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
                                        tL_photo = yy.C(cVar2.f21919a).A(str5, null, false);
                                    } else {
                                        i11 = 0;
                                        tL_photo = null;
                                    }
                                    if (tL_photo == null) {
                                        tL_photo = new TLRPC.TL_photo();
                                        tL_photo.date = ConnectionsManager.getInstance(cVar2.f21919a).getCurrentTime();
                                        tL_photo.file_reference = new byte[i11];
                                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                                        int[] h15 = zi.h1(botInlineResult3);
                                        tL_photoSize2.f27026w = h15[i11];
                                        tL_photoSize2.h = h15[1];
                                        tL_photoSize2.size = 1;
                                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                                        tL_photoSize2.type = "x";
                                        tL_photo.sizes.add(tL_photoSize2);
                                    }
                                    str2 = str5;
                                    j13 = j15;
                                    tL_document = null;
                                    break;
                                default:
                                    str2 = str5;
                                    j13 = j15;
                                    tL_photo = null;
                                    tL_document = null;
                                    break;
                            }
                            str4 = null;
                        }
                        j13 = j15;
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
                                tL_documentAttributeVideo_layer159.f27008w = tL_documentAttributeVideo2.f27008w;
                                tL_documentAttributeVideo_layer159.h = tL_documentAttributeVideo2.h;
                                tL_document.attributes.set(i15, tL_documentAttributeVideo_layer159);
                            }
                        }
                    }
                    if (zi.t3(tL_document, false)) {
                        TLRPC.PhotoSize w10 = w7.w(tL_document.thumbs, 320, false, null, false);
                        w7.G(cVar2.f21919a);
                        File I = w7.I(tL_document);
                        if (!I.exists()) {
                            w7.G(cVar2.f21919a);
                            z12 = true;
                            I = w7.K(tL_document, null, true, true);
                        } else {
                            z12 = true;
                        }
                        inputPeer = null;
                        tL_document2 = tL_document;
                        botInlineResult2 = botInlineResult3;
                        boolean z13 = z12;
                        yy.w(cVar2, z11, tL_document2, I.getAbsolutePath(), null, 0L, false);
                        strArr[0] = yy.D(cVar2, w10, bitmapArr, z13, z13);
                        i12 = z13;
                    } else {
                        botInlineResult2 = botInlineResult3;
                        tL_document2 = tL_document;
                        i12 = 1;
                        inputPeer = null;
                    }
                    if (!m5.C(j13)) {
                        j14 = j13;
                        inputPeer2 = hp.s1(cVar2.f21919a).j1(j14);
                    } else {
                        j14 = j13;
                        inputPeer2 = inputPeer;
                    }
                    if (inputPeer2 != null && inputPeer2.user_id != 0 && hp.s1(cVar2.f21919a).b2(inputPeer2.user_id) != null && hp.s1(cVar2.f21919a).b2(inputPeer2.user_id).voice_messages_forbidden && tL_document2 != null) {
                        boolean R4 = zi.R4(tL_document2);
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        if (R4) {
                            g0.h3(new hn(i12, d2Var2));
                            return;
                        } else if (zi.j4(tL_document2)) {
                            g0.h3(new hn(2, d2Var2));
                            return;
                        }
                    }
                    final zi ziVar3 = ziVar;
                    final zi ziVar4 = ziVar2;
                    final long j16 = j14;
                    final boolean z14 = z10;
                    final int i16 = i3;
                    final zv zvVar2 = zvVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.mm mmVar2 = mmVar;
                    final long j17 = j11;
                    final long j18 = j12;
                    final TLRPC.TL_document tL_document4 = tL_document2;
                    final TLRPC.BotInlineResult botInlineResult4 = botInlineResult2;
                    final TLRPC.TL_photo tL_photo2 = tL_photo;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            wy wyVar;
                            TLRPC.TL_document tL_document5 = TLRPC.TL_document.this;
                            long j19 = j16;
                            zi ziVar5 = ziVar3;
                            zi ziVar6 = ziVar4;
                            TLRPC.BotInlineResult botInlineResult5 = botInlineResult4;
                            HashMap hashMap3 = hashMap2;
                            boolean z15 = z14;
                            int i17 = i16;
                            if (tL_document5 != null) {
                                Bitmap[] bitmapArr2 = bitmapArr;
                                if (bitmapArr2[0] != null) {
                                    String[] strArr2 = strArr;
                                    if (strArr2[0] != null) {
                                        zb.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                    }
                                }
                                TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult5.send_message;
                                wyVar = wy.f(tL_document5, null, str2, j19, ziVar5, ziVar6, botInlineMessage2.message, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap3, z15, i17, 0, 0, botInlineResult5, null, false);
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
                                    wyVar = wy.c(null, botInlineMessage3.message, null, tL_photo3, null, null, null, null, null, null, j19, str10, ziVar5, ziVar6, null, true, null, botInlineMessage3.entities, botInlineMessage3.reply_markup, hashMap3, z15, i17, 0, 0, botInlineResult5, null, false, false);
                                } else {
                                    TLRPC.TL_game tL_game3 = tL_game2;
                                    if (tL_game3 != null) {
                                        wyVar = wy.c(null, null, null, null, null, null, null, tL_game3, null, null, j19, null, ziVar5, ziVar6, null, true, null, null, botInlineResult5.send_message.reply_markup, hashMap3, z15, i17, 0, 0, null, null, false, false);
                                    } else {
                                        wyVar = null;
                                    }
                                }
                            }
                            if (wyVar != null) {
                                wyVar.K = zvVar2;
                                wyVar.H = storyItem2;
                                wyVar.J = mmVar2;
                                wyVar.Q = j17;
                                wyVar.R = j18;
                                yy.C(cVar2.f21919a).r0(wyVar);
                            }
                        }
                    });
                }
            }).run();
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
            if (m5.C(j10)) {
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
            wy b10 = wy.b(botInlineMessage2.message, j10, ziVar, ziVar2, tL_webPagePending2, !botInlineMessage2.no_webpage, botInlineMessage2.entities, botInlineMessage2.reply_markup, hashMap, z10, i3, 0, null, false);
            b10.K = zvVar;
            b10.J = mmVar;
            b10.Q = j11;
            b10.R = j12;
            C(cVar.f21919a).r0(b10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
            TL_iv.RichMessage richMessage = botInlineMessage.rich_message;
            wy c2 = wy.c(null, null, null, null, null, null, null, null, null, null, j10, null, ziVar, ziVar2, null, true, null, null, botInlineMessage.reply_markup, hashMap, z10, i3, 0, 0, null, null, false, false);
            c2.Y = richMessage;
            c2.K = zvVar;
            c2.J = mmVar;
            c2.Q = j11;
            c2.R = j12;
            C(cVar.f21919a).r0(c2);
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
            wy d10 = wy.d(tL_messageMediaWidget, j10, ziVar, ziVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i3);
            d10.f26291b = tL_botInlineMessageWidget.message;
            d10.f26309w = tL_botInlineMessageWidget.entities;
            d10.L = tL_botInlineMessageWidget.invert_media;
            d10.K = zvVar;
            d10.J = mmVar;
            d10.Q = j11;
            d10.R = j12;
            C(cVar.f21919a).r0(d10);
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
            wy d11 = wy.d(tL_messageMediaVenue, j10, ziVar, ziVar2, botInlineMessage3.reply_markup, hashMap, z10, i3);
            d11.K = zvVar;
            d11.J = mmVar;
            d11.Q = j11;
            d11.R = j12;
            C(cVar.f21919a).r0(d11);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
            if (botInlineMessage.period == 0 && botInlineMessage.proximity_notification_radius == 0) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.BotInlineMessage botInlineMessage4 = botInlineResult.send_message;
                tL_messageMediaGeo.geo = botInlineMessage4.geo;
                tL_messageMediaGeo.heading = botInlineMessage4.heading;
                d = wy.d(tL_messageMediaGeo, j10, ziVar, ziVar2, botInlineMessage4.reply_markup, hashMap, z10, i3);
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
                d = wy.d(tL_messageMediaGeoLive, j10, ziVar, ziVar2, botInlineMessage5.reply_markup, hashMap, z10, i3);
            }
            d.K = zvVar;
            d.J = mmVar;
            d.Q = j11;
            d.R = j12;
            C(cVar.f21919a).r0(d);
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
            wy g7 = wy.g(tL_user, j10, ziVar, ziVar2, botInlineResult.send_message.reply_markup, hashMap, z10, i3, 0);
            g7.K = zvVar;
            g7.J = mmVar;
            g7.Q = j11;
            g7.R = j12;
            C(cVar.f21919a).r0(g7);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
            if (m5.C(j10)) {
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
            wy c10 = wy.c(null, null, null, null, null, null, null, null, null, tL_messageMediaInvoice, j10, null, ziVar, ziVar2, null, true, null, null, botInlineResult.send_message.reply_markup, hashMap, z10, i3, 0, 0, null, null, false, false);
            c10.K = zvVar;
            c10.J = mmVar;
            c10.Q = j11;
            c10.R = j12;
            C(cVar.f21919a).r0(c10);
        } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
            TLRPC.TL_webPagePending tL_webPagePending3 = new TLRPC.TL_webPagePending();
            tL_webPagePending3.url = ((TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage).url;
            TLRPC.BotInlineMessage botInlineMessage7 = botInlineResult.send_message;
            wy b11 = wy.b(botInlineMessage7.message, j10, ziVar, ziVar2, tL_webPagePending3, !botInlineMessage7.no_webpage, botInlineMessage7.entities, botInlineMessage7.reply_markup, hashMap, z10, i3, 0, null, false);
            b11.K = zvVar;
            b11.J = mmVar;
            b11.Q = j11;
            b11.R = j12;
            b11.L = botInlineResult.send_message.invert_media;
            C(cVar.f21919a).r0(b11);
        }
    }

    public static void T(c cVar, String str, String str2, Uri uri, String str3, String str4, long j10, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem, org.telegram.ui.mm mmVar, boolean z10, org.telegram.ui.Components.y00 y00Var, zv zvVar) {
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
        V(0, j10, 0L, 0L, 0L, str3, str4, arrayList2, arrayList3, arrayList4, null, null, null, cVar, ziVar, ziVar2, null, null, zvVar, storyItem, mmVar, y00Var, null, z10, false);
    }

    public static int U(org.telegram.messenger.c r42, java.lang.String r43, java.lang.String r44, android.net.Uri r45, java.lang.String r46, final long r47, final org.telegram.messenger.zi r49, final org.telegram.messenger.zi r50, final org.telegram.tgnet.tl.TL_stories.StoryItem r51, final org.telegram.ui.mm r52, final java.util.ArrayList r53, final org.telegram.messenger.zi r54, long[] r55, boolean r56, java.lang.CharSequence r57, final boolean r58, int r59, final int r60, java.lang.Integer[] r61, boolean r62, final org.telegram.messenger.zv r63, final long r64, final boolean r66, final long r67, final long r69, final org.telegram.messenger.ej r71, final th.f r72, final int r73) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.U(org.telegram.messenger.c, java.lang.String, java.lang.String, android.net.Uri, java.lang.String, long, org.telegram.messenger.zi, org.telegram.messenger.zi, org.telegram.tgnet.tl.TL_stories$StoryItem, org.telegram.ui.mm, java.util.ArrayList, org.telegram.messenger.zi, long[], boolean, java.lang.CharSequence, boolean, int, int, java.lang.Integer[], boolean, org.telegram.messenger.zv, long, boolean, long, long, org.telegram.messenger.ej, th.f, int):int");
    }

    public static void V(final int i3, final long j10, final long j11, final long j12, final long j13, final String str, final String str2, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ArrayList arrayList4, final ArrayList arrayList5, final ArrayList arrayList6, final c cVar, final zi ziVar, final zi ziVar2, final zi ziVar3, final ej ejVar, final zv zvVar, final TL_stories.StoryItem storyItem, final org.telegram.ui.mm mmVar, final org.telegram.ui.Components.y00 y00Var, final th.f fVar, final boolean z10, final boolean z11) {
        if (arrayList != null || arrayList2 != null || arrayList3 != null) {
            if (arrayList != null && arrayList2 != null && arrayList.size() != arrayList2.size()) {
                return;
            }
            Utilities.f21387e.c(new Runnable() {
                @Override
                public final void run() {
                    int i10;
                    boolean z12;
                    String str3;
                    ArrayList arrayList7;
                    String str4;
                    long j14;
                    boolean z13;
                    boolean z14;
                    int i11;
                    c cVar2;
                    Uri uri;
                    long j15;
                    int i12;
                    String str5;
                    ej ejVar2;
                    long j16;
                    int i13;
                    ArrayList arrayList8;
                    boolean z15;
                    ArrayList arrayList9;
                    boolean z16;
                    int i14;
                    long[] jArr = new long[1];
                    Integer[] numArr = new Integer[1];
                    long j17 = j10;
                    boolean C = m5.C(j17);
                    ArrayList arrayList10 = arrayList;
                    String str6 = str;
                    th.f fVar2 = fVar;
                    c cVar3 = cVar;
                    int i15 = i3;
                    String str7 = str2;
                    zi ziVar4 = ziVar;
                    zi ziVar5 = ziVar2;
                    TL_stories.StoryItem storyItem2 = storyItem;
                    String str8 = str7;
                    org.telegram.ui.mm mmVar2 = mmVar;
                    ArrayList arrayList11 = arrayList4;
                    zi ziVar6 = ziVar3;
                    boolean z17 = z10;
                    org.telegram.ui.Components.y00 y00Var2 = y00Var;
                    zv zvVar2 = zvVar;
                    org.telegram.ui.Components.y00 y00Var3 = y00Var2;
                    int i16 = i15;
                    long j18 = j11;
                    boolean z18 = z11;
                    String str9 = str6;
                    long j19 = j18;
                    long j20 = j12;
                    long j21 = j13;
                    ej ejVar3 = ejVar;
                    if (arrayList10 != null) {
                        int size = arrayList10.size();
                        int i17 = 0;
                        i10 = 0;
                        int i18 = 0;
                        z12 = true;
                        while (i17 < size) {
                            org.telegram.ui.Components.y00 y00Var4 = y00Var3;
                            if (i17 == 0) {
                                str5 = str9;
                            } else {
                                str5 = null;
                            }
                            boolean z19 = z18;
                            if (!C && size > 1 && i18 % 10 == 0 && fVar2 == null) {
                                ejVar2 = ejVar3;
                                j16 = j17;
                                long j22 = jArr[0];
                                if (j22 != 0) {
                                    i13 = i16;
                                    yy.z(cVar3, j22, i13);
                                } else {
                                    i13 = i16;
                                }
                                jArr[0] = Utilities.f21385b.nextLong();
                                i18 = 0;
                            } else {
                                ejVar2 = ejVar3;
                                j16 = j17;
                                i13 = i16;
                            }
                            int i19 = i18 + 1;
                            long j23 = jArr[0];
                            if ((fVar2 == null && i19 == 10) || i17 == size - 1) {
                                arrayList8 = arrayList11;
                                z15 = true;
                            } else {
                                arrayList8 = arrayList11;
                                z15 = false;
                            }
                            String str10 = (String) arrayList10.get(i17);
                            ej ejVar4 = ejVar2;
                            String str11 = (String) arrayList2.get(i17);
                            int i20 = i19;
                            String str12 = str8;
                            if (i17 == 0) {
                                arrayList9 = arrayList8;
                            } else {
                                arrayList9 = null;
                            }
                            String str13 = str9;
                            if (y00Var4 == null) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            long j24 = j19;
                            if (!z12) {
                                j19 = 0;
                            }
                            ArrayList arrayList12 = arrayList5;
                            if (arrayList12 != null) {
                                i14 = ((Integer) arrayList12.get(i17)).intValue();
                            } else {
                                i14 = -1;
                            }
                            int i21 = i17;
                            int i22 = size;
                            long j25 = j16;
                            ArrayList arrayList13 = arrayList10;
                            ArrayList arrayList14 = arrayList8;
                            int i23 = i13;
                            j17 = j25;
                            i10 = yy.U(cVar3, str10, str11, null, str12, j17, ziVar4, ziVar5, storyItem2, mmVar2, arrayList9, ziVar6, jArr, z15, str5, z17, i23, 0, numArr, z16, zvVar2, j19, z19, j20, j21, ejVar4, fVar2, i14);
                            c cVar4 = cVar3;
                            long j26 = jArr[0];
                            i20 = (j23 != j26 || j26 == -1) ? 1 : 1;
                            if (i10 != 0 && z15 && fVar2 == null && j26 != 0) {
                                yy.z(cVar4, j26, i23);
                                jArr[0] = 0;
                                i20 = 0;
                            }
                            int i24 = i21 + 1;
                            i16 = i23;
                            cVar3 = cVar4;
                            str8 = str12;
                            ejVar3 = ejVar4;
                            z12 = false;
                            arrayList10 = arrayList13;
                            arrayList11 = arrayList14;
                            str9 = str13;
                            j19 = j24;
                            y00Var3 = y00Var4;
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
                    ej ejVar5 = ejVar3;
                    String str14 = str8;
                    ArrayList arrayList16 = arrayList11;
                    org.telegram.ui.Components.y00 y00Var5 = y00Var3;
                    int i25 = i16;
                    String str15 = str9;
                    long j27 = j19;
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
                                j14 = j17;
                                long j28 = jArr[0];
                                if (j28 != 0) {
                                    yy.z(cVar5, j28, i25);
                                }
                                jArr[0] = Utilities.f21385b.nextLong();
                                i27 = 0;
                            } else {
                                str4 = str14;
                                j14 = j17;
                            }
                            int i28 = i27 + 1;
                            long j29 = jArr[0];
                            if ((fVar2 == null && i28 == 10) || i26 == size2 - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            Uri uri2 = (Uri) arrayList17.get(i26);
                            if (y00Var5 == null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z12) {
                                i11 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j17 = j14;
                                j15 = j27;
                            } else {
                                i11 = size2;
                                cVar2 = cVar5;
                                uri = uri2;
                                j17 = j14;
                                j15 = 0;
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
                            i10 = yy.U(cVar2, null, null, uri, str14, j17, ziVar4, ziVar5, storyItem2, mmVar2, arrayList18, ziVar6, jArr, z13, str3, z17, i30, 0, numArr, z14, zvVar2, j15, z22, j20, j21, ejVar5, fVar2, i12);
                            i25 = i30;
                            long j30 = jArr[0];
                            if (j29 != j30 || j30 == -1) {
                                i31 = 1;
                            }
                            if (i10 != 0 && z13 && fVar2 == null && j30 != 0) {
                                yy.z(cVar2, j30, i25);
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
                    if (y00Var5 != null) {
                        ((t0.h) y00Var5.f40562a).f();
                    }
                    if (i33 != 0) {
                        g0.h3(new x0(i33, cVar6, 12));
                    }
                }
            });
        }
    }

    public static void W(c cVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CharSequence charSequence, String str, long j10, zi ziVar, zi ziVar2, boolean z10, int i3) {
        c cVar2;
        CharSequence charSequence2;
        ArrayList arrayList4;
        String str2 = null;
        if (charSequence != null) {
            CharSequence[] charSequenceArr = {charSequence};
            cVar2 = cVar;
            ArrayList W = li.b0(cVar2.f21919a).W(charSequenceArr, true, true);
            charSequence2 = charSequenceArr[0];
            arrayList4 = W;
        } else {
            cVar2 = cVar;
            charSequence2 = charSequence;
            arrayList4 = null;
        }
        if (charSequence2 != null) {
            str2 = charSequence2.toString();
        }
        V(i3, j10, 0L, 0L, 0L, str2, str, arrayList, arrayList2, arrayList3, arrayList4, null, null, cVar2, ziVar, ziVar2, null, null, null, null, null, null, null, z10, false);
    }

    public static void X(final c cVar, final ArrayList arrayList, final long j10, final zi ziVar, final zi ziVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.mm mmVar, final boolean z10, boolean z11, final zi ziVar3, final TLRPC.TL_inputPollAnswer tL_inputPollAnswer, final boolean z12, final int i3, final int i10, final boolean z13, final org.telegram.ui.Components.y00 y00Var, final zv zvVar, final long j11, final boolean z14, final long j12, final long j13, final ej ejVar, final th.f fVar, final boolean z15) {
        final boolean z16;
        final long j14;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        boolean z17 = false;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((xy) arrayList.get(i11)).h > 0) {
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
            j14 = fVar.f55421c;
        } else {
            j14 = 0;
        }
        if (j14 != 0) {
            z17 = true;
        }
        final boolean z18 = z17;
        J.c(new Runnable() {
            @Override
            public final void run() {
                yy.K(arrayList, j10, z10, z16, z18, cVar, j14, ziVar3, tL_inputPollAnswer, ziVar, ziVar2, z12, i3, i10, storyItem, mmVar, zvVar, j11, z14, j12, j13, ejVar, fVar, z15, y00Var, z13);
            }
        });
    }

    public static void Y(c cVar, Uri uri, long j10, zi ziVar, zi ziVar2, org.telegram.ui.Components.y00 y00Var, zi ziVar3, boolean z10, int i3, zv zvVar) {
        Z(cVar, null, null, uri, j10, ziVar, ziVar2, null, null, null, y00Var, 0, ziVar3, null, z10, i3, false, null, zvVar, 0L, 0L, 0L, null);
    }

    public static void Z(c cVar, String str, String str2, Uri uri, long j10, zi ziVar, zi ziVar2, org.telegram.ui.mm mmVar, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.Components.y00 y00Var, int i3, zi ziVar3, b20 b20Var, boolean z10, int i10, boolean z11, CharSequence charSequence, zv zvVar, long j11, long j12, long j13, ej ejVar) {
        ?? obj = new Object();
        obj.f26477c = str;
        obj.f26478e = str2;
        obj.f26475a = uri;
        if (charSequence != null) {
            obj.d = charSequence.toString();
        }
        obj.f26481i = arrayList;
        obj.h = i3;
        if (arrayList2 != null) {
            obj.f26482j = new ArrayList(arrayList2);
        }
        obj.f26483k = b20Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(obj);
        X(cVar, arrayList3, j10, ziVar, ziVar2, null, mmVar, z11, false, ziVar3, null, z10, i10, 0, false, y00Var, zvVar, j11, false, j12, j13, ejVar, null, false);
    }

    public static void a0(c cVar, CharSequence charSequence, long j10, long j11, boolean z10, int i3, int i10) {
        qr.a0(cVar.f21919a).f24934a.c(new fw(charSequence, cVar, j11, j10, z10, i3, i10, 1));
    }

    public static void b0(final int i3, final int i10, final int i11, final long j10, final long j11, final long j12, final long j13, final CharSequence charSequence, final String str, final String str2, final ArrayList arrayList, final c cVar, final zi ziVar, final zi ziVar2, final zi ziVar3, final ej ejVar, final zv zvVar, final b20 b20Var, final TLRPC.Photo photo, final TL_stories.StoryItem storyItem, final org.telegram.ui.mm mmVar, final boolean z10, final boolean z11, final boolean z12) {
        if (str != null && str.length() != 0) {
            new Thread(new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gy.run():void");
                }
            }).start();
        }
    }

    public static boolean h(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.p5.class)) {
                if (p5Var.fromEmojiKeyboard) {
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
                int i3 = 0;
                while (i3 < size) {
                    TL_iv.RichText richText3 = arrayList.get(i3);
                    i3++;
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
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) arrayList.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    tL_documentAttributeVideo_layer159.flags = documentAttribute.flags;
                    tL_documentAttributeVideo_layer159.round_message = documentAttribute.round_message;
                    tL_documentAttributeVideo_layer159.supports_streaming = documentAttribute.supports_streaming;
                    tL_documentAttributeVideo_layer159.duration = documentAttribute.duration;
                    tL_documentAttributeVideo_layer159.f27008w = documentAttribute.f27008w;
                    tL_documentAttributeVideo_layer159.h = documentAttribute.h;
                    arrayList2.add(tL_documentAttributeVideo_layer159);
                } else {
                    arrayList2.add(documentAttribute);
                }
            }
        }
        return arrayList2;
    }

    public static void m(long j10, long j11, File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            channel.position(j10);
            ByteBuffer allocate = ByteBuffer.allocate(262144);
            while (j11 > 0) {
                allocate.clear();
                allocate.limit((int) Math.min(allocate.capacity(), j11));
                int read = channel.read(allocate);
                if (read <= 0) {
                    break;
                }
                allocate.flip();
                channel2.write(allocate);
                j11 -= read;
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
            for (int i3 = 0; i3 < richMessage.blocks.size(); i3++) {
                tL_inputRichMessage.blocks.add(y0(richMessage.blocks.get(i3)));
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
                    tL_inputPhoto.f27020id = photo2.f27025id;
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
                    tL_inputDocument.f27013id = document2.f27007id;
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

    public static b20 n(long j10, String str) {
        int i3;
        int i10;
        float f10;
        int[] iArr = new int[11];
        AnimatedFileNative.d(str, iArr, j10);
        if (iArr[0] == 0) {
            if (r2.f25040a) {
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
        long j11 = iArr[5];
        int i11 = iArr[7];
        b20 b20Var = new b20();
        b20Var.f21708a = -1L;
        b20Var.f21710b = -1L;
        b20Var.f21720m = E;
        b20Var.f21722o = str;
        b20Var.f21723p = j10;
        b20Var.f21721n = i11;
        b20Var.f21725r = (long) Math.ceil(f11);
        boolean z10 = true;
        int i12 = iArr[1];
        b20Var.h = i12;
        b20Var.f21718k = i12;
        int i13 = iArr[2];
        b20Var.f21716i = i13;
        b20Var.f21719l = i13;
        b20Var.f21715g = iArr[8];
        b20Var.v = f11 * 1000.0f;
        float max = Math.max(i12, i13);
        float f12 = 1280.0f;
        if (max > 1280.0f) {
            i3 = 4;
        } else if (max > 854.0f) {
            i3 = 3;
        } else if (max > 640.0f) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        z5 q10 = z5.q(h10.f22829t0);
        int e10 = t0.e();
        if (e10 == 1) {
            i10 = q10.p().h;
        } else if (e10 == 2) {
            i10 = q10.o().h;
        } else {
            i10 = q10.n().h;
        }
        int round = Math.round(i10 / (100.0f / i3));
        if (round > i3) {
            round = i3;
        }
        if (new File(str).length() < 1048576000) {
            if (round == i3 && Math.max(b20Var.h, b20Var.f21716i) <= 1280) {
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
                int i14 = b20Var.h;
                int i15 = b20Var.f21716i;
                if (i14 > i15) {
                    f10 = i14;
                } else {
                    f10 = i15;
                }
                float f13 = f12 / f10;
                b20Var.f21718k = Math.round((i14 * f13) / 2.0f) * 2;
                b20Var.f21719l = Math.round((b20Var.f21716i * f13) / 2.0f) * 2;
            }
            E = MediaController.Q(b20Var.f21716i, b20Var.h, E, b20Var.f21719l, b20Var.f21718k);
        } else {
            z10 = false;
        }
        if (!z10) {
            b20Var.f21718k = b20Var.h;
            b20Var.f21719l = b20Var.f21716i;
            b20Var.f21720m = E;
            b20Var.f21724q = length;
        } else {
            b20Var.f21720m = E;
            b20Var.f21724q = a1.g.e(f11 / 1000.0f, MediaController.v(b20Var.f21718k, b20Var.f21719l, E, false), 8.0f, (float) j11);
        }
        if (b20Var.f21724q == 0) {
            b20Var.f21724q = 1L;
        }
        return b20Var;
    }

    public static Bitmap r(int i3, String str) {
        float f10;
        if (i3 == 2) {
            f10 = 1920.0f;
        } else if (i3 == 3) {
            f10 = 96.0f;
        } else {
            f10 = 512.0f;
        }
        Bitmap s6 = s(str, 0L, null, false);
        if (s6 != null) {
            int width = s6.getWidth();
            int height = s6.getHeight();
            float f11 = width;
            if (f11 > f10 || height > f10) {
                float max = Math.max(width, height) / f10;
                return Bitmap.createScaledBitmap(s6, (int) (f11 / max), (int) (height / max), true);
            }
        }
        return s6;
    }

    public static Bitmap s(String str, long j10, int[] iArr, boolean z10) {
        if (z10) {
            org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(new File(str), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
            Bitmap q10 = t5Var.q(j10, z10);
            if (iArr != null) {
                iArr[0] = t5Var.d[2];
            }
            t5Var.u();
            if (q10 == null) {
                return s(str, j10, iArr, false);
            }
            return q10;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmap = null;
        try {
            mediaMetadataRetriever.setDataSource(str);
            bitmap = mediaMetadataRetriever.getFrameAtTime(j10, 1);
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(j10, 3);
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

    public static void w(c cVar, boolean z10, TLObject tLObject, String str, Uri uri, long j10, boolean z11) {
        int i3;
        boolean z12;
        TLRPC.PhotoSize b02;
        TLRPC.PhotoSize b03;
        if (tLObject instanceof TLRPC.TL_photo) {
            TLRPC.TL_photo tL_photo = (TLRPC.TL_photo) tLObject;
            TLRPC.PhotoSize w10 = w7.w(tL_photo.sizes, 90, false, null, false);
            if (!(w10 instanceof TLRPC.TL_photoStrippedSize) && !(w10 instanceof TLRPC.TL_photoPathSize)) {
                w7.G(cVar.f21919a);
                z12 = w7.K(w10, null, true, true).exists();
            } else {
                z12 = true;
            }
            TLRPC.PhotoSize w11 = w7.w(tL_photo.sizes, g0.Z0(z11), false, null, false);
            w7.G(cVar.f21919a);
            boolean exists = w7.K(w11, null, false, true).exists();
            if (!z12 || !exists) {
                Bitmap K2 = zb.K(str, uri, g0.Z0(false), g0.Z0(false), true);
                if (K2 == null) {
                    K2 = zb.K(str, uri, 800.0f, 800.0f, true);
                }
                Bitmap bitmap = K2;
                if (!exists && (b03 = zb.b0(w11, bitmap, Bitmap.CompressFormat.JPEG, g0.Z0(false), g0.Z0(false), 80, false, 101, 101, false)) != w11) {
                    tL_photo.sizes.add(0, b03);
                }
                if (!z12 && (b02 = zb.b0(w10, bitmap, Bitmap.CompressFormat.JPEG, 90.0f, 90.0f, 55, true, 0, 0, false)) != w10) {
                    tL_photo.sizes.add(0, b02);
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        } else if (tLObject instanceof TLRPC.TL_document) {
            TLRPC.TL_document tL_document = (TLRPC.TL_document) tLObject;
            if ((zi.L4(tL_document) || zi.N3(tL_document)) && zi.X2(tL_document)) {
                int i10 = 320;
                TLRPC.PhotoSize w12 = w7.w(tL_document.thumbs, 320, false, null, false);
                if (!(w12 instanceof TLRPC.TL_photoStrippedSize) && !(w12 instanceof TLRPC.TL_photoPathSize)) {
                    w7.G(cVar.f21919a);
                    if (!w7.K(w12, null, true, true).exists()) {
                        Bitmap s6 = s(str, j10, null, false);
                        if (s6 == null) {
                            s6 = r(1, str);
                        }
                        Bitmap bitmap2 = s6;
                        if (z10) {
                            i10 = 90;
                        }
                        ArrayList<TLRPC.PhotoSize> arrayList = tL_document.thumbs;
                        float f10 = i10;
                        if (i10 > 90) {
                            i3 = 80;
                        } else {
                            i3 = 55;
                        }
                        int i11 = i3;
                        ThreadLocal threadLocal = zb.I;
                        arrayList.set(0, zb.b0(w12, bitmap2, Bitmap.CompressFormat.JPEG, f10, f10, i11, false, 0, 0, true));
                    }
                }
            }
        }
    }

    public static void x(String str, TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo, b20 b20Var) {
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
                tL_documentAttributeVideo.f27008w = Integer.parseInt(extractMetadata);
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
                if (b20Var == null && (intValue == 90 || intValue == 270)) {
                    int i3 = tL_documentAttributeVideo.f27008w;
                    tL_documentAttributeVideo.f27008w = tL_documentAttributeVideo.h;
                    tL_documentAttributeVideo.h = i3;
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
                MediaPlayer create = MediaPlayer.create(t0.f25457b, Uri.fromFile(new File(str)));
                if (create != null) {
                    tL_documentAttributeVideo.duration = create.getDuration() / 1000.0d;
                    tL_documentAttributeVideo.f27008w = create.getVideoWidth();
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
                InputStream openInputStream = t0.f25457b.getContentResolver().openInputStream(uri);
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
                int i3 = geoPoint.accuracy_radius;
                if (i3 != 0) {
                    tL_inputGeoPoint.flags |= 1;
                    tL_inputGeoPoint.accuracy_radius = i3;
                }
                inputGeoPoint = tL_inputGeoPoint;
            }
            inputpageblockmap.geo = inputGeoPoint;
            inputpageblockmap.zoom = pageblockmap.zoom;
            inputpageblockmap.f27224w = pageblockmap.f27226w;
            inputpageblockmap.h = pageblockmap.h;
            inputpageblockmap.caption = pageblockmap.caption;
            return inputpageblockmap;
        }
        return pageBlock;
    }

    public static void z(c cVar, long j10, int i3) {
        g0.h3(new ci.i9(cVar, j10, i3, 6));
    }

    public final TLRPC.TL_photo A(String str, Uri uri, boolean z10) {
        TLRPC.PhotoSize b02;
        Bitmap K2 = zb.K(str, uri, g0.Z0(z10), g0.Z0(z10), true);
        if (K2 == null) {
            K2 = zb.K(str, uri, 800.0f, 800.0f, true);
        }
        Bitmap bitmap = K2;
        ArrayList<TLRPC.PhotoSize> arrayList = new ArrayList<>();
        TLRPC.PhotoSize Z = zb.Z(bitmap, 90.0f, 90.0f, 55, true);
        if (Z != null) {
            arrayList.add(Z);
        }
        if (z10) {
            b02 = zb.b0(null, bitmap, Bitmap.CompressFormat.JPEG, g0.Z0(z10), g0.Z0(z10), 99, false, 101, 101, false);
        } else {
            b02 = zb.b0(null, bitmap, Bitmap.CompressFormat.JPEG, g0.Z0(z10), g0.Z0(z10), 80, false, 101, 101, false);
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

    public final void A0(ky kyVar, TLRPC.InputMedia inputMedia, TLRPC.InputEncryptedFile inputEncryptedFile, String str) {
        int i3 = hs.W1;
        if (inputMedia != null) {
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.media = inputMedia;
            TLObject tLObject = kyVar.f23893c;
            if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject;
                tL_messages_uploadMedia.peer = tL_messages_sendMultiMedia.peer;
                int i10 = 0;
                while (true) {
                    if (i10 >= tL_messages_sendMultiMedia.multi_media.size()) {
                        break;
                    } else if (tL_messages_sendMultiMedia.multi_media.get(i10).media == inputMedia) {
                        f0((TLRPC.Message) kyVar.f23913z.get(i10), kyVar.H);
                        getNotificationCenter().k(i3, str, -1L, -1L, Boolean.FALSE);
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
                                f0((TLRPC.Message) kyVar.f23913z.get(i11), kyVar.H);
                                getNotificationCenter().k(i3, str, -1L, -1L, Boolean.FALSE);
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
                        int a10 = th.d.a((TLRPC.TL_inputMediaPoll) inputMedia3, inputMedia);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= kyVar.C.size()) {
                                break;
                            } else if (((Integer) kyVar.C.get(i12)).intValue() == a10) {
                                f0((TLRPC.Message) kyVar.f23913z.get(i12), kyVar.H);
                                getNotificationCenter().k(i3, str, -1L, -1L, Boolean.FALSE);
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
                                f0((TLRPC.Message) kyVar.f23913z.get(i13), kyVar.H);
                                getNotificationCenter().k(i3, str, -1L, -1L, Boolean.FALSE);
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
                        int a11 = th.d.a((TLRPC.TL_inputMediaPoll) inputMedia5, inputMedia);
                        int i14 = 0;
                        while (true) {
                            if (i14 >= kyVar.C.size()) {
                                break;
                            } else if (((Integer) kyVar.C.get(i14)).intValue() == a11) {
                                f0((TLRPC.Message) kyVar.f23913z.get(i14), kyVar.H);
                                getNotificationCenter().k(i3, str, -1L, -1L, Boolean.FALSE);
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
            }
            getConnectionsManager().sendRequest(tL_messages_uploadMedia, new fx(this, inputMedia, kyVar, 1));
        } else if (inputEncryptedFile != null) {
            TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) kyVar.d;
            int i15 = 0;
            while (true) {
                if (i15 >= tL_messages_sendEncryptedMultiMedia.files.size()) {
                    break;
                } else if (tL_messages_sendEncryptedMultiMedia.files.get(i15) == inputEncryptedFile) {
                    f0((TLRPC.Message) kyVar.f23913z.get(i15), kyVar.H);
                    getNotificationCenter().k(i3, str, -1L, -1L, Boolean.FALSE);
                    break;
                } else {
                    i15++;
                }
            }
            t0(kyVar, false);
        }
    }

    public final py B(long j10) {
        return (py) this.E.f(j10);
    }

    public final Boolean F(zi ziVar, TLRPC.TodoItem todoItem) {
        return (Boolean) this.I.get(Integer.valueOf(Objects.hash(Long.valueOf(zi.B0(ziVar.f26868k)), Integer.valueOf(ziVar.f1()), Integer.valueOf(todoItem.f27148id))));
    }

    public final long I(long j10) {
        return ((Long) this.f26687x.g(0L, j10)).longValue();
    }

    public final boolean J(int i3) {
        if (this.f26680c.indexOfKey(i3) < 0 && this.d.indexOfKey(i3) < 0) {
            return false;
        }
        return true;
    }

    public final void L(ky kyVar) {
        M(kyVar, -1);
    }

    public final void M(ky kyVar, int i3) {
        boolean z10;
        int i10;
        TLObject tLObject;
        boolean z11;
        TLRPC.InputFile inputFile;
        String str;
        TLRPC.InputMedia inputMedia;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputMedia inputMedia2;
        zi ziVar;
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
        b20 b20Var;
        TLRPC.InputMedia d;
        TLRPC.InputMedia inputMedia5;
        String str3;
        TLRPC.PhotoSize photoSize3;
        final yy yyVar = this;
        final ky kyVar2 = kyVar;
        int i12 = kyVar2.f23894e;
        boolean z12 = false;
        boolean z13 = true;
        if (i12 == 0) {
            String str4 = kyVar2.f23900l;
            if (str4 != null) {
                yyVar.e0(str4, kyVar2);
                zb.D().L(yyVar.currentAccount, kyVar2.f23900l, "file");
            } else if (kyVar2.f23893c != null) {
                w7.G(yyVar.currentAccount);
                String file = w7.I(kyVar2.f23896g).toString();
                yyVar.e0(file, kyVar2);
                yyVar.getFileLoader().i0(false, 16777216, file, true);
                yyVar.h0(kyVar2.f23901m);
            } else {
                w7.G(yyVar.currentAccount);
                String file2 = w7.I(kyVar2.f23896g).toString();
                if (kyVar2.d != null && (photoSize3 = kyVar2.f23896g) != null && photoSize3.location.dc_id != 0) {
                    File file3 = new File(file2);
                    if (!file3.exists()) {
                        w7.G(yyVar.currentAccount);
                        file2 = w7.K(kyVar2.f23896g, null, true, true).toString();
                        file3 = new File(file2);
                    }
                    if (!file3.exists()) {
                        yyVar.e0(w7.r(null, kyVar2.f23896g), kyVar2);
                        yyVar.getFileLoader().W(ac.f(kyVar2.f23896g, kyVar2.h), kyVar2.K, "jpg", 3, 0);
                        return;
                    }
                }
                yyVar.e0(file2, kyVar2);
                yyVar.getFileLoader().i0(true, 16777216, file2, true);
                yyVar.h0(kyVar2.f23901m);
            }
        } else if (i12 == 1) {
            b20 b20Var2 = kyVar2.f23903o;
            if (b20Var2 != null && b20Var2.c() && kyVar2.f23904p) {
                zi ziVar2 = kyVar2.f23901m;
                String str5 = ziVar2.f26868k.attachPath;
                TLRPC.Document F0 = ziVar2.F0();
                if (str5 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(w7.z(4));
                    sb2.append("/");
                    sb2.append(F0.f27007id);
                    sb2.append(".");
                    if (kyVar2.f23903o.N) {
                        str3 = "webm";
                    } else {
                        str3 = "mp4";
                    }
                    sb2.append(str3);
                    str5 = sb2.toString();
                }
                yyVar.e0(str5, kyVar2);
                kyVar2.f23903o.getClass();
                MediaController.B().h0(kyVar2.f23901m, false, true, false);
                yyVar.h0(kyVar2.f23901m);
                return;
            }
            b20 b20Var3 = kyVar2.f23903o;
            if (b20Var3 != null) {
                TLRPC.InputFile inputFile2 = b20Var3.f21729w;
                if (inputFile2 != null) {
                    i11 = 4;
                    TLObject tLObject2 = kyVar2.f23893c;
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
                    b20Var3.f21729w = null;
                } else {
                    i11 = 4;
                    if (b20Var3.f21730x != null) {
                        TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) kyVar2.d;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                        decryptedMessageMedia.size = b20Var3.f21724q;
                        decryptedMessageMedia.key = b20Var3.f21731y;
                        decryptedMessageMedia.iv = b20Var3.f21732z;
                        vv secretChatHelper = yyVar.getSecretChatHelper();
                        zi ziVar3 = kyVar2.f23901m;
                        secretChatHelper.j(tL_decryptedMessage, ziVar3.f26868k, kyVar2.f23902n, kyVar2.f23903o.f21730x, kyVar2.f23895f, ziVar3);
                        kyVar2.f23903o.f21730x = null;
                        return;
                    }
                }
            } else {
                i11 = 4;
            }
            TLObject tLObject3 = kyVar2.f23893c;
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
                if ((inputMedia4 instanceof TLRPC.TL_inputMediaPoll) && (d = th.d.d((TLRPC.TL_inputMediaPoll) inputMedia4)) != null) {
                    inputMedia4 = d;
                }
                TLRPC.InputFile inputFile3 = inputMedia4.file;
                if (inputFile3 == null && !(inputMedia4 instanceof TLRPC.TL_inputMediaDocument) && kyVar2.f23904p) {
                    zi ziVar4 = kyVar2.f23901m;
                    String str6 = ziVar4.f26868k.attachPath;
                    TLRPC.Document F02 = ziVar4.F0();
                    TLRPC.TL_document tL_document = kyVar2.f23901m.C1;
                    if (tL_document != null) {
                        F02 = tL_document;
                    }
                    if (str6 == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w7.z(i11));
                        sb3.append("/");
                        str6 = a1.g.r(sb3, F02.f27007id, ".mp4");
                    }
                    String str7 = str6;
                    yyVar.e0(str7, kyVar2);
                    b20 b20Var4 = kyVar2.f23901m.f26886p0;
                    if (b20Var4 == null || !b20Var4.P) {
                        if (b20Var4 != null && b20Var4.c()) {
                            yyVar.getFileLoader().h0(str7, false, false, F02.size, 33554432, false);
                        } else {
                            yyVar.getFileLoader().i0(false, 33554432, str7, false);
                        }
                    }
                    yyVar.h0(kyVar2.f23901m);
                    return;
                }
                TLRPC.InputPhoto inputPhoto = inputMedia4.video_cover;
                if (inputPhoto == null && kyVar2.f23898j == null && kyVar2.f23897i != null && kyVar2.f23905q) {
                    String str8 = w7.z(i11) + "/" + kyVar2.f23897i.location.volume_id + "_" + kyVar2.f23897i.location.local_id + ".jpg";
                    yyVar.e0(str8, kyVar2);
                    yyVar.getFileLoader().i0(false, 16777216, str8, true);
                    yyVar.h0(kyVar2.f23901m);
                    return;
                } else if (kyVar2.f23899k && (inputMedia4 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputFile3 != null && kyVar2.f23898j != null) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = inputPeer2;
                    inputMedia4.flags &= -65;
                    inputMedia4.video_cover = null;
                    tL_messages_uploadMedia.media = inputMedia4;
                    final boolean z14 = inputMedia4.spoiler;
                    final int i13 = inputMedia4.ttl_seconds;
                    yyVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject4, TLRPC.TL_error tL_error) {
                            g0.h3(new ci.ka(yy.this, tLObject4, kyVar2, z14, i13));
                        }
                    });
                    return;
                } else if (inputPhoto == null && kyVar2.f23898j != null && kyVar2.f23905q) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia2 = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia2.peer = inputPeer2;
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = kyVar2.f23898j;
                    tL_messages_uploadMedia2.media = tL_inputMediaUploadedPhoto;
                    yyVar.getConnectionsManager().sendRequest(tL_messages_uploadMedia2, new fx(yyVar, inputMedia4, kyVar2, 0));
                    return;
                } else {
                    zi ziVar5 = kyVar2.f23901m;
                    if (ziVar5 != null && (b20Var = ziVar5.f26886p0) != null && b20Var.N) {
                        str2 = "webp";
                    } else {
                        str2 = "jpg";
                    }
                    String str9 = w7.z(i11) + "/" + kyVar2.f23896g.location.volume_id + "_" + kyVar2.f23896g.location.local_id + "." + str2;
                    yyVar.e0(str9, kyVar2);
                    yyVar.getFileLoader().i0(false, 16777216, str9, true);
                    yyVar.h0(kyVar2.f23901m);
                    return;
                }
            }
            zi ziVar6 = kyVar2.f23901m;
            String str10 = ziVar6.f26868k.attachPath;
            TLRPC.Document F03 = ziVar6.F0();
            if (str10 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(w7.z(i11));
                sb4.append("/");
                str10 = a1.g.r(sb4, F03.f27007id, ".mp4");
            }
            if (kyVar2.d != null && F03.dc_id != 0) {
                File file4 = new File(str10);
                if (!file4.exists()) {
                    w7 fileLoader = yyVar.getFileLoader();
                    TLRPC.Message message = kyVar2.f23901m.f26868k;
                    fileLoader.getClass();
                    file4 = w7.N(message, false, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message2 = kyVar2.f23901m.f26868k;
                        String absolutePath = file4.getAbsolutePath();
                        message2.attachPath = absolutePath;
                        kyVar2.f23901m.f26913w0 = true;
                        str10 = absolutePath;
                    }
                }
                if (file4 == null || (!file4.exists() && kyVar2.f23901m.F0() != null)) {
                    w7 fileLoader2 = yyVar.getFileLoader();
                    TLRPC.Document F04 = kyVar2.f23901m.F0();
                    fileLoader2.getClass();
                    file4 = w7.K(F04, null, false, true);
                    if (file4 != null && file4.exists()) {
                        TLRPC.Message message3 = kyVar2.f23901m.f26868k;
                        String absolutePath2 = file4.getAbsolutePath();
                        message3.attachPath = absolutePath2;
                        kyVar2.f23901m.f26913w0 = true;
                        str10 = absolutePath2;
                    }
                }
                if (file4 == null || !file4.exists()) {
                    yyVar.e0(w7.r(null, F03), kyVar2);
                    yyVar.getFileLoader().X(F03, kyVar2.K, 3, 0);
                    return;
                }
            }
            String str11 = str10;
            yyVar.e0(str11, kyVar2);
            b20 b20Var5 = kyVar2.f23901m.f26886p0;
            if (b20Var5 == null || !b20Var5.P) {
                if (b20Var5 != null && b20Var5.c()) {
                    yyVar.getFileLoader().h0(str11, true, false, F03.size, 33554432, false);
                } else {
                    yyVar.getFileLoader().i0(true, 33554432, str11, false);
                }
            }
            yyVar.h0(kyVar2.f23901m);
        } else if (i12 == 2) {
            String str12 = kyVar2.f23900l;
            if (str12 != null) {
                yyVar.e0(str12, kyVar2);
                zb.D().L(yyVar.currentAccount, kyVar2.f23900l, "gif");
                return;
            }
            TLObject tLObject4 = kyVar2.f23893c;
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
                    String str13 = kyVar2.f23901m.f26868k.attachPath;
                    yyVar.e0(str13, kyVar2);
                    w7 fileLoader3 = yyVar.getFileLoader();
                    if (kyVar2.f23893c != null) {
                        z13 = false;
                    }
                    fileLoader3.i0(z13, 67108864, str13, false);
                    yyVar.h0(kyVar2.f23901m);
                    return;
                } else if (inputMedia3.thumb == null && (photoSize2 = kyVar2.f23896g) != null && !(photoSize2 instanceof TLRPC.TL_photoStrippedSize)) {
                    String str14 = w7.z(4) + "/" + kyVar2.f23896g.location.volume_id + "_" + kyVar2.f23896g.location.local_id + ".jpg";
                    yyVar.e0(str14, kyVar2);
                    yyVar.getFileLoader().i0(false, 16777216, str14, true);
                    yyVar.h0(kyVar2.f23901m);
                    return;
                } else {
                    return;
                }
            }
            zi ziVar7 = kyVar2.f23901m;
            String str15 = ziVar7.f26868k.attachPath;
            TLRPC.Document F05 = ziVar7.F0();
            if (kyVar2.d != null && F05.dc_id != 0) {
                File file5 = new File(str15);
                if (!file5.exists()) {
                    w7 fileLoader4 = yyVar.getFileLoader();
                    TLRPC.Message message4 = kyVar2.f23901m.f26868k;
                    fileLoader4.getClass();
                    file5 = w7.N(message4, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message5 = kyVar2.f23901m.f26868k;
                        String absolutePath3 = file5.getAbsolutePath();
                        message5.attachPath = absolutePath3;
                        kyVar2.f23901m.f26913w0 = true;
                        str15 = absolutePath3;
                    }
                }
                if (file5 == null || (!file5.exists() && kyVar2.f23901m.F0() != null)) {
                    w7 fileLoader5 = yyVar.getFileLoader();
                    TLRPC.Document F06 = kyVar2.f23901m.F0();
                    fileLoader5.getClass();
                    file5 = w7.K(F06, null, false, true);
                    if (file5 != null && file5.exists()) {
                        TLRPC.Message message6 = kyVar2.f23901m.f26868k;
                        String absolutePath4 = file5.getAbsolutePath();
                        message6.attachPath = absolutePath4;
                        kyVar2.f23901m.f26913w0 = true;
                        str15 = absolutePath4;
                    }
                }
                if (file5 == null || !file5.exists()) {
                    yyVar.e0(w7.r(null, F05), kyVar2);
                    yyVar.getFileLoader().X(F05, kyVar2.K, 3, 0);
                    return;
                }
            }
            yyVar.e0(str15, kyVar2);
            yyVar.getFileLoader().i0(true, 67108864, str15, false);
            yyVar.h0(kyVar2.f23901m);
        } else if (i12 == 3) {
            String str16 = kyVar2.f23901m.f26868k.attachPath;
            yyVar.e0(str16, kyVar2);
            w7 fileLoader6 = yyVar.getFileLoader();
            if (kyVar2.f23893c == null) {
                z12 = true;
            }
            fileLoader6.i0(z12, 50331648, str16, true);
            yyVar.h0(kyVar2.f23901m);
        } else if (i12 == 4) {
            if (i3 < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!kyVar2.f23904p && !kyVar2.f23905q) {
                if (!kyVar2.f23911x.isEmpty()) {
                    TLRPC.Message message7 = ((zi) k2.p1.h(1, kyVar2.f23911x)).f26868k;
                    if (kyVar2.G != 0) {
                        z12 = true;
                    }
                    yyVar.f0(message7, z12);
                }
            } else {
                if (i3 < 0) {
                    i10 = kyVar2.f23911x.size() - 1;
                } else {
                    i10 = i3;
                }
                zi ziVar8 = (zi) kyVar2.f23911x.get(i10);
                TLRPC.Document F07 = ziVar8.F0();
                if (F07 == null && (zi.n1(ziVar8) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) zi.n1(ziVar8);
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
                    F07 = messageMedia == null ? null : messageMedia.document;
                }
                if (F07 == null && (zi.n1(ziVar8) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.MessageMedia f10 = th.d.f((TLRPC.TL_messageMediaPoll) zi.n1(ziVar8), ((Integer) kyVar2.C.get(i10)).intValue());
                    if (f10 == null) {
                        F07 = null;
                    } else {
                        F07 = f10.document;
                    }
                }
                if (F07 != null) {
                    b20 b20Var6 = kyVar2.f23903o;
                    if (b20Var6 != null && b20Var6.c() && kyVar2.f23904p) {
                        String str17 = ziVar8.f26868k.attachPath;
                        if (str17 == null) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(w7.z(4));
                            sb5.append("/");
                            str17 = a1.g.r(sb5, F07.f27007id, ".mp4");
                        }
                        yyVar.e0(str17, kyVar2);
                        kyVar2.E.put(ziVar8, str17);
                        kyVar2.E.put(str17 + "_i", ziVar8);
                        TLRPC.PhotoSize photoSize4 = kyVar2.f23896g;
                        if (photoSize4 != null && photoSize4.location != null) {
                            kyVar2.E.put(t4.c.q(str17, "_t"), kyVar2.f23896g);
                        }
                        TLRPC.PhotoSize photoSize5 = kyVar2.f23897i;
                        if (photoSize5 != null && photoSize5.location != null) {
                            kyVar2.E.put(t4.c.q(str17, "_ct"), kyVar2.f23897i);
                        }
                        kyVar2.f23903o.getClass();
                        MediaController.B().h0(ziVar8, false, true, false);
                        kyVar2.f23901m = ziVar8;
                        yyVar.h0(ziVar8);
                    } else {
                        String str18 = ziVar8.f26868k.attachPath;
                        if (str18 != null) {
                            str = "_ct";
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(w7.z(4));
                            sb6.append("/");
                            str = "_ct";
                            str18 = a1.g.r(sb6, F07.f27007id, ".mp4");
                        }
                        TLObject tLObject5 = kyVar2.f23893c;
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
                                        inputMedia = th.d.e((TLRPC.TL_inputMediaPoll) inputMedia6, ((Integer) kyVar2.C.get(i10)).intValue());
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
                                        inputMedia = th.d.e((TLRPC.TL_inputMediaPoll) inputMedia7, ((Integer) kyVar2.C.get(i10)).intValue());
                                    }
                                    inputMedia = null;
                                }
                            } else {
                                inputMedia = null;
                                inputPeer = null;
                            }
                            if (inputMedia != null && inputMedia.file == null && !(inputMedia instanceof TLRPC.TL_inputMediaDocument) && kyVar2.f23904p) {
                                yyVar.e0(str18, kyVar2);
                                kyVar2.E.put(ziVar8, str18);
                                kyVar2.E.put(str18, inputMedia);
                                kyVar2.E.put(str18 + "_i", ziVar8);
                                TLRPC.PhotoSize photoSize6 = kyVar2.f23896g;
                                if (photoSize6 != null && photoSize6.location != null) {
                                    kyVar2.E.put(t4.c.q(str18, "_t"), kyVar2.f23896g);
                                }
                                TLRPC.PhotoSize photoSize7 = kyVar2.f23897i;
                                if (photoSize7 != null && photoSize7.location != null) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(w7.z(4));
                                    sb7.append("/");
                                    sb7.append(kyVar2.f23897i.location.volume_id);
                                    sb7.append("_");
                                    String o10 = a1.g.o(kyVar2.f23897i.location.local_id, ".jpg", sb7);
                                    kyVar2.E.put(t4.c.q(str18, str), kyVar2.f23897i);
                                    kyVar2.E.put(o10 + "_doc", str18);
                                }
                                b20 b20Var7 = ziVar8.f26886p0;
                                if (b20Var7 != null && b20Var7.c()) {
                                    yyVar.getFileLoader().h0(str18, false, false, F07.size, 33554432, false);
                                } else {
                                    yyVar.getFileLoader().i0(false, 33554432, str18, false);
                                }
                                yyVar.h0(ziVar8);
                            } else {
                                String str19 = str;
                                String str20 = str18;
                                TLRPC.PhotoSize photoSize8 = kyVar2.f23897i;
                                if (photoSize8 != null) {
                                    photoSize = photoSize8;
                                    if (kyVar2.f23898j == null && inputMedia != null && inputMedia.video_cover == null) {
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append(w7.z(4));
                                        sb8.append("/");
                                        TLRPC.InputMedia inputMedia8 = inputMedia;
                                        sb8.append(kyVar2.f23897i.location.volume_id);
                                        sb8.append("_");
                                        sb8.append(kyVar2.f23897i.location.local_id);
                                        sb8.append(".jpg");
                                        String sb9 = sb8.toString();
                                        yyVar.e0(sb9, kyVar2);
                                        TLRPC.PhotoSize photoSize9 = kyVar2.f23897i;
                                        if (photoSize9 != null && photoSize9.location != null) {
                                            StringBuilder sb10 = new StringBuilder();
                                            sb10.append(w7.z(4));
                                            sb10.append("/");
                                            sb10.append(kyVar2.f23897i.location.volume_id);
                                            sb10.append("_");
                                            String o11 = a1.g.o(kyVar2.f23897i.location.local_id, ".jpg", sb10);
                                            kyVar2.E.put(t4.c.q(str20, str19), kyVar2.f23897i);
                                            kyVar2.E.put(o11 + "_doc", str20);
                                        }
                                        kyVar2.E.put(sb9 + "_o", str20);
                                        kyVar2.E.put(str20 + "_i", ziVar8);
                                        kyVar2.E.put(ziVar8, sb9);
                                        kyVar2.E.put(sb9, inputMedia8);
                                        yyVar.getFileLoader().i0(false, 16777216, sb9, true);
                                        yyVar.h0(ziVar8);
                                    } else {
                                        inputMedia2 = inputMedia;
                                        ziVar = ziVar8;
                                    }
                                } else {
                                    inputMedia2 = inputMedia;
                                    ziVar = ziVar8;
                                    photoSize = photoSize8;
                                }
                                if (photoSize != null && kyVar2.f23898j != null && inputMedia2 != null && inputMedia2.video_cover == null && (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) && inputMedia2.file != null && (kyVar2.f23893c instanceof TLRPC.TL_messages_sendMultiMedia) && (arrayList = kyVar2.D) != null && i10 >= 0 && i10 < arrayList.size() && Boolean.TRUE.equals(kyVar2.D.get(i10))) {
                                    TLRPC.InputFile inputFile4 = kyVar2.f23898j;
                                    inputMedia2.flags &= -65;
                                    inputMedia2.video_cover = null;
                                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia3 = new TLRPC.TL_messages_uploadMedia();
                                    tL_messages_uploadMedia3.peer = inputPeer;
                                    tL_messages_uploadMedia3.media = inputMedia2;
                                    ConnectionsManager connectionsManager = yyVar.getConnectionsManager();
                                    gx gxVar = new gx(i10, 0, this, inputMedia2, kyVar2, str20, inputFile4);
                                    kyVar2 = kyVar2;
                                    connectionsManager.sendRequest(tL_messages_uploadMedia3, gxVar);
                                    r22 = 0;
                                    yyVar = this;
                                    kyVar2.f23903o = r22;
                                    kyVar2.f23896g = r22;
                                    kyVar2.f23897i = r22;
                                    inputFile = r22;
                                } else {
                                    TLRPC.InputMedia inputMedia9 = inputMedia2;
                                    if (kyVar2.f23897i != null && kyVar2.f23898j != null && inputMedia9 != null && inputMedia9.video_cover == null) {
                                        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia4 = new TLRPC.TL_messages_uploadMedia();
                                        tL_messages_uploadMedia4.peer = inputPeer;
                                        TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto2 = new TLRPC.TL_inputMediaUploadedPhoto();
                                        tL_inputMediaUploadedPhoto2.file = kyVar2.f23898j;
                                        tL_messages_uploadMedia4.media = tL_inputMediaUploadedPhoto2;
                                        yyVar = this;
                                        getConnectionsManager().sendRequest(tL_messages_uploadMedia4, new tn(yyVar, inputMedia9, kyVar2, str20, ziVar, 4));
                                    } else {
                                        yyVar = this;
                                        if (kyVar2.f23896g != null) {
                                            String str21 = w7.z(4) + "/" + kyVar2.f23896g.location.volume_id + "_" + kyVar2.f23896g.location.local_id + ".jpg";
                                            yyVar.e0(str21, kyVar2);
                                            kyVar2.E.put(str21 + "_o", str20);
                                            kyVar2.E.put(ziVar, str21);
                                            kyVar2.E.put(str21, inputMedia9);
                                            yyVar.getFileLoader().i0(false, 16777216, str21, true);
                                            yyVar.h0(ziVar);
                                        }
                                    }
                                }
                            }
                        } else {
                            String str22 = str18;
                            yyVar.e0(str22, kyVar2);
                            kyVar2.E.put(ziVar8, str22);
                            kyVar2.E.put(str22, ((TLRPC.TL_messages_sendEncryptedMultiMedia) kyVar2.d).files.get(i10));
                            kyVar2.E.put(str22 + "_i", ziVar8);
                            TLRPC.PhotoSize photoSize10 = kyVar2.f23896g;
                            if (photoSize10 != null && photoSize10.location != null) {
                                kyVar2.E.put(t4.c.q(str22, "_t"), kyVar2.f23896g);
                            }
                            b20 b20Var8 = ziVar8.f26886p0;
                            if (b20Var8 != null && b20Var8.c()) {
                                yyVar.getFileLoader().h0(str22, true, false, F07.size, 33554432, false);
                            } else {
                                yyVar.getFileLoader().i0(true, 33554432, str22, false);
                            }
                            yyVar.h0(ziVar8);
                        }
                    }
                    r22 = 0;
                    kyVar2.f23903o = r22;
                    kyVar2.f23896g = r22;
                    kyVar2.f23897i = r22;
                    inputFile = r22;
                } else {
                    String str23 = kyVar2.f23900l;
                    if (str23 != null) {
                        yyVar.e0(str23, kyVar2);
                        kyVar2.E.put(ziVar8, kyVar2.f23900l);
                        kyVar2.E.put(kyVar2.f23900l, ziVar8);
                        zb.D().L(yyVar.currentAccount, kyVar2.f23900l, "file");
                        inputFile = null;
                        kyVar2.f23900l = null;
                    } else {
                        TLObject tLObject6 = kyVar2.f23893c;
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
                                    tLObject = th.d.e((TLRPC.TL_inputMediaPoll) inputMedia11, ((Integer) kyVar2.C.get(i10)).intValue());
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
                                    tLObject = th.d.e((TLRPC.TL_inputMediaPoll) inputMedia13, ((Integer) kyVar2.C.get(i10)).intValue());
                                }
                            }
                            tLObject = ((TLRPC.TL_messages_sendEncryptedMultiMedia) kyVar2.d).files.get(i10);
                        }
                        w7.G(yyVar.currentAccount);
                        String file6 = w7.I(kyVar2.f23896g).toString();
                        yyVar.e0(file6, kyVar2);
                        kyVar2.E.put(file6, tLObject);
                        kyVar2.E.put(ziVar8, file6);
                        w7 fileLoader7 = yyVar.getFileLoader();
                        if (kyVar2.d != null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        fileLoader7.i0(z11, 16777216, file6, true);
                        yyVar.h0(ziVar8);
                        inputFile = null;
                        kyVar2.f23896g = null;
                    }
                }
                kyVar2.f23898j = inputFile;
                kyVar2.f23904p = false;
                kyVar2.f23905q = false;
            }
            yyVar.t0(kyVar2, z10);
        } else if (i12 == 5) {
            String str24 = "stickerset_" + kyVar2.f23901m.f1();
            TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
            tL_messages_getStickerSet.stickerset = (TLRPC.InputStickerSet) kyVar2.K;
            yyVar.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new uh(yyVar, kyVar2, str24, 10));
            yyVar.e0(str24, kyVar2);
        }
    }

    public final void N(TLObject tLObject, zi ziVar, String str, ky kyVar, Object obj, HashMap hashMap, boolean z10) {
        O(tLObject, ziVar, str, null, false, kyVar, obj, hashMap, z10);
    }

    public final void O(TLObject tLObject, final zi ziVar, final String str, final ky kyVar, final boolean z10, final ky kyVar2, final Object obj, final HashMap hashMap, final boolean z11) {
        ky y9;
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
                getConnectionsManager().sendRequest(tL_messages_uploadMedia, new hx(this, tL_messages_addPollAnswer, tLObject, ziVar, str, kyVar, z10, kyVar2, obj, hashMap, z11));
                return;
            }
        }
        int i3 = 0;
        boolean z12 = false;
        if (!(tLObject2 instanceof TLRPC.TL_messages_editMessage) && z10 && (y9 = y(ziVar.f1(), zi.B0(ziVar.f26868k))) != null) {
            if (kyVar != null) {
                z12 = kyVar.H;
            }
            ?? obj2 = new Object();
            obj2.f24141a = tLObject2;
            obj2.f24142b = ziVar;
            obj2.d = str;
            obj2.f24146g = kyVar2;
            obj2.h = obj;
            obj2.f24147i = z12;
            if (y9.f23892b == null) {
                y9.f23892b = new ArrayList();
            }
            y9.f23892b.add(obj2);
            if (kyVar != null && (arrayList = kyVar.f23892b) != null) {
                y9.f23892b.addAll(arrayList);
                return;
            }
            return;
        }
        TLRPC.Message message = ziVar.f26868k;
        f0(message, z11);
        ci.e9 y10 = ci.e9.y(this.currentAccount, false);
        gw gwVar = new gw(this, tLObject2, ziVar, str, kyVar, z10, kyVar2, obj, hashMap, z11, 1);
        if (ziVar.f26868k != null) {
            int f12 = ziVar.f1();
            if (ci.e9.o(tLObject) > 0 && y10.Q.remove(Integer.valueOf(f12))) {
                y10.R.put(Integer.valueOf(f12), gwVar);
                return;
            }
        }
        if (f2.b(this.currentAccount).a(tLObject, Collections.singletonList(ziVar), new gw(this, tLObject, ziVar, str, kyVar, z10, kyVar2, obj, hashMap, z11, 2))) {
            if (cg.v.g(this.currentAccount).a(tLObject, Collections.singletonList(ziVar), new u10() {
                @Override
                public final void a(Object obj3) {
                    boolean z13 = z11;
                    yy.this.O((TLObject) obj3, ziVar, str, kyVar, z10, kyVar2, obj, hashMap, z13);
                }
            })) {
                ConnectionsManager connectionsManager = getConnectionsManager();
                hx hxVar = new hx(this, tLObject, ziVar, str, kyVar, z10, kyVar2, obj, hashMap, z11, message);
                o oVar = new o(6, this, message);
                if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
                    i3 = 128;
                }
                message.reqId = connectionsManager.sendRequest(tLObject, hxVar, oVar, i3 | 68);
                if (kyVar != null) {
                    kyVar.d();
                }
            }
        }
    }

    public final void P(final TLObject tLObject, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final ky kyVar, final boolean z10) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            f0(((zi) arrayList.get(i3)).f26868k, z10);
        }
        if (!ci.e9.y(this.currentAccount, false).c(tLObject, arrayList, new Runnable(this) {
            public final yy f26983b;

            {
                this.f26983b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        this.f26983b.P(tLObject, arrayList, arrayList2, arrayList3, kyVar, z10);
                        return;
                    default:
                        this.f26983b.P(tLObject, arrayList, arrayList2, arrayList3, kyVar, z10);
                        return;
                }
            }
        }) || !f2.b(this.currentAccount).a(tLObject, arrayList, new Runnable(this) {
            public final yy f26983b;

            {
                this.f26983b = this;
            }

            @Override
            public final void run() {
                switch (r8) {
                    case 0:
                        this.f26983b.P(tLObject, arrayList, arrayList2, arrayList3, kyVar, z10);
                        return;
                    default:
                        this.f26983b.P(tLObject, arrayList, arrayList2, arrayList3, kyVar, z10);
                        return;
                }
            }
        }) || !cg.v.g(this.currentAccount).a(tLObject, arrayList, new u10() {
            @Override
            public final void a(Object obj) {
                boolean z11 = z10;
                yy.this.P((TLObject) obj, arrayList, arrayList2, arrayList3, kyVar, z11);
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
                yy yyVar = yy.this;
                TLObject tLObject3 = tLObject;
                ArrayList arrayList5 = arrayList;
                ArrayList arrayList6 = arrayList2;
                boolean z13 = z10;
                if (tL_error != null && r8.r(tL_error.text)) {
                    int c2 = r8.c(tL_error.text);
                    ArrayList arrayList7 = arrayList3;
                    arrayList4 = arrayList6;
                    z11 = z13;
                    ky kyVar2 = kyVar;
                    if (arrayList7 != null) {
                        ArrayList arrayList8 = new ArrayList(arrayList7);
                        if (c2 >= 0) {
                            for (int i10 = 0; i10 < arrayList8.size(); i10++) {
                                if (c2 == i10) {
                                    obj = arrayList8.get(i10);
                                } else {
                                    obj = null;
                                }
                                arrayList8.set(i10, obj);
                            }
                        }
                        yyVar.getFileRefController().u(new Object[]{tLObject3, arrayList5, arrayList4, arrayList8, kyVar2, Boolean.valueOf(z11)}, arrayList8);
                        return;
                    } else if (kyVar2 != null) {
                        if (c2 >= 0 && (zArr = kyVar2.f23907s) != null && c2 < zArr.length) {
                            z12 = zArr[c2];
                        } else {
                            z12 = kyVar2.f23906r;
                        }
                        if (!z12) {
                            if (c2 < 0) {
                                kyVar2.f23906r = true;
                            } else {
                                if (kyVar2.f23907s == null) {
                                    kyVar2.f23907s = new boolean[kyVar2.f23911x.size()];
                                }
                                kyVar2.f23907s[c2] = true;
                            }
                            g0.h3(new z4(yyVar, tLObject3, c2, kyVar2, arrayList5, z11));
                            return;
                        }
                    }
                } else {
                    arrayList4 = arrayList6;
                    z11 = z13;
                }
                g0.h3(new nx(yyVar, tL_error, tLObject2, z11, arrayList5, arrayList4, tLObject3));
            }
        }, (QuickAckDelegate) null, 68);
    }

    public final void Q(long j10, Uri uri, ArrayList arrayList, w70 w70Var) {
        if (this.E.f(j10) != null) {
            w70Var.run(0L);
            return;
        }
        if (m5.z(j10)) {
            long j11 = -j10;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j11));
            if (M0 != null && !M0.megagroup) {
                getMessagesController().T(null, j11, null, new eh(this, uri, arrayList, w70Var), null);
                return;
            }
        }
        new Thread(new bm(this, arrayList, j10, uri, w70Var, 3)).start();
    }

    public final void a(TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer j12 = getMessagesController().j1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_forwardMessages.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = j12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_forwardMessages.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = j12;
        }
    }

    public final void b(TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer j12 = getMessagesController().j1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendInlineBotResult.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = j12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = j12;
            tL_messages_sendInlineBotResult.flags |= 1;
        }
    }

    public final void c(TLRPC.TL_messages_sendMedia tL_messages_sendMedia, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer j12 = getMessagesController().j1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = j12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = j12;
            tL_messages_sendMedia.flags |= 1;
        }
    }

    public final void c0(zi ziVar, long j10, long j11, long j12, ej ejVar) {
        TLRPC.WebPage webPage;
        if (ziVar != null) {
            TLRPC.Message message = ziVar.f26868k;
            TLRPC.MessageMedia messageMedia = message.media;
            ArrayList arrayList = null;
            r4 = null;
            r4 = null;
            HashMap hashMap = null;
            arrayList = null;
            if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty) && !(messageMedia instanceof TLRPC.TL_messageMediaWebPage) && !(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                if (m5.C(j10)) {
                    TLRPC.Message message2 = ziVar.f26868k;
                    if (message2.peer_id != null) {
                        TLRPC.MessageMedia messageMedia2 = message2.media;
                        if ((messageMedia2.photo instanceof TLRPC.TL_photo) || (messageMedia2.document instanceof TLRPC.TL_document)) {
                            hashMap = new HashMap();
                            hashMap.put("parentObject", "sent_" + ziVar.f26868k.peer_id.channel_id + "_" + ziVar.f1() + "_" + zi.B0(ziVar.f26868k) + "_" + ziVar.D + "_" + ziVar.T1());
                        }
                    }
                }
                HashMap hashMap2 = hashMap;
                TLRPC.Message message3 = ziVar.f26868k;
                TLRPC.MessageMedia messageMedia3 = message3.media;
                TLRPC.Photo photo = messageMedia3.photo;
                if (photo instanceof TLRPC.TL_photo) {
                    wy c2 = wy.c(null, message3.message, null, (TLRPC.TL_photo) photo, null, null, null, null, null, null, j10, null, ziVar.C, null, null, true, null, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, ziVar, null, false, false);
                    c2.Q = j11;
                    c2.R = j12;
                    c2.T = ejVar;
                    r0(c2);
                    return;
                }
                TLRPC.Document document = messageMedia3.document;
                if (document instanceof TLRPC.TL_document) {
                    wy f10 = wy.f((TLRPC.TL_document) document, null, message3.attachPath, j10, ziVar.C, null, message3.message, message3.entities, null, hashMap2, true, 0, 0, messageMedia3.ttl_seconds, ziVar, null, false);
                    f10.Q = j11;
                    f10.R = j12;
                    f10.T = ejVar;
                    r0(f10);
                } else if (!(messageMedia3 instanceof TLRPC.TL_messageMediaVenue) && !(messageMedia3 instanceof TLRPC.TL_messageMediaGeo)) {
                    if (messageMedia3.phone_number != null) {
                        TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                        TLRPC.MessageMedia messageMedia4 = ziVar.f26868k.media;
                        tL_userContact_old2.phone = messageMedia4.phone_number;
                        tL_userContact_old2.first_name = messageMedia4.first_name;
                        tL_userContact_old2.last_name = messageMedia4.last_name;
                        tL_userContact_old2.f27150id = messageMedia4.user_id;
                        wy g7 = wy.g(tL_userContact_old2, j10, ziVar.C, null, null, null, true, 0, 0);
                        g7.R = j12;
                        g7.T = ejVar;
                        g7.Q = j11;
                        r0(g7);
                    } else if (!m5.C(j10)) {
                        q0(k5.k(ziVar), j10, true, false, true, 0, 0, null, -1, j11, j12, ejVar);
                    }
                } else {
                    wy d = wy.d(messageMedia3, j10, ziVar.C, null, null, null, true, 0);
                    d.Q = j11;
                    d.R = j12;
                    d.T = ejVar;
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
                    for (int i3 = 0; i3 < ziVar.f26868k.entities.size(); i3++) {
                        TLRPC.MessageEntity messageEntity = ziVar.f26868k.entities.get(i3);
                        if ((messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                            arrayList.add(messageEntity);
                        }
                    }
                }
                wy b10 = wy.b(ziVar.f26868k.message, j10, ziVar.C, null, webPage, true, arrayList, null, null, true, 0, 0, null, false);
                b10.Q = j11;
                b10.R = j12;
                b10.T = ejVar;
                r0(b10);
            } else if (m5.C(j10)) {
                q0(k5.k(ziVar), j10, true, false, true, 0, 0, null, -1, j11, j12, ejVar);
            }
        }
    }

    public final void d(TLRPC.TL_messages_sendMessage tL_messages_sendMessage, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer j12 = getMessagesController().j1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMessage.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = j12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMessage.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = j12;
            tL_messages_sendMessage.flags |= 1;
        }
    }

    public final void d0(int i3) {
        SparseArray sparseArray = this.f26679b;
        int size = sparseArray.size();
        sparseArray.remove(i3);
        if (size != 0 && sparseArray.size() == 0) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new hq(messagesStorage, 29));
        }
    }

    @Override
    public final void didReceivedNotification(int r43, int r44, java.lang.Object... r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia, long j10) {
        if (j10 != 0) {
            TLRPC.InputPeer j12 = getMessagesController().j1(j10);
            TLRPC.InputReplyTo inputReplyTo = tL_messages_sendMultiMedia.reply_to;
            if (inputReplyTo != null) {
                if (inputReplyTo instanceof TLRPC.TL_inputReplyToMessage) {
                    inputReplyTo.monoforum_peer_id = j12;
                    inputReplyTo.flags |= 32;
                    return;
                }
                return;
            }
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = j12;
            tL_messages_sendMultiMedia.flags |= 1;
        }
    }

    public final void e0(String str, ky kyVar) {
        HashMap hashMap = this.f26678a;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(kyVar);
    }

    public final void f(ArrayList arrayList) {
        HashMap hashMap;
        int i3;
        int i10;
        int i11;
        int i12;
        long j10;
        zi ziVar;
        int i13;
        String G;
        TLRPC.Message message;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        long j11 = 0;
        int i16 = 0;
        boolean z11 = false;
        while (true) {
            int size = arrayList.size();
            hashMap = this.f26678a;
            if (i16 >= size) {
                break;
            }
            zi ziVar2 = (zi) arrayList.get(i16);
            if (ziVar2.f26887p1) {
                i11 = 1;
            } else {
                i11 = i14;
            }
            long B0 = zi.B0(ziVar2.f26868k);
            arrayList4.add(Integer.valueOf(ziVar2.f1()));
            if (zi.c4(ziVar2.f26868k)) {
                i15 = zi.J1(ziVar2.f26868k);
            }
            TLRPC.Message i02 = i0(ziVar2.f1(), ziVar2.f26887p1);
            if (i02 != null) {
                getConnectionsManager().cancelRequest(i02.reqId, true);
            }
            ci.e9 y9 = ci.e9.y(this.currentAccount, z10);
            ci.z8 z8Var = y9.N;
            ArrayList arrayList5 = arrayList4;
            if (z8Var != null && z8Var.f6469b == zi.B0(ziVar2.f26868k)) {
                ci.z8 z8Var2 = y9.N;
                int f12 = ziVar2.f1();
                ci.y8 y8Var = z8Var2.f6481p;
                org.telegram.ui.Components.ub ubVar = z8Var2.d;
                i12 = i16;
                HashSet hashSet = z8Var2.f6476k;
                j10 = B0;
                if (!z8Var2.f6479n && !z8Var2.f6480o) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ziVar = (zi) it.next();
                            Iterator it2 = it;
                            if (ziVar.f1() == f12) {
                                hashSet.remove(ziVar);
                                break;
                            }
                            it = it2;
                        } else {
                            ziVar = null;
                            break;
                        }
                    }
                    if (hashSet.isEmpty()) {
                        z8Var2.f6479n = true;
                        z8Var2.f6470c.b();
                        y9.N = null;
                    } else {
                        z8Var2.f6473g--;
                        if (ziVar != null && (message = ziVar.f26868k) != null) {
                            z8Var2.h -= message.paid_message_stars;
                        }
                        ci.d9 d9Var = z8Var2.f6472f;
                        if (d9Var != null) {
                            d9Var.f38376b = 3000L;
                            g0.r(y8Var);
                            g0.i3(y8Var, 3000L);
                        }
                        org.telegram.ui.Components.h6 h6Var = ubVar.f38714b;
                        int i17 = z8Var2.f6473g;
                        if (i17 == 1) {
                            G = bd.M0(2131747711, null);
                            i13 = 0;
                        } else {
                            i13 = 0;
                            G = bd.G(i17, "PaidMessageSentTitle", new Object[0]);
                        }
                        h6Var.setText(G);
                        ubVar.f38715c.setText(g0.X2(bd.H(',', "PaidMessageSentSubtitle", Math.max(i13, (int) z8Var2.h))));
                        ubVar.f38713a.d();
                    }
                }
            } else {
                i12 = i16;
                j10 = B0;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                ArrayList arrayList6 = (ArrayList) entry.getValue();
                int i18 = 0;
                while (true) {
                    if (i18 < arrayList6.size()) {
                        ky kyVar = (ky) arrayList6.get(i18);
                        if (kyVar.f23894e == 4) {
                            zi ziVar3 = null;
                            int i19 = 0;
                            while (true) {
                                if (i19 < kyVar.f23911x.size()) {
                                    ziVar3 = (zi) kyVar.f23911x.get(i19);
                                    if (ziVar3.f1() == ziVar2.f1()) {
                                        j0(ziVar2.f1(), ziVar2.f26887p1);
                                        break;
                                    }
                                    i19++;
                                } else {
                                    i19 = -1;
                                    break;
                                }
                            }
                            if (i19 >= 0) {
                                kyVar.f23911x.remove(i19);
                                kyVar.f23913z.remove(i19);
                                kyVar.B.remove(i19);
                                if (!kyVar.f23912y.isEmpty()) {
                                    kyVar.f23912y.remove(i19);
                                }
                                TLObject tLObject = kyVar.f23893c;
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
                                            th.d.i((TLRPC.TL_inputMediaPoll) inputMedia2, ((Integer) kyVar.C.get(i19)).intValue());
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
                                            th.d.i((TLRPC.TL_inputMediaPoll) inputMedia4, ((Integer) kyVar.C.get(i19)).intValue());
                                        }
                                    }
                                    TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia = (TLRPC.TL_messages_sendEncryptedMultiMedia) kyVar.d;
                                    tL_messages_sendEncryptedMultiMedia.messages.remove(i19);
                                    tL_messages_sendEncryptedMultiMedia.files.remove(i19);
                                }
                                MediaController.B().i(ziVar2);
                                String str = (String) kyVar.E.get(ziVar3);
                                if (str != null) {
                                    arrayList2.add(str);
                                }
                                if (kyVar.f23911x.isEmpty()) {
                                    kyVar.d();
                                } else {
                                    if (kyVar.G == ziVar2.f1()) {
                                        zi ziVar4 = (zi) k2.p1.h(1, kyVar.f23911x);
                                        kyVar.G = ziVar4.f1();
                                        ziVar4.f26868k.params.put("final", "1");
                                        TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
                                        tL_messages_messages.messages.add(ziVar4.f26868k);
                                        getMessagesStorage().h1(-2, 0, i11, kyVar.f23891a, 0L, tL_messages_messages, false);
                                    }
                                    if (!arrayList3.contains(kyVar)) {
                                        arrayList3.add(kyVar);
                                    }
                                }
                            }
                        } else if (kyVar.f23901m.f1() == ziVar2.f1()) {
                            j0(ziVar2.f1(), ziVar2.f26887p1);
                            arrayList6.remove(i18);
                            kyVar.d();
                            MediaController.B().i(kyVar.f23901m);
                            if (arrayList6.size() == 0) {
                                arrayList2.add((String) entry.getKey());
                                if (kyVar.d != null) {
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
            j11 = j10;
            z10 = false;
        }
        ArrayList arrayList7 = arrayList4;
        for (int i20 = 0; i20 < arrayList2.size(); i20++) {
            String str2 = (String) arrayList2.get(i20);
            if (str2.startsWith("http")) {
                zb.D().g(str2);
            } else {
                getFileLoader().b(str2, z11);
            }
            hashMap.remove(str2);
        }
        int size2 = arrayList3.size();
        for (int i21 = 0; i21 < size2; i21++) {
            t0((ky) arrayList3.get(i21), false);
        }
        if (arrayList.size() == 1 && ((zi) arrayList.get(0)).Z2() && ((zi) arrayList.get(0)).B1 != null) {
            l0((zi) arrayList.get(0));
        } else if (arrayList.size() != 1 || !((zi) arrayList.get(0)).Z2() || !((zi) arrayList.get(0)).U3()) {
            if (!arrayList.isEmpty() && zi.e5(((zi) arrayList.get(0)).f26868k)) {
                i10 = 9;
            } else if (!arrayList.isEmpty() && zi.c4(((zi) arrayList.get(0)).f26868k)) {
                i10 = 5;
            } else {
                if (i14 != 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                getMessagesController().Z(arrayList7, null, null, j11, i15, false, i3);
            }
            i3 = i10;
            getMessagesController().Z(arrayList7, null, null, j11, i15, false, i3);
        }
    }

    public final void f0(TLRPC.Message message, boolean z10) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            g0.h3(new lw(this, message, z10, 2));
        } else {
            g0(message, z10);
        }
    }

    public final void g(zi ziVar) {
        ArrayList k10 = k5.k(ziVar);
        if (ziVar != null && ziVar.D == 29) {
            ky kyVar = null;
            for (Map.Entry entry : this.f26678a.entrySet()) {
                ArrayList arrayList = (ArrayList) entry.getValue();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ky kyVar2 = (ky) arrayList.get(i3);
                    if (kyVar2.f23894e == 4) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= kyVar2.f23911x.size()) {
                                break;
                            } else if (((zi) kyVar2.f23911x.get(i10)).f1() == ziVar.f1()) {
                                kyVar = kyVar2;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (kyVar != null) {
                        break;
                    }
                }
            }
            if (kyVar != null) {
                k10.clear();
                k10.addAll(kyVar.f23911x);
            }
        }
        f(k10);
    }

    public final void g0(TLRPC.Message message, boolean z10) {
        boolean z11;
        if (message != null) {
            int i3 = message.f27022id;
            if (i3 > 0) {
                this.d.put(i3, message);
                return;
            }
            SparseArray sparseArray = this.f26680c;
            if (sparseArray.indexOfKey(i3) >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            j0(message.f27022id, z10);
            sparseArray.put(message.f27022id, message);
            if (!z10 && !z11 && !zi.d3(message)) {
                long B0 = zi.B0(message);
                a0.h hVar = this.f26682f;
                hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
                getNotificationCenter().k(hs.f23270n1, new Object[0]);
            }
        }
    }

    public final void h0(zi ziVar) {
        boolean z10;
        if (ziVar != null && ziVar.f1() <= 0 && !ziVar.f26887p1) {
            TLRPC.Message message = ziVar.f26868k;
            int i3 = message.f27022id;
            SparseArray sparseArray = this.f26681e;
            if (sparseArray.indexOfKey(i3) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            sparseArray.put(message.f27022id, message);
            if (!z10 && !zi.d3(message)) {
                long B0 = zi.B0(message);
                a0.h hVar = this.h;
                hVar.k(Integer.valueOf(((Integer) hVar.g(0, B0)).intValue() + 1), B0);
                getNotificationCenter().k(hs.f23270n1, new Object[0]);
            }
        }
    }

    public final TLRPC.Message i0(int i3, boolean z10) {
        if (i3 > 0) {
            SparseArray sparseArray = this.d;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i3);
            if (message != null) {
                sparseArray.remove(i3);
            }
            return message;
        }
        SparseArray sparseArray2 = this.f26680c;
        TLRPC.Message message2 = (TLRPC.Message) sparseArray2.get(i3);
        if (message2 != null) {
            sparseArray2.remove(i3);
            if (!z10) {
                long B0 = zi.B0(message2);
                a0.h hVar = this.f26682f;
                Integer num = (Integer) hVar.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        hVar.l(B0);
                    } else {
                        hVar.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(hs.f23270n1, new Object[0]);
                }
            }
        }
        return message2;
    }

    public final void j0(int i3, boolean z10) {
        if (i3 <= 0 && !z10) {
            SparseArray sparseArray = this.f26681e;
            TLRPC.Message message = (TLRPC.Message) sparseArray.get(i3);
            if (message != null) {
                sparseArray.remove(i3);
                long B0 = zi.B0(message);
                a0.h hVar = this.h;
                Integer num = (Integer) hVar.f(B0);
                if (num != null) {
                    int intValue = num.intValue() - 1;
                    if (intValue <= 0) {
                        hVar.l(B0);
                    } else {
                        hVar.k(Integer.valueOf(intValue), B0);
                    }
                    getNotificationCenter().k(hs.f23270n1, new Object[0]);
                }
            }
        }
    }

    public final void k(zi ziVar, TLRPC.Updates updates, boolean z10) {
        int i3;
        if (ziVar == null) {
            return;
        }
        long B0 = zi.B0(ziVar.f26868k);
        long j10 = ziVar.f26868k.random_id;
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
                        if (tL_updateMessageID.random_id == j10) {
                            i3 = tL_updateMessageID.f27259id;
                            break;
                        }
                    }
                } else {
                    i3 = 0;
                    break;
                }
            }
            for (int i11 = 0; i11 < updates.updates.size(); i11++) {
                TLRPC.Update update3 = updates.updates.get(i11);
                if (update3 instanceof TL_update.TL_updateNewMessage) {
                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update3;
                    TLRPC.Message message2 = tL_updateNewMessage.message;
                    if ((message2.action instanceof TLRPC.TL_messageActionGramTransfer) && message2.out && m5.o(message2.peer_id) == B0 && (i3 == 0 || message2.f27022id == i3)) {
                        updates.updates.remove(i11);
                        Utilities.d.c(new yx(this, tL_updateNewMessage, 0));
                        message = message2;
                        break;
                    }
                }
            }
            if (message != null) {
                for (int size2 = updates.updates.size() - 1; size2 >= 0; size2--) {
                    TLRPC.Update update4 = updates.updates.get(size2);
                    if ((update4 instanceof TL_update.TL_updateMessageID) && ((TL_update.TL_updateMessageID) update4).random_id == j10) {
                        updates.updates.remove(size2);
                    }
                }
            }
        } else {
            i3 = 0;
        }
        TLRPC.Message message3 = message;
        int i12 = ziVar.f26868k.local_id;
        if (i12 >= 0) {
            i12 = ziVar.f1();
        }
        int i13 = i12;
        if (message3 == null) {
            if (ziVar.f1() > 0) {
                d0(i13);
                i0(i13, false);
                return;
            }
            if (!z10 && i3 == 0) {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.f27022id = i13;
                tL_messageService.dialog_id = B0;
                getMessagesStorage().N0(0, tL_messageService);
                ziVar.f26868k.send_state = 2;
                ziVar.K1 = true;
                getNotificationCenter().k(hs.M, Integer.valueOf(i13));
            } else {
                qr messagesStorage = getMessagesStorage();
                messagesStorage.f24934a.c(new xp(messagesStorage, j10, B0, Integer.valueOf(i13), i13, ziVar.f26868k.date));
                ziVar.f26868k.send_state = 0;
                ziVar.K1 = true;
                getNotificationCenter().k(hs.J, Integer.valueOf(i13));
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
        if (num.intValue() >= message3.f27022id) {
            z11 = false;
        }
        message3.unread = z11;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(message3);
        getMessagesStorage().f24934a.c(new vl(this, j10, B0, i13, message3, arrayList2, ziVar));
    }

    public final boolean k0(long j10, zi ziVar, boolean z10) {
        long j11;
        int i3 = 0;
        if (ziVar.f1() >= 0) {
            if (ziVar.Z2()) {
                t(ziVar, null, null, null, null, null, null, null, true, ziVar.u2(), ziVar);
                return false;
            }
        } else {
            TLRPC.Message message = ziVar.f26868k;
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                if (z10) {
                    k(ziVar, null, false);
                }
            } else {
                boolean z11 = messageAction instanceof TLRPC.TL_messageEncryptedAction;
                int i10 = hs.f23298s;
                if (z11) {
                    TLRPC.EncryptedChat a12 = getMessagesController().a1(Integer.valueOf((int) (zi.B0(message) & 4294967295L)));
                    if (a12 == null) {
                        getMessagesStorage().N0(ziVar.f26887p1 ? 1 : 0, ziVar.f26868k);
                        ziVar.f26868k.send_state = 2;
                        getNotificationCenter().k(hs.M, Integer.valueOf(ziVar.f1()));
                        d0(ziVar.f1());
                        return false;
                    }
                    TLRPC.Message message2 = ziVar.f26868k;
                    if (message2.random_id == 0) {
                        message2.random_id = E();
                    }
                    TLRPC.DecryptedMessageAction decryptedMessageAction = ziVar.f26868k.action.encryptedAction;
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        getSecretChatHelper().z(a12, ziVar.f26868k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                        getSecretChatHelper().t(a12, null, ziVar.f26868k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                        getSecretChatHelper().r(a12, ziVar.f26868k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        getSecretChatHelper().w(a12, ziVar.f26868k);
                        return true;
                    } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                        getSecretChatHelper().u(a12, null, ziVar.f26868k);
                        return true;
                    } else {
                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                            vv secretChatHelper = getSecretChatHelper();
                            TLRPC.Message message3 = ziVar.f26868k;
                            secretChatHelper.getClass();
                            if (a12 instanceof TLRPC.TL_encryptedChat) {
                                TLRPC.DecryptedMessage tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                                if (message3 != null) {
                                    tL_decryptedMessageService.action = message3.action.encryptedAction;
                                } else {
                                    TLRPC.DecryptedMessageAction tL_decryptedMessageActionScreenshotMessages = new TLRPC.TL_decryptedMessageActionScreenshotMessages();
                                    tL_decryptedMessageService.action = tL_decryptedMessageActionScreenshotMessages;
                                    tL_decryptedMessageActionScreenshotMessages.random_ids = null;
                                    message3 = secretChatHelper.d(a12, tL_decryptedMessageActionScreenshotMessages);
                                    zi ziVar2 = new zi(secretChatHelper.currentAccount, message3, false, false);
                                    ziVar2.f26868k.send_state = 1;
                                    ziVar2.V1 = true;
                                    secretChatHelper.getMessagesController().l5(0, message3.dialog_id, k5.k(ziVar2));
                                    secretChatHelper.getNotificationCenter().k(i10, new Object[0]);
                                }
                                TLRPC.Message message4 = message3;
                                tL_decryptedMessageService.random_id = message4.random_id;
                                secretChatHelper.j(tL_decryptedMessageService, message4, a12, null, null, null);
                                return true;
                            }
                        } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionTyping)) {
                            if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) {
                                getSecretChatHelper().y(a12, 0, 0, ziVar.f26868k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                                getSecretChatHelper().s(a12, ziVar.f26868k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                                getSecretChatHelper().p(a12, ziVar.f26868k, 0L);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                                getSecretChatHelper().x(a12, ziVar.f26868k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                                getSecretChatHelper().q(a12, ziVar.f26868k);
                                return true;
                            } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) {
                                getSecretChatHelper().v(a12, ziVar.f26868k);
                            }
                        }
                        return true;
                    }
                }
                if (messageAction instanceof TLRPC.TL_messageActionScreenshotTaken) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(zi.B0(ziVar.f26868k)));
                    int O1 = ziVar.O1();
                    TLRPC.Message message5 = ziVar.f26868k;
                    if (a22 != null && O1 != 0 && a22.f27150id != getUserConfig().e()) {
                        TLRPC.TL_messages_sendScreenshotNotification tL_messages_sendScreenshotNotification = new TLRPC.TL_messages_sendScreenshotNotification();
                        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_messages_sendScreenshotNotification.peer = tL_inputPeerUser;
                        tL_inputPeerUser.access_hash = a22.access_hash;
                        tL_inputPeerUser.user_id = a22.f27150id;
                        if (message5 != null) {
                            TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                            tL_inputReplyToMessage.reply_to_msg_id = O1;
                            tL_messages_sendScreenshotNotification.reply_to = tL_inputReplyToMessage;
                            tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        } else {
                            message5 = new TLRPC.TL_messageService();
                            message5.random_id = E();
                            message5.dialog_id = a22.f27150id;
                            message5.unread = true;
                            message5.out = true;
                            int j12 = getUserConfig().j();
                            message5.f27022id = j12;
                            message5.local_id = j12;
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            message5.from_id = tL_peerUser;
                            tL_peerUser.user_id = getUserConfig().e();
                            message5.flags |= 264;
                            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                            message5.reply_to = tL_messageReplyHeader;
                            tL_messageReplyHeader.flags |= 16;
                            tL_messageReplyHeader.reply_to_msg_id = O1;
                            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                            message5.peer_id = tL_peerUser2;
                            tL_peerUser2.user_id = a22.f27150id;
                            message5.date = getConnectionsManager().getCurrentTime();
                            message5.action = new TLRPC.TL_messageActionScreenshotTaken();
                            getUserConfig().v(false);
                        }
                        tL_messages_sendScreenshotNotification.random_id = message5.random_id;
                        zi ziVar3 = new zi(this.currentAccount, message5, false, true);
                        ziVar3.f26868k.send_state = 1;
                        ziVar3.V1 = true;
                        getMessagesController().l5(0, message5.dialog_id, k5.k(ziVar3));
                        getNotificationCenter().k(i10, new Object[0]);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(message5);
                        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
                        N(tL_messages_sendScreenshotNotification, ziVar3, null, null, null, null, false);
                    }
                }
                if (z10) {
                    this.f26679b.put(ziVar.f1(), ziVar);
                }
                long B0 = zi.B0(ziVar.f26868k);
                TLRPC.Message message6 = ziVar.f26868k;
                String str = message6.attachPath;
                TLRPC.ReplyMarkup replyMarkup = message6.reply_markup;
                HashMap<String, String> hashMap = message6.params;
                boolean z12 = !message6.silent;
                if (ziVar.f26887p1) {
                    i3 = message6.date;
                }
                wy c2 = wy.c(null, null, null, null, null, null, null, null, null, null, B0, str, null, null, null, true, ziVar, null, replyMarkup, hashMap, z12, i3, 0, 0, null, null, false, false);
                TLRPC.Message message7 = ziVar.f26868k;
                if (message7 != null) {
                    TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message7.quick_reply_shortcut;
                    if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
                        c2.M = ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
                    }
                    c2.N = zi.J1(message7);
                    c2.Q = ziVar.f26868k.paid_message_stars;
                }
                TLRPC.Message message8 = ziVar.f26868k;
                if (message8 != null) {
                    j11 = message8.ephemeralReceiverBotId;
                } else {
                    j11 = 0;
                }
                c2.X = j11;
                c2.Q = j10;
                r0(c2);
                return true;
            }
        }
        return false;
    }

    public final void l0(zi ziVar) {
        ziVar.f26883o1 = true;
        TLRPC.Message message = ziVar.f26868k;
        message.media = ziVar.B1;
        message.message = ziVar.A1;
        ArrayList<TLRPC.MessageEntity> arrayList = ziVar.D1;
        message.entities = arrayList;
        message.attachPath = ziVar.E1;
        message.send_state = 0;
        if (arrayList != null) {
            message.flags |= 128;
        } else {
            message.flags &= -129;
        }
        ziVar.B1 = null;
        ziVar.A1 = null;
        ziVar.D1 = null;
        ziVar.E1 = null;
        ziVar.f26886p0 = null;
        ziVar.D = -1;
        ziVar.M5();
        ziVar.f26924z = null;
        if (ziVar.D != 0) {
            ziVar.k0();
        } else {
            ziVar.Q1 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(ziVar.f26868k);
        getMessagesStorage().j1(arrayList2, false, true, false, 0, false, ziVar.f26887p1 ? 1 : 0, 0L);
        getNotificationCenter().k(hs.m0, Long.valueOf(zi.B0(ziVar.f26868k)), k5.k(ziVar));
    }

    public final void n0(boolean z10, zi ziVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, org.telegram.ui.wm wmVar) {
        boolean z11;
        int i3;
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        if (ziVar != null && keyboardButtonProto != null && wmVar != null) {
            if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class)) {
                i3 = 3;
                z11 = false;
            } else if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                z11 = false;
                i3 = 1;
            } else if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                z11 = z10;
                i3 = 2;
            } else {
                z11 = z10;
                i3 = 0;
            }
            String str = zi.B0(ziVar.f26868k) + "_" + ziVar.f1() + "_" + Utilities.f(keyboardButtonProto.getData()) + "_" + i3;
            this.f26684r.put(str, Boolean.TRUE);
            HashMap hashMap = this.f26685s;
            List list = (List) hashMap.get(zi.B0(ziVar.f26868k) + "_" + ziVar.f1());
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                hashMap.put(zi.B0(ziVar.f26868k) + "_" + ziVar.f1(), arrayList);
                list = arrayList;
            }
            list.add(str);
            TLObject[] tLObjectArr = new TLObject[1];
            hx hxVar = new hx(this, str, list, z11, ziVar, keyboardButtonProto, wmVar, twoStepVerificationActivity, tLObjectArr, inputCheckPasswordSRP, z10);
            if (z11) {
                getMessagesStorage().M(str, hxVar);
                return;
            }
            TL_keyboard.TL_inlineButtonTypeUrlAuth tL_inlineButtonTypeUrlAuth = (TL_keyboard.TL_inlineButtonTypeUrlAuth) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class);
            if (tL_inlineButtonTypeUrlAuth != null) {
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.peer = getMessagesController().j1(zi.B0(ziVar.f26868k));
                tL_messages_requestUrlAuth.msg_id = ziVar.f1();
                tL_messages_requestUrlAuth.button_id = tL_inlineButtonTypeUrlAuth.button_id;
                tL_messages_requestUrlAuth.flags |= 2;
                tLObjectArr[0] = tL_messages_requestUrlAuth;
                getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, hxVar, 2);
            } else if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                if ((ziVar.f26868k.media.flags & 4) == 0) {
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                    tL_inputInvoiceMessage.msg_id = ziVar.f1();
                    tL_inputInvoiceMessage.peer = getMessagesController().m1(ziVar.f26868k.peer_id);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                    JSONObject u10 = ii.a3.u(null, false);
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
                tL_payments_getPaymentReceipt.msg_id = ziVar.f26868k.media.receipt_msg_id;
                tL_payments_getPaymentReceipt.peer = getMessagesController().m1(ziVar.f26868k.peer_id);
                tLObjectArr[0] = tL_payments_getPaymentReceipt;
                getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, hxVar, 2);
            } else if (zi.d3(ziVar.f26868k)) {
                TL_ephemeral.TL_getCallbackAnswer tL_getCallbackAnswer = new TL_ephemeral.TL_getCallbackAnswer();
                tL_getCallbackAnswer.peer = getMessagesController().j1(zi.B0(ziVar.f26868k));
                tL_getCallbackAnswer.f27219id = ziVar.P0();
                tL_getCallbackAnswer.data = keyboardButtonProto.getData();
                getConnectionsManager().sendRequest(tL_getCallbackAnswer, hxVar, 2);
            } else {
                TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
                tL_messages_getBotCallbackAnswer.peer = getMessagesController().j1(zi.B0(ziVar.f26868k));
                tL_messages_getBotCallbackAnswer.msg_id = ziVar.f1();
                tL_messages_getBotCallbackAnswer.game = dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class);
                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) dg.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class);
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
        int i3 = tL_messageReplyHeader.flags;
        if ((i3 & 2) != 0) {
            tL_inputReplyToMessage.flags |= 1;
            tL_inputReplyToMessage.top_msg_id = tL_messageReplyHeader.reply_to_top_id;
        }
        if ((i3 & 1) != 0) {
            tL_inputReplyToMessage.flags |= 2;
            tL_inputReplyToMessage.reply_to_peer_id = hp.s1(this.currentAccount).m1(tL_messageReplyHeader.reply_to_peer_id);
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

    public final void o0(zi ziVar, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        if (ziVar != null && keyboardButtonProto != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(zi.B0(ziVar.f26868k));
            sb2.append("_");
            sb2.append(ziVar.f1());
            sb2.append("_");
            sb2.append(Utilities.f(keyboardButtonProto.getData()));
            sb2.append("_");
            if (dg.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class)) {
                str = "1";
            } else {
                str = "0";
            }
            sb2.append(str);
            this.f26683n.put(sb2.toString(), ziVar);
            this.H.q();
        }
    }

    public final TLRPC.TL_inputReplyToStory p(TL_stories.StoryItem storyItem) {
        TLRPC.TL_inputReplyToStory tL_inputReplyToStory = new TLRPC.TL_inputReplyToStory();
        tL_inputReplyToStory.story_id = storyItem.f27240id;
        tL_inputReplyToStory.peer = getMessagesController().j1(storyItem.dialogId);
        return tL_inputReplyToStory;
    }

    public final void p0(TLRPC.InputPeer inputPeer, TLRPC.TL_inputMediaGame tL_inputMediaGame, long j10, long j11) {
        long E;
        NativeByteBuffer nativeByteBuffer;
        if (inputPeer != null && tL_inputMediaGame != null) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = new TLRPC.TL_messages_sendMedia();
            tL_messages_sendMedia.peer = inputPeer;
            if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                tL_messages_sendMedia.silent = hp.s1(this.currentAccount).f22989d7.getBoolean("silent_" + (-inputPeer.channel_id), false);
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                tL_messages_sendMedia.silent = hp.s1(this.currentAccount).f22989d7.getBoolean("silent_" + (-inputPeer.chat_id), false);
            } else {
                tL_messages_sendMedia.silent = hp.s1(this.currentAccount).f22989d7.getBoolean("silent_" + inputPeer.user_id, false);
            }
            if (j10 != 0) {
                E = j10;
            } else {
                E = E();
            }
            tL_messages_sendMedia.random_id = E;
            tL_messages_sendMedia.message = "";
            tL_messages_sendMedia.media = tL_inputMediaGame;
            long M = t3.M(getMessagesController().M0(Long.valueOf(inputPeer.chat_id)), getMessagesController().N0(inputPeer.chat_id), false);
            if (M != h10.i(this.currentAccount).e()) {
                tL_messages_sendMedia.send_as = getMessagesController().j1(M);
            }
            long N1 = getMessagesController().N1(m5.n(inputPeer));
            if (N1 <= 0) {
                N1 = m5.k(getMessagesController().J2(m5.n(inputPeer)));
            }
            if (N1 > 0) {
                tL_messages_sendMedia.flags |= 2097152;
                tL_messages_sendMedia.allow_paid_stars = N1;
            }
            if (j11 == 0) {
                NativeByteBuffer nativeByteBuffer2 = null;
                try {
                    nativeByteBuffer = new NativeByteBuffer(inputPeer.getObjectSize() + tL_inputMediaGame.getObjectSize() + 12);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    nativeByteBuffer.writeInt32(3);
                    nativeByteBuffer.writeInt64(j10);
                    inputPeer.serializeToStream(nativeByteBuffer);
                    tL_inputMediaGame.serializeToStream(nativeByteBuffer);
                } catch (Exception e11) {
                    e = e11;
                    nativeByteBuffer2 = nativeByteBuffer;
                    a8.g(e, true);
                    nativeByteBuffer = nativeByteBuffer2;
                    j11 = getMessagesStorage().z(nativeByteBuffer);
                    getConnectionsManager().sendRequest(tL_messages_sendMedia, new p4(this, j11, 4));
                }
                j11 = getMessagesStorage().z(nativeByteBuffer);
            }
            getConnectionsManager().sendRequest(tL_messages_sendMedia, new p4(this, j11, 4));
        }
    }

    public final zi q(TLRPC.User user, String str, long j10, String str2, boolean z10, boolean z11, long j11) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        int j12 = getUserConfig().j();
        tL_messageService.f27022id = j12;
        tL_messageService.local_id = j12;
        tL_messageService.random_id = j11;
        tL_messageService.dialog_id = user.f27150id;
        tL_messageService.out = true;
        tL_messageService.unread = true;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().e();
        tL_messageService.flags |= 256;
        TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
        tL_messageService.peer_id = tL_peerUser2;
        tL_peerUser2.user_id = user.f27150id;
        tL_messageService.date = getConnectionsManager().getCurrentTime();
        tL_messageService.send_state = 1;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = new TLRPC.TL_messageActionGramTransfer();
        tL_messageActionGramTransfer.amount = j10;
        tL_messageActionGramTransfer.peer_address = str;
        tL_messageActionGramTransfer.transaction_id = "";
        tL_messageActionGramTransfer.comment = str2;
        tL_messageActionGramTransfer.comment_encrypted = z10;
        tL_messageActionGramTransfer.comment_encrypted_preparing = z11;
        tL_messageService.action = tL_messageActionGramTransfer;
        getUserConfig().v(false);
        zi ziVar = new zi(this.currentAccount, tL_messageService, false, true);
        ziVar.V1 = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_messageService);
        getMessagesStorage().j1(arrayList, false, true, false, 0, false, 0, 0L);
        getMessagesController().l5(0, user.f27150id, k5.k(ziVar));
        getNotificationCenter().k(hs.f23298s, new Object[0]);
        f0(tL_messageService, false);
        return ziVar;
    }

    public final int q0(final java.util.ArrayList r59, long r60, final boolean r62, final boolean r63, final boolean r64, final int r65, final int r66, final org.telegram.messenger.zi r67, final int r68, long r69, final long r71, final org.telegram.messenger.ej r73) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.q0(java.util.ArrayList, long, boolean, boolean, boolean, int, int, org.telegram.messenger.zi, int, long, long, org.telegram.messenger.ej):int");
    }

    public final void r0(org.telegram.messenger.wy r109) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.r0(org.telegram.messenger.wy):void");
    }

    public final void s0(zi ziVar, ArrayList arrayList, dh.n0 n0Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.zh zhVar) {
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji;
        if (ziVar != null && d2Var != null) {
            TLRPC.TL_messages_sendReaction tL_messages_sendReaction = new TLRPC.TL_messages_sendReaction();
            TLRPC.Message message = ziVar.f26868k;
            if (message.isThreadMessage && message.fwd_from != null) {
                tL_messages_sendReaction.peer = getMessagesController().j1(ziVar.Z0());
                tL_messages_sendReaction.msg_id = ziVar.f26868k.fwd_from.saved_from_msg_id;
            } else {
                tL_messages_sendReaction.peer = getMessagesController().j1(zi.B0(ziVar.f26868k));
                tL_messages_sendReaction.msg_id = ziVar.f1();
            }
            tL_messages_sendReaction.add_to_recent = z11;
            if (z11 && n0Var != null) {
                ArrayList arrayList2 = li.b0(this.currentAccount).D1;
                if (n0Var.f9097f != null) {
                    TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                    tL_reactionEmoji.emoticon = n0Var.f9097f;
                    tL_reactionCustomEmoji = tL_reactionEmoji;
                } else {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji2 = new TLRPC.TL_reactionCustomEmoji();
                    tL_reactionCustomEmoji2.document_id = n0Var.f9098g;
                    tL_reactionCustomEmoji = tL_reactionCustomEmoji2;
                }
                arrayList2.add(0, tL_reactionCustomEmoji);
            }
            if (!arrayList.isEmpty()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    dh.n0 n0Var2 = (dh.n0) arrayList.get(i3);
                    if (n0Var2.f9098g != 0) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji3 = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji3.document_id = n0Var2.f9098g;
                        tL_messages_sendReaction.reaction.add(tL_reactionCustomEmoji3);
                        tL_messages_sendReaction.flags |= 1;
                    } else if (n0Var2.f9097f != null) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji2 = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji2.emoticon = n0Var2.f9097f;
                        tL_messages_sendReaction.reaction.add(tL_reactionEmoji2);
                        tL_messages_sendReaction.flags |= 1;
                    }
                }
            }
            if (z10) {
                tL_messages_sendReaction.flags |= 2;
                tL_messages_sendReaction.big = true;
            }
            getConnectionsManager().sendRequest(tL_messages_sendReaction, new s4(9, this, zhVar));
        }
    }

    public final void t(org.telegram.messenger.zi r33, org.telegram.tgnet.TLRPC.TL_inputPollAnswer r34, org.telegram.tgnet.TLRPC.TL_photo r35, org.telegram.messenger.b20 r36, org.telegram.tgnet.TLRPC.TL_document r37, java.lang.String r38, org.telegram.tgnet.TLRPC.PhotoSize r39, java.util.HashMap r40, boolean r41, boolean r42, java.lang.Object r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.t(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$TL_inputPollAnswer, org.telegram.tgnet.TLRPC$TL_photo, org.telegram.messenger.b20, org.telegram.tgnet.TLRPC$TL_document, java.lang.String, org.telegram.tgnet.TLRPC$PhotoSize, java.util.HashMap, boolean, boolean, java.lang.Object):void");
    }

    public final void t0(org.telegram.messenger.ky r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.t0(org.telegram.messenger.ky, boolean):void");
    }

    public final void u(zi ziVar, org.telegram.ui.ActionBar.d2 d2Var, int i3, int i10) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (d2Var != null && d2Var.getParentActivity() != null) {
            if (zi.d3(ziVar.f26868k)) {
                TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
                tL_editMessage2.f27085id = zi.S(ziVar.f1());
                tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
                tL_editMessage2.welcome = true;
                tL_editMessage = tL_editMessage2;
            } else {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.f27085id = ziVar.f1();
                tL_editMessage = tL_messages_editMessage;
            }
            tL_editMessage.peer = getMessagesController().j1(zi.B0(ziVar.f26868k));
            TLRPC.Message message = ziVar.f26868k;
            if (message != null && (message.flags & 1073741824) != 0) {
                tL_editMessage.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                tL_editMessage.flags |= 131072;
            }
            if (i3 != 0) {
                tL_editMessage.schedule_date = i3;
                int i11 = tL_editMessage.flags;
                tL_editMessage.flags = 32768 | i11;
                if (i10 != 0) {
                    tL_editMessage.schedule_repeat_period = i10;
                    tL_editMessage.flags = i11 | 294912;
                }
            }
            getConnectionsManager().sendRequest(tL_editMessage, new uh(this, d2Var, tL_editMessage, 11));
        }
    }

    public final void u0(TLRPC.Document document, String str, final long j10, final CharSequence charSequence, final b20 b20Var, final zi ziVar, final zi ziVar2, final TL_stories.StoryItem storyItem, final org.telegram.ui.mm mmVar, final vi viVar, final boolean z10, final int i3, final int i10, boolean z11, final Object obj, final zv zvVar, final long j11, final long j12, final ej ejVar, final boolean z12) {
        final TLRPC.Document document2;
        TLRPC.PhotoSize photoSize;
        byte[] bArr;
        if (document == null) {
            return;
        }
        HashMap hashMap = null;
        if (m5.C(j10)) {
            if (getMessagesController().a1(Integer.valueOf((int) (j10 & 4294967295L))) == null) {
                return;
            }
            document2 = new TLRPC.TL_document_layer82();
            document2.f27007id = document.f27007id;
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
                    tL_documentAttributeVideo_layer159.f27008w = documentAttribute.f27008w;
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
                File K2 = w7.K(w10, null, true, true);
                if ((w10 instanceof TLRPC.TL_photoStrippedSize) || K2.exists()) {
                    try {
                        if (w10 instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize = new TLRPC.TL_photoStrippedSize();
                            bArr = w10.bytes;
                        } else {
                            TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                            K2.length();
                            byte[] bArr3 = new byte[(int) K2.length()];
                            new RandomAccessFile(K2, "r").readFully(bArr3);
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
                        photoSize.f27026w = w10.f27026w;
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
        if (zi.t3(document2, false)) {
            J.c(new Runnable() {
                @Override
                public final void run() {
                    String str2;
                    final Bitmap[] bitmapArr = new Bitmap[1];
                    final TLRPC.Document document3 = document2;
                    String q10 = ac.b(document3).q(null, null, false);
                    if ("video/mp4".equals(document3.mime_type)) {
                        str2 = ".mp4";
                    } else if ("video/x-matroska".equals(document3.mime_type)) {
                        str2 = ".mkv";
                    } else {
                        str2 = "";
                    }
                    File file = new File(w7.z(3), t4.c.q(q10, str2));
                    if (!file.exists()) {
                        file = new File(w7.z(2), t4.c.q(q10, str2));
                    }
                    final yy yyVar = yy.this;
                    yy.w(yyVar.getAccountInstance(), false, document3, file.getAbsolutePath(), null, 0L, false);
                    final String[] strArr = {yy.D(yyVar.getAccountInstance(), w7.w(document3.thumbs, 320, false, null, false), bitmapArr, true, true)};
                    final b20 b20Var2 = b20Var;
                    final long j13 = j10;
                    final zi ziVar3 = ziVar;
                    final zi ziVar4 = ziVar2;
                    final boolean z13 = z10;
                    final int i12 = i3;
                    final int i13 = i10;
                    final Object obj2 = obj;
                    final vi viVar2 = viVar;
                    final TL_stories.StoryItem storyItem2 = storyItem;
                    final org.telegram.ui.mm mmVar2 = mmVar;
                    final zv zvVar2 = zvVar;
                    final long j14 = j11;
                    final long j15 = j12;
                    final ej ejVar2 = ejVar;
                    final CharSequence charSequence2 = charSequence;
                    final boolean z14 = z12;
                    g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            String str3;
                            yy yyVar2 = yy.this;
                            yyVar2.getClass();
                            Bitmap[] bitmapArr2 = bitmapArr;
                            if (bitmapArr2[0] != null) {
                                String[] strArr2 = strArr;
                                if (strArr2[0] != null) {
                                    zb.D().O(new BitmapDrawable(bitmapArr2[0]), strArr2[0], false);
                                }
                            }
                            wy f10 = wy.f((TLRPC.TL_document) document3, b20Var2, null, j13, ziVar3, ziVar4, null, null, null, null, z13, i12, i13, 0, obj2, viVar2, false);
                            f10.H = storyItem2;
                            f10.J = mmVar2;
                            f10.K = zvVar2;
                            f10.Q = j14;
                            f10.R = j15;
                            f10.T = ejVar2;
                            CharSequence charSequence3 = charSequence2;
                            if (charSequence3 != null) {
                                str3 = charSequence3.toString();
                            } else {
                                str3 = null;
                            }
                            f10.f26291b = str3;
                            f10.L = z14;
                            yyVar2.r0(f10);
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
        wy f10 = wy.f((TLRPC.TL_document) document2, null, null, j10, ziVar, ziVar2, null, null, null, hashMap, z10, i3, i10, 0, obj, viVar, z11);
        f10.H = storyItem;
        f10.J = mmVar;
        f10.K = zvVar;
        f10.Q = j11;
        f10.R = j12;
        f10.T = ejVar;
        f10.L = z12;
        r0(f10);
    }

    public final void v(zi ziVar, TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        TL_ephemeral.TL_editMessage tL_editMessage;
        if (ziVar != null && richMessage != null && ziVar.f26868k != null) {
            if (ziVar.Z2() && ziVar.f26868k.reqId != 0) {
                getConnectionsManager().cancelRequest(ziVar.f26868k.reqId, true);
                ziVar.f26868k.reqId = 0;
            }
            if (zi.d3(ziVar.f26868k)) {
                TL_ephemeral.TL_editMessage tL_editMessage2 = new TL_ephemeral.TL_editMessage();
                tL_editMessage2.f27085id = zi.S(ziVar.f1());
                tL_editMessage2.receiver_id = new TLRPC.TL_inputUserEmpty();
                tL_editMessage2.welcome = true;
                tL_editMessage = tL_editMessage2;
            } else {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.f27085id = ziVar.f1();
                tL_editMessage = tL_messages_editMessage;
            }
            TLRPC.TL_messages_editMessage tL_messages_editMessage2 = tL_editMessage;
            tL_messages_editMessage2.peer = getMessagesController().j1(zi.B0(ziVar.f26868k));
            tL_messages_editMessage2.rich_message = m0(arrayList, richMessage);
            int i3 = tL_messages_editMessage2.flags;
            tL_messages_editMessage2.flags = 8388608 | i3;
            if (ziVar.f26887p1) {
                tL_messages_editMessage2.schedule_date = ziVar.f26868k.date;
                tL_messages_editMessage2.flags = i3 | 8421376;
            }
            TLRPC.Message message = ziVar.f26868k;
            if ((message.flags & 1073741824) != 0) {
                tL_messages_editMessage2.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                tL_messages_editMessage2.flags |= 131072;
            }
            message.rich_message = richMessage;
            message.send_state = 3;
            int sendRequest = getConnectionsManager().sendRequest(tL_messages_editMessage2, new q4(ziVar, this, tL_messages_editMessage2, d2Var, z10));
            TLRPC.Message message2 = ziVar.f26868k;
            if (message2 != null) {
                message2.reqId = sendRequest;
            }
            getNotificationCenter().k(hs.m0, Long.valueOf(zi.B0(ziVar.f26868k)), k5.k(ziVar));
        }
    }

    public final void v0(TLRPC.Document document, String str, long j10, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem, org.telegram.ui.mm mmVar, vi viVar, boolean z10, int i3, int i10, boolean z11, Object obj, zv zvVar, long j11, long j12, ej ejVar) {
        u0(document, str, j10, null, null, ziVar, ziVar2, storyItem, mmVar, viVar, z10, i3, i10, z11, obj, zvVar, j11, j12, ejVar, false);
    }

    public final int w0(zi ziVar, ArrayList arrayList, Runnable runnable) {
        byte[] bArr;
        if (ziVar != null) {
            String str = "poll_" + ziVar.E1();
            if (!this.f26684r.containsKey(str)) {
                TLRPC.TL_messages_sendVote tL_messages_sendVote = new TLRPC.TL_messages_sendVote();
                tL_messages_sendVote.msg_id = ziVar.f1();
                tL_messages_sendVote.peer = getMessagesController().j1(zi.B0(ziVar.f26868k));
                if (arrayList != null) {
                    bArr = new byte[arrayList.size()];
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) arrayList.get(i3);
                        if (pollAnswer != null) {
                            tL_messages_sendVote.options.add(pollAnswer.option);
                            bArr[i3] = pollAnswer.option[0];
                        }
                    }
                } else {
                    bArr = new byte[0];
                }
                this.f26686w.put(str, bArr);
                return getConnectionsManager().sendRequest(tL_messages_sendVote, new q6(this, ziVar, str, runnable, 5));
            }
        }
        return 0;
    }

    public final ky y(int i3, long j10) {
        int i10;
        ky kyVar = null;
        int i11 = Integer.MIN_VALUE;
        for (Map.Entry entry : this.f26678a.entrySet()) {
            ArrayList arrayList = (ArrayList) entry.getValue();
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ky kyVar2 = (ky) arrayList.get(i12);
                int i13 = kyVar2.f23894e;
                if ((i13 == 4 || i13 == 0) && kyVar2.f23891a == j10) {
                    zi ziVar = kyVar2.f23901m;
                    if (ziVar != null) {
                        i10 = ziVar.f1();
                    } else {
                        ArrayList arrayList2 = kyVar2.f23911x;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            i10 = ((zi) k2.p1.h(1, kyVar2.f23911x)).f1();
                        } else {
                            i10 = 0;
                        }
                    }
                    if (i10 != 0 && i10 > i3 && kyVar == null && i11 < i10) {
                        kyVar = kyVar2;
                        i11 = i10;
                    }
                }
            }
        }
        return kyVar;
    }

    public final void z0(org.telegram.messenger.zi r28, org.telegram.tgnet.TLRPC.Message r29, int r30, java.util.List r31, boolean r32, int r33, java.util.HashMap r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yy.z0(org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$Message, int, java.util.List, boolean, int, java.util.HashMap):void");
    }
}
