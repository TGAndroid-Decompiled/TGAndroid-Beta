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
public final class zu implements Runnable {
    public final int f33231a;
    public final Object f33232b;
    public final Object f33233c;

    public zu(int i10, Object obj, Object obj2) {
        this.f33231a = i10;
        this.f33233c = obj;
        this.f33232b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        r60 r60Var;
        org.telegram.ui.hb hbVar;
        di.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f33231a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f33232b;
        Object obj2 = this.f33233c;
        switch (i11) {
            case 0:
                MessagesController.getInstance(rv.U(((av) obj2).f24458a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 1:
                MessagesController.getInstance(((dx) obj2).f25473a.f27932c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 2:
                TLObject tLObject = (TLObject) obj;
                kz kzVar = ((dx) obj2).f25473a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(kzVar.f27932c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.f27932c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 3:
                cy cyVar = (cy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                cyVar.f25124s.f32767f = true;
                kz kzVar2 = cyVar.E;
                if (!kzVar2.f27972p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f19896id))) {
                    kzVar2.f27972p1.add(Long.valueOf(tL_messages_stickerSet2.set.f19896id));
                }
                cyVar.a(true);
                return;
            case 4:
                final jy jyVar = (jy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = jyVar.f27584a.F;
                if (!Arrays.equals(kzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(kzVar3.f27932c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
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
                                MediaDataController.getInstance(jyVar2.f27584a.F.f27932c1).searchStickerSets(true, str, new bi.o4(jyVar2, arrayList3, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = jyVar.f27584a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f27932c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = kzVar4.f27932c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19896id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19896id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19896id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe3)) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19896id));
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
                }, new org.telegram.ui.nf(16, jyVar, str), new Utilities.Callback() {
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
                                MediaDataController.getInstance(jyVar2.f27584a.F.f27932c1).searchStickerSets(true, str, new bi.o4(jyVar2, arrayList2, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = jyVar.f27584a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f27932c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = kzVar4.f27932c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19896id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19896id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19896id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe3)) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19896id));
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
                }, new org.telegram.ui.nf(17, jyVar, arrayList), new org.telegram.ui.ta(jyVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 5:
                ArrayList arrayList4 = (ArrayList) obj;
                ky kyVar = ((jy) obj2).f27584a;
                kyVar.F.V.e(false);
                ArrayList arrayList5 = kyVar.f27918r;
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
                MessagesController.getInstance(kzVar4.f27932c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = kzVar4.f27932c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = pyVar.f29517w;
                pyVar.f29517w = null;
                pyVar.F(str2, "", false, false, false);
                return;
            case 8:
                vz vzVar = (vz) obj2;
                di.n8 n8Var = (di.n8) obj;
                vzVar.c();
                vzVar.h(n8Var);
                zz zzVar = vzVar.J;
                zzVar.f33298h1 = n8Var;
                zzVar.j();
                return;
            case 9:
                ((vz) obj2).J.f33293f1 = (yz) obj;
                return;
            case 10:
                ((c10) obj2).f24865z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 11:
                ((org.telegram.ui.nf) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                return;
            case 12:
                u40 u40Var = (u40) obj2;
                Uri uri = (Uri) obj;
                u40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u40Var.f30799a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.f39006e = false;
                        n2Var.f39007f = false;
                        n2Var.f39005c = u40Var;
                        launchActivity.p0(n2Var);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    u40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 13:
                v50 v50Var = (v50) obj2;
                q50 q50Var = (q50) obj;
                w50 w50Var = v50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                w50Var.N = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, w50Var.L);
                VideoEditedInfo videoEditedInfo2 = w50Var.N;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = w50Var.H;
                videoEditedInfo2.encryptedFile = w50Var.I;
                videoEditedInfo2.key = w50Var.J;
                videoEditedInfo2.iv = w50Var.K;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = v50Var.f31096a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = w50Var.N;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = w50Var.Z0;
                videoEditedInfo3.estimatedDuration = w50Var.f32136f0;
                w50Var.Z0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.f31096a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (q50Var != null) {
                    photoEntry.ttl = q50Var.f29592c;
                    photoEntry.effectId = q50Var.d;
                }
                o50 o50Var = w50Var.f32130c;
                VideoEditedInfo videoEditedInfo4 = w50Var.N;
                if (q50Var != null && !q50Var.f29590a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (q50Var != null) {
                    i10 = q50Var.f29591b;
                } else {
                    i10 = 0;
                }
                if (q50Var != null) {
                    j3 = q50Var.f29593e;
                } else {
                    j3 = 0;
                }
                o50Var.q(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                v50 v50Var2 = (v50) ((org.telegram.ui.Cells.l7) obj2).f22255b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && v50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = v50Var2.A0;
                    arrayList6.add((Bitmap) i2.g.h(1, arrayList6));
                    return;
                }
                v50Var2.A0.add(bitmap);
                return;
            case 15:
                r60 r60Var2 = (r60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                r60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        r60Var2.f29943c.put(Long.valueOf(r60Var2.f29941b.admin_id), (TLRPC.User) vector.objects.get(0));
                        r60Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                l60 l60Var = (l60) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (r60Var = l60Var.f28067a.f28393c).f29953j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = r60Var.f29941b;
                    org.telegram.ui.ub ubVar = hbVar.f36944a;
                    ArrayList arrayList7 = ubVar.f41040s0;
                    int size = arrayList7.size();
                    int i13 = ubVar.I.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f41038r0, (HashMap<String, ArrayList<MessageObject>>) ubVar.f41036q0, ubVar.f41039s, ubVar.X, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            ubVar.G0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.I;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.C0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((b70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(3, editTextBoldCursor));
                return;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.lp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 19:
                y80 y80Var = (y80) obj2;
                if (y80Var.O0 == ((e90) obj)) {
                    y80Var.performLongClick();
                    y80Var.O0 = null;
                    y80Var.M0.d(true);
                    return;
                }
                return;
            case 20:
                ((a90) obj2).l((h90) obj, false);
                return;
            case 21:
                ca0 ca0Var = (ca0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = ca0Var.U) != null) {
                    y0Var.run();
                }
                ca0Var.U = null;
                return;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((ea0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(5, editTextBoldCursor2));
                return;
            case 23:
                k2.g0 g0Var = (k2.g0) obj2;
                Runnable runnable = (Runnable) obj;
                g0Var.getClass();
                runnable.run();
                ((HashMap) g0Var.f14578b).remove(runnable);
                return;
            case 24:
                yg0 yg0Var = (yg0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                yg0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    yg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        yg0Var.a(false);
                        return;
                    }
                    yg0Var.d();
                    yg0Var.f32909c.Y2.N(true);
                    return;
                }
                return;
            case 25:
                dh0 dh0Var = (dh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = dh0Var.f25385a;
                int i14 = dh0Var.f25398x;
                int size3 = arrayList8.size();
                dh0Var.f25398x = size3;
                if (i14 != size3 && dh0Var.S != null) {
                    dh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    ah0 ah0Var = (ah0) arrayList9.get(i15);
                    if (ah0Var.f24386o && !ah0Var.f24387p) {
                        arrayList8.add(ah0Var);
                    } else if (dh0.j(ah0Var.f24374a, arrayList8) == null) {
                        dh0 dh0Var2 = ah0Var.f24395y;
                        float f7 = dh0Var2.N;
                        RectF rectF = ah0Var.f24376c;
                        RectF rectF2 = ah0Var.f24378f;
                        h90 h90Var = ah0Var.f24389r;
                        if (h90Var != null) {
                            h90Var.a();
                            ah0Var.f24391t = z15;
                            ah0Var.f24390s = z15;
                        }
                        ah0Var.f24386o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (rectF.right + 1.0f >= dh0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        ah0Var.f24379g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = ah0Var.f24374a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (dh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    ah0Var.f24377e.d(0.0f, z14);
                                    arrayList8.add(ah0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            ah0Var.f24377e.d(0.0f, z14);
                            arrayList8.add(ah0Var);
                        }
                        z14 = true;
                        ah0Var.f24377e.d(0.0f, z14);
                        arrayList8.add(ah0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                dh0Var.invalidate();
                return;
            case 26:
                ah0 ah0Var2 = (ah0) obj;
                ch0 ch0Var = ((dh0) obj2).F;
                int i17 = ah0Var2.f24374a;
                RectF rectF3 = ah0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ky0) ch0Var).f38152b, i17, rectF3.left, rectF3.top);
                return;
            case 27:
                ViewParent viewParent = (ViewParent) obj;
                ((org.telegram.ui.Cells.t1) obj2).invalidate();
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
                fj0 fj0Var = (fj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = fj0Var.f26073r;
                fj0Var.f26072n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    ej0 ej0Var = (ej0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((ej0) arrayList11.get(i19)).f25718a) == MessageObject.getObjectPeerId(ej0Var.f25718a)) {
                                if (ej0Var.f25720c > 0) {
                                    ((ej0) arrayList11.get(i19)).f25720c = ej0Var.f25720c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(ej0Var);
                        }
                    }
                }
                q0.a aVar = fj0Var.f26075w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                fj0Var.a();
                return;
        }
    }
}
