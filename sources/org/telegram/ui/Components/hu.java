package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
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
public final class hu implements Runnable {
    public final int f26908a;
    public final Object f26909b;
    public final Object f26910c;

    public hu(int i10, Object obj, Object obj2) {
        this.f26908a = i10;
        this.f26909b = obj;
        this.f26910c = obj2;
    }

    @Override
    public final void run() {
        Bitmap createBitmap;
        boolean z10;
        boolean z11;
        int i10;
        long j3;
        w70 w70Var;
        org.telegram.ui.lb lbVar;
        ci.x0 x0Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f26908a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f26910c;
        Object obj2 = this.f26909b;
        switch (i11) {
            case 0:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new hu(1, (iu) obj2, decodeFile));
                return;
            case 1:
                ((iu) obj2).setImage((Bitmap) obj);
                return;
            case 2:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 3:
                MessagesController.getInstance(lw.V(((uv) obj2).f31266a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 4:
                MessagesController.getInstance(((wx) obj2).f32576a.f25080c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 5:
                TLObject tLObject = (TLObject) obj;
                d00 d00Var = ((wx) obj2).f32576a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(d00Var.f25080c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(d00Var.f25080c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 6:
                uy uyVar = (uy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                uyVar.f31286s.f29950f = true;
                d00 d00Var2 = uyVar.E;
                if (!d00Var2.f25120p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f19829id))) {
                    d00Var2.f25120p1.add(Long.valueOf(tL_messages_stickerSet2.set.f19829id));
                }
                uyVar.a(true);
                return;
            case 7:
                final bz bzVar = (bz) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                d00 d00Var3 = bzVar.f24776a.F;
                if (!Arrays.equals(d00Var3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(d00Var3.f25080c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                d00Var3.W0 = currentKeyboardLanguage;
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
                                bz bzVar2 = bzVar;
                                MediaDataController.getInstance(bzVar2.f24776a.F.f25080c1).searchStickerSets(true, str, new ai.d5(bzVar2, arrayList3, runnable, 7));
                                return;
                            default:
                                d00 d00Var4 = bzVar.f24776a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(d00Var4.f25080c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = d00Var4.f25080c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19829id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new vy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19829id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19829id))) {
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
                                                        arrayList6.add(new vy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19829id));
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
                }, new org.telegram.ui.tc(23, bzVar, str), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                bz bzVar2 = bzVar;
                                MediaDataController.getInstance(bzVar2.f24776a.F.f25080c1).searchStickerSets(true, str, new ai.d5(bzVar2, arrayList2, runnable, 7));
                                return;
                            default:
                                d00 d00Var4 = bzVar.f24776a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(d00Var4.f25080c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = d00Var4.f25080c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19829id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new vy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19829id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19829id))) {
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
                                                        arrayList6.add(new vy(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19829id));
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
                }, new org.telegram.ui.tc(24, bzVar, arrayList), new org.telegram.ui.wa(bzVar, str, arrayList, arrayList2, arrayList3));
                return;
            case 8:
                ArrayList arrayList4 = (ArrayList) obj;
                cz czVar = ((bz) obj2).f24776a;
                czVar.F.V.e(false);
                ArrayList arrayList5 = czVar.f25055r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                czVar.E = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                czVar.l();
                return;
            case 9:
                ((hz) obj2).F((String) obj, "", true, false, false);
                return;
            case 10:
                hz hzVar = (hz) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                d00 d00Var4 = hzVar.L;
                MessagesController.getInstance(d00Var4.f25080c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = d00Var4.f25080c1;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = hzVar.f26994w;
                hzVar.f26994w = null;
                hzVar.F(str2, "", false, false, false);
                return;
            case 11:
                o00 o00Var = (o00) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                o00Var.c();
                o00Var.h(k8Var);
                s00 s00Var = o00Var.J;
                s00Var.f30311h1 = k8Var;
                s00Var.j();
                return;
            case 12:
                ((o00) obj2).J.f30306f1 = (r00) obj;
                return;
            case 13:
                ((v10) obj2).f31348z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 14:
                ((org.telegram.ui.tc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                return;
            case 15:
                p50 p50Var = (p50) obj2;
                Uri uri = (Uri) obj;
                p50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) p50Var.f29378a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.f41071e = false;
                        m2Var.f41072f = false;
                        m2Var.f41070c = p50Var;
                        launchActivity.p0(m2Var);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    p50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 16:
                p60 p60Var = (p60) obj2;
                l60 l60Var = (l60) obj;
                w60 w60Var = p60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                w60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, w60Var.Q);
                VideoEditedInfo videoEditedInfo2 = w60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = w60Var.M;
                videoEditedInfo2.encryptedFile = w60Var.N;
                videoEditedInfo2.key = w60Var.O;
                videoEditedInfo2.iv = w60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = p60Var.f29391a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = w60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = w60Var.f32307j1;
                videoEditedInfo3.estimatedDuration = w60Var.f32308k0;
                w60Var.f32307j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, p60Var.f29391a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (l60Var != null) {
                    photoEntry.ttl = l60Var.f28058c;
                    photoEntry.effectId = l60Var.d;
                }
                j60 j60Var = w60Var.f32311n;
                VideoEditedInfo videoEditedInfo4 = w60Var.S;
                if (l60Var != null && !l60Var.f28056a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (l60Var != null) {
                    i10 = l60Var.f28057b;
                } else {
                    i10 = 0;
                }
                if (l60Var != null) {
                    j3 = l60Var.f28059e;
                } else {
                    j3 = 0;
                }
                j60Var.r(photoEntry, videoEditedInfo4, z11, i10, 0, false, j3);
                return;
            case 17:
                Bitmap bitmap = (Bitmap) obj;
                p60 p60Var2 = (p60) ((org.telegram.ui.Cells.l7) obj2).f22190b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && p60Var2.A0.size() > 1) {
                    ArrayList arrayList6 = p60Var2.A0;
                    arrayList6.add((Bitmap) hg.c.h(1, arrayList6));
                    return;
                }
                p60Var2.A0.add(bitmap);
                return;
            case 18:
                w70 w70Var2 = (w70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                w70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        w70Var2.f32334c.put(Long.valueOf(w70Var2.f32332b.admin_id), (TLRPC.User) vector.objects.get(0));
                        w70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                q70 q70Var = (q70) obj2;
                if (((TLRPC.TL_error) obj) == null && (lbVar = (w70Var = q70Var.f29749a.f30067c).f32344j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = w70Var.f32332b;
                    org.telegram.ui.yb ybVar = lbVar.f39687a;
                    ArrayList arrayList7 = ybVar.f44424o0;
                    int size = arrayList7.size();
                    int i13 = ybVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ybVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.yb.L0(ybVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ybVar.f44423n0, (HashMap<String, ArrayList<MessageObject>>) ybVar.m0, ybVar.f44414f, ybVar.T, true).contentType >= 0) {
                        ybVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            ybVar.C0.N = true;
                            org.telegram.ui.ub ubVar = ybVar.E;
                            ubVar.s(ubVar.h, size2);
                            org.telegram.ui.yb.K0(ybVar);
                        }
                        ybVar.f44439y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((g80) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(2, editTextBoldCursor));
                return;
            case 21:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.lp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 22:
                da0 da0Var = (da0) obj2;
                if (da0Var.O0 == ((ja0) obj)) {
                    da0Var.performLongClick();
                    da0Var.O0 = null;
                    da0Var.M0.d(true);
                    return;
                }
                return;
            case 23:
                ((fa0) obj2).l((ma0) obj, false);
                return;
            case 24:
                hb0 hb0Var = (hb0) obj2;
                if (!((boolean[]) obj)[0] && (x0Var = hb0Var.U) != null) {
                    x0Var.run();
                }
                hb0Var.U = null;
                return;
            case 25:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((jb0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, editTextBoldCursor2));
                return;
            case 26:
                pb.c cVar = (pb.c) obj2;
                Runnable runnable = (Runnable) obj;
                cVar.getClass();
                runnable.run();
                cVar.f45429a.remove(runnable);
                return;
            case 27:
                fi0 fi0Var = (fi0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                fi0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    fi0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        fi0Var.a(false);
                        return;
                    }
                    fi0Var.d();
                    fi0Var.f26078c.W2.N(true);
                    return;
                }
                return;
            case 28:
                ki0 ki0Var = (ki0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = ki0Var.f27867a;
                int i14 = ki0Var.f27880x;
                int size3 = arrayList8.size();
                ki0Var.f27880x = size3;
                if (i14 != size3 && ki0Var.S != null) {
                    ki0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    hi0 hi0Var = (hi0) arrayList9.get(i15);
                    if (hi0Var.f26792o && !hi0Var.f26793p) {
                        arrayList8.add(hi0Var);
                    } else if (ki0.j(hi0Var.f26780a, arrayList8) == null) {
                        ki0 ki0Var2 = hi0Var.f26801y;
                        float f7 = ki0Var2.N;
                        RectF rectF = hi0Var.f26782c;
                        RectF rectF2 = hi0Var.f26784f;
                        ma0 ma0Var = hi0Var.f26795r;
                        if (ma0Var != null) {
                            ma0Var.a();
                            hi0Var.f26797t = z15;
                            hi0Var.f26796s = z15;
                        }
                        hi0Var.f26792o = z16;
                        if (rectF.left - 1.0f <= f7) {
                            z12 = z16;
                        } else {
                            z12 = z15;
                        }
                        if (rectF.right + 1.0f >= ki0Var2.getMeasuredWidth() - f7) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        hi0Var.f26785g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = hi0Var.f26780a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (ki0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    hi0Var.f26783e.d(0.0f, z14);
                                    arrayList8.add(hi0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            hi0Var.f26783e.d(0.0f, z14);
                            arrayList8.add(hi0Var);
                        }
                        z14 = true;
                        hi0Var.f26783e.d(0.0f, z14);
                        arrayList8.add(hi0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                ki0Var.invalidate();
                return;
            default:
                hi0 hi0Var2 = (hi0) obj;
                ji0 ji0Var = ((ki0) obj2).F;
                int i17 = hi0Var2.f26780a;
                RectF rectF3 = hi0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ly0) ji0Var).f39868b, i17, rectF3.left, rectF3.top);
                return;
        }
    }
}
