package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class bv implements Runnable {
    public final int f23098a;
    public final Object f23099b;
    public final Object f23100c;

    public bv(int i10, Object obj, Object obj2) {
        this.f23098a = i10;
        this.f23100c = obj;
        this.f23099b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        c70 c70Var;
        org.telegram.ui.ib ibVar;
        ci.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f23098a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f23099b;
        Object obj2 = this.f23100c;
        switch (i11) {
            case 0:
                MessagesController.getInstance(tv.U(((cv) obj2).f23449a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 1:
                MessagesController.getInstance(((ex) obj2).f24050a.f25858c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 2:
                TLObject tLObject = (TLObject) obj;
                kz kzVar = ((ex) obj2).f24050a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(kzVar.f25858c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.f25858c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 3:
                cy cyVar = (cy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                cyVar.f23496s.f30424f = true;
                kz kzVar2 = cyVar.E;
                if (!kzVar2.f25897p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18370id))) {
                    kzVar2.f25897p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18370id));
                }
                cyVar.a(true);
                return;
            case 4:
                final jy jyVar = (jy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = jyVar.f25513a.F;
                if (!Arrays.equals(kzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(kzVar3.f25858c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                kzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                Utilities.doCallbacks(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.f25513a.F.f25858c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList3, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = jyVar.f25513a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f25858c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = kzVar4.f25858c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18370id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18370id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18370id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i12).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList4 = stickerSet3.documents;
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new dy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18370id));
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
                }, new org.telegram.ui.of(16, jyVar, str), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.f25513a.F.f25858c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList2, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = jyVar.f25513a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f25858c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = kzVar4.f25858c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18370id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18370id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18370id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i12).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList4 = stickerSet3.documents;
                                                        } else {
                                                            arrayList4 = null;
                                                        }
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new dy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18370id));
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
                }, new org.telegram.ui.of(17, jyVar, arrayList), new org.telegram.ui.ta(jyVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 5:
                ArrayList arrayList4 = (ArrayList) obj;
                ky kyVar = ((jy) obj2).f25513a;
                kyVar.F.V.e(false);
                ArrayList arrayList5 = kyVar.f25843r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kyVar.E = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                kyVar.l();
                return;
            case 6:
                ((py) obj2).F((String) obj, "", true, false, false);
                return;
            case 7:
                py pyVar = (py) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                kz kzVar4 = pyVar.L;
                MessagesController.getInstance(kzVar4.f25858c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = kzVar4.f25858c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = pyVar.f27445w;
                pyVar.f27445w = null;
                pyVar.F(str2, "", false, false, false);
                return;
            case 8:
                vz vzVar = (vz) obj2;
                ci.n8 n8Var = (ci.n8) obj;
                vzVar.c();
                vzVar.h(n8Var);
                zz zzVar = vzVar.J;
                zzVar.f31000h1 = n8Var;
                zzVar.j();
                return;
            case 9:
                ((vz) obj2).J.f30995f1 = (yz) obj;
                return;
            case 10:
                ((c10) obj2).f23162z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 11:
                ((org.telegram.ui.of) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                return;
            case 12:
                u40 u40Var = (u40) obj2;
                Uri uri = (Uri) obj;
                u40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u40Var.f28619a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.e = false;
                        n2Var.f36385f = false;
                        n2Var.f36384c = u40Var;
                        launchActivity.p0(n2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    u40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 13:
                u50 u50Var = (u50) obj2;
                p50 p50Var = (p50) obj;
                c60 c60Var = u50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                c60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, c60Var.Q);
                VideoEditedInfo videoEditedInfo2 = c60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = c60Var.M;
                videoEditedInfo2.encryptedFile = c60Var.N;
                videoEditedInfo2.key = c60Var.O;
                videoEditedInfo2.iv = c60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = u50Var.f28632a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = c60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = c60Var.f23231e1;
                videoEditedInfo3.estimatedDuration = c60Var.f23240k0;
                c60Var.f23231e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, u50Var.f28632a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (p50Var != null) {
                    photoEntry.ttl = p50Var.f27264c;
                    photoEntry.effectId = p50Var.d;
                }
                n50 n50Var = c60Var.f23242n;
                VideoEditedInfo videoEditedInfo4 = c60Var.S;
                if (p50Var != null && !p50Var.f27262a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (p50Var != null) {
                    i10 = p50Var.f27263b;
                } else {
                    i10 = 0;
                }
                if (p50Var != null) {
                    j3 = p50Var.e;
                } else {
                    j3 = 0;
                }
                n50Var.q(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                u50 u50Var2 = (u50) ((org.telegram.ui.Cells.u6) obj2).f21633b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && u50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = u50Var2.A0;
                    arrayList6.add((Bitmap) hg.k0.g(1, arrayList6));
                    return;
                }
                u50Var2.A0.add(bitmap);
                return;
            case 15:
                c70 c70Var2 = (c70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                c70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        c70Var2.f23270c.put(Long.valueOf(c70Var2.f23268b.admin_id), (TLRPC.User) vector.objects.get(0));
                        c70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                w60 w60Var = (w60) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (c70Var = w60Var.f29940a.f30228c).f23279j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = c70Var.f23268b;
                    org.telegram.ui.vb vbVar = ibVar.f34540a;
                    ArrayList arrayList7 = vbVar.f38511o0;
                    int size = arrayList7.size();
                    int i13 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.vb.L0(vbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.f38510n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f38501f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size2);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.f38526y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((m70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 19:
                i90 i90Var = (i90) obj2;
                if (i90Var.O0 == ((o90) obj)) {
                    i90Var.performLongClick();
                    i90Var.O0 = null;
                    i90Var.M0.d(true);
                    return;
                }
                return;
            case 20:
                ((k90) obj2).l((r90) obj, false);
                return;
            case 21:
                ma0 ma0Var = (ma0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = ma0Var.U) != null) {
                    y0Var.run();
                }
                ma0Var.U = null;
                return;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((oa0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 23:
                ki.e0 e0Var = (ki.e0) obj2;
                Runnable runnable = (Runnable) obj;
                e0Var.getClass();
                runnable.run();
                ((HashMap) e0Var.f13672b).remove(runnable);
                return;
            case 24:
                lh0 lh0Var = (lh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                lh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    lh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        lh0Var.a(false);
                        return;
                    }
                    lh0Var.d();
                    lh0Var.f26110c.Y2.N(true);
                    return;
                }
                return;
            case 25:
                qh0 qh0Var = (qh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = qh0Var.f27563a;
                int i14 = qh0Var.f27575x;
                int size3 = arrayList8.size();
                qh0Var.f27575x = size3;
                if (i14 != size3 && qh0Var.S != null) {
                    qh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    nh0 nh0Var = (nh0) arrayList9.get(i15);
                    if (nh0Var.f26775o && !nh0Var.f26776p) {
                        arrayList8.add(nh0Var);
                    } else if (qh0.j(nh0Var.f26764a, arrayList8) == null) {
                        qh0 qh0Var2 = nh0Var.f26784y;
                        float f7 = qh0Var2.N;
                        RectF rectF = nh0Var.f26766c;
                        RectF rectF2 = nh0Var.f26767f;
                        r90 r90Var = nh0Var.f26778r;
                        if (r90Var != null) {
                            r90Var.a();
                            nh0Var.f26780t = z15;
                            nh0Var.f26779s = z15;
                        }
                        nh0Var.f26775o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (rectF.right + 1.0f >= qh0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        nh0Var.f26768g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = nh0Var.f26764a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (qh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    nh0Var.e.d(0.0f, z14);
                                    arrayList8.add(nh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            nh0Var.e.d(0.0f, z14);
                            arrayList8.add(nh0Var);
                        }
                        z14 = true;
                        nh0Var.e.d(0.0f, z14);
                        arrayList8.add(nh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                qh0Var.invalidate();
                return;
            case 26:
                nh0 nh0Var2 = (nh0) obj;
                ph0 ph0Var = ((qh0) obj2).F;
                int i17 = nh0Var2.f26764a;
                RectF rectF3 = nh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ky0) ph0Var).f35282b, i17, rectF3.left, rectF3.top);
                return;
            case 27:
                ViewParent viewParent = (ViewParent) obj;
                ((org.telegram.ui.Cells.u1) obj2).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 28:
                RLottieNative rLottieNative = (RLottieNative) obj2;
                RLottieNative rLottieNative2 = (RLottieNative) obj;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            default:
                sj0 sj0Var = (sj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = sj0Var.f28220r;
                sj0Var.f28219n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    rj0 rj0Var = (rj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((rj0) arrayList11.get(i19)).f28000a) == MessageObject.getObjectPeerId(rj0Var.f28000a)) {
                                if (rj0Var.f28002c > 0) {
                                    ((rj0) arrayList11.get(i19)).f28002c = rj0Var.f28002c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(rj0Var);
                        }
                    }
                }
                q0.a aVar = sj0Var.f28222w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                sj0Var.a();
                return;
        }
    }
}
