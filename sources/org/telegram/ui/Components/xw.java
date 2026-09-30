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
public final class xw implements Runnable {
    public final int f30524a;
    public final Object f30525b;
    public final Object f30526c;

    public xw(int i10, Object obj, Object obj2) {
        this.f30524a = i10;
        this.f30525b = obj;
        this.f30526c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        f70 f70Var;
        org.telegram.ui.hb hbVar;
        ci.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int indexOf;
        int L;
        int i11 = this.f30524a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f30526c;
        Object obj2 = this.f30525b;
        switch (i11) {
            case 0:
                MessagesController.getInstance(((hx) obj2).f24958a.f26818c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 1:
                TLObject tLObject = (TLObject) obj;
                nz nzVar = ((hx) obj2).f24958a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(nzVar.f26818c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(nzVar.f26818c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 2:
                fy fyVar = (fy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                fyVar.f24384s.f22727f = true;
                nz nzVar2 = fyVar.E;
                if (!nzVar2.f26857p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18379id))) {
                    nzVar2.f26857p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18379id));
                }
                fyVar.a(true);
                return;
            case 3:
                final my myVar = (my) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                nz nzVar3 = myVar.f26465a.F;
                if (!Arrays.equals(nzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(nzVar3.f26818c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                nzVar3.W0 = currentKeyboardLanguage;
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
                                my myVar2 = myVar;
                                MediaDataController.getInstance(myVar2.f26465a.F.f26818c1).searchStickerSets(true, str, new ai.c5(myVar2, arrayList3, runnable, 7));
                                return;
                            default:
                                nz nzVar4 = myVar.f26465a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(nzVar4.f26818c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = nzVar4.f26818c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18379id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new gy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18379id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18379id))) {
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
                                                        arrayList6.add(new gy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18379id));
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
                }, new org.telegram.ui.oc(23, myVar, str), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                my myVar2 = myVar;
                                MediaDataController.getInstance(myVar2.f26465a.F.f26818c1).searchStickerSets(true, str, new ai.c5(myVar2, arrayList2, runnable, 7));
                                return;
                            default:
                                nz nzVar4 = myVar.f26465a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(nzVar4.f26818c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = nzVar4.f26818c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18379id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new gy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18379id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18379id))) {
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
                                                        arrayList6.add(new gy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18379id));
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
                }, new org.telegram.ui.oc(24, myVar, arrayList), new org.telegram.ui.sa(myVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 4:
                ArrayList arrayList4 = (ArrayList) obj;
                ny nyVar = ((my) obj2).f26465a;
                nyVar.F.V.e(false);
                ArrayList arrayList5 = nyVar.f26802r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nyVar.E = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                nyVar.l();
                return;
            case 5:
                ((sy) obj2).F((String) obj, "", true, false, false);
                return;
            case 6:
                sy syVar = (sy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                nz nzVar4 = syVar.L;
                MessagesController.getInstance(nzVar4.f26818c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = nzVar4.f26818c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = syVar.f28367w;
                syVar.f28367w = null;
                syVar.F(str2, "", false, false, false);
                return;
            case 7:
                yz yzVar = (yz) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                yzVar.c();
                yzVar.h(k8Var);
                c00 c00Var = yzVar.J;
                c00Var.f23080h1 = k8Var;
                c00Var.j();
                return;
            case 8:
                ((yz) obj2).J.f23075f1 = (b00) obj;
                return;
            case 9:
                ((f10) obj2).f24123z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 10:
                ((org.telegram.ui.oc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                return;
            case 11:
                y40 y40Var = (y40) obj2;
                Uri uri = (Uri) obj;
                y40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) y40Var.f30580a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.e = false;
                        m2Var.f33886f = false;
                        m2Var.f33885c = y40Var;
                        launchActivity.p0(m2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    y40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 12:
                y50 y50Var = (y50) obj2;
                t50 t50Var = (t50) obj;
                f60 f60Var = y50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                f60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, f60Var.Q);
                VideoEditedInfo videoEditedInfo2 = f60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = f60Var.M;
                videoEditedInfo2.encryptedFile = f60Var.N;
                videoEditedInfo2.key = f60Var.O;
                videoEditedInfo2.iv = f60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = y50Var.f30596a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = f60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = f60Var.f24190e1;
                videoEditedInfo3.estimatedDuration = f60Var.f24199k0;
                f60Var.f24190e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, y50Var.f30596a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (t50Var != null) {
                    photoEntry.ttl = t50Var.f28426c;
                    photoEntry.effectId = t50Var.d;
                }
                r50 r50Var = f60Var.f24201n;
                VideoEditedInfo videoEditedInfo4 = f60Var.S;
                if (t50Var != null && !t50Var.f28424a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (t50Var != null) {
                    i10 = t50Var.f28425b;
                } else {
                    i10 = 0;
                }
                if (t50Var != null) {
                    j3 = t50Var.e;
                } else {
                    j3 = 0;
                }
                r50Var.q(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 13:
                Bitmap bitmap = (Bitmap) obj;
                y50 y50Var2 = (y50) ((org.telegram.ui.Cells.t6) obj2).f21231b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && y50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = y50Var2.A0;
                    arrayList6.add((Bitmap) hg.c.g(1, arrayList6));
                    return;
                }
                y50Var2.A0.add(bitmap);
                return;
            case 14:
                f70 f70Var2 = (f70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                f70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        f70Var2.f24227c.put(Long.valueOf(f70Var2.f24225b.admin_id), (TLRPC.User) vector.objects.get(0));
                        f70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                z60 z60Var = (z60) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (f70Var = z60Var.f30901a.f22577c).f24236j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = f70Var.f24225b;
                    org.telegram.ui.ub ubVar = hbVar.f34272a;
                    ArrayList arrayList7 = ubVar.f38495o0;
                    int size = arrayList7.size();
                    int i13 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f38494n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f38485f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.f38510y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((p70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 17:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.fp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 18:
                l90 l90Var = (l90) obj2;
                if (l90Var.O0 == ((r90) obj)) {
                    l90Var.performLongClick();
                    l90Var.O0 = null;
                    l90Var.M0.d(true);
                    return;
                }
                return;
            case 19:
                ((n90) obj2).l((u90) obj, false);
                return;
            case 20:
                qa0 qa0Var = (qa0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = qa0Var.U) != null) {
                    y0Var.run();
                }
                qa0Var.U = null;
                return;
            case 21:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((sa0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 22:
                l.d dVar = (l.d) obj2;
                Runnable runnable = (Runnable) obj;
                dVar.getClass();
                runnable.run();
                ((HashMap) dVar.f13940a).remove(runnable);
                return;
            case 23:
                mh0 mh0Var = (mh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                mh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    mh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        mh0Var.a(false);
                        return;
                    }
                    mh0Var.d();
                    mh0Var.f26291c.f28778f3.N(true);
                    return;
                }
                return;
            case 24:
                rh0 rh0Var = (rh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = rh0Var.f28013a;
                int i14 = rh0Var.f28025x;
                int size3 = arrayList8.size();
                rh0Var.f28025x = size3;
                if (i14 != size3 && rh0Var.S != null) {
                    rh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    oh0 oh0Var = (oh0) arrayList9.get(i15);
                    if (oh0Var.f27093o && !oh0Var.f27094p) {
                        arrayList8.add(oh0Var);
                    } else if (rh0.j(oh0Var.f27082a, arrayList8) == null) {
                        rh0 rh0Var2 = oh0Var.f27102y;
                        float f7 = rh0Var2.N;
                        RectF rectF = oh0Var.f27084c;
                        RectF rectF2 = oh0Var.f27085f;
                        u90 u90Var = oh0Var.f27096r;
                        if (u90Var != null) {
                            u90Var.a();
                            oh0Var.f27098t = z15;
                            oh0Var.f27097s = z15;
                        }
                        oh0Var.f27093o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (rectF.right + 1.0f >= rh0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        oh0Var.f27086g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = oh0Var.f27082a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (rh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    oh0Var.e.d(0.0f, z14);
                                    arrayList8.add(oh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            oh0Var.e.d(0.0f, z14);
                            arrayList8.add(oh0Var);
                        }
                        z14 = true;
                        oh0Var.e.d(0.0f, z14);
                        arrayList8.add(oh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                rh0Var.invalidate();
                return;
            case 25:
                oh0 oh0Var2 = (oh0) obj;
                qh0 qh0Var = ((rh0) obj2).F;
                int i17 = oh0Var2.f27082a;
                RectF rectF3 = oh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.by0) qh0Var).f32597b, i17, rectF3.left, rectF3.top);
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
                tj0 tj0Var = (tj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = tj0Var.f28546r;
                tj0Var.f28545n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    sj0 sj0Var = (sj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((sj0) arrayList11.get(i19)).f28274a) == MessageObject.getObjectPeerId(sj0Var.f28274a)) {
                                if (sj0Var.f28276c > 0) {
                                    ((sj0) arrayList11.get(i19)).f28276c = sj0Var.f28276c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(sj0Var);
                        }
                    }
                }
                q0.a aVar = tj0Var.f28548w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                tj0Var.a();
                return;
            default:
                ho0 ho0Var = (ho0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = ho0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = ho0Var.L()) < ho0Var.h()) {
                    arrayList12.remove(indexOf);
                    ho0Var.u(L + 1 + indexOf);
                    int size6 = ho0Var.f9766j0.e.size();
                    int size7 = arrayList12.size();
                    if (ho0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        ho0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
