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
    public final int f24930a;
    public final Object f24931b;
    public final Object f24932c;

    public be(int i10, Object obj, Object obj2) {
        this.f24930a = i10;
        this.f24931b = obj;
        this.f24932c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f24930a) {
            case 0:
                int i10 = ChatActivityEnterView.f23851n5;
                ((ChatActivityEnterView) this.f24931b).removeView((ci.e4) this.f24932c);
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f24931b;
                int i11 = ChatActivityEnterView.f23851n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f24932c);
                chatActivityEnterView.W = null;
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f24931b;
                int i12 = ChatActivityEnterView.f23851n5;
                ((td) this.f24932c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 3:
                qg qgVar = (qg) this.f24932c;
                ChatActivityEnterView chatActivityEnterView3 = ((tg) this.f24931b).V;
                chatActivityEnterView3.f23905i1 = chatActivityEnterView3.f23899h1.getAudioRightMs() - chatActivityEnterView3.f23899h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23899h1.getAudioLeftMs(), chatActivityEnterView3.f23899h1.getAudioRightMs(), qgVar);
                return;
            case 4:
                ((xi) this.f24931b).containerView.removeView((ci.e4) this.f24932c);
                return;
            case 5:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f24932c;
                ((xi) this.f24931b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 6:
                xi xiVar = (xi) this.f24931b;
                MediaDataController.getInstance(xiVar.J1).loadAttachMenuBots(false, true);
                if (xiVar.f32880y0 == xiVar.f32876x0.get(((TLRPC.TL_attachMenuBot) this.f24932c).bot_id)) {
                    xiVar.P1(xiVar.f32831j0);
                    return;
                }
                return;
            case 7:
                xi xiVar2 = (xi) this.f24931b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((qi) this.f24932c).f30049c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                xiVar2.M1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(xiVar2.J1).updateAttachMenuBotsInCache();
                return;
            case 8:
                jj jjVar = (jj) this.f24931b;
                jjVar.G = false;
                jjVar.H = (ArrayList) this.f24932c;
                jjVar.N();
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new be(10, (ak) this.f24931b, ((zj) this.f24932c).run()));
                return;
            case 10:
                ((ak) this.f24931b).setStatus((CharSequence) this.f24932c);
                return;
            case 11:
                qk qkVar = (qk) this.f24931b;
                String str3 = (String) this.f24932c;
                qkVar.getClass();
                ArrayList arrayList = new ArrayList(qkVar.X.v.f28159c);
                if (qkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, qkVar.X.v.f28160e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(qkVar, str3, !qkVar.R.isEmpty(), arrayList, 18));
                return;
            case 12:
                qk qkVar2 = (qk) this.f24931b;
                ArrayList arrayList2 = (ArrayList) this.f24932c;
                rk rkVar = qkVar2.X;
                boolean z11 = rkVar.f30433b0;
                gk gkVar = rkVar.f30439r;
                if (z11) {
                    s4.h0 adapter = gkVar.getAdapter();
                    qk qkVar3 = rkVar.f30443y;
                    if (adapter != qkVar3) {
                        gkVar.setAdapter(qkVar3);
                    }
                }
                qkVar2.f30059s = arrayList2;
                qkVar2.l();
                return;
            case 13:
                jl jlVar = (jl) this.f24931b;
                float[] fArr = (float[]) this.f24932c;
                jlVar.getClass();
                jlVar.b0(fArr[0], fArr[1]);
                return;
            case 14:
                pi piVar = (pi) this.f24932c;
                boolean z12 = ChatAttachAlertPhotoLayout.f24022q1;
                int currentItemTop = piVar.getCurrentItemTop();
                int listTopPadding = piVar.getListTopPadding();
                wl wlVar = ((ChatAttachAlertPhotoLayout) this.f24931b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                wlVar.scrollBy(0, listTopPadding);
                return;
            case 15:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24932c;
                gm gmVar = ((ChatAttachAlertPhotoLayout) this.f24931b).P;
                if (gmVar != null) {
                    gmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 16:
                pi piVar2 = (pi) this.f24932c;
                int currentItemTop2 = piVar2.getCurrentItemTop();
                int listTopPadding2 = piVar2.getListTopPadding();
                ai.w0 w0Var = ((tm) this.f24931b).f31098r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 17:
                mo.a(((ko) this.f24931b).f28180c);
                ((hg.h) this.f24932c).run();
                return;
            case 18:
                ((kp) this.f24931b).f28182b.x((List) this.f24932c);
                return;
            case 19:
                ((lp) this.f24931b).f28407b.x((List) this.f24932c);
                return;
            case 20:
                ((org.telegram.ui.ActionBar.f3) this.f24931b).dismiss();
                nf.f.s((Context) this.f24932c, "https://t.me/BotFather?start=deletebot");
                return;
            case 21:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f24931b;
                String charSequence = j3Var.getText().toString();
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22311b;
                Iterator it = ((Set) this.f24932c).iterator();
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
                pr prVar = (pr) this.f24931b;
                prVar.getClass();
                ((ci.d) this.f24932c).setLoading(false);
                prVar.dismiss();
                return;
            case 23:
                pr prVar2 = (pr) this.f24931b;
                TLObject tLObject = (TLObject) this.f24932c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    prVar2.f29730b0 = groupcallstreamrtmpurl.url;
                    prVar2.f29731c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(prVar2.f29731c0);
                    prVar2.f29732d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f28502a |= 256;
                    obj.f28503b = 0;
                    obj.f28504c = spannableStringBuilder.length();
                    prVar2.f29732d0.setSpan(new n11(obj, 0), 0, prVar2.f29732d0.length(), 0);
                    prVar2.f29733e0.N(false);
                    return;
                }
                return;
            case 24:
                ts tsVar = (ts) this.f24931b;
                TLObject tLObject2 = (TLObject) this.f24932c;
                ps psVar = tsVar.f31161b;
                ArrayList arrayList3 = tsVar.h;
                int i13 = tsVar.f31160a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    tsVar.f31165g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    tsVar.f31163e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    tsVar.f31164f = currentTimeMillis;
                    if (!tsVar.f31166i) {
                        tsVar.f31166i = true;
                        String str5 = tsVar.f31165g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f20189id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(tsVar, messagesStorage, arrayList4, currentTimeMillis, str, 3));
                    }
                    tsVar.f31162c = false;
                    psVar.run();
                    return;
                }
                tsVar.f31165g = null;
                tsVar.f31163e = true;
                tsVar.f31162c = false;
                psVar.run();
                return;
            case 25:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f24932c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new be(26, (st) this.f24931b, decodeFile));
                return;
            case 26:
                ((st) this.f24931b).setImage((Bitmap) this.f24932c);
                return;
            case 27:
                ((EditTextBoldCursor) this.f24931b).hintLayout.draw((Canvas) this.f24932c);
                return;
            case 28:
                MessagesController.getInstance(wv.S(((fv) this.f24931b).f26575a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f24932c);
                return;
            default:
                MessagesController.getInstance(((ix) this.f24931b).f27515a.f29097c1).updateEmojiStatus((TLRPC.EmojiStatus) this.f24932c);
                return;
        }
    }
}
