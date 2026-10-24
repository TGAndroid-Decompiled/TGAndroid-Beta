package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class wt implements Runnable {
    public final int f32345a;
    public final Object f32346b;
    public final Object f32347c;

    public wt(int i10, Object obj, Object obj2) {
        this.f32345a = i10;
        this.f32346b = obj;
        this.f32347c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j10;
        k70 k70Var;
        org.telegram.ui.ib ibVar;
        ai.y7 y7Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f32345a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f32347c;
        Object obj2 = this.f32346b;
        switch (i11) {
            case 0:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 1:
                MessagesController.getInstance(yv.e0(((gv) obj2).f26793a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 2:
                MessagesController.getInstance(((jx) obj2).f27809a.f30310c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 3:
                TLObject tLObject = (TLObject) obj;
                rz rzVar = ((jx) obj2).f27809a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(rzVar.f30310c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(rzVar.f30310c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 4:
                hy hyVar = (hy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                hyVar.f27201w.f25858f = true;
                rz rzVar2 = hyVar.G;
                if (!rzVar2.f30349p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20371id))) {
                    rzVar2.f30349p1.add(Long.valueOf(tL_messages_stickerSet2.set.f20371id));
                }
                hyVar.a(true);
                return;
            case 5:
                final qy qyVar = (qy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                rz rzVar3 = qyVar.f30009a.F;
                if (!Arrays.equals(rzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(rzVar3.f30310c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                rzVar3.W0 = currentKeyboardLanguage;
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
                                qy qyVar2 = qyVar;
                                MediaDataController.getInstance(qyVar2.f30009a.F.f30310c1).searchStickerSets(true, str, new ai.a4(qyVar2, arrayList3, runnable, 8));
                                return;
                            default:
                                rz rzVar4 = qyVar.f30009a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(rzVar4.f30310c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = rzVar4.f30310c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20371id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new iy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20371id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20371id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new iy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20371id));
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
                }, new org.telegram.ui.ActionBar.m3(29, qyVar, str), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                qy qyVar2 = qyVar;
                                MediaDataController.getInstance(qyVar2.f30009a.F.f30310c1).searchStickerSets(true, str, new ai.a4(qyVar2, arrayList2, runnable, 8));
                                return;
                            default:
                                rz rzVar4 = qyVar.f30009a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(rzVar4.f30310c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = rzVar4.f30310c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20371id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new iy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20371id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20371id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new iy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20371id));
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
                }, new oy(0, qyVar, arrayList), new ai.f3(qyVar, str, arrayList, arrayList2, arrayList3, 4));
                return;
            case 6:
                ArrayList arrayList4 = (ArrayList) obj;
                ry ryVar = ((qy) obj2).f30009a;
                ryVar.F.V.e(false);
                ArrayList arrayList5 = ryVar.f30293r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ryVar.E = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                ryVar.l();
                return;
            case 7:
                ((wy) obj2).F((String) obj, "", true, false, false);
                return;
            case 8:
                wy wyVar = (wy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                int i12 = wyVar.L.f30310c1;
                MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = wyVar.f32438w;
                wyVar.f32438w = null;
                wyVar.F(str2, "", false, false, false);
                return;
            case 9:
                c00 c00Var = (c00) obj2;
                ei.z7 z7Var = (ei.z7) obj;
                c00Var.c();
                c00Var.h(z7Var);
                g00 g00Var = c00Var.J;
                g00Var.f26478h1 = z7Var;
                g00Var.j();
                return;
            case 10:
                ((c00) obj2).J.f26473f1 = (f00) obj;
                return;
            case 11:
                ((i10) obj2).f27246z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 12:
                ((oy) obj2).run((org.telegram.ui.ActionBar.o2) obj);
                return;
            case 13:
                c50 c50Var = (c50) obj2;
                Uri uri = (Uri) obj;
                c50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) c50Var.f25185a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? o2Var = new org.telegram.ui.ActionBar.o2(bundle);
                        o2Var.e = false;
                        o2Var.f43658f = false;
                        o2Var.f43657c = c50Var;
                        launchActivity.u0(o2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    c50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 14:
                d60 d60Var = (d60) obj2;
                y50 y50Var = (y50) obj;
                l60 l60Var = d60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                l60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, l60Var.Q);
                VideoEditedInfo videoEditedInfo2 = l60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = l60Var.M;
                videoEditedInfo2.encryptedFile = l60Var.N;
                videoEditedInfo2.key = l60Var.O;
                videoEditedInfo2.iv = l60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = d60Var.f25574a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = l60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = l60Var.f28198j1;
                videoEditedInfo3.estimatedDuration = l60Var.f28199k0;
                l60Var.f28198j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, d60Var.f25574a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (y50Var != null) {
                    photoEntry.ttl = y50Var.f32824c;
                    photoEntry.effectId = y50Var.d;
                }
                w50 w50Var = l60Var.f28202n;
                VideoEditedInfo videoEditedInfo4 = l60Var.S;
                if (y50Var != null && !y50Var.f32822a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (y50Var != null) {
                    i10 = y50Var.f32823b;
                } else {
                    i10 = 0;
                }
                if (y50Var != null) {
                    j10 = y50Var.e;
                } else {
                    j10 = 0;
                }
                w50Var.s(photoEntry, videoEditedInfo4, z11, i10, 0, false, j10);
                return;
            case 15:
                Bitmap bitmap = (Bitmap) obj;
                d60 d60Var2 = (d60) ((org.telegram.ui.Cells.u5) obj2).f23736b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && d60Var2.A0.size() > 1) {
                    ArrayList arrayList6 = d60Var2.A0;
                    arrayList6.add((Bitmap) i2.o1.i(1, arrayList6));
                    return;
                }
                d60Var2.A0.add(bitmap);
                return;
            case 16:
                k70 k70Var2 = (k70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                k70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        k70Var2.f27912c.put(Long.valueOf(k70Var2.f27910b.admin_id), (TLRPC.User) vector.objects.get(0));
                        k70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                e70 e70Var = (e70) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (k70Var = e70Var.f25980a.f26217c).f27921j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = k70Var.f27910b;
                    org.telegram.ui.vb vbVar = ibVar.f38221a;
                    ArrayList arrayList7 = vbVar.f42664o0;
                    int size = arrayList7.size();
                    int i13 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.vb.L0(vbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.f42663n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f42654f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size2);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.f42679y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                ((v70) obj).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new l70(editTextBoldCursor, 1));
                return;
            case 19:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.yo) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 20:
                r90 r90Var = (r90) obj2;
                if (r90Var.O0 == ((x90) obj)) {
                    r90Var.performLongClick();
                    r90Var.O0 = null;
                    r90Var.M0.d(true);
                    return;
                }
                return;
            case 21:
                ((t90) obj2).l((aa0) obj, false);
                return;
            case 22:
                va0 va0Var = (va0) obj2;
                if (!((boolean[]) obj)[0] && (y7Var = va0Var.U) != null) {
                    y7Var.run();
                }
                va0Var.U = null;
                return;
            case 23:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                ((xa0) obj).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new l70(editTextBoldCursor2, 3));
                return;
            case 24:
                l2.f fVar = (l2.f) obj2;
                Runnable runnable = (Runnable) obj;
                fVar.getClass();
                runnable.run();
                ((HashMap) fVar.f15906b).remove(runnable);
                return;
            case 25:
                wh0 wh0Var = (wh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                wh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    wh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        wh0Var.a(false);
                        return;
                    }
                    wh0Var.d();
                    wh0Var.f32240c.Z2.N(true);
                    return;
                }
                return;
            case 26:
                bi0 bi0Var = (bi0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = bi0Var.f25007a;
                int i14 = bi0Var.f25019x;
                int size3 = arrayList8.size();
                bi0Var.f25019x = size3;
                if (i14 != size3 && bi0Var.S != null) {
                    bi0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    yh0 yh0Var = (yh0) arrayList9.get(i15);
                    if (yh0Var.f32927o && !yh0Var.f32928p) {
                        arrayList8.add(yh0Var);
                    } else if (bi0.j(yh0Var.f32916a, arrayList8) == null) {
                        bi0 bi0Var2 = yh0Var.f32936y;
                        float f7 = bi0Var2.N;
                        RectF rectF = yh0Var.f32918c;
                        RectF rectF2 = yh0Var.f32919f;
                        aa0 aa0Var = yh0Var.f32930r;
                        if (aa0Var != null) {
                            aa0Var.a();
                            yh0Var.f32932t = z15;
                            yh0Var.f32931s = z15;
                        }
                        yh0Var.f32927o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= bi0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        yh0Var.f32920g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = yh0Var.f32916a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (bi0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    yh0Var.e.d(0.0f, z14);
                                    arrayList8.add(yh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            yh0Var.e.d(0.0f, z14);
                            arrayList8.add(yh0Var);
                        }
                        z14 = true;
                        yh0Var.e.d(0.0f, z14);
                        arrayList8.add(yh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                bi0Var.invalidate();
                return;
            case 27:
                yh0 yh0Var2 = (yh0) obj;
                ai0 ai0Var = ((bi0) obj2).F;
                int i17 = yh0Var2.f32916a;
                RectF rectF3 = yh0Var2.d;
                ProfileActivity.d0(((org.telegram.ui.px0) ai0Var).f40646b, i17, rectF3.left, rectF3.top);
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
                fk0 fk0Var = (fk0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = fk0Var.f26341r;
                fk0Var.f26340n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    ek0 ek0Var = (ek0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((ek0) arrayList11.get(i19)).f26070a) == MessageObject.getObjectPeerId(ek0Var.f26070a)) {
                                if (ek0Var.f26072c > 0) {
                                    ((ek0) arrayList11.get(i19)).f26072c = ek0Var.f26072c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(ek0Var);
                        }
                    }
                }
                q0.a aVar = fk0Var.f26343w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                fk0Var.a();
                return;
        }
    }

    public wt(r71 r71Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32345a = i10;
        this.f32347c = r71Var;
        this.f32346b = editTextBoldCursor;
    }
}
