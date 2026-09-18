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
public final class oh implements Runnable {
    public final int f26734a;
    public final Object f26735b;
    public final Object f26736c;

    public oh(int i10, Object obj, Object obj2) {
        this.f26734a = i10;
        this.f26735b = obj;
        this.f26736c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        boolean z11 = true;
        switch (this.f26734a) {
            case 0:
                ((vi) this.f26735b).containerView.removeView((ci.f4) this.f26736c);
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f26736c;
                ((vi) this.f26735b).dismiss(true);
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 2:
                vi viVar = (vi) this.f26735b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((oi) this.f26736c).f26741c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar.J1).updateAttachMenuBotsInCache();
                return;
            case 3:
                vi viVar2 = (vi) this.f26735b;
                MediaDataController.getInstance(viVar2.J1).loadAttachMenuBots(false, true);
                if (viVar2.f28806y0 == viVar2.f28802x0.get(((TLRPC.TL_attachMenuBot) this.f26736c).bot_id)) {
                    viVar2.Q1(viVar2.f28757j0);
                    return;
                }
                return;
            case 4:
                gj gjVar = (gj) this.f26735b;
                gjVar.H = false;
                gjVar.I = (ArrayList) this.f26736c;
                gjVar.P();
                return;
            case 5:
                gj gjVar2 = (gj) this.f26736c;
                ((vi) this.f26735b).Z0();
                gjVar2.L();
                gjVar2.f26463b.X1(gjVar2, 0);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new oh(7, (xj) this.f26735b, ((wj) this.f26736c).run()));
                return;
            case 7:
                ((xj) this.f26735b).setStatus((CharSequence) this.f26736c);
                return;
            case 8:
                nk nkVar = (nk) this.f26735b;
                String str = (String) this.f26736c;
                nkVar.getClass();
                ArrayList arrayList = new ArrayList(nkVar.X.v.f24681c);
                if (nkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, nkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(nkVar, str, !nkVar.R.isEmpty(), arrayList, 17));
                return;
            case 9:
                nk nkVar2 = (nk) this.f26735b;
                ArrayList arrayList2 = (ArrayList) this.f26736c;
                ok okVar = nkVar2.X;
                boolean z12 = okVar.f26760b0;
                dk dkVar = okVar.f26766r;
                if (z12) {
                    s4.h0 adapter = dkVar.getAdapter();
                    nk nkVar3 = okVar.f26770y;
                    if (adapter != nkVar3) {
                        dkVar.setAdapter(nkVar3);
                    }
                }
                nkVar2.f26473s = arrayList2;
                nkVar2.l();
                return;
            case 10:
                gl glVar = (gl) this.f26735b;
                float[] fArr = (float[]) this.f26736c;
                glVar.getClass();
                glVar.b0(fArr[0], fArr[1]);
                return;
            case 11:
                ni niVar = (ni) this.f26736c;
                boolean z13 = ChatAttachAlertPhotoLayout.f21911q1;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                tl tlVar = ((ChatAttachAlertPhotoLayout) this.f26735b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                tlVar.scrollBy(0, listTopPadding);
                return;
            case 12:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f26736c;
                dm dmVar = ((ChatAttachAlertPhotoLayout) this.f26735b).P;
                if (dmVar != null) {
                    dmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 13:
                ni niVar2 = (ni) this.f26736c;
                int currentItemTop2 = niVar2.getCurrentItemTop();
                int listTopPadding2 = niVar2.getListTopPadding();
                ai.w0 w0Var = ((qm) this.f26735b).f27351r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 14:
                jo.a(((ho) this.f26735b).f24705c);
                ((hg.g) this.f26736c).run();
                return;
            case 15:
                ((hp) this.f26735b).f24712b.x((List) this.f26736c);
                return;
            case 16:
                ((ip) this.f26735b).f24980b.x((List) this.f26736c);
                return;
            case 17:
                ((org.telegram.ui.ActionBar.g3) this.f26735b).dismiss();
                nf.f.s((Context) this.f26736c, "https://t.me/BotFather?start=deletebot");
                return;
            case 18:
                mr mrVar = (mr) this.f26735b;
                mrVar.getClass();
                ((ci.d) this.f26736c).setLoading(false);
                mrVar.dismiss();
                return;
            case 19:
                mr mrVar2 = (mr) this.f26735b;
                TLObject tLObject = (TLObject) this.f26736c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    mrVar2.f26258b0 = groupcallstreamrtmpurl.url;
                    mrVar2.f26259c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mrVar2.f26259c0);
                    mrVar2.f26260d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f26908a |= 256;
                    obj.f26909b = 0;
                    obj.f26910c = spannableStringBuilder.length();
                    mrVar2.f26260d0.setSpan(new q01(obj, 0), 0, mrVar2.f26260d0.length(), 0);
                    mrVar2.f26261e0.N(false);
                    return;
                }
                return;
            case 20:
                qs qsVar = (qs) this.f26735b;
                TLObject tLObject2 = (TLObject) this.f26736c;
                ms msVar = qsVar.f27395b;
                ArrayList arrayList3 = qsVar.h;
                int i10 = qsVar.f27394a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i10).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i10).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    qsVar.f27398g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    qsVar.f27397f = currentTimeMillis;
                    if (!qsVar.f27399i) {
                        qsVar.f27399i = true;
                        String str3 = qsVar.f27398g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList3.size(); i11 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i11)).f18268id, arrayList4, i11, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(qsVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    qsVar.f27396c = false;
                    msVar.run();
                    return;
                }
                qsVar.f27398g = null;
                qsVar.e = true;
                qsVar.f27396c = false;
                msVar.run();
                return;
            case 21:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f26736c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new oh(22, (pt) this.f26735b, decodeFile));
                return;
            case 22:
                ((pt) this.f26735b).setImage((Bitmap) this.f26736c);
                return;
            case 23:
                ((EditTextBoldCursor) this.f26735b).hintLayout.draw((Canvas) this.f26736c);
                return;
            case 24:
                MessagesController.getInstance(sv.U(((bv) this.f26735b).f22807a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f26736c);
                return;
            case 25:
                MessagesController.getInstance(((dx) this.f26735b).f23400a.f25716c1).updateEmojiStatus((TLRPC.EmojiStatus) this.f26736c);
                return;
            case 26:
                TLObject tLObject3 = (TLObject) this.f26736c;
                kz kzVar = ((dx) this.f26735b).f23400a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(kzVar.f25716c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.f25716c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
            case 27:
                ay ayVar = (ay) this.f26735b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.f26736c;
                ayVar.f22512s.f29764f = true;
                kz kzVar2 = ayVar.E;
                if (!kzVar2.f25755p1.contains(Long.valueOf(tL_messages_stickerSet2.set.f18148id))) {
                    kzVar2.f25755p1.add(Long.valueOf(tL_messages_stickerSet2.set.f18148id));
                }
                ayVar.a(true);
                return;
            case 28:
                final iy iyVar = (iy) this.f26735b;
                final String str5 = (String) this.f26736c;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = iyVar.f25050a.F;
                if (!Arrays.equals(kzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(kzVar3.f25716c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                kzVar3.W0 = currentKeyboardLanguage;
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
                                iy iyVar2 = iyVar;
                                MediaDataController.getInstance(iyVar2.f25050a.F.f25716c1).searchStickerSets(true, str5, new ai.d5(iyVar2, arrayList7, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = iyVar.f25050a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f25716c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i12 = kzVar4.f25716c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList10 = arrayList7;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList9 = tL_messages_stickerSet3.documents) != null && !arrayList9.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18148id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList10.add(new cy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18148id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18148id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList10.add(new cy(stickerSetCovered, arrayList8));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18148id));
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
                }, new org.telegram.ui.pf(16, iyVar, str5), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList8;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList9;
                        Runnable runnable = (Runnable) obj2;
                        switch (r4) {
                            case 0:
                                iy iyVar2 = iyVar;
                                MediaDataController.getInstance(iyVar2.f25050a.F.f25716c1).searchStickerSets(true, str5, new ai.d5(iyVar2, arrayList6, runnable, 5));
                                return;
                            default:
                                kz kzVar4 = iyVar.f25050a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.f25716c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i12 = kzVar4.f25716c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i12).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList10 = arrayList6;
                                    if (stickerSets != null) {
                                        for (int i13 = 0; i13 < stickerSets.size(); i13++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i13);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList9 = tL_messages_stickerSet3.documents) != null && !arrayList9.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.f18148id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList10.add(new cy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.f18148id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i12).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i14 = 0; i14 < featuredEmojiSets.size(); i14++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.f18148id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe3)) {
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
                                                        arrayList10.add(new cy(stickerSetCovered, arrayList8));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.f18148id));
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
                }, new org.telegram.ui.pf(17, iyVar, arrayList5), new org.telegram.ui.ua(iyVar, str5, arrayList5, arrayList6, arrayList7));
                return;
            default:
                ArrayList arrayList8 = (ArrayList) this.f26736c;
                jy jyVar = ((iy) this.f26735b).f25050a;
                jyVar.F.V.e(false);
                ArrayList arrayList9 = jyVar.f25464r;
                if (arrayList9.size() < arrayList8.size()) {
                    z11 = false;
                }
                jyVar.E = z11;
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                jyVar.l();
                return;
        }
    }

    public oh(gj gjVar, vi viVar) {
        this.f26734a = 5;
        this.f26736c = gjVar;
        this.f26735b = viVar;
    }
}
