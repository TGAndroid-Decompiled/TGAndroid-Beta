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
    public final int f24946a;
    public final Object f24947b;
    public final Object f24948c;

    public be(int i10, Object obj, Object obj2) {
        this.f24946a = i10;
        this.f24947b = obj;
        this.f24948c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f24946a) {
            case 0:
                int i10 = ChatActivityEnterView.f23854n5;
                ((ChatActivityEnterView) this.f24947b).removeView((ci.e4) this.f24948c);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24947b;
                int i11 = ChatActivityEnterView.f23854n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f24948c);
                chatActivityEnterView.W = null;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f24947b;
                int i12 = ChatActivityEnterView.f23854n5;
                ((td) this.f24948c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 3:
                qg qgVar = (qg) this.f24948c;
                ChatActivityEnterView chatActivityEnterView3 = ((tg) this.f24947b).V;
                chatActivityEnterView3.f23908i1 = chatActivityEnterView3.f23902h1.getAudioRightMs() - chatActivityEnterView3.f23902h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23902h1.getAudioLeftMs(), chatActivityEnterView3.f23902h1.getAudioRightMs(), qgVar);
                return;
            case 4:
                ((xi) this.f24947b).containerView.removeView((ci.e4) this.f24948c);
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f24948c;
                ((xi) this.f24947b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 6:
                xi xiVar = (xi) this.f24947b;
                MediaDataController.getInstance(xiVar.J1).loadAttachMenuBots(false, true);
                if (xiVar.f32971y0 == xiVar.f32967x0.get(((TLRPC.TL_attachMenuBot) this.f24948c).bot_id)) {
                    xiVar.P1(xiVar.f32922j0);
                    return;
                }
                return;
            case 7:
                xi xiVar2 = (xi) this.f24947b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((qi) this.f24948c).f30071c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                xiVar2.M1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(xiVar2.J1).updateAttachMenuBotsInCache();
                return;
            case 8:
                jj jjVar = (jj) this.f24947b;
                jjVar.G = false;
                jjVar.H = (ArrayList) this.f24948c;
                jjVar.N();
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new be(10, (ak) this.f24947b, ((zj) this.f24948c).run()));
                return;
            case 10:
                ((ak) this.f24947b).setStatus((CharSequence) this.f24948c);
                return;
            case 11:
                qk qkVar = (qk) this.f24947b;
                String str3 = (String) this.f24948c;
                qkVar.getClass();
                ArrayList arrayList = new ArrayList(qkVar.X.v.f28245c);
                if (qkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, qkVar.X.v.f28246e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(qkVar, str3, !qkVar.R.isEmpty(), arrayList, 18));
                return;
            case 12:
                qk qkVar2 = (qk) this.f24947b;
                ArrayList arrayList2 = (ArrayList) this.f24948c;
                rk rkVar = qkVar2.X;
                boolean z11 = rkVar.f30515b0;
                gk gkVar = rkVar.f30521r;
                if (z11) {
                    s4.h0 adapter = gkVar.getAdapter();
                    qk qkVar3 = rkVar.f30525y;
                    if (adapter != qkVar3) {
                        gkVar.setAdapter(qkVar3);
                    }
                }
                qkVar2.f30081s = arrayList2;
                qkVar2.l();
                return;
            case 13:
                jl jlVar = (jl) this.f24947b;
                float[] fArr = (float[]) this.f24948c;
                jlVar.getClass();
                jlVar.b0(fArr[0], fArr[1]);
                return;
            case 14:
                pi piVar = (pi) this.f24948c;
                boolean z12 = ChatAttachAlertPhotoLayout.f24025q1;
                int currentItemTop = piVar.getCurrentItemTop();
                int listTopPadding = piVar.getListTopPadding();
                wl wlVar = ((ChatAttachAlertPhotoLayout) this.f24947b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                wlVar.scrollBy(0, listTopPadding);
                return;
            case 15:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24948c;
                gm gmVar = ((ChatAttachAlertPhotoLayout) this.f24947b).P;
                if (gmVar != null) {
                    gmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 16:
                pi piVar2 = (pi) this.f24948c;
                int currentItemTop2 = piVar2.getCurrentItemTop();
                int listTopPadding2 = piVar2.getListTopPadding();
                ai.w0 w0Var = ((tm) this.f24947b).f31185r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 17:
                mo.a(((ko) this.f24947b).f28266c);
                ((hg.h) this.f24948c).run();
                return;
            case 18:
                ((kp) this.f24947b).f28268b.x((List) this.f24948c);
                return;
            case 19:
                ((lp) this.f24947b).f28510b.x((List) this.f24948c);
                return;
            case 20:
                ((org.telegram.ui.ActionBar.f3) this.f24947b).dismiss();
                nf.f.s((Context) this.f24948c, "https://t.me/BotFather?start=deletebot");
                return;
            case 21:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f24947b;
                String charSequence = j3Var.getText().toString();
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22315b;
                Iterator it = ((Set) this.f24948c).iterator();
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
                pr prVar = (pr) this.f24947b;
                prVar.getClass();
                ((ci.d) this.f24948c).setLoading(false);
                prVar.dismiss();
                return;
            case 23:
                pr prVar2 = (pr) this.f24947b;
                TLObject tLObject = (TLObject) this.f24948c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    prVar2.f29829b0 = groupcallstreamrtmpurl.url;
                    prVar2.f29830c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(prVar2.f29830c0);
                    prVar2.f29831d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f28925a |= 256;
                    obj.f28926b = 0;
                    obj.f28927c = spannableStringBuilder.length();
                    prVar2.f29831d0.setSpan(new o11(obj, 0), 0, prVar2.f29831d0.length(), 0);
                    prVar2.f29832e0.N(false);
                    return;
                }
                return;
            case 24:
                ts tsVar = (ts) this.f24947b;
                TLObject tLObject2 = (TLObject) this.f24948c;
                ps psVar = tsVar.f31229b;
                ArrayList arrayList3 = tsVar.h;
                int i13 = tsVar.f31228a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    tsVar.f31233g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tsVar.f31231e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    tsVar.f31232f = currentTimeMillis;
                    if (!tsVar.f31234i) {
                        tsVar.f31234i = true;
                        String str5 = tsVar.f31233g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f20194id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(tsVar, messagesStorage, arrayList4, currentTimeMillis, str, 3));
                    }
                    tsVar.f31230c = false;
                    psVar.run();
                    return;
                }
                tsVar.f31233g = null;
                tsVar.f31231e = true;
                tsVar.f31230c = false;
                psVar.run();
                return;
            case 25:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f24948c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new be(26, (st) this.f24947b, decodeFile));
                return;
            case 26:
                ((st) this.f24947b).setImage((Bitmap) this.f24948c);
                return;
            case 27:
                ((EditTextBoldCursor) this.f24947b).hintLayout.draw((Canvas) this.f24948c);
                return;
            case 28:
                MessagesController.getInstance(wv.S(((fv) this.f24947b).f26590a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f24948c);
                return;
            default:
                MessagesController.getInstance(((ix) this.f24947b).f27618a.f29194c1).updateEmojiStatus((TLRPC.EmojiStatus) this.f24948c);
                return;
        }
    }
}
