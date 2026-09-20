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
public final class tc implements Runnable {
    public final int f28356a;
    public final Object f28357b;
    public final Object f28358c;

    public tc(int i10, Object obj, Object obj2) {
        this.f28356a = i10;
        this.f28357b = obj;
        this.f28358c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f28356a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f28357b;
                Runnable runnable = (Runnable) this.f28358c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((ld) this.f28357b).removeView((ci.f4) this.f28358c);
                return;
            case 2:
                int i10 = ChatActivityEnterView.f21952m5;
                ((ChatActivityEnterView) this.f28357b).removeView((ci.f4) this.f28358c);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28357b;
                int i11 = ChatActivityEnterView.f21952m5;
                chatActivityEnterView.setFieldText((CharSequence) this.f28358c);
                chatActivityEnterView.W = null;
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f28357b;
                int i12 = ChatActivityEnterView.f21952m5;
                ((sd) this.f28358c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.P2, true);
                return;
            case 5:
                og ogVar = (og) this.f28358c;
                ChatActivityEnterView chatActivityEnterView3 = ((rg) this.f28357b).V;
                chatActivityEnterView3.f22005i1 = chatActivityEnterView3.f21999h1.getAudioRightMs() - chatActivityEnterView3.f21999h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f21999h1.getAudioLeftMs(), chatActivityEnterView3.f21999h1.getAudioRightMs(), ogVar);
                return;
            case 6:
                vi.u((vi) this.f28357b, (ci.f4) this.f28358c);
                return;
            case 7:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f28358c;
                ((vi) this.f28357b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 8:
                vi viVar = (vi) this.f28357b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((oi) this.f28358c).f26941c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar.J1).updateAttachMenuBotsInCache();
                return;
            case 9:
                vi viVar2 = (vi) this.f28357b;
                MediaDataController.getInstance(viVar2.J1).loadAttachMenuBots(false, true);
                if (viVar2.f29159y0 == viVar2.f29155x0.get(((TLRPC.TL_attachMenuBot) this.f28358c).bot_id)) {
                    viVar2.Q1(viVar2.f29110j0);
                    return;
                }
                return;
            case 10:
                gj gjVar = (gj) this.f28357b;
                gjVar.H = false;
                gjVar.I = (ArrayList) this.f28358c;
                gjVar.P();
                return;
            case 11:
                gj gjVar2 = (gj) this.f28357b;
                ((vi) this.f28358c).Z0();
                gjVar2.L();
                gjVar2.f26655b.X1(gjVar2, 0);
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new tc(13, (xj) this.f28357b, ((wj) this.f28358c).run()));
                return;
            case 13:
                ((xj) this.f28357b).setStatus((CharSequence) this.f28358c);
                return;
            case 14:
                nk nkVar = (nk) this.f28357b;
                String str = (String) this.f28358c;
                nkVar.getClass();
                ArrayList arrayList = new ArrayList(nkVar.X.v.f24712c);
                if (nkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, nkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(nkVar, str, !nkVar.R.isEmpty(), arrayList, 18));
                return;
            case 15:
                nk nkVar2 = (nk) this.f28357b;
                ArrayList arrayList2 = (ArrayList) this.f28358c;
                ok okVar = nkVar2.X;
                boolean z11 = okVar.f26959b0;
                dk dkVar = okVar.f26965r;
                if (z11) {
                    s4.h0 adapter = dkVar.getAdapter();
                    nk nkVar3 = okVar.f26969y;
                    if (adapter != nkVar3) {
                        dkVar.setAdapter(nkVar3);
                    }
                }
                nkVar2.f26666s = arrayList2;
                nkVar2.l();
                return;
            case 16:
                gl glVar = (gl) this.f28357b;
                float[] fArr = (float[]) this.f28358c;
                glVar.getClass();
                glVar.b0(fArr[0], fArr[1]);
                return;
            case 17:
                ni niVar = (ni) this.f28358c;
                boolean z12 = ChatAttachAlertPhotoLayout.f22119q1;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                tl tlVar = ((ChatAttachAlertPhotoLayout) this.f28357b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                tlVar.scrollBy(0, listTopPadding);
                return;
            case 18:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28358c;
                dm dmVar = ((ChatAttachAlertPhotoLayout) this.f28357b).P;
                if (dmVar != null) {
                    dmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 19:
                ni niVar2 = (ni) this.f28358c;
                int currentItemTop2 = niVar2.getCurrentItemTop();
                int listTopPadding2 = niVar2.getListTopPadding();
                ai.w0 w0Var = ((qm) this.f28357b).f27608r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 20:
                jo.a(((ho) this.f28357b).f24729c);
                ((hg.g) this.f28358c).run();
                return;
            case 21:
                ((hp) this.f28357b).f24731b.x((List) this.f28358c);
                return;
            case 22:
                ((ip) this.f28357b).f25099b.x((List) this.f28358c);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.f3) this.f28357b).dismiss();
                nf.f.s((Context) this.f28358c, "https://t.me/BotFather?start=deletebot");
                return;
            case 24:
                mr mrVar = (mr) this.f28357b;
                mrVar.getClass();
                ((ci.d) this.f28358c).setLoading(false);
                mrVar.dismiss();
                return;
            case 25:
                mr mrVar2 = (mr) this.f28357b;
                TLObject tLObject = (TLObject) this.f28358c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    mrVar2.f26481b0 = groupcallstreamrtmpurl.url;
                    mrVar2.f26482c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mrVar2.f26482c0);
                    mrVar2.f26483d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f23124a |= 256;
                    obj.f23125b = 0;
                    obj.f23126c = spannableStringBuilder.length();
                    mrVar2.f26483d0.setSpan(new d11(obj, 0), 0, mrVar2.f26483d0.length(), 0);
                    mrVar2.f26484e0.N(false);
                    return;
                }
                return;
            case 26:
                qs qsVar = (qs) this.f28357b;
                TLObject tLObject2 = (TLObject) this.f28358c;
                ms msVar = qsVar.f27656b;
                ArrayList arrayList3 = qsVar.h;
                int i13 = qsVar.f27655a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    qsVar.f27659g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    qsVar.f27658f = currentTimeMillis;
                    if (!qsVar.f27660i) {
                        qsVar.f27660i = true;
                        String str3 = qsVar.f27659g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f18475id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(qsVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    qsVar.f27657c = false;
                    msVar.run();
                    return;
                }
                qsVar.f27659g = null;
                qsVar.e = true;
                qsVar.f27657c = false;
                msVar.run();
                return;
            case 27:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f28358c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new tc(28, (pt) this.f28357b, decodeFile));
                return;
            case 28:
                ((pt) this.f28357b).setImage((Bitmap) this.f28358c);
                return;
            default:
                ((EditTextBoldCursor) this.f28357b).hintLayout.draw((Canvas) this.f28358c);
                return;
        }
    }
}
