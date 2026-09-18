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
public final class zd implements Runnable {
    public final int f30768a;
    public final Object f30769b;
    public final Object f30770c;

    public zd(int i10, Object obj, Object obj2) {
        this.f30768a = i10;
        this.f30769b = obj;
        this.f30770c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f30768a) {
            case 0:
                int i10 = ChatActivityEnterView.f21917m5;
                ((ChatActivityEnterView) this.f30769b).removeView((ci.f4) this.f30770c);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f30769b;
                int i11 = ChatActivityEnterView.f21917m5;
                chatActivityEnterView.setFieldText((CharSequence) this.f30770c);
                chatActivityEnterView.W = null;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f30769b;
                int i12 = ChatActivityEnterView.f21917m5;
                ((rd) this.f30770c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.P2, true);
                return;
            case 3:
                og ogVar = (og) this.f30770c;
                ChatActivityEnterView chatActivityEnterView3 = ((rg) this.f30769b).V;
                chatActivityEnterView3.f21970i1 = chatActivityEnterView3.f21964h1.getAudioRightMs() - chatActivityEnterView3.f21964h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f21964h1.getAudioLeftMs(), chatActivityEnterView3.f21964h1.getAudioRightMs(), ogVar);
                return;
            case 4:
                ((vi) this.f30769b).containerView.removeView((ci.f4) this.f30770c);
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f30770c;
                ((vi) this.f30769b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 6:
                vi viVar = (vi) this.f30769b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((oi) this.f30770c).f26951c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar.J1).updateAttachMenuBotsInCache();
                return;
            case 7:
                vi viVar2 = (vi) this.f30769b;
                MediaDataController.getInstance(viVar2.J1).loadAttachMenuBots(false, true);
                if (viVar2.f29082y0 == viVar2.f29078x0.get(((TLRPC.TL_attachMenuBot) this.f30770c).bot_id)) {
                    viVar2.Q1(viVar2.f29033j0);
                    return;
                }
                return;
            case 8:
                gj gjVar = (gj) this.f30769b;
                gjVar.H = false;
                gjVar.I = (ArrayList) this.f30770c;
                gjVar.P();
                return;
            case 9:
                gj gjVar2 = (gj) this.f30769b;
                ((vi) this.f30770c).Z0();
                gjVar2.L();
                gjVar2.f26688b.X1(gjVar2, 0);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new zd(11, (xj) this.f30769b, ((wj) this.f30770c).run()));
                return;
            case 11:
                ((xj) this.f30769b).setStatus((CharSequence) this.f30770c);
                return;
            case 12:
                nk nkVar = (nk) this.f30769b;
                String str = (String) this.f30770c;
                nkVar.getClass();
                ArrayList arrayList = new ArrayList(nkVar.X.v.f24685c);
                if (nkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, nkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(nkVar, str, !nkVar.R.isEmpty(), arrayList, 18));
                return;
            case 13:
                nk nkVar2 = (nk) this.f30769b;
                ArrayList arrayList2 = (ArrayList) this.f30770c;
                ok okVar = nkVar2.X;
                boolean z11 = okVar.f26962b0;
                dk dkVar = okVar.f26968r;
                if (z11) {
                    s4.h0 adapter = dkVar.getAdapter();
                    nk nkVar3 = okVar.f26972y;
                    if (adapter != nkVar3) {
                        dkVar.setAdapter(nkVar3);
                    }
                }
                nkVar2.f26697s = arrayList2;
                nkVar2.l();
                return;
            case 14:
                gl glVar = (gl) this.f30769b;
                float[] fArr = (float[]) this.f30770c;
                glVar.getClass();
                glVar.b0(fArr[0], fArr[1]);
                return;
            case 15:
                ni niVar = (ni) this.f30770c;
                boolean z12 = ChatAttachAlertPhotoLayout.f22084q1;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                tl tlVar = ((ChatAttachAlertPhotoLayout) this.f30769b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                tlVar.scrollBy(0, listTopPadding);
                return;
            case 16:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30770c;
                dm dmVar = ((ChatAttachAlertPhotoLayout) this.f30769b).P;
                if (dmVar != null) {
                    dmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 17:
                ni niVar2 = (ni) this.f30770c;
                int currentItemTop2 = niVar2.getCurrentItemTop();
                int listTopPadding2 = niVar2.getListTopPadding();
                ai.w0 w0Var = ((qm) this.f30769b).f27684r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 18:
                jo.a(((ho) this.f30769b).f24709c);
                ((hg.g) this.f30770c).run();
                return;
            case 19:
                ((hp) this.f30769b).f24711b.x((List) this.f30770c);
                return;
            case 20:
                ((ip) this.f30769b).f25024b.x((List) this.f30770c);
                return;
            case 21:
                ((org.telegram.ui.ActionBar.f3) this.f30769b).dismiss();
                nf.f.s((Context) this.f30770c, "https://t.me/BotFather?start=deletebot");
                return;
            case 22:
                mr mrVar = (mr) this.f30769b;
                mrVar.getClass();
                ((ci.d) this.f30770c).setLoading(false);
                mrVar.dismiss();
                return;
            case 23:
                mr mrVar2 = (mr) this.f30769b;
                TLObject tLObject = (TLObject) this.f30770c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    mrVar2.f26510b0 = groupcallstreamrtmpurl.url;
                    mrVar2.f26511c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mrVar2.f26511c0);
                    mrVar2.f26512d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f23395a |= 256;
                    obj.f23396b = 0;
                    obj.f23397c = spannableStringBuilder.length();
                    mrVar2.f26512d0.setSpan(new e11(obj, 0), 0, mrVar2.f26512d0.length(), 0);
                    mrVar2.f26513e0.N(false);
                    return;
                }
                return;
            case 24:
                qs qsVar = (qs) this.f30769b;
                TLObject tLObject2 = (TLObject) this.f30770c;
                ms msVar = qsVar.f27731b;
                ArrayList arrayList3 = qsVar.h;
                int i13 = qsVar.f27730a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    qsVar.f27734g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    qsVar.f27733f = currentTimeMillis;
                    if (!qsVar.f27735i) {
                        qsVar.f27735i = true;
                        String str3 = qsVar.f27734g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f18443id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(qsVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    qsVar.f27732c = false;
                    msVar.run();
                    return;
                }
                qsVar.f27734g = null;
                qsVar.e = true;
                qsVar.f27732c = false;
                msVar.run();
                return;
            case 25:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f30770c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new zd(26, (pt) this.f30769b, decodeFile));
                return;
            case 26:
                ((pt) this.f30769b).setImage((Bitmap) this.f30770c);
                return;
            case 27:
                ((EditTextBoldCursor) this.f30769b).hintLayout.draw((Canvas) this.f30770c);
                return;
            case 28:
                MessagesController.getInstance(sv.U(((bv) this.f30769b).f23082a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f30770c);
                return;
            default:
                MessagesController.getInstance(((ex) this.f30769b).f23977a.f25892c1).updateEmojiStatus((TLRPC.EmojiStatus) this.f30770c);
                return;
        }
    }
}
