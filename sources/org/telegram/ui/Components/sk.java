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
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
public final class sk implements Runnable {
    public final int f29147a;
    public final Object f29148b;
    public final Object f29149c;

    public sk(int i10, Object obj, Object obj2) {
        this.f29147a = i10;
        this.f29148b = obj;
        this.f29149c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        String str;
        boolean z11;
        Bitmap createBitmap;
        int i10 = this.f29147a;
        String str2 = "";
        boolean z12 = true;
        Object obj = this.f29149c;
        Object obj2 = this.f29148b;
        switch (i10) {
            case 0:
                vi viVar = ((dl) obj2).f27671b;
                viVar.dismiss();
                viVar.f30001f0.presentFragment(org.telegram.ui.fo.W9(((TLRPC.User) obj).f19363id));
                return;
            case 1:
                org.telegram.messenger.q.r(R.string.WalletAddressCopiedBulletin, new zc((dl) obj2, (org.telegram.ui.ActionBar.c6) obj), R.raw.copy, 36);
                return;
            case 2:
                ul ulVar = (ul) obj2;
                float[] fArr = (float[]) obj;
                ulVar.getClass();
                ulVar.e0(fArr[0], fArr[1]);
                return;
            case 3:
                ni niVar = (ni) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f23018q1;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                hm hmVar = ((ChatAttachAlertPhotoLayout) obj2).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                hmVar.scrollBy(0, listTopPadding);
                return;
            case 4:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) obj;
                rm rmVar = ((ChatAttachAlertPhotoLayout) obj2).P;
                if (rmVar != null) {
                    rmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 5:
                ni niVar2 = (ni) obj;
                int currentItemTop2 = niVar2.getCurrentItemTop();
                int listTopPadding2 = niVar2.getListTopPadding();
                bi.o0 o0Var = ((en) obj2).f24746r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                o0Var.scrollBy(0, listTopPadding2);
                return;
            case 6:
                wo.a(((uo) obj2).f29742c);
                ((ig.g) obj).run();
                return;
            case 7:
                ((up) obj2).f29746b.z((List) obj);
                return;
            case 8:
                ((vp) obj2).f30620b.z((List) obj);
                return;
            case 9:
                ((org.telegram.ui.ActionBar.e3) obj2).dismiss();
                pf.d.s((Context) obj, "https://t.me/BotFather?start=deletebot");
                return;
            case 10:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) obj2;
                TreeSet treeSet = (TreeSet) obj;
                String charSequence = j3Var.getText().toString();
                if (!qr.a(charSequence, "bot") && qr.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.h3 h3Var = j3Var.f21368b;
                h3Var.setRightText(str2);
                int dp = AndroidUtilities.dp(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                h3Var.setPadding(0, dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(15.0f));
                return;
            case 11:
                as asVar = (as) obj2;
                asVar.getClass();
                ((di.d) obj).setLoading(false);
                asVar.dismiss();
                return;
            case 12:
                as asVar2 = (as) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    asVar2.f23611b0 = groupcallstreamrtmpurl.url;
                    asVar2.f23612c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(asVar2.f23612c0);
                    asVar2.f23613d0 = spannableStringBuilder;
                    ?? obj3 = new Object();
                    obj3.f28135a |= 256;
                    obj3.f28136b = 0;
                    obj3.f28137c = spannableStringBuilder.length();
                    asVar2.f23613d0.setSpan(new q11(obj3, 0), 0, asVar2.f23613d0.length(), 0);
                    asVar2.f23614e0.N(false);
                    return;
                }
                return;
            case 13:
                dt dtVar = (dt) obj2;
                TLObject tLObject2 = (TLObject) obj;
                zs zsVar = dtVar.f24485b;
                ArrayList arrayList = dtVar.h;
                int i11 = dtVar.f24484a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i11).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i11).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    dtVar.f24488g = str3;
                    if (str3 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dtVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    dtVar.f24487f = currentTimeMillis;
                    if (dtVar.f24489i) {
                        z11 = false;
                    } else {
                        dtVar.f24489i = true;
                        String str4 = dtVar.f24488g;
                        if (str4 == null) {
                            str = "";
                        } else {
                            str = str4;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < arrayList.size(); i12 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.User) arrayList.get(i12)).f19363id, arrayList2, i12, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(dtVar, messagesStorage, arrayList2, currentTimeMillis, str, 3));
                        z11 = false;
                    }
                    dtVar.f24486c = z11;
                    zsVar.run();
                    return;
                }
                dtVar.f24488g = null;
                dtVar.e = true;
                dtVar.f24486c = false;
                zsVar.run();
                return;
            case 14:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new sk(15, (cu) obj2, decodeFile));
                return;
            case 15:
                ((cu) obj2).setImage((Bitmap) obj);
                return;
            case 16:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                return;
            case 17:
                MessagesController.getInstance(ew.V(((nv) obj2).f27719a)).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 18:
                MessagesController.getInstance(((px) obj2).f28440a.f31014c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                return;
            case 19:
                TLObject tLObject3 = (TLObject) obj;
                wz wzVar = ((px) obj2).f28440a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(wzVar.f31014c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(wzVar.f31014c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 20:
                ny nyVar = (ny) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                nyVar.f27744s.f26516f = true;
                wz wzVar2 = nyVar.E;
                if (!wzVar2.f31053p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f19243id))) {
                    wzVar2.f31053p1.add(Long.valueOf(tL_messages_stickerSet2.set.f19243id));
                }
                nyVar.a(true);
                return;
            case 21:
                final uy uyVar = (uy) obj2;
                final String str5 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                wz wzVar3 = uyVar.f29818a.F;
                if (!Arrays.equals(wzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(wzVar3.f31014c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
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
                                MediaDataController.getInstance(uyVar2.f29818a.F.f31014c1).searchStickerSets(true, str5, new bi.q4(uyVar2, arrayList5, runnable, 7));
                                return;
                            default:
                                wz wzVar4 = uyVar.f29818a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wzVar4.f31014c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i13 = wzVar4.f31014c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i13).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i14 = 0; i14 < stickerSets.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19243id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new oy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19243id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i13).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i15 = 0; i15 < featuredEmojiSets.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19243id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i13).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19243id));
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
                }, new org.telegram.ui.vc(23, uyVar, str5), new Utilities.Callback() {
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
                                MediaDataController.getInstance(uyVar2.f29818a.F.f31014c1).searchStickerSets(true, str5, new bi.q4(uyVar2, arrayList4, runnable, 7));
                                return;
                            default:
                                wz wzVar4 = uyVar.f29818a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wzVar4.f31014c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i13 = wzVar4.f31014c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i13).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i14 = 0; i14 < stickerSets.size(); i14++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i14);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f19243id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new oy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f19243id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i13).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i15 = 0; i15 < featuredEmojiSets.size(); i15++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i15);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f19243id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i13).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f19243id));
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
                }, new org.telegram.ui.vc(24, uyVar, arrayList3), new org.telegram.ui.xa(uyVar, str5, arrayList3, arrayList4, arrayList5));
                return;
            case 22:
                ArrayList arrayList6 = (ArrayList) obj;
                vy vyVar = ((uy) obj2).f29818a;
                vyVar.F.V.e(false);
                ArrayList arrayList7 = vyVar.f30674r;
                if (arrayList7.size() < arrayList6.size()) {
                    z12 = false;
                }
                vyVar.E = z12;
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                vyVar.l();
                return;
            case 23:
                ((az) obj2).F((String) obj, "", true, false, false);
                return;
            case 24:
                az azVar = (az) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                wz wzVar4 = azVar.L;
                MessagesController.getInstance(wzVar4.f31014c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i13 = wzVar4.f31014c1;
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = azVar.f23644w;
                azVar.f23644w = null;
                azVar.F(str6, "", false, false, false);
                return;
            case 25:
                h00 h00Var = (h00) obj2;
                di.j8 j8Var = (di.j8) obj;
                h00Var.c();
                h00Var.h(j8Var);
                l00 l00Var = h00Var.J;
                l00Var.f26865h1 = j8Var;
                l00Var.j();
                return;
            case 26:
                ((h00) obj2).J.f26860f1 = (k00) obj;
                return;
            case 27:
                ((o10) obj2).f27792z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 28:
                ((org.telegram.ui.vc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                return;
            default:
                i50 i50Var = (i50) obj2;
                Uri uri = (Uri) obj;
                i50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) i50Var.f25829a.getParentActivity();
                    if (launchActivity != 0) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        ?? m2Var = new org.telegram.ui.ActionBar.m2(bundle);
                        m2Var.e = false;
                        m2Var.f40474f = false;
                        m2Var.f40473c = i50Var;
                        launchActivity.p0(m2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    i50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
        }
    }
}
