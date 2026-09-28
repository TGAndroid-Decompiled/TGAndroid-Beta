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
public final class ww implements Runnable {
    public final int f30196a;
    public final Object f30197b;
    public final Object f30198c;

    public ww(int i10, Object obj, Object obj2) {
        this.f30196a = i10;
        this.f30197b = obj;
        this.f30198c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        e70 e70Var;
        org.telegram.ui.hb hbVar;
        ci.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int indexOf;
        int L;
        int i11 = this.f30196a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f30198c;
        Object obj2 = this.f30197b;
        switch (i11) {
            case 0:
                MessagesController.getInstance(((gx) obj2).f24642a.f26532c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 1:
                TLObject tLObject = (TLObject) obj;
                mz mzVar = ((gx) obj2).f24642a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(mzVar.f26532c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(mzVar.f26532c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 2:
                ey eyVar = (ey) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                eyVar.f24097s.f30981f = true;
                mz mzVar2 = eyVar.E;
                if (!mzVar2.f26571p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18362id))) {
                    mzVar2.f26571p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18362id));
                }
                eyVar.a(true);
                return;
            case 3:
                final ly lyVar = (ly) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                mz mzVar3 = lyVar.f26175a.F;
                if (!Arrays.equals(mzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(mzVar3.f26532c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                mzVar3.W0 = currentKeyboardLanguage;
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
                                ly lyVar2 = lyVar;
                                MediaDataController.getInstance(lyVar2.f26175a.F.f26532c1).searchStickerSets(true, str, new ai.c5(lyVar2, arrayList3, runnable, 7));
                                return;
                            default:
                                mz mzVar4 = lyVar.f26175a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.f26532c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = mzVar4.f26532c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18362id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new fy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18362id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18362id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new fy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18362id));
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
                }, new org.telegram.ui.oc(23, lyVar, str), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                ly lyVar2 = lyVar;
                                MediaDataController.getInstance(lyVar2.f26175a.F.f26532c1).searchStickerSets(true, str, new ai.c5(lyVar2, arrayList2, runnable, 7));
                                return;
                            default:
                                mz mzVar4 = lyVar.f26175a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.f26532c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = mzVar4.f26532c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18362id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new fy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18362id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18362id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new fy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18362id));
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
                }, new org.telegram.ui.oc(24, lyVar, arrayList), new org.telegram.ui.sa(lyVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 4:
                ArrayList arrayList4 = (ArrayList) obj;
                my myVar = ((ly) obj2).f26175a;
                myVar.F.V.e(false);
                ArrayList arrayList5 = myVar.f26516r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                myVar.E = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                myVar.l();
                return;
            case 5:
                ((ry) obj2).F((String) obj, "", true, false, false);
                return;
            case 6:
                ry ryVar = (ry) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                mz mzVar4 = ryVar.L;
                MessagesController.getInstance(mzVar4.f26532c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = mzVar4.f26532c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = ryVar.f28072w;
                ryVar.f28072w = null;
                ryVar.F(str2, "", false, false, false);
                return;
            case 7:
                xz xzVar = (xz) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                xzVar.c();
                xzVar.h(k8Var);
                b00 b00Var = xzVar.J;
                b00Var.f22793h1 = k8Var;
                b00Var.j();
                return;
            case 8:
                ((xz) obj2).J.f22788f1 = (a00) obj;
                return;
            case 9:
                ((e10) obj2).f23823z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 10:
                ((org.telegram.ui.oc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                return;
            case 11:
                x40 x40Var = (x40) obj2;
                Uri uri = (Uri) obj;
                x40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) x40Var.f30236a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.e = false;
                        m2Var.f33745f = false;
                        m2Var.f33744c = x40Var;
                        launchActivity.p0(m2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    x40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 12:
                x50 x50Var = (x50) obj2;
                s50 s50Var = (s50) obj;
                e60 e60Var = x50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                e60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, e60Var.Q);
                VideoEditedInfo videoEditedInfo2 = e60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = e60Var.M;
                videoEditedInfo2.encryptedFile = e60Var.N;
                videoEditedInfo2.key = e60Var.O;
                videoEditedInfo2.iv = e60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = x50Var.f30251a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = e60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = e60Var.f23891e1;
                videoEditedInfo3.estimatedDuration = e60Var.f23900k0;
                e60Var.f23891e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, x50Var.f30251a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (s50Var != null) {
                    photoEntry.ttl = s50Var.f28128c;
                    photoEntry.effectId = s50Var.d;
                }
                q50 q50Var = e60Var.f23902n;
                VideoEditedInfo videoEditedInfo4 = e60Var.S;
                if (s50Var != null && !s50Var.f28126a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (s50Var != null) {
                    i10 = s50Var.f28127b;
                } else {
                    i10 = 0;
                }
                if (s50Var != null) {
                    j3 = s50Var.e;
                } else {
                    j3 = 0;
                }
                q50Var.q(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 13:
                Bitmap bitmap = (Bitmap) obj;
                x50 x50Var2 = (x50) ((org.telegram.ui.Cells.t6) obj2).f21209b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && x50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = x50Var2.A0;
                    arrayList6.add((Bitmap) hg.c.g(1, arrayList6));
                    return;
                }
                x50Var2.A0.add(bitmap);
                return;
            case 14:
                e70 e70Var2 = (e70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                e70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        e70Var2.f23927c.put(Long.valueOf(e70Var2.f23925b.admin_id), (TLRPC.User) vector.objects.get(0));
                        e70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                y60 y60Var = (y60) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (e70Var = y60Var.f30587a.f30831c).f23936j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = e70Var.f23925b;
                    org.telegram.ui.ub ubVar = hbVar.f34179a;
                    ArrayList arrayList7 = ubVar.f38405o0;
                    int size = arrayList7.size();
                    int i13 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f38404n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f38395f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.f38420y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((o70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 17:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.fp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 18:
                k90 k90Var = (k90) obj2;
                if (k90Var.O0 == ((q90) obj)) {
                    k90Var.performLongClick();
                    k90Var.O0 = null;
                    k90Var.M0.d(true);
                    return;
                }
                return;
            case 19:
                ((m90) obj2).l((t90) obj, false);
                return;
            case 20:
                pa0 pa0Var = (pa0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = pa0Var.U) != null) {
                    y0Var.run();
                }
                pa0Var.U = null;
                return;
            case 21:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((ra0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 22:
                l.d dVar = (l.d) obj2;
                Runnable runnable = (Runnable) obj;
                dVar.getClass();
                runnable.run();
                ((HashMap) dVar.f13924a).remove(runnable);
                return;
            case 23:
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
                    lh0Var.f26001c.Y2.N(true);
                    return;
                }
                return;
            case 24:
                qh0 qh0Var = (qh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = qh0Var.f27716a;
                int i14 = qh0Var.f27728x;
                int size3 = arrayList8.size();
                qh0Var.f27728x = size3;
                if (i14 != size3 && qh0Var.S != null) {
                    qh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    nh0 nh0Var = (nh0) arrayList9.get(i15);
                    if (nh0Var.f26776o && !nh0Var.f26777p) {
                        arrayList8.add(nh0Var);
                    } else if (qh0.j(nh0Var.f26765a, arrayList8) == null) {
                        qh0 qh0Var2 = nh0Var.f26785y;
                        float f7 = qh0Var2.N;
                        RectF rectF = nh0Var.f26767c;
                        RectF rectF2 = nh0Var.f26768f;
                        t90 t90Var = nh0Var.f26779r;
                        if (t90Var != null) {
                            t90Var.a();
                            nh0Var.f26781t = z15;
                            nh0Var.f26780s = z15;
                        }
                        nh0Var.f26776o = z16;
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
                        nh0Var.f26769g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = nh0Var.f26765a;
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
            case 25:
                nh0 nh0Var2 = (nh0) obj;
                ph0 ph0Var = ((qh0) obj2).F;
                int i17 = nh0Var2.f26765a;
                RectF rectF3 = nh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.by0) ph0Var).f32511b, i17, rectF3.left, rectF3.top);
                return;
            case 26:
                ViewParent viewParent = (ViewParent) obj;
                ((org.telegram.ui.Cells.u1) obj2).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 27:
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
            case 28:
                sj0 sj0Var = (sj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = sj0Var.f28258r;
                sj0Var.f28257n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    rj0 rj0Var = (rj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((rj0) arrayList11.get(i19)).f27979a) == MessageObject.getObjectPeerId(rj0Var.f27979a)) {
                                if (rj0Var.f27981c > 0) {
                                    ((rj0) arrayList11.get(i19)).f27981c = rj0Var.f27981c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(rj0Var);
                        }
                    }
                }
                q0.a aVar = sj0Var.f28260w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                sj0Var.a();
                return;
            default:
                go0 go0Var = (go0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = go0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = go0Var.L()) < go0Var.h()) {
                    arrayList12.remove(indexOf);
                    go0Var.u(L + 1 + indexOf);
                    int size6 = go0Var.f9754j0.e.size();
                    int size7 = arrayList12.size();
                    if (go0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        go0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
