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
public final class ee implements Runnable {
    public final int f22684a;
    public final Object f22685b;
    public final Object f22686c;

    public ee(int i10, Object obj, Object obj2) {
        this.f22684a = i10;
        this.f22685b = obj;
        this.f22686c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f22684a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f22685b;
                int i10 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.setFieldText((CharSequence) this.f22686c);
                chatActivityEnterView.W = null;
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f22685b;
                int i11 = ChatActivityEnterView.f20816m5;
                ((qd) this.f22686c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.P2, true);
                return;
            case 2:
                rg rgVar = (rg) this.f22686c;
                ChatActivityEnterView chatActivityEnterView3 = ((ug) this.f22685b).V;
                chatActivityEnterView3.f20869i1 = chatActivityEnterView3.f20863h1.getAudioRightMs() - chatActivityEnterView3.f20863h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f20863h1.getAudioLeftMs(), chatActivityEnterView3.f20863h1.getAudioRightMs(), rgVar);
                return;
            case 3:
                yi.u((yi) this.f22685b, (bi.x4) this.f22686c);
                return;
            case 4:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f22686c;
                ((yi) this.f22685b).dismiss(true);
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 5:
                yi yiVar = (yi) this.f22685b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ri) this.f22686c).f26672c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                yiVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(yiVar.J1).updateAttachMenuBotsInCache();
                return;
            case 6:
                yi yiVar2 = (yi) this.f22685b;
                MediaDataController.getInstance(yiVar2.J1).loadAttachMenuBots(false, true);
                if (yiVar2.f29427y0 == yiVar2.f29423x0.get(((TLRPC.TL_attachMenuBot) this.f22686c).bot_id)) {
                    yiVar2.Q1(yiVar2.f29378j0);
                    return;
                }
                return;
            case 7:
                jj jjVar = (jj) this.f22685b;
                jjVar.H = false;
                jjVar.I = (ArrayList) this.f22686c;
                jjVar.P();
                return;
            case 8:
                jj jjVar2 = (jj) this.f22685b;
                ((yi) this.f22686c).Z0();
                jjVar2.L();
                jjVar2.f26422b.X1(jjVar2, 0);
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ee(10, (ak) this.f22685b, ((zj) this.f22686c).run()));
                return;
            case 10:
                ((ak) this.f22685b).setStatus((CharSequence) this.f22686c);
                return;
            case 11:
                sk skVar = (sk) this.f22685b;
                String str = (String) this.f22686c;
                skVar.getClass();
                ArrayList arrayList = new ArrayList(skVar.X.v.f25248c);
                if (skVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, skVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new bi.g2(skVar, str, true ^ skVar.R.isEmpty(), arrayList));
                return;
            case 12:
                sk skVar2 = (sk) this.f22685b;
                ArrayList arrayList2 = (ArrayList) this.f22686c;
                tk tkVar = skVar2.X;
                boolean z11 = tkVar.f27422b0;
                ik ikVar = tkVar.f27428r;
                if (z11) {
                    s4.h0 adapter = ikVar.getAdapter();
                    sk skVar3 = tkVar.f27432y;
                    if (adapter != skVar3) {
                        ikVar.setAdapter(skVar3);
                    }
                }
                skVar2.f27087s = arrayList2;
                skVar2.l();
                return;
            case 13:
                ll llVar = (ll) this.f22685b;
                float[] fArr = (float[]) this.f22686c;
                llVar.getClass();
                llVar.b0(fArr[0], fArr[1]);
                return;
            case 14:
                qi qiVar = (qi) this.f22686c;
                boolean z12 = ChatAttachAlertPhotoLayout.f20983q1;
                int currentItemTop = qiVar.getCurrentItemTop();
                int listTopPadding = qiVar.getListTopPadding();
                yl ylVar = ((ChatAttachAlertPhotoLayout) this.f22685b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ylVar.scrollBy(0, listTopPadding);
                return;
            case 15:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22686c;
                im imVar = ((ChatAttachAlertPhotoLayout) this.f22685b).P;
                if (imVar != null) {
                    imVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 16:
                qi qiVar2 = (qi) this.f22686c;
                int currentItemTop2 = qiVar2.getCurrentItemTop();
                int listTopPadding2 = qiVar2.getListTopPadding();
                bi.y1 y1Var = ((xm) this.f22685b).f29080r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                y1Var.scrollBy(0, listTopPadding2);
                return;
            case 17:
                oo.a(((mo) this.f22685b).f25263c);
                ((gg.g) this.f22686c).run();
                return;
            case 18:
                ((np) this.f22685b).f25564b.x((List) this.f22686c);
                return;
            case 19:
                ((op) this.f22685b).f25880b.x((List) this.f22686c);
                return;
            case 20:
                ((org.telegram.ui.ActionBar.h3) this.f22685b).dismiss();
                nf.f.s((Context) this.f22686c, "https://t.me/BotFather?start=deletebot");
                return;
            case 21:
                sr srVar = (sr) this.f22685b;
                srVar.getClass();
                ((bi.d) this.f22686c).setLoading(false);
                srVar.dismiss();
                return;
            case 22:
                sr srVar2 = (sr) this.f22685b;
                TLObject tLObject = (TLObject) this.f22686c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    srVar2.f27201b0 = groupcallstreamrtmpurl.url;
                    srVar2.f27202c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(srVar2.f27202c0);
                    srVar2.f27203d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f21677a |= 256;
                    obj.f21678b = 0;
                    obj.f21679c = spannableStringBuilder.length();
                    srVar2.f27203d0.setSpan(new c11(obj, 0), 0, srVar2.f27203d0.length(), 0);
                    srVar2.f27204e0.N(false);
                    return;
                }
                return;
            case 23:
                ws wsVar = (ws) this.f22685b;
                TLObject tLObject2 = (TLObject) this.f22686c;
                ss ssVar = wsVar.f28829b;
                ArrayList arrayList3 = wsVar.h;
                int i12 = wsVar.f28828a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    wsVar.f28832g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    wsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    wsVar.f28831f = currentTimeMillis;
                    if (!wsVar.f28833i) {
                        wsVar.f28833i = true;
                        String str3 = wsVar.f28832g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList3.size(); i13 = com.google.android.gms.internal.vision.e2.f(((TLRPC.User) arrayList3.get(i13)).f17342id, arrayList4, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.g(wsVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    wsVar.f28830c = false;
                    ssVar.run();
                    return;
                }
                wsVar.f28832g = null;
                wsVar.e = true;
                wsVar.f28830c = false;
                ssVar.run();
                return;
            case 24:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f22686c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new ee(25, (tt) this.f22685b, decodeFile));
                return;
            case 25:
                ((tt) this.f22685b).setImage((Bitmap) this.f22686c);
                return;
            case 26:
                ((EditTextBoldCursor) this.f22685b).hintLayout.draw((Canvas) this.f22686c);
                return;
            case 27:
                MessagesController.getInstance(wv.U(((fv) this.f22685b).f23086a)).updateEmojiStatus((TLRPC.EmojiStatus) this.f22686c);
                return;
            case 28:
                MessagesController.getInstance(((ix) this.f22685b).f24155a.f26805c1).updateEmojiStatus((TLRPC.EmojiStatus) this.f22686c);
                return;
            default:
                TLObject tLObject3 = (TLObject) this.f22686c;
                rz rzVar = ((ix) this.f22685b).f24155a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(rzVar.f26805c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(rzVar.f26805c1).replaceStickerSet(tL_messages_stickerSet);
                    return;
                }
                return;
        }
    }
}
