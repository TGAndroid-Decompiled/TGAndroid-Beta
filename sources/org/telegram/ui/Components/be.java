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
    public final int f24925a;
    public final Object f24926b;
    public final Object f24927c;

    public be(int i10, Object obj, Object obj2) {
        this.f24925a = i10;
        this.f24926b = obj;
        this.f24927c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f24925a) {
            case 0:
                int i10 = ChatActivityEnterView.f23846n5;
                ((ChatActivityEnterView) this.f24926b).removeView((ci.e4) this.f24927c);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24926b;
                int i11 = ChatActivityEnterView.f23846n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f24927c);
                chatActivityEnterView.W = null;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f24926b;
                int i12 = ChatActivityEnterView.f23846n5;
                ((td) this.f24927c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 3:
                qg qgVar = (qg) this.f24927c;
                ChatActivityEnterView chatActivityEnterView3 = ((tg) this.f24926b).V;
                chatActivityEnterView3.f23900i1 = chatActivityEnterView3.f23894h1.getAudioRightMs() - chatActivityEnterView3.f23894h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23894h1.getAudioLeftMs(), chatActivityEnterView3.f23894h1.getAudioRightMs(), qgVar);
                return;
            case 4:
                xi.m((xi) this.f24926b, (ci.e4) this.f24927c);
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f24927c;
                ((xi) this.f24926b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 6:
                xi xiVar = (xi) this.f24926b;
                MediaDataController.getInstance(xiVar.J1).loadAttachMenuBots(false, true);
                if (xiVar.f32873y0 == xiVar.f32869x0.get(((TLRPC.TL_attachMenuBot) this.f24927c).bot_id)) {
                    xiVar.N1(xiVar.f32824j0);
                    return;
                }
                return;
            case 7:
                xi xiVar2 = (xi) this.f24926b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((qi) this.f24927c).f30043c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                xiVar2.K1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(xiVar2.J1).updateAttachMenuBotsInCache();
                return;
            case 8:
                jj jjVar = (jj) this.f24926b;
                jjVar.G = false;
                jjVar.H = (ArrayList) this.f24927c;
                jjVar.N();
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new be(10, (ak) this.f24926b, ((zj) this.f24927c).run()));
                return;
            case 10:
                ((ak) this.f24926b).setStatus((CharSequence) this.f24927c);
                return;
            case 11:
                qk qkVar = (qk) this.f24926b;
                String str3 = (String) this.f24927c;
                qkVar.getClass();
                ArrayList arrayList = new ArrayList(qkVar.X.v.f28153c);
                if (qkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, qkVar.X.v.f28154e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(qkVar, str3, !qkVar.R.isEmpty(), arrayList, 18));
                return;
            case 12:
                qk qkVar2 = (qk) this.f24926b;
                ArrayList arrayList2 = (ArrayList) this.f24927c;
                rk rkVar = qkVar2.X;
                boolean z11 = rkVar.f30426b0;
                gk gkVar = rkVar.f30432r;
                if (z11) {
                    s4.h0 adapter = gkVar.getAdapter();
                    qk qkVar3 = rkVar.f30436y;
                    if (adapter != qkVar3) {
                        gkVar.setAdapter(qkVar3);
                    }
                }
                qkVar2.f30053s = arrayList2;
                qkVar2.l();
                return;
            case 13:
                jl jlVar = (jl) this.f24926b;
                float[] fArr = (float[]) this.f24927c;
                jlVar.getClass();
                jlVar.b0(fArr[0], fArr[1]);
                return;
            case 14:
                pi piVar = (pi) this.f24927c;
                boolean z12 = ChatAttachAlertPhotoLayout.f24017q1;
                int currentItemTop = piVar.getCurrentItemTop();
                int listTopPadding = piVar.getListTopPadding();
                wl wlVar = ((ChatAttachAlertPhotoLayout) this.f24926b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                wlVar.scrollBy(0, listTopPadding);
                return;
            case 15:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24927c;
                gm gmVar = ((ChatAttachAlertPhotoLayout) this.f24926b).P;
                if (gmVar != null) {
                    gmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 16:
                pi piVar2 = (pi) this.f24927c;
                int currentItemTop2 = piVar2.getCurrentItemTop();
                int listTopPadding2 = piVar2.getListTopPadding();
                ai.w0 w0Var = ((tm) this.f24926b).f31091r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 17:
                mo.a(((ko) this.f24926b).f28174c);
                ((hg.g) this.f24927c).run();
                return;
            case 18:
                ((kp) this.f24926b).f28176b.x((List) this.f24927c);
                return;
            case 19:
                ((lp) this.f24926b).f28401b.x((List) this.f24927c);
                return;
            case 20:
                ((org.telegram.ui.ActionBar.f3) this.f24926b).dismiss();
                nf.f.s((Context) this.f24927c, "https://t.me/BotFather?start=deletebot");
                return;
            case 21:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f24926b;
                String charSequence = j3Var.getText().toString();
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22306b;
                Iterator it = ((Set) this.f24927c).iterator();
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
                pr prVar = (pr) this.f24926b;
                prVar.getClass();
                ((ci.d) this.f24927c).setLoading(false);
                prVar.dismiss();
                return;
            case 23:
                pr prVar2 = (pr) this.f24926b;
                TLObject tLObject = (TLObject) this.f24927c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    prVar2.f29724b0 = groupcallstreamrtmpurl.url;
                    prVar2.f29725c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(prVar2.f29725c0);
                    prVar2.f29726d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f28496a |= 256;
                    obj.f28497b = 0;
                    obj.f28498c = spannableStringBuilder.length();
                    prVar2.f29726d0.setSpan(new n11(obj, 0), 0, prVar2.f29726d0.length(), 0);
                    prVar2.f29727e0.N(false);
                    return;
                }
                return;
            case 24:
                ts tsVar = (ts) this.f24926b;
                TLObject tLObject2 = (TLObject) this.f24927c;
                ps psVar = tsVar.f31154b;
                ArrayList arrayList3 = tsVar.h;
                int i13 = tsVar.f31153a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    tsVar.f31158g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tsVar.f31156e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    tsVar.f31157f = currentTimeMillis;
                    if (!tsVar.f31159i) {
                        tsVar.f31159i = true;
                        String str5 = tsVar.f31158g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f20184id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(tsVar, messagesStorage, arrayList4, currentTimeMillis, str, 3));
                    }
                    tsVar.f31155c = false;
                    psVar.run();
                    return;
                }
                tsVar.f31158g = null;
                tsVar.f31156e = true;
                tsVar.f31155c = false;
                psVar.run();
                return;
            case 25:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f24927c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new be(26, (st) this.f24926b, decodeFile));
                return;
            case 26:
                ((st) this.f24926b).setImage((Bitmap) this.f24927c);
                return;
            case 27:
                ((EditTextBoldCursor) this.f24926b).hintLayout.draw((Canvas) this.f24927c);
                return;
            case 28:
                MessagesController.getInstance(wv.S(((fv) this.f24926b).f26569a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f24927c);
                return;
            default:
                MessagesController.getInstance(((ix) this.f24926b).f27509a.f29091c1).updateEmojiStatus((TLRPC.EmojiStatus) this.f24927c);
                return;
        }
    }
}
