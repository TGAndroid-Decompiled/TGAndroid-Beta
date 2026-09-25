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
public final class kd implements Runnable {
    public final int f25759a;
    public final Object f25760b;
    public final Object f25761c;

    public kd(int i10, Object obj, Object obj2) {
        this.f25759a = i10;
        this.f25761c = obj;
        this.f25760b = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f25759a) {
            case 0:
                ((md) this.f25761c).removeView((ci.e4) this.f25760b);
                return;
            case 1:
                int i10 = ChatActivityEnterView.f21953n5;
                ((ChatActivityEnterView) this.f25761c).removeView((ci.e4) this.f25760b);
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25761c;
                int i11 = ChatActivityEnterView.f21953n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f25760b);
                chatActivityEnterView.W = null;
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f25761c;
                int i12 = ChatActivityEnterView.f21953n5;
                ((td) this.f25760b).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 4:
                pg pgVar = (pg) this.f25760b;
                ChatActivityEnterView chatActivityEnterView3 = ((sg) this.f25761c).V;
                chatActivityEnterView3.f22006i1 = chatActivityEnterView3.f22000h1.getAudioRightMs() - chatActivityEnterView3.f22000h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f22000h1.getAudioLeftMs(), chatActivityEnterView3.f22000h1.getAudioRightMs(), pgVar);
                return;
            case 5:
                wi.u((wi) this.f25761c, (ci.e4) this.f25760b);
                return;
            case 6:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f25760b;
                ((wi) this.f25761c).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 7:
                wi wiVar = (wi) this.f25761c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((pi) this.f25760b).f27350c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                wiVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(wiVar.J1).updateAttachMenuBotsInCache();
                return;
            case 8:
                wi wiVar2 = (wi) this.f25761c;
                MediaDataController.getInstance(wiVar2.J1).loadAttachMenuBots(false, true);
                if (wiVar2.f30067y0 == wiVar2.f30063x0.get(((TLRPC.TL_attachMenuBot) this.f25760b).bot_id)) {
                    wiVar2.Q1(wiVar2.f30018j0);
                    return;
                }
                return;
            case 9:
                hj hjVar = (hj) this.f25761c;
                hjVar.H = false;
                hjVar.I = (ArrayList) this.f25760b;
                hjVar.P();
                return;
            case 10:
                hj hjVar2 = (hj) this.f25761c;
                ((wi) this.f25760b).Z0();
                hjVar2.L();
                hjVar2.f27088b.X1(hjVar2, 0);
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new kd(12, (yj) this.f25761c, ((xj) this.f25760b).run()));
                return;
            case 12:
                ((yj) this.f25761c).setStatus((CharSequence) this.f25760b);
                return;
            case 13:
                ok okVar = (ok) this.f25761c;
                String str = (String) this.f25760b;
                okVar.getClass();
                ArrayList arrayList = new ArrayList(okVar.X.v.f25103c);
                if (okVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, okVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(okVar, str, !okVar.R.isEmpty(), arrayList, 18));
                return;
            case 14:
                ok okVar2 = (ok) this.f25761c;
                ArrayList arrayList2 = (ArrayList) this.f25760b;
                pk pkVar = okVar2.X;
                boolean z11 = pkVar.f27368b0;
                ek ekVar = pkVar.f27374r;
                if (z11) {
                    s4.h0 adapter = ekVar.getAdapter();
                    ok okVar3 = pkVar.f27378y;
                    if (adapter != okVar3) {
                        ekVar.setAdapter(okVar3);
                    }
                }
                okVar2.f27099s = arrayList2;
                okVar2.l();
                return;
            case 15:
                hl hlVar = (hl) this.f25761c;
                float[] fArr = (float[]) this.f25760b;
                hlVar.getClass();
                hlVar.b0(fArr[0], fArr[1]);
                return;
            case 16:
                oi oiVar = (oi) this.f25760b;
                boolean z12 = ChatAttachAlertPhotoLayout.f22121q1;
                int currentItemTop = oiVar.getCurrentItemTop();
                int listTopPadding = oiVar.getListTopPadding();
                ul ulVar = ((ChatAttachAlertPhotoLayout) this.f25761c).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ulVar.scrollBy(0, listTopPadding);
                return;
            case 17:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25760b;
                em emVar = ((ChatAttachAlertPhotoLayout) this.f25761c).P;
                if (emVar != null) {
                    emVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 18:
                oi oiVar2 = (oi) this.f25760b;
                int currentItemTop2 = oiVar2.getCurrentItemTop();
                int listTopPadding2 = oiVar2.getListTopPadding();
                ai.w0 w0Var = ((rm) this.f25761c).f28001r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 19:
                ko.a(((io) this.f25761c).f25132c);
                ((hg.h) this.f25760b).run();
                return;
            case 20:
                ((ip) this.f25761c).f25136b.x((List) this.f25760b);
                return;
            case 21:
                ((jp) this.f25761c).f25462b.x((List) this.f25760b);
                return;
            case 22:
                ((org.telegram.ui.ActionBar.e3) this.f25761c).dismiss();
                nf.f.s((Context) this.f25760b, "https://t.me/BotFather?start=deletebot");
                return;
            case 23:
                nr nrVar = (nr) this.f25761c;
                nrVar.getClass();
                ((ci.d) this.f25760b).setLoading(false);
                nrVar.dismiss();
                return;
            case 24:
                nr nrVar2 = (nr) this.f25761c;
                TLObject tLObject = (TLObject) this.f25760b;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    nrVar2.f26791b0 = groupcallstreamrtmpurl.url;
                    nrVar2.f26792c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nrVar2.f26792c0);
                    nrVar2.f26793d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f22849a |= 256;
                    obj.f22850b = 0;
                    obj.f22851c = spannableStringBuilder.length();
                    nrVar2.f26793d0.setSpan(new c11(obj, 0), 0, nrVar2.f26793d0.length(), 0);
                    nrVar2.f26794e0.N(false);
                    return;
                }
                return;
            case 25:
                rs rsVar = (rs) this.f25761c;
                TLObject tLObject2 = (TLObject) this.f25760b;
                ns nsVar = rsVar.f28044b;
                ArrayList arrayList3 = rsVar.h;
                int i13 = rsVar.f28043a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    rsVar.f28047g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    rsVar.f28046f = currentTimeMillis;
                    if (!rsVar.f28048i) {
                        rsVar.f28048i = true;
                        String str3 = rsVar.f28047g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f18483id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(rsVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    rsVar.f28045c = false;
                    nsVar.run();
                    return;
                }
                rsVar.f28047g = null;
                rsVar.e = true;
                rsVar.f28045c = false;
                nsVar.run();
                return;
            case 26:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f25760b);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new kd(27, (qt) this.f25761c, decodeFile));
                return;
            case 27:
                ((qt) this.f25761c).setImage((Bitmap) this.f25760b);
                return;
            case 28:
                ((EditTextBoldCursor) this.f25761c).hintLayout.draw((Canvas) this.f25760b);
                return;
            default:
                MessagesController.getInstance(tv.U(((cv) this.f25761c).f23405a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f25760b);
                return;
        }
    }
}
