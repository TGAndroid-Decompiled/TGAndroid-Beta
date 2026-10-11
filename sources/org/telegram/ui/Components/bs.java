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
public final class bs implements Runnable {
    public final int f25010a;
    public final Object f25011b;
    public final Object f25012c;

    public bs(int i10, Object obj, Object obj2) {
        this.f25010a = i10;
        this.f25012c = obj;
        this.f25011b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        boolean z11;
        long j3;
        u70 u70Var;
        org.telegram.ui.hb hbVar;
        ci.x0 x0Var;
        int i10 = this.f25010a;
        boolean z12 = false;
        int i11 = 0;
        Object obj = this.f25011b;
        Object obj2 = this.f25012c;
        switch (i10) {
            case 0:
                es esVar = (es) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    esVar.f26120b0 = groupcallstreamrtmpurl.url;
                    esVar.f26121c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(esVar.f26121c0);
                    esVar.f26122d0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f31643a |= 256;
                    obj3.f31644b = 0;
                    obj3.f31645c = spannableStringBuilder.length();
                    esVar.f26122d0.setSpan(new w11(obj3, 0), 0, esVar.f26122d0.length(), 0);
                    esVar.f26123e0.N(false);
                    return;
                }
                return;
            case 1:
                ht htVar = (ht) obj2;
                TLObject tLObject2 = (TLObject) obj;
                dt dtVar = htVar.f27072b;
                ArrayList arrayList = htVar.h;
                int i12 = htVar.f27071a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    htVar.f27076g = str;
                    if (str == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    htVar.f27074e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    htVar.f27075f = currentTimeMillis;
                    if (!htVar.f27077i) {
                        htVar.f27077i = true;
                        String str2 = htVar.f27076g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList.get(i13)).f20179id, arrayList2, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(htVar, messagesStorage, arrayList2, currentTimeMillis, str3, 3));
                    }
                    htVar.f27073c = false;
                    dtVar.run();
                    return;
                }
                htVar.f27076g = null;
                htVar.f27074e = true;
                htVar.f27073c = false;
                dtVar.run();
                return;
            case 2:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new bs(3, (gu) obj2, decodeFile));
                return;
            case 3:
                ((gu) obj2).setImage((Bitmap) obj);
                return;
            case 4:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 5:
                MessagesController.getInstance(jw.V(((sv) obj2).f30866a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 6:
                MessagesController.getInstance(((ux) obj2).f31607a.f24662c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 7:
                TLObject tLObject3 = (TLObject) obj;
                b00 b00Var = ((ux) obj2).f31607a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(b00Var.f24662c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(b00Var.f24662c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 8:
                sy syVar = (sy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                syVar.f30902s.f29551f = true;
                b00 b00Var2 = syVar.E;
                if (!b00Var2.f24702p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20059id))) {
                    b00Var2.f24702p1.add(Long.valueOf(tL_messages_stickerSet2.set.f20059id));
                }
                syVar.a(true);
                return;
            case 9:
                final zy zyVar = (zy) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                b00 b00Var3 = zyVar.f33686a.F;
                if (!Arrays.equals(b00Var3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(b00Var3.f24662c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                b00Var3.W0 = currentKeyboardLanguage;
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
                                zy zyVar2 = zyVar;
                                MediaDataController.getInstance(zyVar2.f33686a.F.f24662c1).searchStickerSets(true, str4, new ai.d5(zyVar2, arrayList5, runnable, 7));
                                return;
                            default:
                                b00 b00Var4 = zyVar.f33686a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(b00Var4.f24662c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = b00Var4.f24662c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20059id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.ai.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ty(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20059id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20059id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.ai.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new ty(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20059id));
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
                }, new org.telegram.ui.oc(23, zyVar, str4), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                zy zyVar2 = zyVar;
                                MediaDataController.getInstance(zyVar2.f33686a.F.f24662c1).searchStickerSets(true, str4, new ai.d5(zyVar2, arrayList4, runnable, 7));
                                return;
                            default:
                                b00 b00Var4 = zyVar.f33686a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(b00Var4.f24662c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = b00Var4.f24662c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20059id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.ai.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ty(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20059id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20059id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.ai.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new ty(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20059id));
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
                }, new org.telegram.ui.oc(24, zyVar, arrayList3), new org.telegram.ui.sa(zyVar, str4, arrayList3, arrayList4, arrayList5));
                return;
            case 10:
                ArrayList arrayList6 = (ArrayList) obj;
                az azVar = ((zy) obj2).f33686a;
                azVar.F.V.e(false);
                ArrayList arrayList7 = azVar.f24640r;
                if (arrayList7.size() >= arrayList6.size()) {
                    z12 = true;
                }
                azVar.E = z12;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                azVar.l();
                return;
            case 11:
                ((fz) obj2).F((String) obj, "", true, false, false);
                return;
            case 12:
                fz fzVar = (fz) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                b00 b00Var4 = fzVar.L;
                MessagesController.getInstance(b00Var4.f24662c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i14 = b00Var4.f24662c1;
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = fzVar.f26526w;
                fzVar.f26526w = null;
                fzVar.F(str5, "", false, false, false);
                return;
            case 13:
                m00 m00Var = (m00) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                m00Var.c();
                m00Var.h(k8Var);
                q00 q00Var = m00Var.J;
                q00Var.f29909h1 = k8Var;
                q00Var.j();
                return;
            case 14:
                ((m00) obj2).J.f29904f1 = (p00) obj;
                return;
            case 15:
                ((t10) obj2).f30954z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 16:
                ((org.telegram.ui.oc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                return;
            case 17:
                n50 n50Var = (n50) obj2;
                Uri uri = (Uri) obj;
                n50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) n50Var.f28948a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.f40054e = false;
                        m2Var.f40055f = false;
                        m2Var.f40053c = n50Var;
                        launchActivity.p0(m2Var);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    n50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 18:
                m60 m60Var = (m60) obj2;
                i60 i60Var = (i60) obj;
                u60 u60Var = m60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                u60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, u60Var.Q);
                VideoEditedInfo videoEditedInfo2 = u60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = u60Var.M;
                videoEditedInfo2.encryptedFile = u60Var.N;
                videoEditedInfo2.key = u60Var.O;
                videoEditedInfo2.iv = u60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = m60Var.f28535a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = u60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = u60Var.f31278j1;
                videoEditedInfo3.estimatedDuration = u60Var.f31279k0;
                u60Var.f31278j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, m60Var.f28535a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (i60Var != null) {
                    photoEntry.ttl = i60Var.f27197c;
                    photoEntry.effectId = i60Var.d;
                }
                g60 g60Var = u60Var.f31282n;
                VideoEditedInfo videoEditedInfo4 = u60Var.S;
                if (i60Var != null && !i60Var.f27195a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (i60Var != null) {
                    i11 = i60Var.f27196b;
                }
                int i15 = i11;
                if (i60Var != null) {
                    j3 = i60Var.f27198e;
                } else {
                    j3 = 0;
                }
                g60Var.r(photoEntry, videoEditedInfo4, z11, i15, 0, false, j3);
                return;
            case 19:
                Bitmap bitmap = (Bitmap) obj;
                m60 m60Var2 = (m60) ((org.telegram.ui.Cells.t6) obj2).f23052b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && m60Var2.A0.size() > 1) {
                    ArrayList arrayList8 = m60Var2.A0;
                    arrayList8.add((Bitmap) hg.c.g(1, arrayList8));
                    return;
                }
                m60Var2.A0.add(bitmap);
                return;
            case 20:
                u70 u70Var2 = (u70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                u70Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        u70Var2.f31313c.put(Long.valueOf(u70Var2.f31311b.admin_id), (TLRPC.User) vector.objects.get(0));
                        u70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                o70 o70Var = (o70) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (u70Var = o70Var.f29279a.f29637c).f31323j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = u70Var.f31311b;
                    org.telegram.ui.ub ubVar = hbVar.f38369a;
                    ArrayList arrayList9 = ubVar.f42487o0;
                    int size = arrayList9.size();
                    int i16 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f42486n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f42477f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.f42502y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((e80) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(2, editTextBoldCursor));
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                aa0 aa0Var = (aa0) obj2;
                if (aa0Var.O0 == ((ga0) obj)) {
                    aa0Var.performLongClick();
                    aa0Var.O0 = null;
                    aa0Var.M0.d(true);
                    return;
                }
                return;
            case 25:
                ((ca0) obj2).l((ja0) obj, false);
                return;
            case 26:
                eb0 eb0Var = (eb0) obj2;
                if (!((boolean[]) obj)[0] && (x0Var = eb0Var.U) != null) {
                    x0Var.run();
                }
                eb0Var.U = null;
                return;
            case 27:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((gb0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, editTextBoldCursor2));
                return;
            case 28:
                ai0 ai0Var = (ai0) obj2;
                Runnable runnable = (Runnable) obj;
                ai0Var.getClass();
                runnable.run();
                ai0Var.f24522a.remove(runnable);
                return;
            default:
                ei0 ei0Var = (ei0) obj2;
                TLObject tLObject5 = (TLObject) obj;
                ei0Var.M = false;
                if (tLObject5 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject5;
                    ei0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        ei0Var.a(false);
                        return;
                    }
                    ei0Var.d();
                    ei0Var.f26018c.W2.N(true);
                    return;
                }
                return;
        }
    }
}
