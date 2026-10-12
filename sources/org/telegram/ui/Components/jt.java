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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class jt implements Runnable {
    public final int f27647a;
    public final Object f27648b;
    public final Object f27649c;

    public jt(int i10, Object obj, Object obj2) {
        this.f27647a = i10;
        this.f27648b = obj;
        this.f27649c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        boolean z11;
        boolean z12;
        int i10;
        long j3;
        w70 w70Var;
        org.telegram.ui.lb lbVar;
        ci.x0 x0Var;
        boolean z13;
        boolean z14;
        boolean z15;
        int i11 = this.f27647a;
        boolean z16 = false;
        boolean z17 = true;
        Object obj = this.f27649c;
        Object obj2 = this.f27648b;
        switch (i11) {
            case 0:
                kt ktVar = (kt) obj2;
                TLObject tLObject = (TLObject) obj;
                et etVar = ktVar.f27925b;
                ArrayList arrayList = ktVar.h;
                int i12 = ktVar.f27924a;
                if (tLObject instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    ktVar.f27929g = str;
                    if (str == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ktVar.f27927e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    ktVar.f27928f = currentTimeMillis;
                    if (!ktVar.f27930i) {
                        ktVar.f27930i = true;
                        String str2 = ktVar.f27929g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList.get(i13)).f19950id, arrayList2, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(ktVar, messagesStorage, arrayList2, currentTimeMillis, str3, 3));
                    }
                    ktVar.f27926c = false;
                    etVar.run();
                    return;
                }
                ktVar.f27929g = null;
                ktVar.f27927e = true;
                ktVar.f27926c = false;
                etVar.run();
                return;
            case 1:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new jt(2, (iu) obj2, decodeFile));
                return;
            case 2:
                ((iu) obj2).setImage((Bitmap) obj);
                return;
            case 3:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 4:
                MessagesController.getInstance(lw.V(((uv) obj2).f31266a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 5:
                MessagesController.getInstance(((wx) obj2).f32575a.f25072c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 6:
                TLObject tLObject2 = (TLObject) obj;
                d00 d00Var = ((wx) obj2).f32575a;
                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    MediaDataController.getInstance(d00Var.f25072c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(d00Var.f25072c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 7:
                uy uyVar = (uy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                uyVar.f31286s.f29951f = true;
                d00 d00Var2 = uyVar.E;
                if (!d00Var2.f25112p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f19830id))) {
                    d00Var2.f25112p1.add(Long.valueOf(tL_messages_stickerSet2.set.f19830id));
                }
                uyVar.a(true);
                return;
            case 8:
                final bz bzVar = (bz) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                d00 d00Var3 = bzVar.f24771a.F;
                if (!Arrays.equals(d00Var3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(d00Var3.f25072c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                d00Var3.W0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                Utilities.doCallbacks(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                bz bzVar2 = bzVar;
                                MediaDataController.getInstance(bzVar2.f24771a.F.f25072c1).searchStickerSets(true, str4, new ai.d5(bzVar2, arrayList5, runnable, 7));
                                return;
                            default:
                                d00 d00Var4 = bzVar.f24771a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(d00Var4.f25072c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = d00Var4.f25072c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19830id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new vy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19830id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19830id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList6 = stickerSet3.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new vy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19830id));
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
                }, new org.telegram.ui.tc(23, bzVar, str4), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                bz bzVar2 = bzVar;
                                MediaDataController.getInstance(bzVar2.f24771a.F.f25072c1).searchStickerSets(true, str4, new ai.d5(bzVar2, arrayList4, runnable, 7));
                                return;
                            default:
                                d00 d00Var4 = bzVar.f24771a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(d00Var4.f25072c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i14 = d00Var4.f25072c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19830id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new vy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19830id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19830id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList6 = stickerSet3.documents;
                                                        } else {
                                                            arrayList6 = null;
                                                        }
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new vy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19830id));
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
                }, new org.telegram.ui.tc(24, bzVar, arrayList3), new org.telegram.ui.wa(bzVar, str4, arrayList3, arrayList4, arrayList5));
                return;
            case 9:
                ArrayList arrayList6 = (ArrayList) obj;
                cz czVar = ((bz) obj2).f24771a;
                czVar.F.V.e(false);
                ArrayList arrayList7 = czVar.f25047r;
                if (arrayList7.size() >= arrayList6.size()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                czVar.E = z11;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                czVar.l();
                return;
            case 10:
                ((hz) obj2).F((String) obj, "", true, false, false);
                return;
            case 11:
                hz hzVar = (hz) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                d00 d00Var4 = hzVar.L;
                MessagesController.getInstance(d00Var4.f25072c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i14 = d00Var4.f25072c1;
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = hzVar.f26979w;
                hzVar.f26979w = null;
                hzVar.F(str5, "", false, false, false);
                return;
            case 12:
                o00 o00Var = (o00) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                o00Var.c();
                o00Var.h(k8Var);
                s00 s00Var = o00Var.J;
                s00Var.f30307h1 = k8Var;
                s00Var.j();
                return;
            case 13:
                ((o00) obj2).J.f30302f1 = (r00) obj;
                return;
            case 14:
                ((v10) obj2).f31348z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 15:
                ((org.telegram.ui.tc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                return;
            case 16:
                p50 p50Var = (p50) obj2;
                Uri uri = (Uri) obj;
                p50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) p50Var.f29381a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.f41073e = false;
                        m2Var.f41074f = false;
                        m2Var.f41072c = p50Var;
                        launchActivity.p0(m2Var);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    p50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 17:
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
                videoEditedInfo2.originalPath = p60Var.f29394a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = w60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = w60Var.f32293j1;
                videoEditedInfo3.estimatedDuration = w60Var.f32294k0;
                w60Var.f32293j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, p60Var.f29394a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (l60Var != null) {
                    photoEntry.ttl = l60Var.f28043c;
                    photoEntry.effectId = l60Var.d;
                }
                j60 j60Var = w60Var.f32297n;
                VideoEditedInfo videoEditedInfo4 = w60Var.S;
                if (l60Var != null && !l60Var.f28041a) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (l60Var != null) {
                    i10 = l60Var.f28042b;
                } else {
                    i10 = 0;
                }
                if (l60Var != null) {
                    j3 = l60Var.f28044e;
                } else {
                    j3 = 0;
                }
                j60Var.r(photoEntry, videoEditedInfo4, z12, i10, 0, false, j3);
                return;
            case 18:
                Bitmap bitmap = (Bitmap) obj;
                p60 p60Var2 = (p60) ((org.telegram.ui.Cells.l7) obj2).f22191b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && p60Var2.A0.size() > 1) {
                    ArrayList arrayList8 = p60Var2.A0;
                    arrayList8.add((Bitmap) hg.c.h(1, arrayList8));
                    return;
                }
                p60Var2.A0.add(bitmap);
                return;
            case 19:
                w70 w70Var2 = (w70) obj2;
                TLObject tLObject3 = (TLObject) obj;
                w70Var2.getClass();
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    if (!vector.objects.isEmpty()) {
                        w70Var2.f32320c.put(Long.valueOf(w70Var2.f32318b.admin_id), (TLRPC.User) vector.objects.get(0));
                        w70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                q70 q70Var = (q70) obj2;
                if (((TLRPC.TL_error) obj) == null && (lbVar = (w70Var = q70Var.f29727a.f30068c).f32330j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = w70Var.f32318b;
                    org.telegram.ui.yb ybVar = lbVar.f39681a;
                    ArrayList arrayList9 = ybVar.f44429o0;
                    int size = arrayList9.size();
                    int i15 = ybVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ybVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.yb.L0(ybVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) ybVar.f44428n0, (HashMap<String, ArrayList<MessageObject>>) ybVar.m0, ybVar.f44419f, ybVar.T, true).contentType >= 0) {
                        ybVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            ybVar.C0.N = true;
                            org.telegram.ui.ub ubVar = ybVar.E;
                            ubVar.s(ubVar.h, size2);
                            org.telegram.ui.yb.K0(ybVar);
                        }
                        ybVar.f44444y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((g80) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(2, editTextBoldCursor));
                return;
            case 22:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.lp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 23:
                da0 da0Var = (da0) obj2;
                if (da0Var.O0 == ((ja0) obj)) {
                    da0Var.performLongClick();
                    da0Var.O0 = null;
                    da0Var.M0.d(true);
                    return;
                }
                return;
            case 24:
                ((fa0) obj2).l((ma0) obj, false);
                return;
            case 25:
                hb0 hb0Var = (hb0) obj2;
                if (!((boolean[]) obj)[0] && (x0Var = hb0Var.U) != null) {
                    x0Var.run();
                }
                hb0Var.U = null;
                return;
            case 26:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((jb0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(4, editTextBoldCursor2));
                return;
            case 27:
                pb.c cVar = (pb.c) obj2;
                Runnable runnable = (Runnable) obj;
                cVar.getClass();
                runnable.run();
                cVar.f45434a.remove(runnable);
                return;
            case 28:
                fi0 fi0Var = (fi0) obj2;
                TLObject tLObject4 = (TLObject) obj;
                fi0Var.M = false;
                if (tLObject4 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject4;
                    fi0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        fi0Var.a(false);
                        return;
                    }
                    fi0Var.d();
                    fi0Var.f26080c.W2.N(true);
                    return;
                }
                return;
            default:
                li0 li0Var = (li0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = li0Var.f28191a;
                int i16 = li0Var.f28204x;
                int size3 = arrayList10.size();
                li0Var.f28204x = size3;
                if (i16 != size3 && li0Var.S != null) {
                    li0Var.g();
                }
                int size4 = arrayList11.size();
                int i17 = 0;
                while (i17 < size4) {
                    ii0 ii0Var = (ii0) arrayList11.get(i17);
                    if (ii0Var.f27162o && !ii0Var.f27163p) {
                        arrayList10.add(ii0Var);
                    } else if (li0.j(ii0Var.f27150a, arrayList10) == null) {
                        li0 li0Var2 = ii0Var.f27171y;
                        float f7 = li0Var2.N;
                        RectF rectF = ii0Var.f27152c;
                        RectF rectF2 = ii0Var.f27154f;
                        ma0 ma0Var = ii0Var.f27165r;
                        if (ma0Var != null) {
                            ma0Var.a();
                            ii0Var.f27167t = z16;
                            ii0Var.f27166s = z16;
                        }
                        ii0Var.f27162o = z17;
                        if (rectF.left - 1.0f <= f7) {
                            z13 = z17;
                        } else {
                            z13 = z16;
                        }
                        if (rectF.right + 1.0f >= li0Var2.getMeasuredWidth() - f7) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        ii0Var.f27155g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i18 = ii0Var.f27150a;
                            if (i18 != 3 && i18 != 2) {
                                z15 = true;
                            } else {
                                z15 = true;
                                if (li0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    ii0Var.f27153e.d(0.0f, z15);
                                    arrayList10.add(ii0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            ii0Var.f27153e.d(0.0f, z15);
                            arrayList10.add(ii0Var);
                        }
                        z15 = true;
                        ii0Var.f27153e.d(0.0f, z15);
                        arrayList10.add(ii0Var);
                    }
                    i17++;
                    z16 = false;
                    z17 = true;
                }
                arrayList11.clear();
                arrayList11.addAll(arrayList10);
                li0Var.invalidate();
                return;
        }
    }
}
