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
    public final int f25076a;
    public final Object f25077b;
    public final Object f25078c;

    public bs(int i10, Object obj, Object obj2) {
        this.f25076a = i10;
        this.f25078c = obj;
        this.f25077b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        boolean z11;
        long j3;
        t70 t70Var;
        org.telegram.ui.hb hbVar;
        ci.x0 x0Var;
        int i10 = this.f25076a;
        boolean z12 = false;
        int i11 = 0;
        Object obj = this.f25077b;
        Object obj2 = this.f25078c;
        switch (i10) {
            case 0:
                es esVar = (es) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    esVar.f26194b0 = groupcallstreamrtmpurl.url;
                    esVar.f26195c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(esVar.f26195c0);
                    esVar.f26196d0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f31418a |= 256;
                    obj3.f31419b = 0;
                    obj3.f31420c = spannableStringBuilder.length();
                    esVar.f26196d0.setSpan(new v11(obj3, 0), 0, esVar.f26196d0.length(), 0);
                    esVar.f26197e0.N(false);
                    return;
                }
                return;
            case 1:
                ht htVar = (ht) obj2;
                TLObject tLObject2 = (TLObject) obj;
                dt dtVar = htVar.f27231b;
                ArrayList arrayList = htVar.h;
                int i12 = htVar.f27230a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    htVar.f27235g = str;
                    if (str == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    htVar.f27233e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    htVar.f27234f = currentTimeMillis;
                    if (!htVar.f27236i) {
                        htVar.f27236i = true;
                        String str2 = htVar.f27235g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList.get(i13)).f20215id, arrayList2, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(htVar, messagesStorage, arrayList2, currentTimeMillis, str3, 3));
                    }
                    htVar.f27232c = false;
                    dtVar.run();
                    return;
                }
                htVar.f27235g = null;
                htVar.f27233e = true;
                htVar.f27232c = false;
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
                MessagesController.getInstance(jw.V(((sv) obj2).f30948a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 6:
                MessagesController.getInstance(((ux) obj2).f31739a.f24731c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 7:
                TLObject tLObject3 = (TLObject) obj;
                b00 b00Var = ((ux) obj2).f31739a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(b00Var.f24731c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(b00Var.f24731c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 8:
                sy syVar = (sy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                syVar.f30973s.f29654f = true;
                b00 b00Var2 = syVar.E;
                if (!b00Var2.f24771p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20095id))) {
                    b00Var2.f24771p1.add(Long.valueOf(tL_messages_stickerSet2.set.f20095id));
                }
                syVar.a(true);
                return;
            case 9:
                final zy zyVar = (zy) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                b00 b00Var3 = zyVar.f33750a.F;
                if (!Arrays.equals(b00Var3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(b00Var3.f24731c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
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
                                MediaDataController.getInstance(zyVar2.f33750a.F.f24731c1).searchStickerSets(true, str4, new ai.d5(zyVar2, arrayList5, runnable, 7));
                                return;
                            default:
                                b00 b00Var4 = zyVar.f33750a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(b00Var4.f24731c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = b00Var4.f24731c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20095id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.ai.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ty(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20095id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20095id))) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20095id));
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
                                MediaDataController.getInstance(zyVar2.f33750a.F.f24731c1).searchStickerSets(true, str4, new ai.d5(zyVar2, arrayList4, runnable, 7));
                                return;
                            default:
                                b00 b00Var4 = zyVar.f33750a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(b00Var4.f24731c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = b00Var4.f24731c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20095id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.ai.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ty(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20095id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20095id))) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20095id));
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
                az azVar = ((zy) obj2).f33750a;
                azVar.F.V.e(false);
                ArrayList arrayList7 = azVar.f24708r;
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
                MessagesController.getInstance(b00Var4.f24731c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i14 = b00Var4.f24731c1;
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = fzVar.f26591w;
                fzVar.f26591w = null;
                fzVar.F(str5, "", false, false, false);
                return;
            case 13:
                m00 m00Var = (m00) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                m00Var.c();
                m00Var.h(k8Var);
                q00 q00Var = m00Var.J;
                q00Var.f30038h1 = k8Var;
                q00Var.j();
                return;
            case 14:
                ((m00) obj2).J.f30033f1 = (p00) obj;
                return;
            case 15:
                ((t10) obj2).f31019z0 = -1;
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
                    LaunchActivity launchActivity = (LaunchActivity) n50Var.f29024a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.f40088e = false;
                        m2Var.f40089f = false;
                        m2Var.f40087c = n50Var;
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
                t60 t60Var = m60Var.H0;
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
                videoEditedInfo2.originalPath = m60Var.f28720a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = t60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = t60Var.f31102j1;
                videoEditedInfo3.estimatedDuration = t60Var.f31103k0;
                t60Var.f31102j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, m60Var.f28720a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (i60Var != null) {
                    photoEntry.ttl = i60Var.f27344c;
                    photoEntry.effectId = i60Var.d;
                }
                g60 g60Var = t60Var.f31106n;
                VideoEditedInfo videoEditedInfo4 = t60Var.S;
                if (i60Var != null && !i60Var.f27342a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (i60Var != null) {
                    i11 = i60Var.f27343b;
                }
                int i15 = i11;
                if (i60Var != null) {
                    j3 = i60Var.f27345e;
                } else {
                    j3 = 0;
                }
                g60Var.r(photoEntry, videoEditedInfo4, z11, i15, 0, false, j3);
                return;
            case 19:
                Bitmap bitmap = (Bitmap) obj;
                m60 m60Var2 = (m60) ((org.telegram.ui.Cells.t6) obj2).f23088b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && m60Var2.A0.size() > 1) {
                    ArrayList arrayList8 = m60Var2.A0;
                    arrayList8.add((Bitmap) hg.c.g(1, arrayList8));
                    return;
                }
                m60Var2.A0.add(bitmap);
                return;
            case 20:
                t70 t70Var2 = (t70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                t70Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        t70Var2.f31137c.put(Long.valueOf(t70Var2.f31135b.admin_id), (TLRPC.User) vector.objects.get(0));
                        t70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                n70 n70Var = (n70) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (t70Var = n70Var.f29061a.f29405c).f31147j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = t70Var.f31135b;
                    org.telegram.ui.ub ubVar = hbVar.f38403a;
                    ArrayList arrayList9 = ubVar.f42521o0;
                    int size = arrayList9.size();
                    int i16 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f42520n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f42511f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.f42536y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((d80) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(2, editTextBoldCursor));
                return;
            case 23:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                z90 z90Var = (z90) obj2;
                if (z90Var.O0 == ((fa0) obj)) {
                    z90Var.performLongClick();
                    z90Var.O0 = null;
                    z90Var.M0.d(true);
                    return;
                }
                return;
            case 25:
                ((ba0) obj2).l((ia0) obj, false);
                return;
            case 26:
                db0 db0Var = (db0) obj2;
                if (!((boolean[]) obj)[0] && (x0Var = db0Var.U) != null) {
                    x0Var.run();
                }
                db0Var.U = null;
                return;
            case 27:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((fb0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, editTextBoldCursor2));
                return;
            case 28:
                zh0 zh0Var = (zh0) obj2;
                Runnable runnable = (Runnable) obj;
                zh0Var.getClass();
                runnable.run();
                zh0Var.f33633a.remove(runnable);
                return;
            default:
                di0 di0Var = (di0) obj2;
                TLObject tLObject5 = (TLObject) obj;
                di0Var.M = false;
                if (tLObject5 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject5;
                    di0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        di0Var.a(false);
                        return;
                    }
                    di0Var.d();
                    di0Var.f25781c.W2.N(true);
                    return;
                }
                return;
        }
    }
}
