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
    public final int f30215a;
    public final Object f30216b;
    public final Object f30217c;

    public ww(int i10, Object obj, Object obj2) {
        this.f30215a = i10;
        this.f30216b = obj;
        this.f30217c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        d70 d70Var;
        org.telegram.ui.hb hbVar;
        ci.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int indexOf;
        int L;
        int i11 = this.f30215a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f30217c;
        Object obj2 = this.f30216b;
        switch (i11) {
            case 0:
                MessagesController.getInstance(((gx) obj2).f24595a.f26548c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 1:
                TLObject tLObject = (TLObject) obj;
                mz mzVar = ((gx) obj2).f24595a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(mzVar.f26548c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(mzVar.f26548c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 2:
                ey eyVar = (ey) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                eyVar.f24081s.f30994f = true;
                mz mzVar2 = eyVar.E;
                if (!mzVar2.f26587p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18362id))) {
                    mzVar2.f26587p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18362id));
                }
                eyVar.a(true);
                return;
            case 3:
                final ly lyVar = (ly) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                mz mzVar3 = lyVar.f26196a.F;
                if (!Arrays.equals(mzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(mzVar3.f26548c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
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
                                MediaDataController.getInstance(lyVar2.f26196a.F.f26548c1).searchStickerSets(true, str, new ai.c5(lyVar2, arrayList3, runnable, 7));
                                return;
                            default:
                                mz mzVar4 = lyVar.f26196a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.f26548c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = mzVar4.f26548c1;
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
                                MediaDataController.getInstance(lyVar2.f26196a.F.f26548c1).searchStickerSets(true, str, new ai.c5(lyVar2, arrayList2, runnable, 7));
                                return;
                            default:
                                mz mzVar4 = lyVar.f26196a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.f26548c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = mzVar4.f26548c1;
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
                my myVar = ((ly) obj2).f26196a;
                myVar.F.V.e(false);
                ArrayList arrayList5 = myVar.f26534r;
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
                MessagesController.getInstance(mzVar4.f26548c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = mzVar4.f26548c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = ryVar.f28085w;
                ryVar.f28085w = null;
                ryVar.F(str2, "", false, false, false);
                return;
            case 7:
                xz xzVar = (xz) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                xzVar.c();
                xzVar.h(k8Var);
                b00 b00Var = xzVar.J;
                b00Var.f22813h1 = k8Var;
                b00Var.j();
                return;
            case 8:
                ((xz) obj2).J.f22808f1 = (a00) obj;
                return;
            case 9:
                ((e10) obj2).f23830z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 10:
                ((org.telegram.ui.oc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                return;
            case 11:
                w40 w40Var = (w40) obj2;
                Uri uri = (Uri) obj;
                w40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) w40Var.f29841a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.e = false;
                        m2Var.f33744f = false;
                        m2Var.f33743c = w40Var;
                        launchActivity.p0(m2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    w40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 12:
                w50 w50Var = (w50) obj2;
                r50 r50Var = (r50) obj;
                d60 d60Var = w50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                d60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, d60Var.Q);
                VideoEditedInfo videoEditedInfo2 = d60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = d60Var.M;
                videoEditedInfo2.encryptedFile = d60Var.N;
                videoEditedInfo2.key = d60Var.O;
                videoEditedInfo2.iv = d60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = w50Var.f29854a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = d60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = d60Var.f23558e1;
                videoEditedInfo3.estimatedDuration = d60Var.f23567k0;
                d60Var.f23558e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w50Var.f29854a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (r50Var != null) {
                    photoEntry.ttl = r50Var.f27832c;
                    photoEntry.effectId = r50Var.d;
                }
                p50 p50Var = d60Var.f23569n;
                VideoEditedInfo videoEditedInfo4 = d60Var.S;
                if (r50Var != null && !r50Var.f27830a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (r50Var != null) {
                    i10 = r50Var.f27831b;
                } else {
                    i10 = 0;
                }
                if (r50Var != null) {
                    j3 = r50Var.e;
                } else {
                    j3 = 0;
                }
                p50Var.q(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 13:
                Bitmap bitmap = (Bitmap) obj;
                w50 w50Var2 = (w50) ((org.telegram.ui.Cells.t6) obj2).f21209b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && w50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = w50Var2.A0;
                    arrayList6.add((Bitmap) hg.c.g(1, arrayList6));
                    return;
                }
                w50Var2.A0.add(bitmap);
                return;
            case 14:
                d70 d70Var2 = (d70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                d70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        d70Var2.f23595c.put(Long.valueOf(d70Var2.f23593b.admin_id), (TLRPC.User) vector.objects.get(0));
                        d70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 15:
                x60 x60Var = (x60) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (d70Var = x60Var.f30278a.f30574c).f23604j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = d70Var.f23593b;
                    org.telegram.ui.ub ubVar = hbVar.f34178a;
                    ArrayList arrayList7 = ubVar.f38404o0;
                    int size = arrayList7.size();
                    int i13 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ub.L0(ubVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.f38403n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f38394f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.f38419y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((n70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 17:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.fp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 18:
                j90 j90Var = (j90) obj2;
                if (j90Var.O0 == ((p90) obj)) {
                    j90Var.performLongClick();
                    j90Var.O0 = null;
                    j90Var.M0.d(true);
                    return;
                }
                return;
            case 19:
                ((l90) obj2).l((s90) obj, false);
                return;
            case 20:
                oa0 oa0Var = (oa0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = oa0Var.U) != null) {
                    y0Var.run();
                }
                oa0Var.U = null;
                return;
            case 21:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((qa0) obj2).setFocusable(true);
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
                kh0 kh0Var = (kh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                kh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    kh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        kh0Var.a(false);
                        return;
                    }
                    kh0Var.d();
                    kh0Var.f25728c.Y2.N(true);
                    return;
                }
                return;
            case 24:
                ph0 ph0Var = (ph0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = ph0Var.f27379a;
                int i14 = ph0Var.f27391x;
                int size3 = arrayList8.size();
                ph0Var.f27391x = size3;
                if (i14 != size3 && ph0Var.S != null) {
                    ph0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    mh0 mh0Var = (mh0) arrayList9.get(i15);
                    if (mh0Var.f26415o && !mh0Var.f26416p) {
                        arrayList8.add(mh0Var);
                    } else if (ph0.j(mh0Var.f26404a, arrayList8) == null) {
                        ph0 ph0Var2 = mh0Var.f26424y;
                        float f7 = ph0Var2.N;
                        RectF rectF = mh0Var.f26406c;
                        RectF rectF2 = mh0Var.f26407f;
                        s90 s90Var = mh0Var.f26418r;
                        if (s90Var != null) {
                            s90Var.a();
                            mh0Var.f26420t = z15;
                            mh0Var.f26419s = z15;
                        }
                        mh0Var.f26415o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (rectF.right + 1.0f >= ph0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        mh0Var.f26408g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = mh0Var.f26404a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (ph0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    mh0Var.e.d(0.0f, z14);
                                    arrayList8.add(mh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            mh0Var.e.d(0.0f, z14);
                            arrayList8.add(mh0Var);
                        }
                        z14 = true;
                        mh0Var.e.d(0.0f, z14);
                        arrayList8.add(mh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                ph0Var.invalidate();
                return;
            case 25:
                mh0 mh0Var2 = (mh0) obj;
                oh0 oh0Var = ((ph0) obj2).F;
                int i17 = mh0Var2.f26404a;
                RectF rectF3 = mh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.by0) oh0Var).f32510b, i17, rectF3.left, rectF3.top);
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
                rj0 rj0Var = (rj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = rj0Var.f27940r;
                rj0Var.f27939n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    qj0 qj0Var = (qj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((qj0) arrayList11.get(i19)).f27694a) == MessageObject.getObjectPeerId(qj0Var.f27694a)) {
                                if (qj0Var.f27696c > 0) {
                                    ((qj0) arrayList11.get(i19)).f27696c = qj0Var.f27696c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(qj0Var);
                        }
                    }
                }
                q0.a aVar = rj0Var.f27942w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                rj0Var.a();
                return;
            default:
                fo0 fo0Var = (fo0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = fo0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = fo0Var.L()) < fo0Var.h()) {
                    arrayList12.remove(indexOf);
                    fo0Var.u(L + 1 + indexOf);
                    int size6 = fo0Var.f9754j0.e.size();
                    int size7 = arrayList12.size();
                    if (fo0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        fo0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
