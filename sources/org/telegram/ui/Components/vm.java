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
public final class vm implements Runnable {
    public final int f29754a;
    public final Object f29755b;
    public final Object f29756c;

    public vm(int i10, Object obj, Object obj2) {
        this.f29754a = i10;
        this.f29755b = obj;
        this.f29756c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        String str;
        Bitmap createBitmap;
        boolean z11;
        long j10;
        p70 p70Var;
        org.telegram.ui.mb mbVar;
        int i10 = this.f29754a;
        String str2 = "";
        boolean z12 = true;
        int i11 = 0;
        Object obj = this.f29756c;
        Object obj2 = this.f29755b;
        switch (i10) {
            case 0:
                ni niVar = (ni) obj;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                bi.o0 o0Var = ((en) obj2).f24433r;
                if (currentItemTop > AndroidUtilities.dp(7.0f)) {
                    listTopPadding -= currentItemTop;
                }
                o0Var.scrollBy(0, listTopPadding);
                return;
            case 1:
                wo.a(((uo) obj2).f29412c);
                ((ig.g) obj).run();
                return;
            case 2:
                ((up) obj2).f29416b.z((List) obj);
                return;
            case 3:
                ((vp) obj2).f30289b.z((List) obj);
                return;
            case 4:
                ((org.telegram.ui.ActionBar.e3) obj2).dismiss();
                pf.d.r((Context) obj, "https://t.me/BotFather?start=deletebot");
                return;
            case 5:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) obj2;
                TreeSet treeSet = (TreeSet) obj;
                String charSequence = j3Var.getText().toString();
                if (!qr.a(charSequence, "bot") && qr.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.h3 h3Var = j3Var.f21083b;
                h3Var.setRightText(str2);
                int dp = AndroidUtilities.dp(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                h3Var.setPadding(0, dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(15.0f));
                return;
            case 6:
                as asVar = (as) obj2;
                asVar.getClass();
                ((di.d) obj).setLoading(false);
                asVar.dismiss();
                return;
            case 7:
                as asVar2 = (as) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    asVar2.f23290b0 = groupcallstreamrtmpurl.url;
                    asVar2.f23291c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(asVar2.f23291c0);
                    asVar2.f23292d0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f28163a |= 256;
                    obj3.f28164b = 0;
                    obj3.f28165c = spannableStringBuilder.length();
                    asVar2.f23292d0.setSpan(new r11(obj3, 0), 0, asVar2.f23292d0.length(), 0);
                    asVar2.f23293e0.N(false);
                    return;
                }
                return;
            case 8:
                dt dtVar = (dt) obj2;
                TLObject tLObject2 = (TLObject) obj;
                zs zsVar = dtVar.f24179b;
                ArrayList arrayList = dtVar.h;
                int i12 = dtVar.f24178a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    dtVar.f24182g = str3;
                    if (str3 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dtVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    dtVar.f24181f = currentTimeMillis;
                    if (!dtVar.f24183i) {
                        dtVar.f24183i = true;
                        String str4 = dtVar.f24182g;
                        if (str4 == null) {
                            str = "";
                        } else {
                            str = str4;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList.size(); i13 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.User) arrayList.get(i13)).f19063id, arrayList2, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(dtVar, messagesStorage, arrayList2, currentTimeMillis, str, 3));
                    }
                    dtVar.f24180c = false;
                    zsVar.run();
                    return;
                }
                dtVar.f24182g = null;
                dtVar.e = true;
                dtVar.f24180c = false;
                zsVar.run();
                return;
            case 9:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new vm(10, (cu) obj2, decodeFile));
                return;
            case 10:
                ((cu) obj2).setImage((Bitmap) obj);
                return;
            case 11:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 12:
                MessagesController.getInstance(ew.V(((nv) obj2).f27418a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 13:
                MessagesController.getInstance(((px) obj2).f28126a.f30707c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 14:
                TLObject tLObject3 = (TLObject) obj;
                wz wzVar = ((px) obj2).f28126a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(wzVar.f30707c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(wzVar.f30707c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 15:
                ny nyVar = (ny) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                nyVar.f27443s.f26153f = true;
                wz wzVar2 = nyVar.E;
                if (!wzVar2.f30746p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18943id))) {
                    wzVar2.f30746p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18943id));
                }
                nyVar.a(true);
                return;
            case 16:
                final uy uyVar = (uy) obj2;
                final String str5 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                wz wzVar3 = uyVar.f29486a.F;
                if (!Arrays.equals(wzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(wzVar3.f30707c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                wzVar3.W0 = currentKeyboardLanguage;
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
                                uy uyVar2 = uyVar;
                                MediaDataController.getInstance(uyVar2.f29486a.F.f30707c1).searchStickerSets(true, str5, new bi.q4(uyVar2, arrayList5, runnable, 7));
                                return;
                            default:
                                wz wzVar4 = uyVar.f29486a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wzVar4.f30707c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i14 = wzVar4.f30707c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18943id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new oy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18943id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18943id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new oy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18943id));
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
                }, new org.telegram.ui.uc(23, uyVar, str5), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj4) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj4;
                        switch (r4) {
                            case 0:
                                uy uyVar2 = uyVar;
                                MediaDataController.getInstance(uyVar2.f29486a.F.f30707c1).searchStickerSets(true, str5, new bi.q4(uyVar2, arrayList4, runnable, 7));
                                return;
                            default:
                                wz wzVar4 = uyVar.f29486a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wzVar4.f30707c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i14 = wzVar4.f30707c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18943id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new oy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18943id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18943id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList8.add(new oy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18943id));
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
                }, new org.telegram.ui.uc(24, uyVar, arrayList3), new org.telegram.ui.xa(uyVar, str5, arrayList3, arrayList4, arrayList5));
                return;
            case 17:
                ArrayList arrayList6 = (ArrayList) obj;
                vy vyVar = ((uy) obj2).f29486a;
                vyVar.F.V.e(false);
                ArrayList arrayList7 = vyVar.f30343r;
                if (arrayList7.size() < arrayList6.size()) {
                    z12 = false;
                }
                vyVar.E = z12;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                vyVar.l();
                return;
            case 18:
                ((az) obj2).F((String) obj, "", true, false, false);
                return;
            case 19:
                az azVar = (az) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                wz wzVar4 = azVar.L;
                MessagesController.getInstance(wzVar4.f30707c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i14 = wzVar4.f30707c1;
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = azVar.f23323w;
                azVar.f23323w = null;
                azVar.F(str6, "", false, false, false);
                return;
            case 20:
                h00 h00Var = (h00) obj2;
                di.j8 j8Var = (di.j8) obj;
                h00Var.c();
                h00Var.h(j8Var);
                l00 l00Var = h00Var.J;
                l00Var.f26536h1 = j8Var;
                l00Var.j();
                return;
            case 21:
                ((h00) obj2).J.f26531f1 = (k00) obj;
                return;
            case 22:
                ((o10) obj2).f27495z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 23:
                ((org.telegram.ui.uc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                return;
            case 24:
                i50 i50Var = (i50) obj2;
                Uri uri = (Uri) obj;
                i50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) i50Var.f25498a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.e = false;
                        m2Var.f39574f = false;
                        m2Var.f39573c = i50Var;
                        launchActivity.p0(m2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    i50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 25:
                i60 i60Var = (i60) obj2;
                e60 e60Var = (e60) obj;
                p60 p60Var = i60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                p60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, p60Var.Q);
                VideoEditedInfo videoEditedInfo2 = p60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = p60Var.M;
                videoEditedInfo2.encryptedFile = p60Var.N;
                videoEditedInfo2.key = p60Var.O;
                videoEditedInfo2.iv = p60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = i60Var.f25526a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = p60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = p60Var.f27871j1;
                videoEditedInfo3.estimatedDuration = p60Var.f27872k0;
                p60Var.f27871j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, i60Var.f25526a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (e60Var != null) {
                    photoEntry.ttl = e60Var.f24316c;
                    photoEntry.effectId = e60Var.d;
                }
                c60 c60Var = p60Var.f27875n;
                VideoEditedInfo videoEditedInfo4 = p60Var.S;
                if (e60Var != null && !e60Var.f24314a) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (e60Var != null) {
                    i11 = e60Var.f24315b;
                }
                int i15 = i11;
                if (e60Var != null) {
                    j10 = e60Var.e;
                } else {
                    j10 = 0;
                }
                c60Var.s(photoEntry, videoEditedInfo4, z11, i15, 0, false, j10);
                return;
            case 26:
                Bitmap bitmap = (Bitmap) obj;
                i60 i60Var2 = (i60) ((org.telegram.ui.Cells.l7) obj2).f21186b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && i60Var2.A0.size() > 1) {
                    ArrayList arrayList8 = i60Var2.A0;
                    arrayList8.add((Bitmap) i2.d.h(1, arrayList8));
                    return;
                }
                i60Var2.A0.add(bitmap);
                return;
            case 27:
                p70 p70Var2 = (p70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                p70Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        p70Var2.f27901c.put(Long.valueOf(p70Var2.f27899b.admin_id), (TLRPC.User) vector.objects.get(0));
                        p70Var2.T.l();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                j70 j70Var = (j70) obj2;
                if (((TLRPC.TL_error) obj) == null && (mbVar = (p70Var = j70Var.f25905a.f26233c).f27910j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = p70Var.f27899b;
                    org.telegram.ui.ac acVar = mbVar.f37958a;
                    ArrayList arrayList9 = acVar.f33852o0;
                    int size = arrayList9.size();
                    int i16 = acVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = acVar.getAccountInstance().getUserConfig().clientUserId;
                    if (new MessageObject(org.telegram.ui.ac.L0(acVar), tL_channelAdminLogEvent, (ArrayList<MessageObject>) acVar.f33851n0, (HashMap<String, ArrayList<MessageObject>>) acVar.m0, acVar.f33842f, acVar.T, true).contentType >= 0) {
                        acVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            acVar.C0.N = true;
                            org.telegram.ui.wb wbVar = acVar.E;
                            wbVar.s(wbVar.h, size2);
                            org.telegram.ui.ac.K0(acVar);
                        }
                        acVar.f33867y0.remove(tL_chatInviteExported.link);
                        return;
                    }
                    return;
                }
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((z70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(2, editTextBoldCursor));
                return;
        }
    }
}
