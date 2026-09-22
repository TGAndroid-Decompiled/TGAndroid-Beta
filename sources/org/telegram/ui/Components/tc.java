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
    public final int f28446a;
    public final Object f28447b;
    public final Object f28448c;

    public tc(int i10, Object obj, Object obj2) {
        this.f28446a = i10;
        this.f28447b = obj;
        this.f28448c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f28446a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f28447b;
                Runnable runnable = (Runnable) this.f28448c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((ld) this.f28447b).removeView((ci.f4) this.f28448c);
                return;
            case 2:
                int i10 = ChatActivityEnterView.f21967n5;
                ((ChatActivityEnterView) this.f28447b).removeView((ci.f4) this.f28448c);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28447b;
                int i11 = ChatActivityEnterView.f21967n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f28448c);
                chatActivityEnterView.W = null;
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f28447b;
                int i12 = ChatActivityEnterView.f21967n5;
                ((sd) this.f28448c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 5:
                og ogVar = (og) this.f28448c;
                ChatActivityEnterView chatActivityEnterView3 = ((rg) this.f28447b).V;
                chatActivityEnterView3.f22020i1 = chatActivityEnterView3.f22014h1.getAudioRightMs() - chatActivityEnterView3.f22014h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f22014h1.getAudioLeftMs(), chatActivityEnterView3.f22014h1.getAudioRightMs(), ogVar);
                return;
            case 6:
                vi.u((vi) this.f28447b, (ci.f4) this.f28448c);
                return;
            case 7:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f28448c;
                ((vi) this.f28447b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 8:
                vi viVar = (vi) this.f28447b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((oi) this.f28448c).f27082c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar.J1).updateAttachMenuBotsInCache();
                return;
            case 9:
                vi viVar2 = (vi) this.f28447b;
                MediaDataController.getInstance(viVar2.J1).loadAttachMenuBots(false, true);
                if (viVar2.f29157y0 == viVar2.f29153x0.get(((TLRPC.TL_attachMenuBot) this.f28448c).bot_id)) {
                    viVar2.Q1(viVar2.f29108j0);
                    return;
                }
                return;
            case 10:
                gj gjVar = (gj) this.f28447b;
                gjVar.H = false;
                gjVar.I = (ArrayList) this.f28448c;
                gjVar.P();
                return;
            case 11:
                gj gjVar2 = (gj) this.f28447b;
                ((vi) this.f28448c).Z0();
                gjVar2.L();
                gjVar2.f26786b.X1(gjVar2, 0);
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new tc(13, (xj) this.f28447b, ((wj) this.f28448c).run()));
                return;
            case 13:
                ((xj) this.f28447b).setStatus((CharSequence) this.f28448c);
                return;
            case 14:
                nk nkVar = (nk) this.f28447b;
                String str = (String) this.f28448c;
                nkVar.getClass();
                ArrayList arrayList = new ArrayList(nkVar.X.v.f24842c);
                if (nkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, nkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(nkVar, str, !nkVar.R.isEmpty(), arrayList, 18));
                return;
            case 15:
                nk nkVar2 = (nk) this.f28447b;
                ArrayList arrayList2 = (ArrayList) this.f28448c;
                ok okVar = nkVar2.X;
                boolean z11 = okVar.f27111b0;
                dk dkVar = okVar.f27117r;
                if (z11) {
                    s4.h0 adapter = dkVar.getAdapter();
                    nk nkVar3 = okVar.f27121y;
                    if (adapter != nkVar3) {
                        dkVar.setAdapter(nkVar3);
                    }
                }
                nkVar2.f26796s = arrayList2;
                nkVar2.l();
                return;
            case 16:
                gl glVar = (gl) this.f28447b;
                float[] fArr = (float[]) this.f28448c;
                glVar.getClass();
                glVar.b0(fArr[0], fArr[1]);
                return;
            case 17:
                ni niVar = (ni) this.f28448c;
                boolean z12 = ChatAttachAlertPhotoLayout.f22135q1;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                tl tlVar = ((ChatAttachAlertPhotoLayout) this.f28447b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                tlVar.scrollBy(0, listTopPadding);
                return;
            case 18:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28448c;
                dm dmVar = ((ChatAttachAlertPhotoLayout) this.f28447b).P;
                if (dmVar != null) {
                    dmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 19:
                ni niVar2 = (ni) this.f28448c;
                int currentItemTop2 = niVar2.getCurrentItemTop();
                int listTopPadding2 = niVar2.getListTopPadding();
                ai.w0 w0Var = ((qm) this.f28447b).f27604r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 20:
                jo.a(((ho) this.f28447b).f24860c);
                ((hg.g) this.f28448c).run();
                return;
            case 21:
                ((hp) this.f28447b).f24862b.x((List) this.f28448c);
                return;
            case 22:
                ((ip) this.f28447b).f25164b.x((List) this.f28448c);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.f3) this.f28447b).dismiss();
                nf.f.s((Context) this.f28448c, "https://t.me/BotFather?start=deletebot");
                return;
            case 24:
                mr mrVar = (mr) this.f28447b;
                mrVar.getClass();
                ((ci.d) this.f28448c).setLoading(false);
                mrVar.dismiss();
                return;
            case 25:
                mr mrVar2 = (mr) this.f28447b;
                TLObject tLObject = (TLObject) this.f28448c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    mrVar2.f26531b0 = groupcallstreamrtmpurl.url;
                    mrVar2.f26532c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mrVar2.f26532c0);
                    mrVar2.f26533d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f23827a |= 256;
                    obj.f23828b = 0;
                    obj.f23829c = spannableStringBuilder.length();
                    mrVar2.f26533d0.setSpan(new f11(obj, 0), 0, mrVar2.f26533d0.length(), 0);
                    mrVar2.f26534e0.N(false);
                    return;
                }
                return;
            case 26:
                qs qsVar = (qs) this.f28447b;
                TLObject tLObject2 = (TLObject) this.f28448c;
                ms msVar = qsVar.f27666b;
                ArrayList arrayList3 = qsVar.h;
                int i13 = qsVar.f27665a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    qsVar.f27669g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    qsVar.f27668f = currentTimeMillis;
                    if (!qsVar.f27670i) {
                        qsVar.f27670i = true;
                        String str3 = qsVar.f27669g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f18490id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(qsVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    qsVar.f27667c = false;
                    msVar.run();
                    return;
                }
                qsVar.f27669g = null;
                qsVar.e = true;
                qsVar.f27667c = false;
                msVar.run();
                return;
            case 27:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f28448c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new tc(28, (pt) this.f28447b, decodeFile));
                return;
            case 28:
                ((pt) this.f28447b).setImage((Bitmap) this.f28448c);
                return;
            default:
                ((EditTextBoldCursor) this.f28447b).hintLayout.draw((Canvas) this.f28448c);
                return;
        }
    }
}
