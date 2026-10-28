package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
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
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class so implements Runnable {
    public final int f32650a;
    public final Object f32651b;
    public final Object f32652c;

    public so(int i10, Object obj, Object obj2) {
        this.f32650a = i10;
        this.f32651b = obj;
        this.f32652c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        String str;
        ys ysVar;
        Bitmap createBitmap;
        boolean z11;
        long j10;
        o70 o70Var;
        org.telegram.ui.jb jbVar;
        int i10 = this.f32650a;
        String str2 = "";
        boolean z12 = false;
        int i11 = 0;
        Object obj = this.f32652c;
        Object obj2 = this.f32651b;
        switch (i10) {
            case 0:
                vo.a(((to) obj2).f33114c);
                ((jg.g) obj).run();
                return;
            case 1:
                ((vp) obj2).f34345b.C((List) obj);
                return;
            case 2:
                ((wp) obj2).f34558b.C((List) obj);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.k3) obj2).dismiss();
                qf.d.r((Context) obj, "https://t.me/BotFather?start=deletebot");
                return;
            case 4:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) obj2;
                TreeSet treeSet = (TreeSet) obj;
                String charSequence = g3Var.getText().toString();
                if (!pr.a(charSequence, "bot") && pr.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.e3 e3Var = g3Var.d;
                e3Var.setRightText(str2);
                int dp = AndroidUtilities.dp(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                e3Var.setPadding(0, dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(15.0f));
                return;
            case 5:
                zr zrVar = (zr) obj2;
                zrVar.getClass();
                ((fi.d) obj).setLoading(false);
                zrVar.dismiss();
                return;
            case 6:
                zr zrVar2 = (zr) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    zrVar2.f35431b0 = groupcallstreamrtmpurl.url;
                    zrVar2.f35432c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zrVar2.f35432c0);
                    zrVar2.f35433d0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f35208a |= 256;
                    obj3.f35209b = 0;
                    obj3.f35210c = spannableStringBuilder.length();
                    zrVar2.f35433d0.setSpan(new a21(obj3, 0), 0, zrVar2.f35433d0.length(), 0);
                    zrVar2.f35434e0.O(false);
                    return;
                }
                return;
            case 7:
                bt btVar = (bt) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ys ysVar2 = btVar.f26908b;
                ArrayList arrayList = btVar.h;
                int i12 = btVar.f26907a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    btVar.f26911g = str3;
                    if (str3 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    btVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    btVar.f26910f = currentTimeMillis;
                    if (btVar.f26912i) {
                        ysVar = ysVar2;
                    } else {
                        btVar.f26912i = true;
                        String str4 = btVar.f26911g;
                        if (str4 == null) {
                            str = "";
                        } else {
                            str = str4;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            i13 = c3.h0.j(((TLRPC.User) arrayList.get(i13)).f22177id, arrayList2, i13, 1);
                            ysVar2 = ysVar2;
                        }
                        ysVar = ysVar2;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new bi.a0(btVar, messagesStorage, arrayList2, currentTimeMillis, str, 11));
                    }
                    btVar.f26909c = false;
                    ysVar.run();
                    return;
                }
                btVar.f26911g = null;
                btVar.e = true;
                btVar.f26909c = false;
                ysVar2.run();
                return;
            case 8:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new so(9, (zt) obj2, decodeFile));
                return;
            case 9:
                ((zt) obj2).setImage((Bitmap) obj);
                return;
            case 10:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 11:
                MessagesController.getInstance(aw.e0(((jv) obj2).f29769a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 12:
                MessagesController.getInstance(((lx) obj2).f30311a.f32713c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 13:
                TLObject tLObject3 = (TLObject) obj;
                sz szVar = ((lx) obj2).f30311a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(szVar.f32713c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(szVar.f32713c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 14:
                iy iyVar = (iy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                iyVar.f29441w.f27960f = true;
                sz szVar2 = iyVar.G;
                if (!szVar2.f32752p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f22055id))) {
                    szVar2.f32752p1.add(Long.valueOf(tL_messages_stickerSet2.set.f22055id));
                }
                iyVar.a(true);
                return;
            case 15:
                final ry ryVar = (ry) obj2;
                final String str5 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                sz szVar3 = ryVar.f32398a.F;
                if (!Arrays.equals(szVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(szVar3.f32713c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                szVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                Utilities.doCallbacks(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                ry ryVar2 = ryVar;
                                MediaDataController.getInstance(ryVar2.f32398a.F.f32713c1).searchStickerSets(true, str5, new bi.v3(ryVar2, arrayList5, runnable, 8));
                                return;
                            default:
                                sz szVar4 = ryVar.f32398a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(szVar4.f32713c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i14 = szVar4.f32713c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22055id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new jy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22055id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22055id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new jy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f22055id));
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
                }, new oy(1, ryVar, str5), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                ry ryVar2 = ryVar;
                                MediaDataController.getInstance(ryVar2.f32398a.F.f32713c1).searchStickerSets(true, str5, new bi.v3(ryVar2, arrayList4, runnable, 8));
                                return;
                            default:
                                sz szVar4 = ryVar.f32398a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(szVar4.f32713c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i14 = szVar4.f32713c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f22055id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new jy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f22055id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f22055id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new jy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f22055id));
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
                }, new oy(2, ryVar, arrayList3), new bi.b3(ryVar, str5, arrayList3, arrayList4, arrayList5, 4));
                return;
            case 16:
                ArrayList arrayList6 = (ArrayList) obj;
                sy syVar = ((ry) obj2).f32398a;
                syVar.F.V.e(false);
                ArrayList arrayList7 = syVar.f32698r;
                if (arrayList7.size() >= arrayList6.size()) {
                    z12 = true;
                }
                syVar.E = z12;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                syVar.l();
                return;
            case 17:
                ((xy) obj2).F((String) obj, "", true, false, false);
                return;
            case 18:
                xy xyVar = (xy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                int i14 = xyVar.L.f32713c1;
                MessagesController.getInstance(i14).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = xyVar.f34880w;
                xyVar.f34880w = null;
                xyVar.F(str6, "", false, false, false);
                return;
            case 19:
                e00 e00Var = (e00) obj2;
                fi.v7 v7Var = (fi.v7) obj;
                e00Var.c();
                e00Var.h(v7Var);
                i00 i00Var = e00Var.J;
                i00Var.f29132h1 = v7Var;
                i00Var.j();
                return;
            case 20:
                ((e00) obj2).J.f29127f1 = (h00) obj;
                return;
            case 21:
                ((n10) obj2).f30722z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 22:
                ((oy) obj2).run((org.telegram.ui.ActionBar.r2) obj);
                return;
            case 23:
                g50 g50Var = (g50) obj2;
                Uri uri = (Uri) obj;
                g50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) g50Var.f28388a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? r2Var = new org.telegram.ui.ActionBar.r2(bundle);
                        r2Var.e = false;
                        r2Var.f39417f = false;
                        r2Var.f39416c = g50Var;
                        launchActivity.u0(r2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    g50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 24:
                h60 h60Var = (h60) obj2;
                c60 c60Var = (c60) obj;
                p60 p60Var = h60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                p60Var.R = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, p60Var.P);
                VideoEditedInfo videoEditedInfo2 = p60Var.R;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = p60Var.L;
                videoEditedInfo2.encryptedFile = p60Var.M;
                videoEditedInfo2.key = p60Var.N;
                videoEditedInfo2.iv = p60Var.O;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = h60Var.f28870a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = p60Var.R;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = p60Var.f31485i1;
                videoEditedInfo3.estimatedDuration = p60Var.f31486j0;
                p60Var.f31485i1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, h60Var.f28870a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (c60Var != null) {
                    photoEntry.ttl = c60Var.f27080c;
                    photoEntry.effectId = c60Var.d;
                }
                a60 a60Var = p60Var.h;
                VideoEditedInfo videoEditedInfo4 = p60Var.R;
                if (c60Var != null && !c60Var.f27078a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (c60Var != null) {
                    i11 = c60Var.f27079b;
                }
                int i15 = i11;
                if (c60Var != null) {
                    j10 = c60Var.e;
                } else {
                    j10 = 0;
                }
                a60Var.r(photoEntry, videoEditedInfo4, z11, i15, 0, false, j10);
                return;
            case 25:
                Bitmap bitmap = (Bitmap) obj;
                h60 h60Var2 = (h60) ((m.g3) obj2).f17724b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && h60Var2.A0.size() > 1) {
                    ArrayList arrayList8 = h60Var2.A0;
                    arrayList8.add((Bitmap) ic.a.g(1, arrayList8));
                    return;
                }
                h60Var2.A0.add(bitmap);
                return;
            case 26:
                o70 o70Var2 = (o70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                o70Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        o70Var2.f31211c.put(Long.valueOf(o70Var2.f31209b.admin_id), (TLRPC.User) vector.objects.get(0));
                        o70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                i70 i70Var = (i70) obj2;
                if (((TLRPC.TL_error) obj) == null && (jbVar = (o70Var = i70Var.f29232a.f29532c).f31220j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = o70Var.f31209b;
                    org.telegram.ui.wb wbVar = jbVar.f40502a;
                    ArrayList arrayList9 = wbVar.f44604o0;
                    int size = arrayList9.size();
                    int i16 = wbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.wb.M0(wbVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.f44603n0, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f44594f, wbVar.T, true).contentType >= 0) {
                        wbVar.S0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            wbVar.C0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.E;
                            sbVar.s(sbVar.h, size2);
                            org.telegram.ui.wb.L0(wbVar);
                        }
                        wbVar.f44619y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((z70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new p70(editTextBoldCursor, 1));
                return;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.cp) obj).presentFragment(new ProfileActivity(bundle2, null));
                return;
        }
    }
}
