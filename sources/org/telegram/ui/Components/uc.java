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
public final class uc implements Runnable {
    public final int f28753a;
    public final Object f28754b;
    public final Object f28755c;

    public uc(int i10, Object obj, Object obj2) {
        this.f28753a = i10;
        this.f28754b = obj;
        this.f28755c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f28753a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f28754b;
                Runnable runnable = (Runnable) this.f28755c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((md) this.f28754b).removeView((ci.e4) this.f28755c);
                return;
            case 2:
                int i10 = ChatActivityEnterView.f21938n5;
                ((ChatActivityEnterView) this.f28754b).removeView((ci.e4) this.f28755c);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28754b;
                int i11 = ChatActivityEnterView.f21938n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f28755c);
                chatActivityEnterView.W = null;
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f28754b;
                int i12 = ChatActivityEnterView.f21938n5;
                ((td) this.f28755c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 5:
                pg pgVar = (pg) this.f28755c;
                ChatActivityEnterView chatActivityEnterView3 = ((sg) this.f28754b).V;
                chatActivityEnterView3.f21991i1 = chatActivityEnterView3.f21985h1.getAudioRightMs() - chatActivityEnterView3.f21985h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f21985h1.getAudioLeftMs(), chatActivityEnterView3.f21985h1.getAudioRightMs(), pgVar);
                return;
            case 6:
                wi.u((wi) this.f28754b, (ci.e4) this.f28755c);
                return;
            case 7:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f28755c;
                ((wi) this.f28754b).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 8:
                wi wiVar = (wi) this.f28754b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((pi) this.f28755c).f27335c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                wiVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(wiVar.J1).updateAttachMenuBotsInCache();
                return;
            case 9:
                wi wiVar2 = (wi) this.f28754b;
                MediaDataController.getInstance(wiVar2.J1).loadAttachMenuBots(false, true);
                if (wiVar2.f30046y0 == wiVar2.f30042x0.get(((TLRPC.TL_attachMenuBot) this.f28755c).bot_id)) {
                    wiVar2.Q1(wiVar2.f29997j0);
                    return;
                }
                return;
            case 10:
                hj hjVar = (hj) this.f28754b;
                hjVar.H = false;
                hjVar.I = (ArrayList) this.f28755c;
                hjVar.P();
                return;
            case 11:
                hj hjVar2 = (hj) this.f28754b;
                ((wi) this.f28755c).Z0();
                hjVar2.L();
                hjVar2.f27083b.X1(hjVar2, 0);
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new uc(13, (yj) this.f28754b, ((xj) this.f28755c).run()));
                return;
            case 13:
                ((yj) this.f28754b).setStatus((CharSequence) this.f28755c);
                return;
            case 14:
                ok okVar = (ok) this.f28754b;
                String str = (String) this.f28755c;
                okVar.getClass();
                ArrayList arrayList = new ArrayList(okVar.X.v.f25076c);
                if (okVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, okVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(okVar, str, !okVar.R.isEmpty(), arrayList, 18));
                return;
            case 15:
                ok okVar2 = (ok) this.f28754b;
                ArrayList arrayList2 = (ArrayList) this.f28755c;
                pk pkVar = okVar2.X;
                boolean z11 = pkVar.f27353b0;
                ek ekVar = pkVar.f27359r;
                if (z11) {
                    s4.h0 adapter = ekVar.getAdapter();
                    ok okVar3 = pkVar.f27363y;
                    if (adapter != okVar3) {
                        ekVar.setAdapter(okVar3);
                    }
                }
                okVar2.f27094s = arrayList2;
                okVar2.l();
                return;
            case 16:
                hl hlVar = (hl) this.f28754b;
                float[] fArr = (float[]) this.f28755c;
                hlVar.getClass();
                hlVar.b0(fArr[0], fArr[1]);
                return;
            case 17:
                oi oiVar = (oi) this.f28755c;
                boolean z12 = ChatAttachAlertPhotoLayout.f22106q1;
                int currentItemTop = oiVar.getCurrentItemTop();
                int listTopPadding = oiVar.getListTopPadding();
                ul ulVar = ((ChatAttachAlertPhotoLayout) this.f28754b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ulVar.scrollBy(0, listTopPadding);
                return;
            case 18:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28755c;
                em emVar = ((ChatAttachAlertPhotoLayout) this.f28754b).P;
                if (emVar != null) {
                    emVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 19:
                oi oiVar2 = (oi) this.f28755c;
                int currentItemTop2 = oiVar2.getCurrentItemTop();
                int listTopPadding2 = oiVar2.getListTopPadding();
                ai.w0 w0Var = ((rm) this.f28754b).f27992r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 20:
                ko.a(((io) this.f28754b).f25105c);
                ((hg.h) this.f28755c).run();
                return;
            case 21:
                ((ip) this.f28754b).f25109b.x((List) this.f28755c);
                return;
            case 22:
                ((jp) this.f28754b).f25455b.x((List) this.f28755c);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.e3) this.f28754b).dismiss();
                nf.f.s((Context) this.f28755c, "https://t.me/BotFather?start=deletebot");
                return;
            case 24:
                nr nrVar = (nr) this.f28754b;
                nrVar.getClass();
                ((ci.d) this.f28755c).setLoading(false);
                nrVar.dismiss();
                return;
            case 25:
                nr nrVar2 = (nr) this.f28754b;
                TLObject tLObject = (TLObject) this.f28755c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    nrVar2.f26783b0 = groupcallstreamrtmpurl.url;
                    nrVar2.f26784c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nrVar2.f26784c0);
                    nrVar2.f26785d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f22840a |= 256;
                    obj.f22841b = 0;
                    obj.f22842c = spannableStringBuilder.length();
                    nrVar2.f26785d0.setSpan(new c11(obj, 0), 0, nrVar2.f26785d0.length(), 0);
                    nrVar2.f26786e0.N(false);
                    return;
                }
                return;
            case 26:
                rs rsVar = (rs) this.f28754b;
                TLObject tLObject2 = (TLObject) this.f28755c;
                ns nsVar = rsVar.f28035b;
                ArrayList arrayList3 = rsVar.h;
                int i13 = rsVar.f28034a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    rsVar.f28038g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    rsVar.f28037f = currentTimeMillis;
                    if (!rsVar.f28039i) {
                        rsVar.f28039i = true;
                        String str3 = rsVar.f28038g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f18468id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(rsVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    rsVar.f28036c = false;
                    nsVar.run();
                    return;
                }
                rsVar.f28038g = null;
                rsVar.e = true;
                rsVar.f28036c = false;
                nsVar.run();
                return;
            case 27:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f28755c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new uc(28, (qt) this.f28754b, decodeFile));
                return;
            case 28:
                ((qt) this.f28754b).setImage((Bitmap) this.f28755c);
                return;
            default:
                ((EditTextBoldCursor) this.f28754b).hintLayout.draw((Canvas) this.f28755c);
                return;
        }
    }
}
