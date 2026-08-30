package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
public final class il implements Runnable {
    public final int f25741a;
    public final Object f25742b;
    public final Object f25743c;

    public il(int i10, Object obj, Object obj2) {
        this.f25741a = i10;
        this.f25742b = obj;
        this.f25743c = obj2;
    }

    @Override
    public final void run() {
        boolean z4;
        ls lsVar;
        Bitmap createBitmap;
        boolean z10;
        int i10;
        long j10;
        s60 s60Var;
        org.telegram.ui.eb ebVar;
        int i11 = this.f25741a;
        boolean z11 = false;
        Object obj = this.f25743c;
        Object obj2 = this.f25742b;
        switch (i11) {
            case 0:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) obj;
                am amVar = ((ChatAttachAlertPhotoLayout) obj2).M;
                if (amVar != null) {
                    amVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 1:
                di diVar = (di) obj;
                int currentItemTop = diVar.getCurrentItemTop();
                int listTopPadding = diVar.getListTopPadding();
                lh.e1 e1Var = ((om) obj2).f27591r;
                if (currentItemTop > AndroidUtilities.dp(7.0f)) {
                    listTopPadding -= currentItemTop;
                }
                e1Var.scrollBy(0, listTopPadding);
                return;
            case 2:
                fo.a(((co) obj2).f24030c);
                ((uf.g) obj).run();
                return;
            case 3:
                ((ep) obj2).f24626b.x((List) obj);
                return;
            case 4:
                ((fp) obj2).f24932b.x((List) obj);
                return;
            case 5:
                ((org.telegram.ui.ActionBar.g3) obj2).dismiss();
                af.g.s((Context) obj, "https://t.me/BotFather?start=deletebot");
                return;
            case 6:
                jr jrVar = (jr) obj2;
                jrVar.getClass();
                ((ph.d) obj).setLoading(false);
                jrVar.dismiss();
                return;
            case 7:
                jr jrVar2 = (jr) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    jrVar2.Y = groupcallstreamrtmpurl.url;
                    jrVar2.Z = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jrVar2.Z);
                    jrVar2.f26023a0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f28583a |= 256;
                    obj3.f28584b = 0;
                    obj3.f28585c = spannableStringBuilder.length();
                    jrVar2.f26023a0.setSpan(new t01(obj3, 0), 0, jrVar2.f26023a0.length(), 0);
                    jrVar2.f26024b0.N(false);
                    return;
                }
                return;
            case 8:
                os osVar = (os) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ls lsVar2 = osVar.f27655b;
                ArrayList arrayList = osVar.h;
                int i12 = osVar.f27654a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    osVar.f27658g = str;
                    if (str == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    osVar.e = z4;
                    long currentTimeMillis = System.currentTimeMillis();
                    osVar.f27657f = currentTimeMillis;
                    if (osVar.f27659i) {
                        lsVar = lsVar2;
                    } else {
                        osVar.f27659i = true;
                        String str2 = osVar.f27658g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            i13 = android.support.v4.media.a.g(((TLRPC.User) arrayList.get(i13)).f19331id, arrayList2, i13, 1);
                            lsVar2 = lsVar2;
                        }
                        lsVar = lsVar2;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new kh.g1(osVar, messagesStorage, arrayList2, currentTimeMillis, str3, 11));
                    }
                    osVar.f27656c = false;
                    lsVar.run();
                    return;
                }
                osVar.f27658g = null;
                osVar.e = true;
                osVar.f27656c = false;
                lsVar2.run();
                return;
            case 9:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new il(10, (lt) obj2, decodeFile));
                return;
            case 10:
                ((lt) obj2).setImage((Bitmap) obj);
                return;
            case 11:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 12:
                MessagesController.getInstance(mv.U(((vu) obj2).f30088a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 13:
                MessagesController.getInstance(((ax) obj2).f23522a.Z0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 14:
                TLObject tLObject3 = (TLObject) obj;
                kz kzVar = ((ax) obj2).f23522a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(kzVar.Z0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.Z0).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 15:
                zx zxVar = (zx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                zxVar.f31470s.f30102f = true;
                kz kzVar2 = zxVar.B;
                if (!kzVar2.f26447m1.contains(Long.valueOf(tL_messages_stickerSet2.set.f19211id))) {
                    kzVar2.f26447m1.add(Long.valueOf(tL_messages_stickerSet2.set.f19211id));
                }
                zxVar.a(true);
                return;
            case 16:
                final iy iyVar = (iy) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = iyVar.f25796a.C;
                if (!Arrays.equals(kzVar3.T0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(kzVar3.Z0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                kzVar3.T0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                Utilities.doCallbacks(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                iy iyVar2 = iyVar;
                                MediaDataController.getInstance(iyVar2.f25796a.C.Z0).searchStickerSets(true, str4, new kh.h(iyVar2, arrayList5, runnable, 9));
                                return;
                            default:
                                kz kzVar4 = iyVar.f25796a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = kzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19211id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ay(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19211id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19211id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList6 = stickerSet3.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ay(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19211id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                return;
                        }
                    }
                }, new vk(3, iyVar, str4), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                iy iyVar2 = iyVar;
                                MediaDataController.getInstance(iyVar2.f25796a.C.Z0).searchStickerSets(true, str4, new kh.h(iyVar2, arrayList4, runnable, 9));
                                return;
                            default:
                                kz kzVar4 = iyVar.f25796a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = kzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19211id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ay(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19211id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19211id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList6 = stickerSet3.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ay(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19211id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                return;
                        }
                    }
                }, new vk(4, iyVar, arrayList3), new lh.g2(iyVar, str4, arrayList3, arrayList4, arrayList5, 4));
                return;
            case 17:
                ArrayList arrayList6 = (ArrayList) obj;
                jy jyVar = ((iy) obj2).f25796a;
                jyVar.C.S.e(false);
                ArrayList arrayList7 = jyVar.f26062r;
                if (arrayList7.size() >= arrayList6.size()) {
                    z11 = true;
                }
                jyVar.B = z11;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                jyVar.l();
                return;
            case 18:
                ((oy) obj2).F((String) obj, "", true, false, false);
                return;
            case 19:
                oy oyVar = (oy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                kz kzVar4 = oyVar.I;
                MessagesController.getInstance(kzVar4.Z0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i14 = kzVar4.Z0;
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = oyVar.f27691w;
                oyVar.f27691w = null;
                oyVar.F(str5, "", false, false, false);
                return;
            case 20:
                vz vzVar = (vz) obj2;
                ph.t6 t6Var = (ph.t6) obj;
                vzVar.c();
                vzVar.h(t6Var);
                zz zzVar = vzVar.G;
                zzVar.f31499h1 = t6Var;
                zzVar.j();
                return;
            case 21:
                ((vz) obj2).G.f31494f1 = (yz) obj;
                return;
            case 22:
                ((c10) obj2).f23803w0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 23:
                ((vk) obj2).run((org.telegram.ui.ActionBar.p2) obj);
                return;
            case 24:
                w40 w40Var = (w40) obj2;
                Uri uri = (Uri) obj;
                w40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) w40Var.f30190a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? p2Var = new org.telegram.ui.ActionBar.p2(bundle);
                        p2Var.e = false;
                        p2Var.f38422f = false;
                        p2Var.f38421c = w40Var;
                        launchActivity.p0(p2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    w40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 25:
                w50 w50Var = (w50) obj2;
                s50 s50Var = (s50) obj;
                x50 x50Var = w50Var.E0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                x50Var.K = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, x50Var.I);
                VideoEditedInfo videoEditedInfo2 = x50Var.K;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = x50Var.E;
                videoEditedInfo2.encryptedFile = x50Var.F;
                videoEditedInfo2.key = x50Var.G;
                videoEditedInfo2.iv = x50Var.H;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = w50Var.f30203a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = x50Var.K;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = x50Var.W0;
                videoEditedInfo3.estimatedDuration = x50Var.f30551c0;
                x50Var.W0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w50Var.f30203a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (s50Var != null) {
                    photoEntry.ttl = s50Var.f28633c;
                    photoEntry.effectId = s50Var.d;
                }
                q50 q50Var = x50Var.f30550c;
                VideoEditedInfo videoEditedInfo4 = x50Var.K;
                if (s50Var != null && !s50Var.f28631a) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (s50Var != null) {
                    i10 = s50Var.f28632b;
                } else {
                    i10 = 0;
                }
                if (s50Var != null) {
                    j10 = s50Var.e;
                } else {
                    j10 = 0;
                }
                q50Var.r(photoEntry, videoEditedInfo4, z10, i10, 0, false, j10);
                return;
            case 26:
                Bitmap bitmap = (Bitmap) obj;
                w50 w50Var2 = (w50) ((m2.b) obj2).f13714b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && w50Var2.f30234x0.size() > 1) {
                    ArrayList arrayList8 = w50Var2.f30234x0;
                    arrayList8.add((Bitmap) kh.a2.i(1, arrayList8));
                    return;
                }
                w50Var2.f30234x0.add(bitmap);
                return;
            case 27:
                s60 s60Var2 = (s60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                s60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        s60Var2.f28640c.put(Long.valueOf(s60Var2.f28638b.admin_id), (TLRPC.User) vector.objects.get(0));
                        s60Var2.Q.l();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                m60 m60Var = (m60) obj2;
                if (((TLRPC.TL_error) obj) == null && (ebVar = (s60Var = m60Var.f26951a.f27204c).f28646g0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = s60Var.f28638b;
                    org.telegram.ui.sb sbVar = ebVar.f33973a;
                    ArrayList arrayList9 = sbVar.f38269p0;
                    int size = arrayList9.size();
                    int i15 = sbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = sbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.sb.L0(sbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) sbVar.f38268o0, (HashMap<String, ArrayList<MessageObject>>) sbVar.f38267n0, sbVar.f38273s, sbVar.U, true).contentType >= 0) {
                        sbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            sbVar.D0.N = true;
                            org.telegram.ui.ob obVar = sbVar.F;
                            obVar.s(obVar.h, size2);
                            org.telegram.ui.sb.K0(sbVar);
                        }
                        sbVar.f38284z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((c70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
        }
    }
}
