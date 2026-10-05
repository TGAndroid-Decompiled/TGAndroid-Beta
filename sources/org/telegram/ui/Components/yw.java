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
import org.telegram.ui.ProfileActivity;
public final class yw implements Runnable {
    public final int f33356a;
    public final Object f33357b;
    public final Object f33358c;

    public yw(int i10, Object obj, Object obj2) {
        this.f33356a = i10;
        this.f33357b = obj;
        this.f33358c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        f70 f70Var;
        org.telegram.ui.jb jbVar;
        ci.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int indexOf;
        int L;
        int i11 = this.f33356a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f33358c;
        Object obj2 = this.f33357b;
        switch (i11) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                nz nzVar = ((ix) obj2).f27618a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(nzVar.f29194c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(nzVar.f29194c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 1:
                fy fyVar = (fy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                fyVar.f26632s.f24763f = true;
                nz nzVar2 = fyVar.E;
                if (!nzVar2.f29234p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f20074id))) {
                    nzVar2.f29234p1.add(Long.valueOf(tL_messages_stickerSet2.set.f20074id));
                }
                fyVar.a(true);
                return;
            case 2:
                final my myVar = (my) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                nz nzVar3 = myVar.f28861a.F;
                if (!Arrays.equals(nzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(nzVar3.f29194c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
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
                                MediaDataController.getInstance(myVar2.f28861a.F.f29194c1).searchStickerSets(true, str, new ai.c5(myVar2, arrayList3, runnable, 7));
                                return;
                            default:
                                nz nzVar4 = myVar.f28861a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(nzVar4.f29194c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = nzVar4.f29194c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20074id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new gy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20074id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20074id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe3)) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20074id));
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
                }, new org.telegram.ui.qc(23, myVar, str), new Utilities.Callback() {
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
                                MediaDataController.getInstance(myVar2.f28861a.F.f29194c1).searchStickerSets(true, str, new ai.c5(myVar2, arrayList2, runnable, 7));
                                return;
                            default:
                                nz nzVar4 = myVar.f28861a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(nzVar4.f29194c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = nzVar4.f29194c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f20074id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new gy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f20074id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f20074id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe3)) {
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f20074id));
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
                }, new org.telegram.ui.qc(24, myVar, arrayList), new org.telegram.ui.ua(myVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 3:
                ArrayList arrayList4 = (ArrayList) obj;
                ny nyVar = ((my) obj2).f28861a;
                nyVar.F.V.e(false);
                ArrayList arrayList5 = nyVar.f29175r;
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
            case 4:
                ((sy) obj2).F((String) obj, "", true, false, false);
                return;
            case 5:
                sy syVar = (sy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                int i12 = syVar.L.f29194c1;
                MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = syVar.f30984w;
                syVar.f30984w = null;
                syVar.F(str2, "", false, false, false);
                return;
            case 6:
                yz yzVar = (yz) obj2;
                ci.j8 j8Var = (ci.j8) obj;
                yzVar.c();
                yzVar.h(j8Var);
                c00 c00Var = yzVar.J;
                c00Var.f25183h1 = j8Var;
                c00Var.j();
                return;
            case 7:
                ((yz) obj2).J.f25178f1 = (b00) obj;
                return;
            case 8:
                ((f10) obj2).f26263z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 9:
                ((org.telegram.ui.qc) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                return;
            case 10:
                y40 y40Var = (y40) obj2;
                Uri uri = (Uri) obj;
                y40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) y40Var.f33170a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.f37478e = false;
                        n2Var.f37479f = false;
                        n2Var.f37477c = y40Var;
                        launchActivity.p0(n2Var);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    y40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 11:
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
                videoEditedInfo2.originalPath = y50Var.f33185a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = f60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = f60Var.f26360e1;
                videoEditedInfo3.estimatedDuration = f60Var.f26369k0;
                f60Var.f26360e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, y50Var.f33185a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (t50Var != null) {
                    photoEntry.ttl = t50Var.f31063c;
                    photoEntry.effectId = t50Var.d;
                }
                r50 r50Var = f60Var.f26371n;
                VideoEditedInfo videoEditedInfo4 = f60Var.S;
                if (t50Var != null && !t50Var.f31061a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (t50Var != null) {
                    i10 = t50Var.f31062b;
                } else {
                    i10 = 0;
                }
                if (t50Var != null) {
                    j3 = t50Var.f31064e;
                } else {
                    j3 = 0;
                }
                r50Var.q(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 12:
                Bitmap bitmap = (Bitmap) obj;
                y50 y50Var2 = (y50) ((org.telegram.ui.Cells.t6) obj2).f23074b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && y50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = y50Var2.A0;
                    arrayList6.add((Bitmap) hg.c.g(1, arrayList6));
                    return;
                }
                y50Var2.A0.add(bitmap);
                return;
            case 13:
                f70 f70Var2 = (f70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                f70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        f70Var2.f26404c.put(Long.valueOf(f70Var2.f26402b.admin_id), (TLRPC.User) vector.objects.get(0));
                        f70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                z60 z60Var = (z60) obj2;
                if (((TLRPC.TL_error) obj) == null && (jbVar = (f70Var = z60Var.f33437a.f24510c).f26414j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = f70Var.f26402b;
                    org.telegram.ui.wb wbVar = jbVar.f37633a;
                    ArrayList arrayList7 = wbVar.f42055o0;
                    int size = arrayList7.size();
                    int i13 = wbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.wb.L0(wbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.f42054n0, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f42045f, wbVar.T, true).contentType >= 0) {
                        wbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            wbVar.C0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.E;
                            sbVar.s(sbVar.h, size2);
                            org.telegram.ui.wb.K0(wbVar);
                        }
                        wbVar.f42070y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((p70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 16:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.hp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 17:
                l90 l90Var = (l90) obj2;
                if (l90Var.O0 == ((r90) obj)) {
                    l90Var.performLongClick();
                    l90Var.O0 = null;
                    l90Var.M0.d(true);
                    return;
                }
                return;
            case 18:
                ((n90) obj2).l((u90) obj, false);
                return;
            case 19:
                pa0 pa0Var = (pa0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = pa0Var.U) != null) {
                    y0Var.run();
                }
                pa0Var.U = null;
                return;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((ra0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 21:
                pb.c cVar = (pb.c) obj2;
                Runnable runnable = (Runnable) obj;
                cVar.getClass();
                runnable.run();
                cVar.f44377a.remove(runnable);
                return;
            case 22:
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
                    lh0Var.f28475c.f26034f3.N(true);
                    return;
                }
                return;
            case 23:
                qh0 qh0Var = (qh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = qh0Var.f30055a;
                int i14 = qh0Var.f30068x;
                int size3 = arrayList8.size();
                qh0Var.f30068x = size3;
                if (i14 != size3 && qh0Var.S != null) {
                    qh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    nh0 nh0Var = (nh0) arrayList9.get(i15);
                    if (nh0Var.f29072o && !nh0Var.f29073p) {
                        arrayList8.add(nh0Var);
                    } else if (qh0.j(nh0Var.f29060a, arrayList8) == null) {
                        qh0 qh0Var2 = nh0Var.f29081y;
                        float f7 = qh0Var2.N;
                        RectF rectF = nh0Var.f29062c;
                        RectF rectF2 = nh0Var.f29064f;
                        u90 u90Var = nh0Var.f29075r;
                        if (u90Var != null) {
                            u90Var.a();
                            nh0Var.f29077t = z15;
                            nh0Var.f29076s = z15;
                        }
                        nh0Var.f29072o = z16;
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
                        nh0Var.f29065g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = nh0Var.f29060a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (qh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    nh0Var.f29063e.d(0.0f, z14);
                                    arrayList8.add(nh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            nh0Var.f29063e.d(0.0f, z14);
                            arrayList8.add(nh0Var);
                        }
                        z14 = true;
                        nh0Var.f29063e.d(0.0f, z14);
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
            case 24:
                nh0 nh0Var2 = (nh0) obj;
                ph0 ph0Var = ((qh0) obj2).F;
                int i17 = nh0Var2.f29060a;
                RectF rectF3 = nh0Var2.d;
                ProfileActivity.X(((org.telegram.ui.ey0) ph0Var).f36140b, i17, rectF3.left, rectF3.top);
                return;
            case 25:
                ViewParent viewParent = (ViewParent) obj;
                ((org.telegram.ui.Cells.u1) obj2).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 26:
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
            case 27:
                sj0 sj0Var = (sj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = sj0Var.f30808r;
                sj0Var.f30807n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    rj0 rj0Var = (rj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((rj0) arrayList11.get(i19)).f30510a) == MessageObject.getObjectPeerId(rj0Var.f30510a)) {
                                if (rj0Var.f30512c > 0) {
                                    ((rj0) arrayList11.get(i19)).f30512c = rj0Var.f30512c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(rj0Var);
                        }
                    }
                }
                q0.a aVar = sj0Var.f30810w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                sj0Var.a();
                return;
            case 28:
                jo0 jo0Var = (jo0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = jo0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = jo0Var.L()) < jo0Var.h()) {
                    arrayList12.remove(indexOf);
                    jo0Var.u(L + 1 + indexOf);
                    int size6 = jo0Var.f10622j0.f10535e.size();
                    int size7 = arrayList12.size();
                    if (jo0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        jo0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((jo0) obj2).T();
                yc.a0((org.telegram.ui.uy) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
        }
    }
}
