package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
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
public final class ld implements Runnable {
    public final int f25967a;
    public final Object f25968b;
    public final Object f25969c;

    public ld(int i10, Object obj, Object obj2) {
        this.f25967a = i10;
        this.f25969c = obj;
        this.f25968b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f25967a) {
            case 0:
                ((nd) this.f25969c).removeView((ci.e4) this.f25968b);
                return;
            case 1:
                int i10 = ChatActivityEnterView.f21974n5;
                ((ChatActivityEnterView) this.f25969c).removeView((ci.e4) this.f25968b);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25969c;
                int i11 = ChatActivityEnterView.f21974n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f25968b);
                chatActivityEnterView.W = null;
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f25969c;
                int i12 = ChatActivityEnterView.f21974n5;
                ((ud) this.f25968b).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 4:
                qg qgVar = (qg) this.f25968b;
                ChatActivityEnterView chatActivityEnterView3 = ((tg) this.f25969c).V;
                chatActivityEnterView3.f22027i1 = chatActivityEnterView3.f22021h1.getAudioRightMs() - chatActivityEnterView3.f22021h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f22021h1.getAudioLeftMs(), chatActivityEnterView3.f22021h1.getAudioRightMs(), qgVar);
                return;
            case 5:
                xi.u((xi) this.f25969c, (ci.e4) this.f25968b);
                return;
            case 6:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f25968b;
                ((xi) this.f25969c).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 7:
                xi xiVar = (xi) this.f25969c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((qi) this.f25968b).f27659c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                xiVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(xiVar.J1).updateAttachMenuBotsInCache();
                return;
            case 8:
                xi xiVar2 = (xi) this.f25969c;
                MediaDataController.getInstance(xiVar2.J1).loadAttachMenuBots(false, true);
                if (xiVar2.f30331y0 == xiVar2.f30327x0.get(((TLRPC.TL_attachMenuBot) this.f25968b).bot_id)) {
                    xiVar2.Q1(xiVar2.f30282j0);
                    return;
                }
                return;
            case 9:
                jj jjVar = (jj) this.f25969c;
                jjVar.G = false;
                jjVar.H = (ArrayList) this.f25968b;
                jjVar.P();
                return;
            case 10:
                jj jjVar2 = (jj) this.f25969c;
                ((xi) this.f25968b).Z0();
                jjVar2.L();
                jjVar2.f27362b.X1(jjVar2, 0);
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ld(12, (ak) this.f25969c, ((zj) this.f25968b).run()));
                return;
            case 12:
                ((ak) this.f25969c).setStatus((CharSequence) this.f25968b);
                return;
            case 13:
                qk qkVar = (qk) this.f25969c;
                String str = (String) this.f25968b;
                qkVar.getClass();
                ArrayList arrayList = new ArrayList(qkVar.X.v.f25779c);
                if (qkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, qkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(qkVar, str, !qkVar.R.isEmpty(), arrayList, 18));
                return;
            case 14:
                qk qkVar2 = (qk) this.f25969c;
                ArrayList arrayList2 = (ArrayList) this.f25968b;
                rk rkVar = qkVar2.X;
                boolean z11 = rkVar.f28039b0;
                gk gkVar = rkVar.f28045r;
                if (z11) {
                    s4.h0 adapter = gkVar.getAdapter();
                    qk qkVar3 = rkVar.f28049y;
                    if (adapter != qkVar3) {
                        gkVar.setAdapter(qkVar3);
                    }
                }
                qkVar2.f27666s = arrayList2;
                qkVar2.l();
                return;
            case 15:
                jl jlVar = (jl) this.f25969c;
                float[] fArr = (float[]) this.f25968b;
                jlVar.getClass();
                jlVar.b0(fArr[0], fArr[1]);
                return;
            case 16:
                pi piVar = (pi) this.f25968b;
                boolean z12 = ChatAttachAlertPhotoLayout.f22142q1;
                int currentItemTop = piVar.getCurrentItemTop();
                int listTopPadding = piVar.getListTopPadding();
                wl wlVar = ((ChatAttachAlertPhotoLayout) this.f25969c).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                wlVar.scrollBy(0, listTopPadding);
                return;
            case 17:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25968b;
                gm gmVar = ((ChatAttachAlertPhotoLayout) this.f25969c).P;
                if (gmVar != null) {
                    gmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 18:
                pi piVar2 = (pi) this.f25968b;
                int currentItemTop2 = piVar2.getCurrentItemTop();
                int listTopPadding2 = piVar2.getListTopPadding();
                ai.w0 w0Var = ((tm) this.f25969c).f28602r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 19:
                mo.a(((ko) this.f25969c).f25803c);
                ((hg.h) this.f25968b).run();
                return;
            case 20:
                ((kp) this.f25969c).f25805b.x((List) this.f25968b);
                return;
            case 21:
                ((lp) this.f25969c).f26072b.x((List) this.f25968b);
                return;
            case 22:
                ((org.telegram.ui.ActionBar.e3) this.f25969c).dismiss();
                nf.f.s((Context) this.f25968b, "https://t.me/BotFather?start=deletebot");
                return;
            case 23:
                pr prVar = (pr) this.f25969c;
                prVar.getClass();
                ((ci.d) this.f25968b).setLoading(false);
                prVar.dismiss();
                return;
            case 24:
                pr prVar2 = (pr) this.f25969c;
                TLObject tLObject = (TLObject) this.f25968b;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    prVar2.f27461b0 = groupcallstreamrtmpurl.url;
                    prVar2.f27462c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(prVar2.f27462c0);
                    prVar2.f27463d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f23824a |= 256;
                    obj.f23825b = 0;
                    obj.f23826c = spannableStringBuilder.length();
                    prVar2.f27463d0.setSpan(new f11(obj, 0), 0, prVar2.f27463d0.length(), 0);
                    prVar2.f27464e0.N(false);
                    return;
                }
                return;
            case 25:
                ts tsVar = (ts) this.f25969c;
                TLObject tLObject2 = (TLObject) this.f25968b;
                ps psVar = tsVar.f28650b;
                ArrayList arrayList3 = tsVar.h;
                int i13 = tsVar.f28649a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    tsVar.f28653g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    tsVar.f28652f = currentTimeMillis;
                    if (!tsVar.f28654i) {
                        tsVar.f28654i = true;
                        String str3 = tsVar.f28653g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f18499id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(tsVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    tsVar.f28651c = false;
                    psVar.run();
                    return;
                }
                tsVar.f28653g = null;
                tsVar.e = true;
                tsVar.f28651c = false;
                psVar.run();
                return;
            case 26:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f25968b);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new ld(27, (st) this.f25969c, decodeFile));
                return;
            case 27:
                ((st) this.f25969c).setImage((Bitmap) this.f25968b);
                return;
            case 28:
                ((EditTextBoldCursor) this.f25969c).hintLayout.draw((Canvas) this.f25968b);
                return;
            default:
                MessagesController.getInstance(vv.U(((ev) this.f25969c).f24050a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f25968b);
                return;
        }
    }
}
