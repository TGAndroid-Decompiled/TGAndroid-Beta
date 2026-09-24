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
public final class cv implements Runnable {
    public final int f23394a;
    public final Object f23395b;
    public final Object f23396c;

    public cv(int i10, Object obj, Object obj2) {
        this.f23394a = i10;
        this.f23396c = obj;
        this.f23395b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        c70 c70Var;
        org.telegram.ui.hb hbVar;
        ci.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f23394a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f23395b;
        Object obj2 = this.f23396c;
        switch (i11) {
            case 0:
                MessagesController.getInstance(uv.U(((dv) obj2).f23716a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 1:
                MessagesController.getInstance(((fx) obj2).f24265a.f26229c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 2:
                TLObject tLObject = (TLObject) obj;
                lz lzVar = ((fx) obj2).f24265a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(lzVar.f26229c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(lzVar.f26229c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 3:
                dy dyVar = (dy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                dyVar.f23732s.f30707f = true;
                lz lzVar2 = dyVar.E;
                if (!lzVar2.f26268p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18348id))) {
                    lzVar2.f26268p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18348id));
                }
                dyVar.a(true);
                return;
            case 4:
                final ky kyVar = (ky) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                lz lzVar3 = kyVar.f25897a.F;
                if (!Arrays.equals(lzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(lzVar3.f26229c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                lzVar3.W0 = currentKeyboardLanguage;
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
                                ky kyVar2 = kyVar;
                                MediaDataController.getInstance(kyVar2.f25897a.F.f26229c1).searchStickerSets(true, str, new ai.c5(kyVar2, arrayList3, runnable, 7));
                                return;
                            default:
                                lz lzVar4 = kyVar.f25897a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar4.f26229c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = lzVar4.f26229c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18348id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ey(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18348id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18348id))) {
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
                                                        arrayList6.add(new ey(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18348id));
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
                }, new org.telegram.ui.oc(23, kyVar, str), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                ky kyVar2 = kyVar;
                                MediaDataController.getInstance(kyVar2.f25897a.F.f26229c1).searchStickerSets(true, str, new ai.c5(kyVar2, arrayList2, runnable, 7));
                                return;
                            default:
                                lz lzVar4 = kyVar.f25897a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar4.f26229c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = lzVar4.f26229c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18348id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ey(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18348id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18348id))) {
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
                                                        arrayList6.add(new ey(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18348id));
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
                }, new org.telegram.ui.oc(24, kyVar, arrayList), new org.telegram.ui.sa(kyVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 5:
                ArrayList arrayList4 = (ArrayList) obj;
                ly lyVar = ((ky) obj2).f25897a;
                lyVar.F.V.e(false);
                ArrayList arrayList5 = lyVar.f26215r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lyVar.E = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                lyVar.l();
                return;
            case 6:
                ((qy) obj2).F((String) obj, "", true, false, false);
                return;
            case 7:
                qy qyVar = (qy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                lz lzVar4 = qyVar.L;
                MessagesController.getInstance(lzVar4.f26229c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = lzVar4.f26229c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = qyVar.f27781w;
                qyVar.f27781w = null;
                qyVar.F(str2, "", false, false, false);
                return;
            case 8:
                wz wzVar = (wz) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                wzVar.c();
                wzVar.h(k8Var);
                a00 a00Var = wzVar.J;
                a00Var.f22477h1 = k8Var;
                a00Var.j();
                return;
            case 9:
                ((wz) obj2).J.f22472f1 = (zz) obj;
                return;
            case 10:
                ((d10) obj2).f23446z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 11:
                ((org.telegram.ui.oc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                return;
            case 12:
                v40 v40Var = (v40) obj2;
                Uri uri = (Uri) obj;
                v40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) v40Var.f28985a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.e = false;
                        m2Var.f33730f = false;
                        m2Var.f33729c = v40Var;
                        launchActivity.p0(m2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    v40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 13:
                v50 v50Var = (v50) obj2;
                q50 q50Var = (q50) obj;
                c60 c60Var = v50Var.H0;
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
                videoEditedInfo2.originalPath = v50Var.f29001a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = c60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = c60Var.f23191e1;
                videoEditedInfo3.estimatedDuration = c60Var.f23200k0;
                c60Var.f23191e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.f29001a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (q50Var != null) {
                    photoEntry.ttl = q50Var.f27506c;
                    photoEntry.effectId = q50Var.d;
                }
                o50 o50Var = c60Var.f23202n;
                VideoEditedInfo videoEditedInfo4 = c60Var.S;
                if (q50Var != null && !q50Var.f27504a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (q50Var != null) {
                    i10 = q50Var.f27505b;
                } else {
                    i10 = 0;
                }
                if (q50Var != null) {
                    j3 = q50Var.e;
                } else {
                    j3 = 0;
                }
                o50Var.q(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                v50 v50Var2 = (v50) ((org.telegram.ui.Cells.t6) obj2).f21195b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && v50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = v50Var2.A0;
                    arrayList6.add((Bitmap) hg.c.g(1, arrayList6));
                    return;
                }
                v50Var2.A0.add(bitmap);
                return;
            case 15:
                c70 c70Var2 = (c70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                c70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        c70Var2.f23228c.put(Long.valueOf(c70Var2.f23226b.admin_id), (TLRPC.User) vector.objects.get(0));
                        c70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                w60 w60Var = (w60) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (c70Var = w60Var.f29889a.f30257c).f23237j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = c70Var.f23226b;
                    org.telegram.ui.ub ubVar = hbVar.f34166a;
                    ArrayList arrayList7 = ubVar.f38386o0;
                    int size = arrayList7.size();
                    int i13 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f38385n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f38376f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.f38401y0.remove(tL_chatInviteExported.link);
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
                ((org.telegram.ui.fp) obj).presentFragment(new ProfileActivity(bundle2, null));
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
                na0 na0Var = (na0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = na0Var.U) != null) {
                    y0Var.run();
                }
                na0Var.U = null;
                return;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((pa0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 23:
                l.d dVar = (l.d) obj2;
                Runnable runnable = (Runnable) obj;
                dVar.getClass();
                runnable.run();
                ((HashMap) dVar.f13909a).remove(runnable);
                return;
            case 24:
                jh0 jh0Var = (jh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                jh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    jh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        jh0Var.a(false);
                        return;
                    }
                    jh0Var.d();
                    jh0Var.f25416c.Y2.N(true);
                    return;
                }
                return;
            case 25:
                oh0 oh0Var = (oh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = oh0Var.f27068a;
                int i14 = oh0Var.f27080x;
                int size3 = arrayList8.size();
                oh0Var.f27080x = size3;
                if (i14 != size3 && oh0Var.S != null) {
                    oh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    lh0 lh0Var = (lh0) arrayList9.get(i15);
                    if (lh0Var.f26099o && !lh0Var.f26100p) {
                        arrayList8.add(lh0Var);
                    } else if (oh0.j(lh0Var.f26088a, arrayList8) == null) {
                        oh0 oh0Var2 = lh0Var.f26108y;
                        float f7 = oh0Var2.N;
                        RectF rectF = lh0Var.f26090c;
                        RectF rectF2 = lh0Var.f26091f;
                        r90 r90Var = lh0Var.f26102r;
                        if (r90Var != null) {
                            r90Var.a();
                            lh0Var.f26104t = z15;
                            lh0Var.f26103s = z15;
                        }
                        lh0Var.f26099o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (rectF.right + 1.0f >= oh0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        lh0Var.f26092g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = lh0Var.f26088a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (oh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    lh0Var.e.d(0.0f, z14);
                                    arrayList8.add(lh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            lh0Var.e.d(0.0f, z14);
                            arrayList8.add(lh0Var);
                        }
                        z14 = true;
                        lh0Var.e.d(0.0f, z14);
                        arrayList8.add(lh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                oh0Var.invalidate();
                return;
            case 26:
                lh0 lh0Var2 = (lh0) obj;
                nh0 nh0Var = ((oh0) obj2).F;
                int i17 = lh0Var2.f26088a;
                RectF rectF3 = lh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.by0) nh0Var).f32497b, i17, rectF3.left, rectF3.top);
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
                qj0 qj0Var = (qj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = qj0Var.f27638r;
                qj0Var.f27637n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    pj0 pj0Var = (pj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((pj0) arrayList11.get(i19)).f27348a) == MessageObject.getObjectPeerId(pj0Var.f27348a)) {
                                if (pj0Var.f27350c > 0) {
                                    ((pj0) arrayList11.get(i19)).f27350c = pj0Var.f27350c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(pj0Var);
                        }
                    }
                }
                q0.a aVar = qj0Var.f27640w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                qj0Var.a();
                return;
        }
    }
}
