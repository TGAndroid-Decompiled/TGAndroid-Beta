package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;
public final class ph implements Runnable {
    public final int f27028a;
    public final Object f27029b;
    public final Object f27030c;

    public ph(int i10, Object obj, Object obj2) {
        this.f27028a = i10;
        this.f27029b = obj;
        this.f27030c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        boolean z11 = true;
        switch (this.f27028a) {
            case 0:
                wi.u((wi) this.f27029b, (ci.e4) this.f27030c);
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f27030c;
                ((wi) this.f27029b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 2:
                wi wiVar = (wi) this.f27029b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((pi) this.f27030c).f27052c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                wiVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(wiVar.J1).updateAttachMenuBotsInCache();
                return;
            case 3:
                wi wiVar2 = (wi) this.f27029b;
                MediaDataController.getInstance(wiVar2.J1).loadAttachMenuBots(false, true);
                if (wiVar2.f29726y0 == wiVar2.f29722x0.get(((TLRPC.TL_attachMenuBot) this.f27030c).bot_id)) {
                    wiVar2.Q1(wiVar2.f29677j0);
                    return;
                }
                return;
            case 4:
                hj hjVar = (hj) this.f27029b;
                hjVar.H = false;
                hjVar.I = (ArrayList) this.f27030c;
                hjVar.P();
                return;
            case 5:
                hj hjVar2 = (hj) this.f27030c;
                ((wi) this.f27029b).Z0();
                hjVar2.L();
                hjVar2.f26744b.X1(hjVar2, 0);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ph(7, (yj) this.f27029b, ((xj) this.f27030c).run()));
                return;
            case 7:
                ((yj) this.f27029b).setStatus((CharSequence) this.f27030c);
                return;
            case 8:
                ok okVar = (ok) this.f27029b;
                String str = (String) this.f27030c;
                okVar.getClass();
                ArrayList arrayList = new ArrayList(okVar.X.v.f24986c);
                if (okVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, okVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(okVar, str, !okVar.R.isEmpty(), arrayList, 17));
                return;
            case 9:
                ok okVar2 = (ok) this.f27029b;
                ArrayList arrayList2 = (ArrayList) this.f27030c;
                pk pkVar = okVar2.X;
                boolean z12 = pkVar.f27062b0;
                ek ekVar = pkVar.f27068r;
                if (z12) {
                    s4.h0 adapter = ekVar.getAdapter();
                    ok okVar3 = pkVar.f27072y;
                    if (adapter != okVar3) {
                        ekVar.setAdapter(okVar3);
                    }
                }
                okVar2.f26763s = arrayList2;
                okVar2.l();
                return;
            case 10:
                hl hlVar = (hl) this.f27029b;
                float[] fArr = (float[]) this.f27030c;
                hlVar.getClass();
                hlVar.b0(fArr[0], fArr[1]);
                return;
            case 11:
                oi oiVar = (oi) this.f27030c;
                boolean z13 = ChatAttachAlertPhotoLayout.f21869q1;
                int currentItemTop = oiVar.getCurrentItemTop();
                int listTopPadding = oiVar.getListTopPadding();
                ul ulVar = ((ChatAttachAlertPhotoLayout) this.f27029b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ulVar.scrollBy(0, listTopPadding);
                return;
            case 12:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f27030c;
                em emVar = ((ChatAttachAlertPhotoLayout) this.f27029b).P;
                if (emVar != null) {
                    emVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 13:
                oi oiVar2 = (oi) this.f27030c;
                int currentItemTop2 = oiVar2.getCurrentItemTop();
                int listTopPadding2 = oiVar2.getListTopPadding();
                ai.w0 w0Var = ((rm) this.f27029b).f27671r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 14:
                ko.a(((io) this.f27029b).f25016c);
                ((hg.h) this.f27030c).run();
                return;
            case 15:
                ((ip) this.f27029b).f25040b.x((List) this.f27030c);
                return;
            case 16:
                ((jp) this.f27029b).f25383b.x((List) this.f27030c);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.f3) this.f27029b).dismiss();
                nf.f.s((Context) this.f27030c, "https://t.me/BotFather?start=deletebot");
                return;
            case 18:
                nr nrVar = (nr) this.f27029b;
                nrVar.getClass();
                ((ci.d) this.f27030c).setLoading(false);
                nrVar.dismiss();
                return;
            case 19:
                nr nrVar2 = (nr) this.f27029b;
                TLObject tLObject = (TLObject) this.f27030c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    nrVar2.f26498b0 = groupcallstreamrtmpurl.url;
                    nrVar2.f26499c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nrVar2.f26499c0);
                    nrVar2.f26500d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f26312a |= 256;
                    obj.f26313b = 0;
                    obj.f26314c = spannableStringBuilder.length();
                    nrVar2.f26500d0.setSpan(new o01(obj, 0), 0, nrVar2.f26500d0.length(), 0);
                    nrVar2.f26501e0.N(false);
                    return;
                }
                return;
            case 20:
                rs rsVar = (rs) this.f27029b;
                TLObject tLObject2 = (TLObject) this.f27030c;
                ns nsVar = rsVar.f27714b;
                ArrayList arrayList3 = rsVar.h;
                int i10 = rsVar.f27713a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i10).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i10).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    rsVar.f27717g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    rsVar.f27716f = currentTimeMillis;
                    if (!rsVar.f27718i) {
                        rsVar.f27718i = true;
                        String str3 = rsVar.f27717g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList3.size(); i11 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i11)).f18230id, arrayList4, i11, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(rsVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    rsVar.f27715c = false;
                    nsVar.run();
                    return;
                }
                rsVar.f27717g = null;
                rsVar.e = true;
                rsVar.f27715c = false;
                nsVar.run();
                return;
            case 21:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f27030c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new ph(22, (qt) this.f27029b, decodeFile));
                return;
            case 22:
                ((qt) this.f27029b).setImage((Bitmap) this.f27030c);
                return;
            case 23:
                ((EditTextBoldCursor) this.f27029b).hintLayout.draw((Canvas) this.f27030c);
                return;
            case 24:
                MessagesController.getInstance(tv.U(((cv) this.f27029b).f23106a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f27030c);
                return;
            case 25:
                MessagesController.getInstance(((ex) this.f27029b).f23755a.f25968c1).updateEmojiStatus((TLRPC.EmojiStatus) this.f27030c);
                return;
            case 26:
                TLObject tLObject3 = (TLObject) this.f27030c;
                lz lzVar = ((ex) this.f27029b).f23755a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(lzVar.f25968c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(lzVar.f25968c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 27:
                cy cyVar = (cy) this.f27029b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.f27030c;
                cyVar.f23133s.f30090f = true;
                lz lzVar2 = cyVar.E;
                if (!lzVar2.f26007p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18110id))) {
                    lzVar2.f26007p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18110id));
                }
                cyVar.a(true);
                return;
            case 28:
                final jy jyVar = (jy) this.f27029b;
                final String str5 = (String) this.f27030c;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                lz lzVar3 = jyVar.f25438a.F;
                if (!Arrays.equals(lzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(lzVar3.f25968c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                lzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList5 = new ArrayList();
                final ArrayList arrayList6 = new ArrayList();
                final ArrayList arrayList7 = new ArrayList();
                Utilities.doCallbacks(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList8;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList9;
                        Runnable runnable = (Runnable) obj2;
                        switch (r4) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.f25438a.F.f25968c1).searchStickerSets(true, str5, new ai.c5(jyVar2, arrayList7, runnable, 7));
                                return;
                            default:
                                lz lzVar4 = jyVar.f25438a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar4.f25968c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i12 = lzVar4.f25968c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList10 = arrayList7;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList9 = tL_messages_stickerSet3.documents) != null && !arrayList9.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18110id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList10.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18110id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18110id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList8 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i12).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList8 = stickerSet3.documents;
                                                        } else {
                                                            arrayList8 = null;
                                                        }
                                                    } else {
                                                        arrayList8 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                                                        arrayList10.add(new dy(stickerSetCovered, arrayList8));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18110id));
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
                }, new org.telegram.ui.oc(23, jyVar, str5), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList8;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList9;
                        Runnable runnable = (Runnable) obj2;
                        switch (r4) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.f25438a.F.f25968c1).searchStickerSets(true, str5, new ai.c5(jyVar2, arrayList6, runnable, 7));
                                return;
                            default:
                                lz lzVar4 = jyVar.f25438a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar4.f25968c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i12 = lzVar4.f25968c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList10 = arrayList6;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList9 = tL_messages_stickerSet3.documents) != null && !arrayList9.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18110id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList10.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18110id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18110id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList8 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i12).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        if (stickerSet3 != null) {
                                                            arrayList8 = stickerSet3.documents;
                                                        } else {
                                                            arrayList8 = null;
                                                        }
                                                    } else {
                                                        arrayList8 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList8 != null && !arrayList8.isEmpty()) {
                                                        arrayList10.add(new dy(stickerSetCovered, arrayList8));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18110id));
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
                }, new org.telegram.ui.oc(24, jyVar, arrayList5), new org.telegram.ui.sa(jyVar, str5, arrayList5, arrayList6, arrayList7));
                return;
            default:
                ArrayList arrayList8 = (ArrayList) this.f27030c;
                ky kyVar = ((jy) this.f27029b).f25438a;
                kyVar.F.V.e(false);
                ArrayList arrayList9 = kyVar.f25717r;
                if (arrayList9.size() < arrayList8.size()) {
                    z11 = false;
                }
                kyVar.E = z11;
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                kyVar.l();
                return;
        }
    }

    public ph(hj hjVar, wi wiVar) {
        this.f27028a = 5;
        this.f27030c = hjVar;
        this.f27029b = wiVar;
    }
}
