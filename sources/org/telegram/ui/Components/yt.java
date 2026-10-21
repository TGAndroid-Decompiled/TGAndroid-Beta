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
public final class yt implements Runnable {
    public final int f32727a;
    public final Object f32728b;
    public final Object f32729c;

    public yt(int i10, Object obj, Object obj2) {
        this.f32727a = i10;
        this.f32728b = obj;
        this.f32729c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j10;
        l70 l70Var;
        org.telegram.ui.ib ibVar;
        ai.y7 y7Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f32727a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f32729c;
        Object obj2 = this.f32728b;
        switch (i11) {
            case 0:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 1:
                MessagesController.getInstance(aw.V(((iv) obj2).f27339a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 2:
                MessagesController.getInstance(((lx) obj2).f28317a.f30723c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 3:
                TLObject tLObject = (TLObject) obj;
                tz tzVar = ((lx) obj2).f28317a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(tzVar.f30723c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(tzVar.f30723c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 4:
                jy jyVar = (jy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                jyVar.f27674s.f26437f = true;
                tz tzVar2 = jyVar.E;
                if (!tzVar2.f30762p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20303id))) {
                    tzVar2.f30762p1.add(Long.valueOf(tL_messages_stickerSet2.set.f20303id));
                }
                jyVar.a(true);
                return;
            case 5:
                final sy syVar = (sy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                tz tzVar3 = syVar.f30373a.F;
                if (!Arrays.equals(tzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(tzVar3.f30723c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                tzVar3.W0 = currentKeyboardLanguage;
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
                                sy syVar2 = syVar;
                                MediaDataController.getInstance(syVar2.f30373a.F.f30723c1).searchStickerSets(true, str, new ai.a4(syVar2, arrayList3, runnable, 8));
                                return;
                            default:
                                tz tzVar4 = syVar.f30373a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.f30723c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = tzVar4.f30723c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20303id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20303id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20303id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new ky(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20303id));
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
                }, new org.telegram.ui.ActionBar.j3(29, syVar, str), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                sy syVar2 = syVar;
                                MediaDataController.getInstance(syVar2.f30373a.F.f30723c1).searchStickerSets(true, str, new ai.a4(syVar2, arrayList2, runnable, 8));
                                return;
                            default:
                                tz tzVar4 = syVar.f30373a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.f30723c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = tzVar4.f30723c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20303id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20303id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20303id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new ky(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20303id));
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
                }, new qy(0, syVar, arrayList), new ai.f3(syVar, str, arrayList, arrayList2, arrayList3, 4));
                return;
            case 6:
                ArrayList arrayList4 = (ArrayList) obj;
                ty tyVar = ((sy) obj2).f30373a;
                tyVar.F.V.e(false);
                ArrayList arrayList5 = tyVar.f30709r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tyVar.E = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                tyVar.l();
                return;
            case 7:
                ((yy) obj2).F((String) obj, "", true, false, false);
                return;
            case 8:
                yy yyVar = (yy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                tz tzVar4 = yyVar.L;
                MessagesController.getInstance(tzVar4.f30723c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = tzVar4.f30723c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = yyVar.f32764w;
                yyVar.f32764w = null;
                yyVar.F(str2, "", false, false, false);
                return;
            case 9:
                e00 e00Var = (e00) obj2;
                ei.z7 z7Var = (ei.z7) obj;
                e00Var.c();
                e00Var.h(z7Var);
                i00 i00Var = e00Var.J;
                i00Var.f27043h1 = z7Var;
                i00Var.j();
                return;
            case 10:
                ((e00) obj2).J.f27038f1 = (h00) obj;
                return;
            case 11:
                ((k10) obj2).f27719z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 12:
                ((qy) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                return;
            case 13:
                e50 e50Var = (e50) obj2;
                Uri uri = (Uri) obj;
                e50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) e50Var.f25720a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.e = false;
                        n2Var.f42351f = false;
                        n2Var.f42350c = e50Var;
                        launchActivity.t0(n2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    e50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 14:
                f60 f60Var = (f60) obj2;
                a60 a60Var = (a60) obj;
                m60 m60Var = f60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                m60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, m60Var.Q);
                VideoEditedInfo videoEditedInfo2 = m60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = m60Var.M;
                videoEditedInfo2.encryptedFile = m60Var.N;
                videoEditedInfo2.key = m60Var.O;
                videoEditedInfo2.iv = m60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = f60Var.f26092a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = m60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = m60Var.f28417j1;
                videoEditedInfo3.estimatedDuration = m60Var.f28418k0;
                m60Var.f28417j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, f60Var.f26092a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (a60Var != null) {
                    photoEntry.ttl = a60Var.f24526c;
                    photoEntry.effectId = a60Var.d;
                }
                y50 y50Var = m60Var.f28421n;
                VideoEditedInfo videoEditedInfo4 = m60Var.S;
                if (a60Var != null && !a60Var.f24524a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (a60Var != null) {
                    i10 = a60Var.f24525b;
                } else {
                    i10 = 0;
                }
                if (a60Var != null) {
                    j10 = a60Var.e;
                } else {
                    j10 = 0;
                }
                y50Var.s(photoEntry, videoEditedInfo4, z11, i10, 0, false, j10);
                return;
            case 15:
                Bitmap bitmap = (Bitmap) obj;
                f60 f60Var2 = (f60) ((org.telegram.ui.Cells.k7) obj2).f22512b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && f60Var2.A0.size() > 1) {
                    ArrayList arrayList6 = f60Var2.A0;
                    arrayList6.add((Bitmap) i2.e.h(1, arrayList6));
                    return;
                }
                f60Var2.A0.add(bitmap);
                return;
            case 16:
                l70 l70Var2 = (l70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                l70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        l70Var2.f28070c.put(Long.valueOf(l70Var2.f28068b.admin_id), (TLRPC.User) vector.objects.get(0));
                        l70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                f70 f70Var = (f70) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (l70Var = f70Var.f26136a.f26520c).f28079j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = l70Var.f28068b;
                    org.telegram.ui.vb vbVar = ibVar.f37910a;
                    ArrayList arrayList7 = vbVar.f42178o0;
                    int size = arrayList7.size();
                    int i13 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.vb.L0(vbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.f42177n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f42168f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size2);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.f42193y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                ((v70) obj).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(2, editTextBoldCursor));
                return;
            case 19:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.wo) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 20:
                s90 s90Var = (s90) obj2;
                if (s90Var.O0 == ((y90) obj)) {
                    s90Var.performLongClick();
                    s90Var.O0 = null;
                    s90Var.M0.d(true);
                    return;
                }
                return;
            case 21:
                ((u90) obj2).l((ba0) obj, false);
                return;
            case 22:
                wa0 wa0Var = (wa0) obj2;
                if (!((boolean[]) obj)[0] && (y7Var = wa0Var.U) != null) {
                    y7Var.run();
                }
                wa0Var.U = null;
                return;
            case 23:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                ((ya0) obj).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, editTextBoldCursor2));
                return;
            case 24:
                l2.f fVar = (l2.f) obj2;
                Runnable runnable = (Runnable) obj;
                fVar.getClass();
                runnable.run();
                ((HashMap) fVar.f15843b).remove(runnable);
                return;
            case 25:
                uh0 uh0Var = (uh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                uh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    uh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        uh0Var.a(false);
                        return;
                    }
                    uh0Var.d();
                    uh0Var.f30936c.W2.N(true);
                    return;
                }
                return;
            case 26:
                zh0 zh0Var = (zh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = zh0Var.f32902a;
                int i14 = zh0Var.f32914x;
                int size3 = arrayList8.size();
                zh0Var.f32914x = size3;
                if (i14 != size3 && zh0Var.S != null) {
                    zh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    wh0 wh0Var = (wh0) arrayList9.get(i15);
                    if (wh0Var.f32117o && !wh0Var.f32118p) {
                        arrayList8.add(wh0Var);
                    } else if (zh0.j(wh0Var.f32106a, arrayList8) == null) {
                        zh0 zh0Var2 = wh0Var.f32126y;
                        float f7 = zh0Var2.N;
                        RectF rectF = wh0Var.f32108c;
                        RectF rectF2 = wh0Var.f32109f;
                        ba0 ba0Var = wh0Var.f32120r;
                        if (ba0Var != null) {
                            ba0Var.a();
                            wh0Var.f32122t = z15;
                            wh0Var.f32121s = z15;
                        }
                        wh0Var.f32117o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= zh0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        wh0Var.f32110g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = wh0Var.f32106a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (zh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    wh0Var.e.d(0.0f, z14);
                                    arrayList8.add(wh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            wh0Var.e.d(0.0f, z14);
                            arrayList8.add(wh0Var);
                        }
                        z14 = true;
                        wh0Var.e.d(0.0f, z14);
                        arrayList8.add(wh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                zh0Var.invalidate();
                return;
            case 27:
                wh0 wh0Var2 = (wh0) obj;
                yh0 yh0Var = ((zh0) obj2).F;
                int i17 = wh0Var2.f32106a;
                RectF rectF3 = wh0Var2.d;
                ProfileActivity.e0(((org.telegram.ui.mx0) yh0Var).f39364b, i17, rectF3.left, rectF3.top);
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
                dk0 dk0Var = (dk0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = dk0Var.f25515r;
                dk0Var.f25514n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    ck0 ck0Var = (ck0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((ck0) arrayList11.get(i19)).f25211a) == MessageObject.getObjectPeerId(ck0Var.f25211a)) {
                                if (ck0Var.f25213c > 0) {
                                    ((ck0) arrayList11.get(i19)).f25213c = ck0Var.f25213c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(ck0Var);
                        }
                    }
                }
                q0.a aVar = dk0Var.f25517w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                dk0Var.a();
                return;
        }
    }

    public yt(l71 l71Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32727a = i10;
        this.f32729c = l71Var;
        this.f32728b = editTextBoldCursor;
    }
}
