package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;
public final class be implements Runnable {
    public final int f24926a;
    public final Object f24927b;
    public final Object f24928c;

    public be(int i10, Object obj, Object obj2) {
        this.f24926a = i10;
        this.f24927b = obj;
        this.f24928c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f24926a) {
            case 0:
                int i10 = ChatActivityEnterView.f23847n5;
                ((ChatActivityEnterView) this.f24927b).removeView((ci.e4) this.f24928c);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24927b;
                int i11 = ChatActivityEnterView.f23847n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f24928c);
                chatActivityEnterView.W = null;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f24927b;
                int i12 = ChatActivityEnterView.f23847n5;
                ((td) this.f24928c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 3:
                qg qgVar = (qg) this.f24928c;
                ChatActivityEnterView chatActivityEnterView3 = ((tg) this.f24927b).V;
                chatActivityEnterView3.f23901i1 = chatActivityEnterView3.f23895h1.getAudioRightMs() - chatActivityEnterView3.f23895h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23895h1.getAudioLeftMs(), chatActivityEnterView3.f23895h1.getAudioRightMs(), qgVar);
                return;
            case 4:
                xi.m((xi) this.f24927b, (ci.e4) this.f24928c);
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f24928c;
                ((xi) this.f24927b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 6:
                xi xiVar = (xi) this.f24927b;
                MediaDataController.getInstance(xiVar.J1).loadAttachMenuBots(false, true);
                if (xiVar.f32874y0 == xiVar.f32870x0.get(((TLRPC.TL_attachMenuBot) this.f24928c).bot_id)) {
                    xiVar.N1(xiVar.f32825j0);
                    return;
                }
                return;
            case 7:
                xi xiVar2 = (xi) this.f24927b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((qi) this.f24928c).f30044c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                xiVar2.K1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(xiVar2.J1).updateAttachMenuBotsInCache();
                return;
            case 8:
                jj jjVar = (jj) this.f24927b;
                jjVar.G = false;
                jjVar.H = (ArrayList) this.f24928c;
                jjVar.N();
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new be(10, (ak) this.f24927b, ((zj) this.f24928c).run()));
                return;
            case 10:
                ((ak) this.f24927b).setStatus((CharSequence) this.f24928c);
                return;
            case 11:
                qk qkVar = (qk) this.f24927b;
                String str3 = (String) this.f24928c;
                qkVar.getClass();
                ArrayList arrayList = new ArrayList(qkVar.X.v.f28154c);
                if (qkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, qkVar.X.v.f28155e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(qkVar, str3, !qkVar.R.isEmpty(), arrayList, 18));
                return;
            case 12:
                qk qkVar2 = (qk) this.f24927b;
                ArrayList arrayList2 = (ArrayList) this.f24928c;
                rk rkVar = qkVar2.X;
                boolean z11 = rkVar.f30427b0;
                gk gkVar = rkVar.f30433r;
                if (z11) {
                    s4.h0 adapter = gkVar.getAdapter();
                    qk qkVar3 = rkVar.f30437y;
                    if (adapter != qkVar3) {
                        gkVar.setAdapter(qkVar3);
                    }
                }
                qkVar2.f30054s = arrayList2;
                qkVar2.l();
                return;
            case 13:
                jl jlVar = (jl) this.f24927b;
                float[] fArr = (float[]) this.f24928c;
                jlVar.getClass();
                jlVar.b0(fArr[0], fArr[1]);
                return;
            case 14:
                pi piVar = (pi) this.f24928c;
                boolean z12 = ChatAttachAlertPhotoLayout.f24018q1;
                int currentItemTop = piVar.getCurrentItemTop();
                int listTopPadding = piVar.getListTopPadding();
                wl wlVar = ((ChatAttachAlertPhotoLayout) this.f24927b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                wlVar.scrollBy(0, listTopPadding);
                return;
            case 15:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24928c;
                gm gmVar = ((ChatAttachAlertPhotoLayout) this.f24927b).P;
                if (gmVar != null) {
                    gmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 16:
                pi piVar2 = (pi) this.f24928c;
                int currentItemTop2 = piVar2.getCurrentItemTop();
                int listTopPadding2 = piVar2.getListTopPadding();
                ai.w0 w0Var = ((tm) this.f24927b).f31092r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 17:
                mo.a(((ko) this.f24927b).f28175c);
                ((hg.g) this.f24928c).run();
                return;
            case 18:
                ((kp) this.f24927b).f28177b.x((List) this.f24928c);
                return;
            case 19:
                ((lp) this.f24927b).f28402b.x((List) this.f24928c);
                return;
            case 20:
                ((org.telegram.ui.ActionBar.f3) this.f24927b).dismiss();
                nf.f.s((Context) this.f24928c, "https://t.me/BotFather?start=deletebot");
                return;
            case 21:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f24927b;
                String charSequence = j3Var.getText().toString();
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22307b;
                Iterator it = ((Set) this.f24928c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (charSequence.endsWith((String) it.next())) {
                        }
                    } else {
                        str2 = "bot";
                    }
                }
                h3Var.setRightText(str2);
                return;
            case 22:
                pr prVar = (pr) this.f24927b;
                prVar.getClass();
                ((ci.d) this.f24928c).setLoading(false);
                prVar.dismiss();
                return;
            case 23:
                pr prVar2 = (pr) this.f24927b;
                TLObject tLObject = (TLObject) this.f24928c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    prVar2.f29725b0 = groupcallstreamrtmpurl.url;
                    prVar2.f29726c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(prVar2.f29726c0);
                    prVar2.f29727d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f28497a |= 256;
                    obj.f28498b = 0;
                    obj.f28499c = spannableStringBuilder.length();
                    prVar2.f29727d0.setSpan(new n11(obj, 0), 0, prVar2.f29727d0.length(), 0);
                    prVar2.f29728e0.N(false);
                    return;
                }
                return;
            case 24:
                ts tsVar = (ts) this.f24927b;
                TLObject tLObject2 = (TLObject) this.f24928c;
                ps psVar = tsVar.f31155b;
                ArrayList arrayList3 = tsVar.h;
                int i13 = tsVar.f31154a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    tsVar.f31159g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tsVar.f31157e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    tsVar.f31158f = currentTimeMillis;
                    if (!tsVar.f31160i) {
                        tsVar.f31160i = true;
                        String str5 = tsVar.f31159g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f20185id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(tsVar, messagesStorage, arrayList4, currentTimeMillis, str, 3));
                    }
                    tsVar.f31156c = false;
                    psVar.run();
                    return;
                }
                tsVar.f31159g = null;
                tsVar.f31157e = true;
                tsVar.f31156c = false;
                psVar.run();
                return;
            case 25:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f24928c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new be(26, (st) this.f24927b, decodeFile));
                return;
            case 26:
                ((st) this.f24927b).setImage((Bitmap) this.f24928c);
                return;
            case 27:
                ((EditTextBoldCursor) this.f24927b).hintLayout.draw((Canvas) this.f24928c);
                return;
            case 28:
                MessagesController.getInstance(wv.S(((fv) this.f24927b).f26570a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f24928c);
                return;
            default:
                MessagesController.getInstance(((ix) this.f24927b).f27510a.f29092c1).updateEmojiStatus((TLRPC.EmojiStatus) this.f24928c);
                return;
        }
    }
}
