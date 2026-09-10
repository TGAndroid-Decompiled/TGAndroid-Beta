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
public final class hy implements Runnable {
    public final int f23799a;
    public final Object f23800b;
    public final Object f23801c;

    public hy(int i10, Object obj, Object obj2) {
        this.f23799a = i10;
        this.f23800b = obj;
        this.f23801c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        a70 a70Var;
        org.telegram.ui.jb jbVar;
        bi.c1 c1Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int indexOf;
        int L;
        int i11 = this.f23799a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f23801c;
        Object obj2 = this.f23800b;
        switch (i11) {
            case 0:
                iy iyVar = (iy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                iyVar.f24164s.f22501f = true;
                rz rzVar = iyVar.E;
                if (!rzVar.f26844p1.contains(Long.valueOf(tL_messages_stickerSet.set.f17222id))) {
                    rzVar.f26844p1.add(Long.valueOf(tL_messages_stickerSet.set.f17222id));
                }
                iyVar.a(true);
                return;
            case 1:
                final qy qyVar = (qy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                rz rzVar2 = qyVar.f26493a.F;
                if (!Arrays.equals(rzVar2.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(rzVar2.f26805c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                rzVar2.W0 = currentKeyboardLanguage;
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
                                MediaDataController.getInstance(qyVar2.f26493a.F.f26805c1).searchStickerSets(true, str, new h7(qyVar2, arrayList3, runnable, 2));
                                return;
                            default:
                                rz rzVar3 = qyVar.f26493a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(rzVar3.f26805c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = rzVar3.f26805c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet2.set.f17222id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new jy(tL_messages_stickerSet2, tL_messages_stickerSet2.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f17222id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f17222id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new jy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f17222id));
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
                }, new org.telegram.ui.pf(16, qyVar, str), new Utilities.Callback() {
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
                                MediaDataController.getInstance(qyVar2.f26493a.F.f26805c1).searchStickerSets(true, str, new h7(qyVar2, arrayList2, runnable, 2));
                                return;
                            default:
                                rz rzVar3 = qyVar.f26493a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(rzVar3.f26805c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = rzVar3.f26805c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet2.set.f17222id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new jy(tL_messages_stickerSet2, tL_messages_stickerSet2.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.f17222id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f17222id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new jy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f17222id));
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
                }, new org.telegram.ui.pf(17, qyVar, arrayList), new org.telegram.ui.ua(qyVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 2:
                ArrayList arrayList4 = (ArrayList) obj;
                ry ryVar = ((qy) obj2).f26493a;
                ryVar.F.V.e(false);
                ArrayList arrayList5 = ryVar.f26781r;
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
            case 3:
                ((wy) obj2).F((String) obj, "", true, false, false);
                return;
            case 4:
                wy wyVar = (wy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                rz rzVar3 = wyVar.L;
                MessagesController.getInstance(rzVar3.f26805c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = rzVar3.f26805c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = wyVar.f28867w;
                wyVar.f28867w = null;
                wyVar.F(str2, "", false, false, false);
                return;
            case 5:
                c00 c00Var = (c00) obj2;
                bi.q9 q9Var = (bi.q9) obj;
                c00Var.c();
                c00Var.h(q9Var);
                g00 g00Var = c00Var.J;
                g00Var.f23156h1 = q9Var;
                g00Var.j();
                return;
            case 6:
                ((c00) obj2).J.f23151f1 = (f00) obj;
                return;
            case 7:
                ((k10) obj2).f24560z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 8:
                ((org.telegram.ui.pf) obj2).run((org.telegram.ui.ActionBar.p2) obj);
                return;
            case 9:
                e50 e50Var = (e50) obj2;
                Uri uri = (Uri) obj;
                e50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) e50Var.f22552a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? p2Var = new org.telegram.ui.ActionBar.p2(bundle);
                        p2Var.e = false;
                        p2Var.f35326f = false;
                        p2Var.f35325c = e50Var;
                        launchActivity.p0(p2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    e50Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 10:
                e60 e60Var = (e60) obj2;
                a60 a60Var = (a60) obj;
                f60 f60Var = e60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                f60Var.N = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, f60Var.L);
                VideoEditedInfo videoEditedInfo2 = f60Var.N;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = f60Var.H;
                videoEditedInfo2.encryptedFile = f60Var.I;
                videoEditedInfo2.key = f60Var.J;
                videoEditedInfo2.iv = f60Var.K;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = e60Var.f22568a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = f60Var.N;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = f60Var.Z0;
                videoEditedInfo3.estimatedDuration = f60Var.f22884f0;
                f60Var.Z0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, e60Var.f22568a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (a60Var != null) {
                    photoEntry.ttl = a60Var.f21394c;
                    photoEntry.effectId = a60Var.d;
                }
                y50 y50Var = f60Var.f22879c;
                VideoEditedInfo videoEditedInfo4 = f60Var.N;
                if (a60Var != null && !a60Var.f21392a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (a60Var != null) {
                    i10 = a60Var.f21393b;
                } else {
                    i10 = 0;
                }
                if (a60Var != null) {
                    j3 = a60Var.e;
                } else {
                    j3 = 0;
                }
                y50Var.q(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 11:
                Bitmap bitmap = (Bitmap) obj;
                e60 e60Var2 = (e60) ((org.telegram.ui.Cells.l9) obj2).f19501b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && e60Var2.A0.size() > 1) {
                    ArrayList arrayList6 = e60Var2.A0;
                    arrayList6.add((Bitmap) hc.b.i(1, arrayList6));
                    return;
                }
                e60Var2.A0.add(bitmap);
                return;
            case 12:
                a70 a70Var2 = (a70) obj2;
                TLObject tLObject = (TLObject) obj;
                a70Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        a70Var2.f21400c.put(Long.valueOf(a70Var2.f21398b.admin_id), (TLRPC.User) vector.objects.get(0));
                        a70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                u60 u60Var = (u60) obj2;
                if (((TLRPC.TL_error) obj) == null && (jbVar = (a70Var = u60Var.f27573a.f27846c).f21409j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a70Var.f21398b;
                    org.telegram.ui.wb wbVar = jbVar.f34069a;
                    ArrayList arrayList7 = wbVar.f37813s0;
                    int size = arrayList7.size();
                    int i13 = wbVar.I.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.wb.L0(wbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.f37811r0, (HashMap<String, ArrayList<MessageObject>>) wbVar.f37809q0, wbVar.f37812s, wbVar.X, true).contentType >= 0) {
                        wbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            wbVar.G0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.I;
                            sbVar.s(sbVar.h, size2);
                            org.telegram.ui.wb.K0(wbVar);
                        }
                        wbVar.C0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((k70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(3, editTextBoldCursor));
                return;
            case 15:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.mp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 16:
                h90 h90Var = (h90) obj2;
                if (h90Var.O0 == ((n90) obj)) {
                    h90Var.performLongClick();
                    h90Var.O0 = null;
                    h90Var.M0.d(true);
                    return;
                }
                return;
            case 17:
                ((j90) obj2).l((q90) obj, false);
                return;
            case 18:
                la0 la0Var = (la0) obj2;
                if (!((boolean[]) obj)[0] && (c1Var = la0Var.U) != null) {
                    c1Var.run();
                }
                la0Var.U = null;
                return;
            case 19:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((na0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(5, editTextBoldCursor2));
                return;
            case 20:
                m.g3 g3Var = (m.g3) obj2;
                Runnable runnable = (Runnable) obj;
                g3Var.getClass();
                runnable.run();
                ((HashMap) g3Var.f13018b).remove(runnable);
                return;
            case 21:
                ih0 ih0Var = (ih0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ih0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
                    ih0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        ih0Var.a(false);
                        return;
                    }
                    ih0Var.d();
                    ih0Var.f24022c.Y2.N(true);
                    return;
                }
                return;
            case 22:
                nh0 nh0Var = (nh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = nh0Var.f25514a;
                int i14 = nh0Var.f25526x;
                int size3 = arrayList8.size();
                nh0Var.f25526x = size3;
                if (i14 != size3 && nh0Var.S != null) {
                    nh0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    kh0 kh0Var = (kh0) arrayList9.get(i15);
                    if (kh0Var.f24726o && !kh0Var.f24727p) {
                        arrayList8.add(kh0Var);
                    } else if (nh0.j(kh0Var.f24715a, arrayList8) == null) {
                        nh0 nh0Var2 = kh0Var.f24735y;
                        float f7 = nh0Var2.N;
                        RectF rectF = kh0Var.f24717c;
                        RectF rectF2 = kh0Var.f24718f;
                        q90 q90Var = kh0Var.f24729r;
                        if (q90Var != null) {
                            q90Var.a();
                            kh0Var.f24731t = z15;
                            kh0Var.f24730s = z15;
                        }
                        kh0Var.f24726o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (rectF.right + 1.0f >= nh0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        kh0Var.f24719g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = kh0Var.f24715a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (nh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    kh0Var.e.d(0.0f, z14);
                                    arrayList8.add(kh0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            kh0Var.e.d(0.0f, z14);
                            arrayList8.add(kh0Var);
                        }
                        z14 = true;
                        kh0Var.e.d(0.0f, z14);
                        arrayList8.add(kh0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                nh0Var.invalidate();
                return;
            case 23:
                kh0 kh0Var2 = (kh0) obj;
                mh0 mh0Var = ((nh0) obj2).F;
                int i17 = kh0Var2.f24715a;
                RectF rectF3 = kh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ny0) mh0Var).f35359b, i17, rectF3.left, rectF3.top);
                return;
            case 24:
                ViewParent viewParent = (ViewParent) obj;
                ((org.telegram.ui.Cells.t1) obj2).invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    return;
                }
                return;
            case 25:
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
            case 26:
                pj0 pj0Var = (pj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = pj0Var.f26148r;
                pj0Var.f26147n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj3 = arrayList10.get(i18);
                    i18++;
                    oj0 oj0Var = (oj0) obj3;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList11.size()) {
                            if (MessageObject.getObjectPeerId(((oj0) arrayList11.get(i19)).f25826a) == MessageObject.getObjectPeerId(oj0Var.f25826a)) {
                                if (oj0Var.f25828c > 0) {
                                    ((oj0) arrayList11.get(i19)).f25828c = oj0Var.f25828c;
                                }
                            } else {
                                i19++;
                            }
                        } else {
                            arrayList11.add(oj0Var);
                        }
                    }
                }
                q0.a aVar = pj0Var.f26150w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                pj0Var.a();
                return;
            case 27:
                ao0 ao0Var = (ao0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = ao0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = ao0Var.L()) < ao0Var.h()) {
                    arrayList12.remove(indexOf);
                    ao0Var.u(L + 1 + indexOf);
                    int size6 = ao0Var.f8039j0.e.size();
                    int size7 = arrayList12.size();
                    if (ao0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        ao0Var.u(L);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ((ao0) obj2).T();
                wc.a0((org.telegram.ui.wy) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                return;
            default:
                ((lo0) obj2).sendAccessibilityEvent((View) obj, 4);
                return;
        }
    }
}
