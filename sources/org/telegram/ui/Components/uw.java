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
public final class uw implements Runnable {
    public final int f28840a;
    public final Object f28841b;
    public final Object f28842c;

    public uw(int i10, Object obj, Object obj2) {
        this.f28840a = i10;
        this.f28841b = obj;
        this.f28842c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        a70 a70Var;
        org.telegram.ui.ib ibVar;
        ci.y0 y0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int indexOf;
        int L;
        int i11 = this.f28840a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f28842c;
        Object obj2 = this.f28841b;
        switch (i11) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                kz kzVar = ((ex) obj2).f23977a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(kzVar.f25892c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.f25892c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 1:
                cy cyVar = (cy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                cyVar.f23366s.f30389f = true;
                kz kzVar2 = cyVar.E;
                if (!kzVar2.f25931p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18323id))) {
                    kzVar2.f25931p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18323id));
                }
                cyVar.a(true);
                return;
            case 2:
                final jy jyVar = (jy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = jyVar.f25479a.F;
                if (!Arrays.equals(kzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(kzVar3.f25892c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                kzVar3.W0 = currentKeyboardLanguage;
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
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.f25479a.F.f25892c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList3, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = jyVar.f25479a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f25892c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = kzVar4.f25892c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18323id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18323id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18323id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new dy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18323id));
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
                }, new org.telegram.ui.of(16, jyVar, str), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.f25479a.F.f25892c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList2, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = jyVar.f25479a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f25892c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = kzVar4.f25892c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18323id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18323id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18323id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new dy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18323id));
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
                }, new org.telegram.ui.of(17, jyVar, arrayList), new org.telegram.ui.ta(jyVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 3:
                ArrayList arrayList4 = (ArrayList) obj;
                ky kyVar = ((jy) obj2).f25479a;
                kyVar.F.V.e(false);
                ArrayList arrayList5 = kyVar.f25877r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kyVar.E = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                kyVar.l();
                return;
            case 4:
                ((py) obj2).F((String) obj, "", true, false, false);
                return;
            case 5:
                py pyVar = (py) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                kz kzVar4 = pyVar.L;
                MessagesController.getInstance(kzVar4.f25892c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = kzVar4.f25892c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = pyVar.f27350w;
                pyVar.f27350w = null;
                pyVar.F(str2, "", false, false, false);
                return;
            case 6:
                vz vzVar = (vz) obj2;
                ci.n8 n8Var = (ci.n8) obj;
                vzVar.c();
                vzVar.h(n8Var);
                zz zzVar = vzVar.J;
                zzVar.f30939h1 = n8Var;
                zzVar.j();
                return;
            case 7:
                ((vz) obj2).J.f30934f1 = (yz) obj;
                return;
            case 8:
                ((c10) obj2).f23168z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 9:
                ((org.telegram.ui.of) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                return;
            case 10:
                u40 u40Var = (u40) obj2;
                Uri uri = (Uri) obj;
                u40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u40Var.f28554a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? n2Var = new org.telegram.ui.ActionBar.n2(bundle);
                        n2Var.e = false;
                        n2Var.f36230f = false;
                        n2Var.f36229c = u40Var;
                        launchActivity.p0(n2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    u40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 11:
                u50 u50Var = (u50) obj2;
                p50 p50Var = (p50) obj;
                b60 b60Var = u50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                b60Var.Q = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, b60Var.O);
                VideoEditedInfo videoEditedInfo2 = b60Var.Q;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = b60Var.K;
                videoEditedInfo2.encryptedFile = b60Var.L;
                videoEditedInfo2.key = b60Var.M;
                videoEditedInfo2.iv = b60Var.N;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = u50Var.f28578a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = b60Var.Q;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = b60Var.f22833c1;
                videoEditedInfo3.estimatedDuration = b60Var.f22842i0;
                b60Var.f22833c1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, u50Var.f28578a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (p50Var != null) {
                    photoEntry.ttl = p50Var.f27108c;
                    photoEntry.effectId = p50Var.d;
                }
                n50 n50Var = b60Var.f22838f;
                VideoEditedInfo videoEditedInfo4 = b60Var.Q;
                if (p50Var != null && !p50Var.f27106a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (p50Var != null) {
                    i10 = p50Var.f27107b;
                } else {
                    i10 = 0;
                }
                if (p50Var != null) {
                    j3 = p50Var.e;
                } else {
                    j3 = 0;
                }
                n50Var.q(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 12:
                Bitmap bitmap = (Bitmap) obj;
                u50 u50Var2 = (u50) ((org.telegram.ui.Cells.t6) obj2).f21173b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && u50Var2.A0.size() > 1) {
                    ArrayList arrayList6 = u50Var2.A0;
                    arrayList6.add((Bitmap) hg.k0.g(1, arrayList6));
                    return;
                }
                u50Var2.A0.add(bitmap);
                return;
            case 13:
                a70 a70Var2 = (a70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                a70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        a70Var2.f22538c.put(Long.valueOf(a70Var2.f22536b.admin_id), (TLRPC.User) vector.objects.get(0));
                        a70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                u60 u60Var = (u60) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (a70Var = u60Var.f28618a.f28942c).f22547j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a70Var.f22536b;
                    org.telegram.ui.vb vbVar = ibVar.f34483a;
                    ArrayList arrayList7 = vbVar.f38429o0;
                    int size = arrayList7.size();
                    int i13 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.vb.L0(vbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.f38428n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f38419f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size2);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.f38444y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((k70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(3, editTextBoldCursor));
                return;
            case 16:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 17:
                g90 g90Var = (g90) obj2;
                if (g90Var.O0 == ((m90) obj)) {
                    g90Var.performLongClick();
                    g90Var.O0 = null;
                    g90Var.M0.d(true);
                    return;
                }
                return;
            case 18:
                ((i90) obj2).l((p90) obj, false);
                return;
            case 19:
                ka0 ka0Var = (ka0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = ka0Var.U) != null) {
                    y0Var.run();
                }
                ka0Var.U = null;
                return;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((ma0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(5, editTextBoldCursor2));
                return;
            case 21:
                l.d dVar = (l.d) obj2;
                Runnable runnable = (Runnable) obj;
                dVar.getClass();
                runnable.run();
                ((HashMap) dVar.f13859a).remove(runnable);
                return;
            case 22:
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
                    jh0Var.f25334c.Y2.N(true);
                    return;
                }
                return;
            case 23:
                oh0 oh0Var = (oh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = oh0Var.f26936a;
                int i14 = oh0Var.f26948x;
                int size3 = arrayList8.size();
                oh0Var.f26948x = size3;
                if (i14 != size3 && oh0Var.S != null) {
                    oh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    lh0 lh0Var = (lh0) arrayList9.get(i15);
                    if (lh0Var.f26152o && !lh0Var.f26153p) {
                        arrayList8.add(lh0Var);
                    } else if (oh0.j(lh0Var.f26141a, arrayList8) == null) {
                        oh0 oh0Var2 = lh0Var.f26161y;
                        float f7 = oh0Var2.N;
                        RectF rectF = lh0Var.f26143c;
                        RectF rectF2 = lh0Var.f26144f;
                        p90 p90Var = lh0Var.f26155r;
                        if (p90Var != null) {
                            p90Var.a();
                            lh0Var.f26157t = z15;
                            lh0Var.f26156s = z15;
                        }
                        lh0Var.f26152o = z16;
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
                        lh0Var.f26145g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = lh0Var.f26141a;
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
            case 24:
                lh0 lh0Var2 = (lh0) obj;
                nh0 nh0Var = ((oh0) obj2).F;
                int i17 = lh0Var2.f26141a;
                RectF rectF3 = lh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ky0) nh0Var).f35201b, i17, rectF3.left, rectF3.top);
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
                qj0 qj0Var = (qj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = qj0Var.f27628r;
                qj0Var.f27627n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    pj0 pj0Var = (pj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((pj0) arrayList11.get(i19)).f27249a) == MessageObject.getObjectPeerId(pj0Var.f27249a)) {
                                if (pj0Var.f27251c > 0) {
                                    ((pj0) arrayList11.get(i19)).f27251c = pj0Var.f27251c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(pj0Var);
                        }
                    }
                }
                q0.a aVar = qj0Var.f27630w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                qj0Var.a();
                return;
            case 28:
                eo0 eo0Var = (eo0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = eo0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = eo0Var.L()) < eo0Var.h()) {
                    arrayList12.remove(indexOf);
                    eo0Var.u(L + 1 + indexOf);
                    int size6 = eo0Var.f9772j0.e.size();
                    int size7 = arrayList12.size();
                    if (eo0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        eo0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((eo0) obj2).T();
                xc.a0((org.telegram.ui.uy) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
        }
    }
}
