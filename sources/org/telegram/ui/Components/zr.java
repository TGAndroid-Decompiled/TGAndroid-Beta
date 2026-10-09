package org.telegram.ui.Components;

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
public final class zr implements Runnable {
    public final int f33625a;
    public final Object f33626b;
    public final Object f33627c;

    public zr(int i10, Object obj, Object obj2) {
        this.f33625a = i10;
        this.f33626b = obj;
        this.f33627c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        boolean z11;
        long j3;
        t70 t70Var;
        org.telegram.ui.ib ibVar;
        ci.x0 x0Var;
        int i10 = this.f33625a;
        boolean z12 = false;
        int i11 = 0;
        Object obj = this.f33627c;
        Object obj2 = this.f33626b;
        switch (i10) {
            case 0:
                ds dsVar = (ds) obj2;
                dsVar.getClass();
                ((ci.d) obj).setLoading(false);
                dsVar.dismiss();
                return;
            case 1:
                ds dsVar2 = (ds) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    dsVar2.f25798b0 = groupcallstreamrtmpurl.url;
                    dsVar2.f25799c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dsVar2.f25799c0);
                    dsVar2.f25800d0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f30974a |= 256;
                    obj3.f30975b = 0;
                    obj3.f30976c = spannableStringBuilder.length();
                    dsVar2.f25800d0.setSpan(new u11(obj3, 0), 0, dsVar2.f25800d0.length(), 0);
                    dsVar2.f25801e0.N(false);
                    return;
                }
                return;
            case 2:
                gt gtVar = (gt) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ct ctVar = gtVar.f26873b;
                ArrayList arrayList = gtVar.h;
                int i12 = gtVar.f26872a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    gtVar.f26877g = str;
                    if (str == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gtVar.f26875e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    gtVar.f26876f = currentTimeMillis;
                    if (!gtVar.f26878i) {
                        gtVar.f26878i = true;
                        String str2 = gtVar.f26877g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList.get(i13)).f20185id, arrayList2, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(gtVar, messagesStorage, arrayList2, currentTimeMillis, str3, 3));
                    }
                    gtVar.f26874c = false;
                    ctVar.run();
                    return;
                }
                gtVar.f26877g = null;
                gtVar.f26875e = true;
                gtVar.f26874c = false;
                ctVar.run();
                return;
            case 3:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new zr(4, (fu) obj2, decodeFile));
                return;
            case 4:
                ((fu) obj2).setImage((Bitmap) obj);
                return;
            case 5:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 6:
                MessagesController.getInstance(iw.V(((rv) obj2).f30516a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 7:
                MessagesController.getInstance(((tx) obj2).f31298a.f24401c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 8:
                TLObject tLObject3 = (TLObject) obj;
                a00 a00Var = ((tx) obj2).f31298a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(a00Var.f24401c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(a00Var.f24401c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 9:
                ry ryVar = (ry) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ryVar.f30541s.f29304f = true;
                a00 a00Var2 = ryVar.E;
                if (!a00Var2.f24441p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20065id))) {
                    a00Var2.f24441p1.add(Long.valueOf(tL_messages_stickerSet2.set.f20065id));
                }
                ryVar.a(true);
                return;
            case 10:
                final yy yyVar = (yy) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                a00 a00Var3 = yyVar.f33403a.F;
                if (!Arrays.equals(a00Var3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(a00Var3.f24401c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                a00Var3.W0 = currentKeyboardLanguage;
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
                                yy yyVar2 = yyVar;
                                MediaDataController.getInstance(yyVar2.f33403a.F.f24401c1).searchStickerSets(true, str4, new ai.d5(yyVar2, arrayList5, runnable, 7));
                                return;
                            default:
                                a00 a00Var4 = yyVar.f33403a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(a00Var4.f24401c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = a00Var4.f24401c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20065id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new sy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20065id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20065id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new sy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20065id));
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
                }, new org.telegram.ui.pc(23, yyVar, str4), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                yy yyVar2 = yyVar;
                                MediaDataController.getInstance(yyVar2.f33403a.F.f24401c1).searchStickerSets(true, str4, new ai.d5(yyVar2, arrayList4, runnable, 7));
                                return;
                            default:
                                a00 a00Var4 = yyVar.f33403a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(a00Var4.f24401c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = a00Var4.f24401c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20065id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new sy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20065id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20065id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new sy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20065id));
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
                }, new org.telegram.ui.pc(24, yyVar, arrayList3), new org.telegram.ui.ta(yyVar, str4, arrayList3, arrayList4, arrayList5));
                return;
            case 11:
                ArrayList arrayList6 = (ArrayList) obj;
                zy zyVar = ((yy) obj2).f33403a;
                zyVar.F.V.e(false);
                ArrayList arrayList7 = zyVar.f33678r;
                if (arrayList7.size() >= arrayList6.size()) {
                    z12 = true;
                }
                zyVar.E = z12;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                zyVar.l();
                return;
            case 12:
                ((ez) obj2).F((String) obj, "", true, false, false);
                return;
            case 13:
                ez ezVar = (ez) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                a00 a00Var4 = ezVar.L;
                MessagesController.getInstance(a00Var4.f24401c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i14 = a00Var4.f24401c1;
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = ezVar.f26186w;
                ezVar.f26186w = null;
                ezVar.F(str5, "", false, false, false);
                return;
            case 14:
                l00 l00Var = (l00) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                l00Var.c();
                l00Var.h(k8Var);
                p00 p00Var = l00Var.J;
                p00Var.f29640h1 = k8Var;
                p00Var.j();
                return;
            case 15:
                ((l00) obj2).J.f29635f1 = (o00) obj;
                return;
            case 16:
                ((s10) obj2).f30594z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 17:
                ((org.telegram.ui.pc) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                return;
            case 18:
                m50 m50Var = (m50) obj2;
                Uri uri = (Uri) obj;
                m50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) m50Var.f28682a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.f40351e = false;
                        n2Var.f40352f = false;
                        n2Var.f40350c = m50Var;
                        launchActivity.p0(n2Var);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    m50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 19:
                l60 l60Var = (l60) obj2;
                h60 h60Var = (h60) obj;
                t60 t60Var = l60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                t60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, t60Var.Q);
                VideoEditedInfo videoEditedInfo2 = t60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = t60Var.M;
                videoEditedInfo2.encryptedFile = t60Var.N;
                videoEditedInfo2.key = t60Var.O;
                videoEditedInfo2.iv = t60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = l60Var.f28267a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = t60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = t60Var.f31022j1;
                videoEditedInfo3.estimatedDuration = t60Var.f31023k0;
                t60Var.f31022j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, l60Var.f28267a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (h60Var != null) {
                    photoEntry.ttl = h60Var.f26978c;
                    photoEntry.effectId = h60Var.d;
                }
                f60 f60Var = t60Var.f31026n;
                VideoEditedInfo videoEditedInfo4 = t60Var.S;
                if (h60Var != null && !h60Var.f26976a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (h60Var != null) {
                    i11 = h60Var.f26977b;
                }
                int i15 = i11;
                if (h60Var != null) {
                    j3 = h60Var.f26979e;
                } else {
                    j3 = 0;
                }
                f60Var.r(photoEntry, videoEditedInfo4, z11, i15, 0, false, j3);
                return;
            case 20:
                Bitmap bitmap = (Bitmap) obj;
                l60 l60Var2 = (l60) ((org.telegram.ui.Cells.t6) obj2).f23060b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && l60Var2.A0.size() > 1) {
                    ArrayList arrayList8 = l60Var2.A0;
                    arrayList8.add((Bitmap) hg.c.g(1, arrayList8));
                    return;
                }
                l60Var2.A0.add(bitmap);
                return;
            case 21:
                t70 t70Var2 = (t70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                t70Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        t70Var2.f31056c.put(Long.valueOf(t70Var2.f31054b.admin_id), (TLRPC.User) vector.objects.get(0));
                        t70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                n70 n70Var = (n70) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (t70Var = n70Var.f29062a.f29404c).f31066j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = t70Var.f31054b;
                    org.telegram.ui.vb vbVar = ibVar.f38598a;
                    ArrayList arrayList9 = vbVar.f42785o0;
                    int size = arrayList9.size();
                    int i16 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.vb.L0(vbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.f42784n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f42775f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size2);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.f42800y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((d80) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(2, editTextBoldCursor));
                return;
            case 24:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 25:
                z90 z90Var = (z90) obj2;
                if (z90Var.O0 == ((fa0) obj)) {
                    z90Var.performLongClick();
                    z90Var.O0 = null;
                    z90Var.M0.d(true);
                    return;
                }
                return;
            case 26:
                ((ba0) obj2).l((ia0) obj, false);
                return;
            case 27:
                db0 db0Var = (db0) obj2;
                if (!((boolean[]) obj)[0] && (x0Var = db0Var.U) != null) {
                    x0Var.run();
                }
                db0Var.U = null;
                return;
            case 28:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((fb0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, editTextBoldCursor2));
                return;
            default:
                yh0 yh0Var = (yh0) obj2;
                Runnable runnable = (Runnable) obj;
                yh0Var.getClass();
                runnable.run();
                yh0Var.f33209a.remove(runnable);
                return;
        }
    }
}
