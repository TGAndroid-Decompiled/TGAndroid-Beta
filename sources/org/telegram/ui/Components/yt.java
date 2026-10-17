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
    public final int f32754a;
    public final Object f32755b;
    public final Object f32756c;

    public yt(int i10, Object obj, Object obj2) {
        this.f32754a = i10;
        this.f32755b = obj;
        this.f32756c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j10;
        l70 l70Var;
        org.telegram.ui.kb kbVar;
        ai.x7 x7Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f32754a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f32756c;
        Object obj2 = this.f32755b;
        switch (i11) {
            case 0:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 1:
                MessagesController.getInstance(aw.V(((iv) obj2).f27355a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 2:
                MessagesController.getInstance(((lx) obj2).f28339a.f30747c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 3:
                TLObject tLObject = (TLObject) obj;
                tz tzVar = ((lx) obj2).f28339a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(tzVar.f30747c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(tzVar.f30747c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 4:
                jy jyVar = (jy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                jyVar.f27650s.f26406f = true;
                tz tzVar2 = jyVar.E;
                if (!tzVar2.f30786p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20299id))) {
                    tzVar2.f30786p1.add(Long.valueOf(tL_messages_stickerSet2.set.f20299id));
                }
                jyVar.a(true);
                return;
            case 5:
                final sy syVar = (sy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                tz tzVar3 = syVar.f30405a.F;
                if (!Arrays.equals(tzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(tzVar3.f30747c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
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
                                MediaDataController.getInstance(syVar2.f30405a.F.f30747c1).searchStickerSets(true, str, new ai.w3(syVar2, arrayList3, runnable, 9));
                                return;
                            default:
                                tz tzVar4 = syVar.f30405a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.f30747c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = tzVar4.f30747c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20299id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20299id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20299id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.wh.w(" ", translitSafe, translitSafe3)) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20299id));
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
                                MediaDataController.getInstance(syVar2.f30405a.F.f30747c1).searchStickerSets(true, str, new ai.w3(syVar2, arrayList2, runnable, 9));
                                return;
                            default:
                                tz tzVar4 = syVar.f30405a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.f30747c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = tzVar4.f30747c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20299id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20299id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20299id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.wh.w(" ", translitSafe, translitSafe3)) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20299id));
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
                }, new qy(0, syVar, arrayList), new ai.g3(syVar, str, arrayList, arrayList2, arrayList3, 4));
                return;
            case 6:
                ArrayList arrayList4 = (ArrayList) obj;
                ty tyVar = ((sy) obj2).f30405a;
                tyVar.F.V.e(false);
                ArrayList arrayList5 = tyVar.f30733r;
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
                MessagesController.getInstance(tzVar4.f30747c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = tzVar4.f30747c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = yyVar.f32777w;
                yyVar.f32777w = null;
                yyVar.F(str2, "", false, false, false);
                return;
            case 9:
                e00 e00Var = (e00) obj2;
                ei.z7 z7Var = (ei.z7) obj;
                e00Var.c();
                e00Var.h(z7Var);
                i00 i00Var = e00Var.J;
                i00Var.f26995h1 = z7Var;
                i00Var.j();
                return;
            case 10:
                ((e00) obj2).J.f26990f1 = (h00) obj;
                return;
            case 11:
                ((k10) obj2).f27695z0 = -1;
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
                    LaunchActivity launchActivity = (LaunchActivity) e50Var.f25805a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.e = false;
                        n2Var.f42907f = false;
                        n2Var.f42906c = e50Var;
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
                videoEditedInfo2.originalPath = f60Var.f26099a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = m60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = m60Var.f28430j1;
                videoEditedInfo3.estimatedDuration = m60Var.f28431k0;
                m60Var.f28430j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, f60Var.f26099a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (a60Var != null) {
                    photoEntry.ttl = a60Var.f24501c;
                    photoEntry.effectId = a60Var.d;
                }
                y50 y50Var = m60Var.f28434n;
                VideoEditedInfo videoEditedInfo4 = m60Var.S;
                if (a60Var != null && !a60Var.f24499a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (a60Var != null) {
                    i10 = a60Var.f24500b;
                } else {
                    i10 = 0;
                }
                if (a60Var != null) {
                    j10 = a60Var.e;
                } else {
                    j10 = 0;
                }
                y50Var.r(photoEntry, videoEditedInfo4, z11, i10, 0, false, j10);
                return;
            case 15:
                Bitmap bitmap = (Bitmap) obj;
                f60 f60Var2 = (f60) ((org.telegram.ui.Cells.k7) obj2).f22511b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && f60Var2.A0.size() > 1) {
                    ArrayList arrayList6 = f60Var2.A0;
                    arrayList6.add((Bitmap) i0.a.h(1, arrayList6));
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
                        l70Var2.f28119c.put(Long.valueOf(l70Var2.f28117b.admin_id), (TLRPC.User) vector.objects.get(0));
                        l70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                f70 f70Var = (f70) obj2;
                if (((TLRPC.TL_error) obj) == null && (kbVar = (l70Var = f70Var.f26156a.f26492c).f28128j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = l70Var.f28117b;
                    org.telegram.ui.xb xbVar = kbVar.f38458a;
                    ArrayList arrayList7 = xbVar.f43060o0;
                    int size = arrayList7.size();
                    int i13 = xbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = xbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.xb.L0(xbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) xbVar.f43059n0, (HashMap<String, ArrayList<MessageObject>>) xbVar.m0, xbVar.f43050f, xbVar.T, true).contentType >= 0) {
                        xbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            xbVar.C0.N = true;
                            org.telegram.ui.tb tbVar = xbVar.E;
                            tbVar.s(tbVar.h, size2);
                            org.telegram.ui.xb.K0(xbVar);
                        }
                        xbVar.f43075y0.remove(tL_chatInviteExported.link);
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
                ((org.telegram.ui.yo) obj).presentFragment(new ProfileActivity(bundle2, null));
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
                if (!((boolean[]) obj)[0] && (x7Var = wa0Var.U) != null) {
                    x7Var.run();
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
                ((HashMap) fVar.f15837b).remove(runnable);
                return;
            case 25:
                th0 th0Var = (th0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                th0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    th0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        th0Var.a(false);
                        return;
                    }
                    th0Var.d();
                    th0Var.f30549c.W2.N(true);
                    return;
                }
                return;
            case 26:
                yh0 yh0Var = (yh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = yh0Var.f32631a;
                int i14 = yh0Var.f32643x;
                int size3 = arrayList8.size();
                yh0Var.f32643x = size3;
                if (i14 != size3 && yh0Var.S != null) {
                    yh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    vh0 vh0Var = (vh0) arrayList9.get(i15);
                    if (vh0Var.f31290o && !vh0Var.f31291p) {
                        arrayList8.add(vh0Var);
                    } else if (yh0.j(vh0Var.f31279a, arrayList8) == null) {
                        yh0 yh0Var2 = vh0Var.f31299y;
                        float f7 = yh0Var2.N;
                        RectF rectF = vh0Var.f31281c;
                        RectF rectF2 = vh0Var.f31282f;
                        ba0 ba0Var = vh0Var.f31293r;
                        if (ba0Var != null) {
                            ba0Var.a();
                            vh0Var.f31295t = z15;
                            vh0Var.f31294s = z15;
                        }
                        vh0Var.f31290o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= yh0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        vh0Var.f31283g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = vh0Var.f31279a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (yh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    vh0Var.e.d(0.0f, z14);
                                    arrayList8.add(vh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            vh0Var.e.d(0.0f, z14);
                            arrayList8.add(vh0Var);
                        }
                        z14 = true;
                        vh0Var.e.d(0.0f, z14);
                        arrayList8.add(vh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                yh0Var.invalidate();
                return;
            case 27:
                vh0 vh0Var2 = (vh0) obj;
                xh0 xh0Var = ((yh0) obj2).F;
                int i17 = vh0Var2.f31279a;
                RectF rectF3 = vh0Var2.d;
                ProfileActivity.e0(((org.telegram.ui.ox0) xh0Var).f39899b, i17, rectF3.left, rectF3.top);
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
                ck0 ck0Var = (ck0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = ck0Var.f25251r;
                ck0Var.f25250n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    bk0 bk0Var = (bk0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((bk0) arrayList11.get(i19)).f24998a) == MessageObject.getObjectPeerId(bk0Var.f24998a)) {
                                if (bk0Var.f25000c > 0) {
                                    ((bk0) arrayList11.get(i19)).f25000c = bk0Var.f25000c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(bk0Var);
                        }
                    }
                }
                q0.a aVar = ck0Var.f25253w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                ck0Var.a();
                return;
        }
    }

    public yt(j71 j71Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f32754a = i10;
        this.f32756c = j71Var;
        this.f32755b = editTextBoldCursor;
    }
}
