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
import org.telegram.ui.ProfileActivity;
public final class em implements Runnable {
    public final int f24630a;
    public final Object f24631b;
    public final Object f24632c;

    public em(int i10, Object obj, Object obj2) {
        this.f24630a = i10;
        this.f24631b = obj;
        this.f24632c = obj2;
    }

    @Override
    public final void run() {
        boolean z4;
        ks ksVar;
        Bitmap createBitmap;
        boolean z10;
        int i10;
        long j10;
        t60 t60Var;
        org.telegram.ui.gb gbVar;
        int i11 = this.f24630a;
        boolean z11 = false;
        Object obj = this.f24632c;
        Object obj2 = this.f24631b;
        switch (i11) {
            case 0:
                di diVar = (di) obj;
                int currentItemTop = diVar.getCurrentItemTop();
                int listTopPadding = diVar.getListTopPadding();
                lh.e1 e1Var = ((nm) obj2).f27299r;
                if (currentItemTop > AndroidUtilities.dp(7.0f)) {
                    listTopPadding -= currentItemTop;
                }
                e1Var.scrollBy(0, listTopPadding);
                return;
            case 1:
                eo.a(((bo) obj2).f23727c);
                ((uf.g) obj).run();
                return;
            case 2:
                ((dp) obj2).f24335b.x((List) obj);
                return;
            case 3:
                ((ep) obj2).f24665b.x((List) obj);
                return;
            case 4:
                ((org.telegram.ui.ActionBar.g3) obj2).dismiss();
                ze.d.s((Context) obj, "https://t.me/BotFather?start=deletebot");
                return;
            case 5:
                ir irVar = (ir) obj2;
                irVar.getClass();
                ((ph.d) obj).setLoading(false);
                irVar.dismiss();
                return;
            case 6:
                ir irVar2 = (ir) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    irVar2.Y = groupcallstreamrtmpurl.url;
                    irVar2.Z = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(irVar2.Z);
                    irVar2.f25757a0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f28632a |= 256;
                    obj3.f28633b = 0;
                    obj3.f28634c = spannableStringBuilder.length();
                    irVar2.f25757a0.setSpan(new t01(obj3, 0), 0, irVar2.f25757a0.length(), 0);
                    irVar2.f25758b0.N(false);
                    return;
                }
                return;
            case 7:
                ns nsVar = (ns) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ks ksVar2 = nsVar.f27358b;
                ArrayList arrayList = nsVar.h;
                int i12 = nsVar.f27357a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    nsVar.f27361g = str;
                    if (str == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    nsVar.e = z4;
                    long currentTimeMillis = System.currentTimeMillis();
                    nsVar.f27360f = currentTimeMillis;
                    if (nsVar.f27362i) {
                        ksVar = ksVar2;
                    } else {
                        nsVar.f27362i = true;
                        String str2 = nsVar.f27361g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            i13 = android.support.v4.media.a.g(((TLRPC.User) arrayList.get(i13)).f19306id, arrayList2, i13, 1);
                            ksVar2 = ksVar2;
                        }
                        ksVar = ksVar2;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new kh.g1(nsVar, messagesStorage, arrayList2, currentTimeMillis, str3, 11));
                    }
                    nsVar.f27359c = false;
                    ksVar.run();
                    return;
                }
                nsVar.f27361g = null;
                nsVar.e = true;
                nsVar.f27359c = false;
                ksVar2.run();
                return;
            case 8:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new em(9, (kt) obj2, decodeFile));
                return;
            case 9:
                ((kt) obj2).setImage((Bitmap) obj);
                return;
            case 10:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 11:
                MessagesController.getInstance(lv.U(((uu) obj2).f29297a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 12:
                MessagesController.getInstance(((ax) obj2).f23494a.Z0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 13:
                TLObject tLObject3 = (TLObject) obj;
                kz kzVar = ((ax) obj2).f23494a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(kzVar.Z0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.Z0).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 14:
                zx zxVar = (zx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                zxVar.f31498s.f30066f = true;
                kz kzVar2 = zxVar.B;
                if (!kzVar2.f26459m1.contains(Long.valueOf(tL_messages_stickerSet2.set.f19186id))) {
                    kzVar2.f26459m1.add(Long.valueOf(tL_messages_stickerSet2.set.f19186id));
                }
                zxVar.a(true);
                return;
            case 15:
                final iy iyVar = (iy) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = iyVar.f25785a.C;
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
                                MediaDataController.getInstance(iyVar2.f25785a.C.Z0).searchStickerSets(true, str4, new kh.h(iyVar2, arrayList5, runnable, 9));
                                return;
                            default:
                                kz kzVar4 = iyVar.f25785a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = kzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19186id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ay(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19186id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19186id))) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19186id));
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
                                MediaDataController.getInstance(iyVar2.f25785a.C.Z0).searchStickerSets(true, str4, new kh.h(iyVar2, arrayList4, runnable, 9));
                                return;
                            default:
                                kz kzVar4 = iyVar.f25785a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = kzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19186id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ay(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19186id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19186id))) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19186id));
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
            case 16:
                ArrayList arrayList6 = (ArrayList) obj;
                jy jyVar = ((iy) obj2).f25785a;
                jyVar.C.S.e(false);
                ArrayList arrayList7 = jyVar.f26072r;
                if (arrayList7.size() >= arrayList6.size()) {
                    z11 = true;
                }
                jyVar.B = z11;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                jyVar.l();
                return;
            case 17:
                ((oy) obj2).F((String) obj, "", true, false, false);
                return;
            case 18:
                oy oyVar = (oy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                kz kzVar4 = oyVar.I;
                MessagesController.getInstance(kzVar4.Z0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i14 = kzVar4.Z0;
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = oyVar.f27687w;
                oyVar.f27687w = null;
                oyVar.F(str5, "", false, false, false);
                return;
            case 19:
                vz vzVar = (vz) obj2;
                ph.s6 s6Var = (ph.s6) obj;
                vzVar.c();
                vzVar.h(s6Var);
                a00 a00Var = vzVar.G;
                a00Var.f23223h1 = s6Var;
                a00Var.j();
                return;
            case 20:
                ((vz) obj2).G.f23218f1 = (yz) obj;
                return;
            case 21:
                ((d10) obj2).f24101w0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 22:
                ((vk) obj2).run((org.telegram.ui.ActionBar.p2) obj);
                return;
            case 23:
                x40 x40Var = (x40) obj2;
                Uri uri = (Uri) obj;
                x40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) x40Var.f30466a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? p2Var = new org.telegram.ui.ActionBar.p2(bundle);
                        p2Var.e = false;
                        p2Var.f40855f = false;
                        p2Var.f40854c = x40Var;
                        launchActivity.p0(p2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    x40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 24:
                x50 x50Var = (x50) obj2;
                t50 t50Var = (t50) obj;
                y50 y50Var = x50Var.E0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                y50Var.K = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, y50Var.I);
                VideoEditedInfo videoEditedInfo2 = y50Var.K;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = y50Var.E;
                videoEditedInfo2.encryptedFile = y50Var.F;
                videoEditedInfo2.key = y50Var.G;
                videoEditedInfo2.iv = y50Var.H;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = x50Var.f30479a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = y50Var.K;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = y50Var.W0;
                videoEditedInfo3.estimatedDuration = y50Var.f30876c0;
                y50Var.W0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, x50Var.f30479a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (t50Var != null) {
                    photoEntry.ttl = t50Var.f28901c;
                    photoEntry.effectId = t50Var.d;
                }
                r50 r50Var = y50Var.f30875c;
                VideoEditedInfo videoEditedInfo4 = y50Var.K;
                if (t50Var != null && !t50Var.f28899a) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (t50Var != null) {
                    i10 = t50Var.f28900b;
                } else {
                    i10 = 0;
                }
                if (t50Var != null) {
                    j10 = t50Var.e;
                } else {
                    j10 = 0;
                }
                r50Var.r(photoEntry, videoEditedInfo4, z10, i10, 0, false, j10);
                return;
            case 25:
                Bitmap bitmap = (Bitmap) obj;
                x50 x50Var2 = (x50) ((m2.b) obj2).f13698b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && x50Var2.f30510x0.size() > 1) {
                    ArrayList arrayList8 = x50Var2.f30510x0;
                    arrayList8.add((Bitmap) kf.k0.i(1, arrayList8));
                    return;
                }
                x50Var2.f30510x0.add(bitmap);
                return;
            case 26:
                t60 t60Var2 = (t60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                t60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        t60Var2.f28909c.put(Long.valueOf(t60Var2.f28907b.admin_id), (TLRPC.User) vector.objects.get(0));
                        t60Var2.Q.l();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                n60 n60Var = (n60) obj2;
                if (((TLRPC.TL_error) obj) == null && (gbVar = (t60Var = n60Var.f27200a.f27469c).f28915g0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = t60Var.f28907b;
                    org.telegram.ui.ub ubVar = gbVar.f34400a;
                    ArrayList arrayList9 = ubVar.f38748p0;
                    int size = arrayList9.size();
                    int i15 = ubVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f38747o0, (HashMap<String, ArrayList<MessageObject>>) ubVar.f38746n0, ubVar.f38752s, ubVar.U, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            ubVar.D0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.F;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.f38763z0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((d70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.fp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
        }
    }
}
