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
public final class gt implements Runnable {
    public final int f28977a;
    public final Object f28978b;
    public final Object f28979c;

    public gt(int i10, Object obj, Object obj2) {
        this.f28977a = i10;
        this.f28978b = obj;
        this.f28979c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10;
        long j10;
        n60 n60Var;
        org.telegram.ui.ab abVar;
        jh.r5 r5Var;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11 = this.f28977a;
        boolean z15 = false;
        boolean z16 = true;
        Object obj = this.f28979c;
        Object obj2 = this.f28978b;
        switch (i11) {
            case 0:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new gt(1, (ht) obj2, decodeFile));
                return;
            case 1:
                ((ht) obj2).setImage((Bitmap) obj);
                return;
            case 2:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 3:
                MessagesController.getInstance(jv.U(((su) obj2).f32719a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 4:
                MessagesController.getInstance(((ww) obj2).f34500a.Y0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 5:
                TLObject tLObject = (TLObject) obj;
                fz fzVar = ((ww) obj2).f34500a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(fzVar.Y0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(fzVar.Y0).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 6:
                vx vxVar = (vx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                vxVar.f34212s.f32405f = true;
                fz fzVar2 = vxVar.A;
                if (!fzVar2.l1.contains(Long.valueOf(tL_messages_stickerSet2.set.f22419id))) {
                    fzVar2.l1.add(Long.valueOf(tL_messages_stickerSet2.set.f22419id));
                }
                vxVar.a(true);
                return;
            case 7:
                final dy dyVar = (dy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                fz fzVar3 = dyVar.f27885a.B;
                if (!Arrays.equals(fzVar3.S0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(fzVar3.Y0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                fzVar3.S0 = currentKeyboardLanguage;
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
                                dy dyVar2 = dyVar;
                                MediaDataController.getInstance(dyVar2.f27885a.B.Y0).searchStickerSets(true, str, new ih.i(dyVar2, arrayList3, runnable, 9));
                                return;
                            default:
                                fz fzVar4 = dyVar.f27885a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(fzVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = fzVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22419id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new wx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22419id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22419id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new wx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f22419id));
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
                }, new org.telegram.ui.tm(11, dyVar, str), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                dy dyVar2 = dyVar;
                                MediaDataController.getInstance(dyVar2.f27885a.B.Y0).searchStickerSets(true, str, new ih.i(dyVar2, arrayList2, runnable, 9));
                                return;
                            default:
                                fz fzVar4 = dyVar.f27885a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(fzVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i12 = fzVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22419id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new wx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22419id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22419id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList6.add(new wx(stickerSetCovered, arrayList4));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f22419id));
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
                }, new org.telegram.ui.tm(12, dyVar, arrayList), new jh.g2(dyVar, str, arrayList, arrayList2, arrayList3, 4));
                return;
            case 8:
                ArrayList arrayList4 = (ArrayList) obj;
                ey eyVar = ((dy) obj2).f27885a;
                eyVar.B.R.e(false);
                ArrayList arrayList5 = eyVar.f28199r;
                if (arrayList5.size() >= arrayList4.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eyVar.A = z10;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                eyVar.l();
                return;
            case 9:
                ((jy) obj2).F((String) obj, "", true, false, false);
                return;
            case 10:
                jy jyVar = (jy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                fz fzVar4 = jyVar.H;
                MessagesController.getInstance(fzVar4.Y0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i12 = fzVar4.Y0;
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = jyVar.f29851w;
                jyVar.f29851w = null;
                jyVar.F(str2, "", false, false, false);
                return;
            case 11:
                qz qzVar = (qz) obj2;
                nh.n7 n7Var = (nh.n7) obj;
                qzVar.c();
                qzVar.h(n7Var);
                uz uzVar = qzVar.F;
                uzVar.f33361h1 = n7Var;
                uzVar.j();
                return;
            case 12:
                ((qz) obj2).F.f33356f1 = (tz) obj;
                return;
            case 13:
                ((y00) obj2).f34884v0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 14:
                ((org.telegram.ui.tm) obj2).run((org.telegram.ui.ActionBar.o2) obj);
                return;
            case 15:
                s40 s40Var = (s40) obj2;
                Uri uri = (Uri) obj;
                s40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) s40Var.f32469a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? o2Var = new org.telegram.ui.ActionBar.o2(bundle);
                        o2Var.f39991e = false;
                        o2Var.f39992f = false;
                        o2Var.f39990c = s40Var;
                        launchActivity.p0(o2Var);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    s40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 16:
                r50 r50Var = (r50) obj2;
                n50 n50Var = (n50) obj;
                s50 s50Var = r50Var.D0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                s50Var.J = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, s50Var.H);
                VideoEditedInfo videoEditedInfo2 = s50Var.J;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = s50Var.D;
                videoEditedInfo2.encryptedFile = s50Var.E;
                videoEditedInfo2.key = s50Var.F;
                videoEditedInfo2.iv = s50Var.G;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = r50Var.f32184a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = s50Var.J;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = s50Var.V0;
                videoEditedInfo3.estimatedDuration = s50Var.f32496b0;
                s50Var.V0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, r50Var.f32184a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (n50Var != null) {
                    photoEntry.ttl = n50Var.f30858c;
                    photoEntry.effectId = n50Var.d;
                }
                l50 l50Var = s50Var.f32497c;
                VideoEditedInfo videoEditedInfo4 = s50Var.J;
                if (n50Var != null && !n50Var.f30856a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (n50Var != null) {
                    i10 = n50Var.f30857b;
                } else {
                    i10 = 0;
                }
                if (n50Var != null) {
                    j10 = n50Var.f30859e;
                } else {
                    j10 = 0;
                }
                l50Var.r(photoEntry, videoEditedInfo4, z11, i10, 0, false, j10);
                return;
            case 17:
                Bitmap bitmap = (Bitmap) obj;
                r50 r50Var2 = (r50) ((lh.m7) obj2).f15932b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && r50Var2.f32214w0.size() > 1) {
                    ArrayList arrayList6 = r50Var2.f32214w0;
                    arrayList6.add((Bitmap) j7.l1.i(1, arrayList6));
                    return;
                }
                r50Var2.f32214w0.add(bitmap);
                return;
            case 18:
                n60 n60Var2 = (n60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                n60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        n60Var2.f30887c.put(Long.valueOf(n60Var2.f30885b.admin_id), (TLRPC.User) vector.objects.get(0));
                        n60Var2.P.l();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                h60 h60Var = (h60) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (n60Var = h60Var.f29073a.f29327c).f30893f0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = n60Var.f30885b;
                    org.telegram.ui.ob obVar = abVar.f36500a;
                    ArrayList arrayList7 = obVar.f41061o0;
                    int size = arrayList7.size();
                    int i13 = obVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = obVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ob.L0(obVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) obVar.f41060n0, (HashMap<String, ArrayList<MessageObject>>) obVar.m0, obVar.f41066s, obVar.T, true).contentType >= 0) {
                        obVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            obVar.C0.N = true;
                            org.telegram.ui.kb kbVar = obVar.E;
                            kbVar.s(kbVar.h, size2);
                            org.telegram.ui.ob.K0(obVar);
                        }
                        obVar.f41076y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((x60) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(3, editTextBoldCursor));
                return;
            case 21:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.yo) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 22:
                t80 t80Var = (t80) obj2;
                if (t80Var.K0 == ((z80) obj)) {
                    t80Var.performLongClick();
                    t80Var.K0 = null;
                    t80Var.I0.d(true);
                    return;
                }
                return;
            case 23:
                ((v80) obj2).l((c90) obj, false);
                return;
            case 24:
                y90 y90Var = (y90) obj2;
                if (!((boolean[]) obj)[0] && (r5Var = y90Var.Q) != null) {
                    r5Var.run();
                }
                y90Var.Q = null;
                return;
            case 25:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((aa0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(5, editTextBoldCursor2));
                return;
            case 26:
                k8.i0 i0Var = (k8.i0) obj2;
                Runnable runnable = (Runnable) obj;
                i0Var.getClass();
                runnable.run();
                i0Var.f13514a.remove(runnable);
                return;
            case 27:
                ug0 ug0Var = (ug0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ug0Var.I = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    ug0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        ug0Var.a(false);
                        return;
                    }
                    ug0Var.d();
                    ug0Var.f33224c.U2.N(true);
                    return;
                }
                return;
            case 28:
                zg0 zg0Var = (zg0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = zg0Var.f35338a;
                int i14 = zg0Var.f35347x;
                int size3 = arrayList8.size();
                zg0Var.f35347x = size3;
                if (i14 != size3 && zg0Var.O != null) {
                    zg0Var.g();
                }
                int size4 = arrayList9.size();
                int i15 = 0;
                while (i15 < size4) {
                    wg0 wg0Var = (wg0) arrayList9.get(i15);
                    if (wg0Var.f34411o && !wg0Var.f34412p) {
                        arrayList8.add(wg0Var);
                    } else if (zg0.j(wg0Var.f34399a, arrayList8) == null) {
                        zg0 zg0Var2 = wg0Var.f34420y;
                        float f9 = zg0Var2.J;
                        RectF rectF = wg0Var.f34401c;
                        RectF rectF2 = wg0Var.f34403f;
                        c90 c90Var = wg0Var.f34414r;
                        if (c90Var != null) {
                            c90Var.a();
                            wg0Var.f34416t = z15;
                            wg0Var.f34415s = z15;
                        }
                        wg0Var.f34411o = z16;
                        if (rectF.left - 1.0f <= f9) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (rectF.right + 1.0f >= zg0Var2.getMeasuredWidth() - f9) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z12 && z13) {
                            z13 = false;
                            z12 = false;
                        }
                        wg0Var.f34404g.set(rectF);
                        rectF2.set(rectF);
                        if (z12) {
                            rectF2.right = rectF2.left;
                        } else if (z13) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i16 = wg0Var.f34399a;
                            if (i16 != 3 && i16 != 2) {
                                z14 = true;
                            } else {
                                z14 = true;
                                if (zg0Var2.D == 1) {
                                    rectF2.left = rectF2.right;
                                    wg0Var.f34402e.d(0.0f, z14);
                                    arrayList8.add(wg0Var);
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            wg0Var.f34402e.d(0.0f, z14);
                            arrayList8.add(wg0Var);
                        }
                        z14 = true;
                        wg0Var.f34402e.d(0.0f, z14);
                        arrayList8.add(wg0Var);
                    }
                    i15++;
                    z15 = false;
                    z16 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                zg0Var.invalidate();
                return;
            default:
                wg0 wg0Var2 = (wg0) obj;
                yg0 yg0Var = ((zg0) obj2).B;
                int i17 = wg0Var2.f34399a;
                RectF rectF3 = wg0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ex0) yg0Var).f37920b, i17, rectF3.left, rectF3.top);
                return;
        }
    }
}
