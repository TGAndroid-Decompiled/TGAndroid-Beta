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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class jy implements Runnable {
    public final int f25556a;
    public final Object f25557b;
    public final Object f25558c;

    public jy(int i10, Object obj, Object obj2) {
        this.f25556a = i10;
        this.f25557b = obj;
        this.f25558c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        e70 e70Var;
        org.telegram.ui.jb jbVar;
        ci.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int indexOf;
        int L;
        int i11 = this.f25556a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f25558c;
        Object obj2 = this.f25557b;
        switch (i11) {
            case 0:
                final ly lyVar = (ly) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                mz mzVar = lyVar.f26231a.F;
                if (!Arrays.equals(mzVar.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(mzVar.f26574c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                mzVar.W0 = currentKeyboardLanguage;
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
                                MediaDataController.getInstance(lyVar2.f26231a.F.f26574c1).searchStickerSets(true, str, new ai.c5(lyVar2, arrayList3, runnable, 7));
                                return;
                            default:
                                mz mzVar2 = lyVar.f26231a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar2.f26574c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = mzVar2.f26574c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
                                            if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f18356id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ey(tL_messages_stickerSet, tL_messages_stickerSet.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet.set.f18356id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18356id))) {
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
                                                        arrayList6.add(new ey(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18356id));
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
                }, new org.telegram.ui.qc(23, lyVar, str), new Utilities.Callback() {
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
                                MediaDataController.getInstance(lyVar2.f26231a.F.f26574c1).searchStickerSets(true, str, new ai.c5(lyVar2, arrayList2, runnable, 7));
                                return;
                            default:
                                mz mzVar2 = lyVar.f26231a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar2.f26574c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = mzVar2.f26574c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
                                            if (tL_messages_stickerSet != null && (stickerSet2 = tL_messages_stickerSet.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.f18356id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ey(tL_messages_stickerSet, tL_messages_stickerSet.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet.set.f18356id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18356id))) {
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
                                                        arrayList6.add(new ey(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18356id));
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
                }, new org.telegram.ui.qc(24, lyVar, arrayList), new org.telegram.ui.va(lyVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 1:
                ArrayList arrayList4 = (ArrayList) obj;
                my myVar = ((ly) obj2).f26231a;
                myVar.F.V.e(false);
                ArrayList arrayList5 = myVar.f26558r;
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
            case 2:
                ((ry) obj2).F((String) obj, "", true, false, false);
                return;
            case 3:
                ry ryVar = (ry) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                int i12 = ryVar.L.f26574c1;
                MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = ryVar.f28108w;
                ryVar.f28108w = null;
                ryVar.F(str2, "", false, false, false);
                return;
            case 4:
                xz xzVar = (xz) obj2;
                ci.j8 j8Var = (ci.j8) obj;
                xzVar.c();
                xzVar.h(j8Var);
                b00 b00Var = xzVar.J;
                b00Var.f22830h1 = j8Var;
                b00Var.j();
                return;
            case 5:
                ((xz) obj2).J.f22825f1 = (a00) obj;
                return;
            case 6:
                ((e10) obj2).f23838z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 7:
                ((org.telegram.ui.qc) obj2).run((org.telegram.ui.ActionBar.o2) obj);
                return;
            case 8:
                x40 x40Var = (x40) obj2;
                Uri uri = (Uri) obj;
                x40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) x40Var.f30246a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? o2Var = new org.telegram.ui.ActionBar.o2(bundle);
                        o2Var.e = false;
                        o2Var.f34520f = false;
                        o2Var.f34519c = x40Var;
                        launchActivity.p0(o2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    x40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 9:
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
                videoEditedInfo2.originalPath = x50Var.f30261a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = e60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = e60Var.f23906e1;
                videoEditedInfo3.estimatedDuration = e60Var.f23915k0;
                e60Var.f23906e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, x50Var.f30261a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (s50Var != null) {
                    photoEntry.ttl = s50Var.f28164c;
                    photoEntry.effectId = s50Var.d;
                }
                q50 q50Var = e60Var.f23917n;
                VideoEditedInfo videoEditedInfo4 = e60Var.S;
                if (s50Var != null && !s50Var.f28162a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (s50Var != null) {
                    i10 = s50Var.f28163b;
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
            case 10:
                Bitmap bitmap = (Bitmap) obj;
                x50 x50Var2 = (x50) ((org.telegram.ui.Cells.t6) obj2).f21211b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && x50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = x50Var2.A0;
                    arrayList6.add((Bitmap) hg.k0.g(1, arrayList6));
                    return;
                }
                x50Var2.A0.add(bitmap);
                return;
            case 11:
                e70 e70Var2 = (e70) obj2;
                TLObject tLObject = (TLObject) obj;
                e70Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        e70Var2.f23942c.put(Long.valueOf(e70Var2.f23940b.admin_id), (TLRPC.User) vector.objects.get(0));
                        e70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                y60 y60Var = (y60) obj2;
                if (((TLRPC.TL_error) obj) == null && (jbVar = (e70Var = y60Var.f30592a.f30861c).f23951j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = e70Var.f23940b;
                    org.telegram.ui.wb wbVar = jbVar.f34685a;
                    ArrayList arrayList7 = wbVar.f38887o0;
                    int size = arrayList7.size();
                    int i13 = wbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.wb.L0(wbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.f38886n0, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f38877f, wbVar.T, true).contentType >= 0) {
                        wbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            wbVar.C0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.E;
                            sbVar.s(sbVar.h, size2);
                            org.telegram.ui.wb.K0(wbVar);
                        }
                        wbVar.f38902y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((o70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 14:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.gp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 15:
                k90 k90Var = (k90) obj2;
                if (k90Var.O0 == ((q90) obj)) {
                    k90Var.performLongClick();
                    k90Var.O0 = null;
                    k90Var.M0.d(true);
                    return;
                }
                return;
            case 16:
                ((m90) obj2).l((t90) obj, false);
                return;
            case 17:
                oa0 oa0Var = (oa0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = oa0Var.U) != null) {
                    y0Var.run();
                }
                oa0Var.U = null;
                return;
            case 18:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((qa0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 19:
                pb.c cVar = (pb.c) obj2;
                Runnable runnable = (Runnable) obj;
                cVar.getClass();
                runnable.run();
                cVar.f41015a.remove(runnable);
                return;
            case 20:
                lh0 lh0Var = (lh0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                lh0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
                    lh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        lh0Var.a(false);
                        return;
                    }
                    lh0Var.d();
                    lh0Var.f26051c.Y2.N(true);
                    return;
                }
                return;
            case 21:
                qh0 qh0Var = (qh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = qh0Var.f27730a;
                int i14 = qh0Var.f27742x;
                int size3 = arrayList8.size();
                qh0Var.f27742x = size3;
                if (i14 != size3 && qh0Var.S != null) {
                    qh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    nh0 nh0Var = (nh0) arrayList9.get(i15);
                    if (nh0Var.f26829o && !nh0Var.f26830p) {
                        arrayList8.add(nh0Var);
                    } else if (qh0.j(nh0Var.f26818a, arrayList8) == null) {
                        qh0 qh0Var2 = nh0Var.f26838y;
                        float f7 = qh0Var2.N;
                        RectF rectF = nh0Var.f26820c;
                        RectF rectF2 = nh0Var.f26821f;
                        t90 t90Var = nh0Var.f26832r;
                        if (t90Var != null) {
                            t90Var.a();
                            nh0Var.f26834t = z15;
                            nh0Var.f26833s = z15;
                        }
                        nh0Var.f26829o = z16;
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
                        nh0Var.f26822g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = nh0Var.f26818a;
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
            case 22:
                nh0 nh0Var2 = (nh0) obj;
                ph0 ph0Var = ((qh0) obj2).F;
                int i17 = nh0Var2.f26818a;
                RectF rectF3 = nh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ey0) ph0Var).f33351b, i17, rectF3.left, rectF3.top);
                return;
            case 23:
                ViewParent viewParent = (ViewParent) obj;
                ((org.telegram.ui.Cells.u1) obj2).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 24:
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
            case 25:
                sj0 sj0Var = (sj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = sj0Var.f28276r;
                sj0Var.f28275n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    rj0 rj0Var = (rj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((rj0) arrayList11.get(i19)).f28017a) == MessageObject.getObjectPeerId(rj0Var.f28017a)) {
                                if (rj0Var.f28019c > 0) {
                                    ((rj0) arrayList11.get(i19)).f28019c = rj0Var.f28019c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(rj0Var);
                        }
                    }
                }
                q0.a aVar = sj0Var.f28278w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                sj0Var.a();
                return;
            case 26:
                fo0 fo0Var = (fo0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = fo0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = fo0Var.L()) < fo0Var.h()) {
                    arrayList12.remove(indexOf);
                    fo0Var.u(L + 1 + indexOf);
                    int size6 = fo0Var.f9760j0.e.size();
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
            case 27:
                ((fo0) obj2).T();
                xc.a0((org.telegram.ui.ty) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            case 28:
                ((qo0) obj2).sendAccessibilityEvent((View) obj, 4);
                return;
            default:
                ff ffVar = (ff) obj2;
                org.telegram.ui.xn xnVar = (org.telegram.ui.xn) obj;
                if (xnVar != null) {
                    xnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    return;
                }
                return;
        }
    }
}
