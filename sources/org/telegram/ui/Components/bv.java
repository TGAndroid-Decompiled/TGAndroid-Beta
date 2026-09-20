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
    public final int f23054a;
    public final Object f23055b;
    public final Object f23056c;

    public bv(int i10, Object obj, Object obj2) {
        this.f23054a = i10;
        this.f23056c = obj;
        this.f23055b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        z60 z60Var;
        org.telegram.ui.ib ibVar;
        ci.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f23054a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f23055b;
        Object obj2 = this.f23056c;
        switch (i11) {
            case 0:
                MessagesController.getInstance(tv.U(((cv) obj2).f23412a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 1:
                MessagesController.getInstance(((ex) obj2).f23948a.f25898c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 2:
                TLObject tLObject = (TLObject) obj;
                kz kzVar = ((ex) obj2).f23948a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(kzVar.f25898c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.f25898c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 3:
                cy cyVar = (cy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                cyVar.f23429s.f30374f = true;
                kz kzVar2 = cyVar.E;
                if (!kzVar2.f25937p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18355id))) {
                    kzVar2.f25937p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18355id));
                }
                cyVar.a(true);
                return;
            case 4:
                final jy jyVar = (jy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = jyVar.f25558a.F;
                if (!Arrays.equals(kzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(kzVar3.f25898c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
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
                                MediaDataController.getInstance(jyVar2.f25558a.F.f25898c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList3, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = jyVar.f25558a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f25898c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = kzVar4.f25898c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18355id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18355id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18355id))) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18355id));
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
                                MediaDataController.getInstance(jyVar2.f25558a.F.f25898c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList2, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = jyVar.f25558a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f25898c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = kzVar4.f25898c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18355id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18355id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18355id))) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18355id));
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
                ky kyVar = ((jy) obj2).f25558a;
                kyVar.F.V.e(false);
                ArrayList arrayList5 = kyVar.f25884r;
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
                MessagesController.getInstance(kzVar4.f25898c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = kzVar4.f25898c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = pyVar.f27464w;
                pyVar.f27464w = null;
                pyVar.F(str2, "", false, false, false);
                return;
            case 8:
                vz vzVar = (vz) obj2;
                ci.n8 n8Var = (ci.n8) obj;
                vzVar.c();
                vzVar.h(n8Var);
                zz zzVar = vzVar.J;
                zzVar.f30979h1 = n8Var;
                zzVar.j();
                return;
            case 9:
                ((vz) obj2).J.f30974f1 = (yz) obj;
                return;
            case 10:
                ((c10) obj2).f23123z0 = -1;
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
                    LaunchActivity launchActivity = (LaunchActivity) u40Var.f28531a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.e = false;
                        n2Var.f36358f = false;
                        n2Var.f36357c = u40Var;
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
                a60 a60Var = u50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                a60Var.Q = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, a60Var.O);
                VideoEditedInfo videoEditedInfo2 = a60Var.Q;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = a60Var.K;
                videoEditedInfo2.encryptedFile = a60Var.L;
                videoEditedInfo2.key = a60Var.M;
                videoEditedInfo2.iv = a60Var.N;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = u50Var.f28556a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = a60Var.Q;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = a60Var.f22538c1;
                videoEditedInfo3.estimatedDuration = a60Var.f22547i0;
                a60Var.f22538c1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, u50Var.f28556a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (p50Var != null) {
                    photoEntry.ttl = p50Var.f27170c;
                    photoEntry.effectId = p50Var.d;
                }
                n50 n50Var = a60Var.f22543f;
                VideoEditedInfo videoEditedInfo4 = a60Var.Q;
                if (p50Var != null && !p50Var.f27168a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (p50Var != null) {
                    i10 = p50Var.f27169b;
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
                u50 u50Var2 = (u50) ((org.telegram.ui.Cells.u6) obj2).f21618b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && u50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = u50Var2.A0;
                    arrayList6.add((Bitmap) hg.k0.g(1, arrayList6));
                    return;
                }
                u50Var2.A0.add(bitmap);
                return;
            case 15:
                z60 z60Var2 = (z60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                z60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        z60Var2.f30749c.put(Long.valueOf(z60Var2.f30747b.admin_id), (TLRPC.User) vector.objects.get(0));
                        z60Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                t60 t60Var = (t60) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (z60Var = t60Var.f28303a.f28601c).f30758j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = z60Var.f30747b;
                    org.telegram.ui.vb vbVar = ibVar.f34520a;
                    ArrayList arrayList7 = vbVar.f38490o0;
                    int size = arrayList7.size();
                    int i13 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.vb.L0(vbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.f38489n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f38480f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size2);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.f38505y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((j70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 19:
                f90 f90Var = (f90) obj2;
                if (f90Var.O0 == ((l90) obj)) {
                    f90Var.performLongClick();
                    f90Var.O0 = null;
                    f90Var.M0.d(true);
                    return;
                }
                return;
            case 20:
                ((h90) obj2).l((o90) obj, false);
                return;
            case 21:
                ja0 ja0Var = (ja0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = ja0Var.U) != null) {
                    y0Var.run();
                }
                ja0Var.U = null;
                return;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((la0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 23:
                l.d dVar = (l.d) obj2;
                Runnable runnable = (Runnable) obj;
                dVar.getClass();
                runnable.run();
                ((HashMap) dVar.f13898a).remove(runnable);
                return;
            case 24:
                ih0 ih0Var = (ih0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ih0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    ih0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        ih0Var.a(false);
                        return;
                    }
                    ih0Var.d();
                    ih0Var.f25049c.Y2.N(true);
                    return;
                }
                return;
            case 25:
                nh0 nh0Var = (nh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = nh0Var.f26640a;
                int i14 = nh0Var.f26652x;
                int size3 = arrayList8.size();
                nh0Var.f26652x = size3;
                if (i14 != size3 && nh0Var.S != null) {
                    nh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    kh0 kh0Var = (kh0) arrayList9.get(i15);
                    if (kh0Var.f25790o && !kh0Var.f25791p) {
                        arrayList8.add(kh0Var);
                    } else if (nh0.j(kh0Var.f25779a, arrayList8) == null) {
                        nh0 nh0Var2 = kh0Var.f25799y;
                        float f7 = nh0Var2.N;
                        RectF rectF = kh0Var.f25781c;
                        RectF rectF2 = kh0Var.f25782f;
                        o90 o90Var = kh0Var.f25793r;
                        if (o90Var != null) {
                            o90Var.a();
                            kh0Var.f25795t = z15;
                            kh0Var.f25794s = z15;
                        }
                        kh0Var.f25790o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (rectF.right + 1.0f >= nh0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        kh0Var.f25783g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = kh0Var.f25779a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (nh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    kh0Var.e.d(0.0f, z14);
                                    arrayList8.add(kh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            kh0Var.e.d(0.0f, z14);
                            arrayList8.add(kh0Var);
                        }
                        z14 = true;
                        kh0Var.e.d(0.0f, z14);
                        arrayList8.add(kh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                nh0Var.invalidate();
                return;
            case 26:
                kh0 kh0Var2 = (kh0) obj;
                mh0 mh0Var = ((nh0) obj2).F;
                int i17 = kh0Var2.f25779a;
                RectF rectF3 = kh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ky0) mh0Var).f35264b, i17, rectF3.left, rectF3.top);
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
                pj0 pj0Var = (pj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = pj0Var.f27327r;
                pj0Var.f27326n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    oj0 oj0Var = (oj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((oj0) arrayList11.get(i19)).f26954a) == MessageObject.getObjectPeerId(oj0Var.f26954a)) {
                                if (oj0Var.f26956c > 0) {
                                    ((oj0) arrayList11.get(i19)).f26956c = oj0Var.f26956c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(oj0Var);
                        }
                    }
                }
                q0.a aVar = pj0Var.f27329w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                pj0Var.a();
                return;
        }
    }
}
