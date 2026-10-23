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
    public final int f33035a;
    public final Object f33036b;
    public final Object f33037c;

    public yt(int i10, Object obj, Object obj2) {
        this.f33035a = i10;
        this.f33036b = obj;
        this.f33037c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j10;
        m70 m70Var;
        org.telegram.ui.ib ibVar;
        ai.y7 y7Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f33035a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f33037c;
        Object obj2 = this.f33036b;
        switch (i11) {
            case 0:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 1:
                MessagesController.getInstance(aw.e0(((iv) obj2).f27453a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 2:
                MessagesController.getInstance(((lx) obj2).f28431a.f30966c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 3:
                TLObject tLObject = (TLObject) obj;
                tz tzVar = ((lx) obj2).f28431a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(tzVar.f30966c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(tzVar.f30966c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 4:
                jy jyVar = (jy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                jyVar.f27784w.f26471f = true;
                tz tzVar2 = jyVar.G;
                if (!tzVar2.f31005p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20370id))) {
                    tzVar2.f31005p1.add(Long.valueOf(tL_messages_stickerSet2.set.f20370id));
                }
                jyVar.a(true);
                return;
            case 5:
                final sy syVar = (sy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                tz tzVar3 = syVar.f30571a.F;
                if (!Arrays.equals(tzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(tzVar3.f30966c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
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
                                MediaDataController.getInstance(syVar2.f30571a.F.f30966c1).searchStickerSets(true, str, new ai.a4(syVar2, arrayList3, runnable, 8));
                                return;
                            default:
                                tz tzVar4 = syVar.f30571a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.f30966c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = tzVar4.f30966c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20370id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20370id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20370id))) {
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
                                                        arrayList6.add(new ky(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20370id));
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
                }, new org.telegram.ui.ActionBar.m3(29, syVar, str), new Utilities.Callback() {
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
                                MediaDataController.getInstance(syVar2.f30571a.F.f30966c1).searchStickerSets(true, str, new ai.a4(syVar2, arrayList2, runnable, 8));
                                return;
                            default:
                                tz tzVar4 = syVar.f30571a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.f30966c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = tzVar4.f30966c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20370id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20370id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20370id))) {
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
                                                        arrayList6.add(new ky(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20370id));
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
                ty tyVar = ((sy) obj2).f30571a;
                tyVar.F.V.e(false);
                ArrayList arrayList5 = tyVar.f30921r;
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
                int i12 = yyVar.L.f30966c1;
                MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = yyVar.f33066w;
                yyVar.f33066w = null;
                yyVar.F(str2, "", false, false, false);
                return;
            case 9:
                e00 e00Var = (e00) obj2;
                ei.z7 z7Var = (ei.z7) obj;
                e00Var.c();
                e00Var.h(z7Var);
                i00 i00Var = e00Var.J;
                i00Var.f27103h1 = z7Var;
                i00Var.j();
                return;
            case 10:
                ((e00) obj2).J.f27098f1 = (h00) obj;
                return;
            case 11:
                ((k10) obj2).f27827z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 12:
                ((qy) obj2).run((org.telegram.ui.ActionBar.o2) obj);
                return;
            case 13:
                e50 e50Var = (e50) obj2;
                Uri uri = (Uri) obj;
                e50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) e50Var.f25852a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? o2Var = new org.telegram.ui.ActionBar.o2(bundle);
                        o2Var.e = false;
                        o2Var.f43948f = false;
                        o2Var.f43947c = e50Var;
                        launchActivity.u0(o2Var);
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
                n60 n60Var = f60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                n60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, n60Var.Q);
                VideoEditedInfo videoEditedInfo2 = n60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = n60Var.M;
                videoEditedInfo2.encryptedFile = n60Var.N;
                videoEditedInfo2.key = n60Var.O;
                videoEditedInfo2.iv = n60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = f60Var.f26186a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = n60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = n60Var.f28864j1;
                videoEditedInfo3.estimatedDuration = n60Var.f28865k0;
                n60Var.f28864j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, f60Var.f26186a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (a60Var != null) {
                    photoEntry.ttl = a60Var.f24652c;
                    photoEntry.effectId = a60Var.d;
                }
                y50 y50Var = n60Var.f28868n;
                VideoEditedInfo videoEditedInfo4 = n60Var.S;
                if (a60Var != null && !a60Var.f24650a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (a60Var != null) {
                    i10 = a60Var.f24651b;
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
                f60 f60Var2 = (f60) ((org.telegram.ui.Cells.u5) obj2).f23735b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && f60Var2.A0.size() > 1) {
                    ArrayList arrayList6 = f60Var2.A0;
                    arrayList6.add((Bitmap) i2.o1.i(1, arrayList6));
                    return;
                }
                f60Var2.A0.add(bitmap);
                return;
            case 16:
                m70 m70Var2 = (m70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                m70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        m70Var2.f28578c.put(Long.valueOf(m70Var2.f28576b.admin_id), (TLRPC.User) vector.objects.get(0));
                        m70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                g70 g70Var = (g70) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (m70Var = g70Var.f26557a.f26813c).f28587j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = m70Var.f28576b;
                    org.telegram.ui.vb vbVar = ibVar.f38136a;
                    ArrayList arrayList7 = vbVar.f42696o0;
                    int size = arrayList7.size();
                    int i13 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.vb.L0(vbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.f42695n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f42686f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size2);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.f42711y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                ((x70) obj).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new n70(editTextBoldCursor, 1));
                return;
            case 19:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.yo) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 20:
                t90 t90Var = (t90) obj2;
                if (t90Var.O0 == ((z90) obj)) {
                    t90Var.performLongClick();
                    t90Var.O0 = null;
                    t90Var.M0.d(true);
                    return;
                }
                return;
            case 21:
                ((v90) obj2).l((ca0) obj, false);
                return;
            case 22:
                xa0 xa0Var = (xa0) obj2;
                if (!((boolean[]) obj)[0] && (y7Var = xa0Var.U) != null) {
                    y7Var.run();
                }
                xa0Var.U = null;
                return;
            case 23:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                ((za0) obj).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new n70(editTextBoldCursor2, 3));
                return;
            case 24:
                l2.f fVar = (l2.f) obj2;
                Runnable runnable = (Runnable) obj;
                fVar.getClass();
                runnable.run();
                ((HashMap) fVar.f15906b).remove(runnable);
                return;
            case 25:
                xh0 xh0Var = (xh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                xh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    xh0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        xh0Var.a(false);
                        return;
                    }
                    xh0Var.d();
                    xh0Var.f32569c.Z2.N(true);
                    return;
                }
                return;
            case 26:
                ci0 ci0Var = (ci0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = ci0Var.f25337a;
                int i14 = ci0Var.f25349x;
                int size3 = arrayList8.size();
                ci0Var.f25349x = size3;
                if (i14 != size3 && ci0Var.S != null) {
                    ci0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    zh0 zh0Var = (zh0) arrayList9.get(i15);
                    if (zh0Var.f33236o && !zh0Var.f33237p) {
                        arrayList8.add(zh0Var);
                    } else if (ci0.j(zh0Var.f33225a, arrayList8) == null) {
                        ci0 ci0Var2 = zh0Var.f33245y;
                        float f7 = ci0Var2.N;
                        RectF rectF = zh0Var.f33227c;
                        RectF rectF2 = zh0Var.f33228f;
                        ca0 ca0Var = zh0Var.f33239r;
                        if (ca0Var != null) {
                            ca0Var.a();
                            zh0Var.f33241t = z15;
                            zh0Var.f33240s = z15;
                        }
                        zh0Var.f33236o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= ci0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        zh0Var.f33229g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = zh0Var.f33225a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (ci0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    zh0Var.e.d(0.0f, z14);
                                    arrayList8.add(zh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            zh0Var.e.d(0.0f, z14);
                            arrayList8.add(zh0Var);
                        }
                        z14 = true;
                        zh0Var.e.d(0.0f, z14);
                        arrayList8.add(zh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                ci0Var.invalidate();
                return;
            case 27:
                zh0 zh0Var2 = (zh0) obj;
                bi0 bi0Var = ((ci0) obj2).F;
                int i17 = zh0Var2.f33225a;
                RectF rectF3 = zh0Var2.d;
                ProfileActivity.d0(((org.telegram.ui.qx0) bi0Var).f40933b, i17, rectF3.left, rectF3.top);
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
                gk0 gk0Var = (gk0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = gk0Var.f26622r;
                gk0Var.f26621n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    fk0 fk0Var = (fk0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((fk0) arrayList11.get(i19)).f26369a) == MessageObject.getObjectPeerId(fk0Var.f26369a)) {
                                if (fk0Var.f26371c > 0) {
                                    ((fk0) arrayList11.get(i19)).f26371c = fk0Var.f26371c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(fk0Var);
                        }
                    }
                }
                q0.a aVar = gk0Var.f26624w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                gk0Var.a();
                return;
        }
    }

    public yt(s71 s71Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.f33035a = i10;
        this.f33037c = s71Var;
        this.f33036b = editTextBoldCursor;
    }
}
