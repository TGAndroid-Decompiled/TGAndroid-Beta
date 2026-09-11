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
    public final int f30857a;
    public final Object f30858b;
    public final Object f30859c;

    public uc(int i10, Object obj, Object obj2) {
        this.f30857a = i10;
        this.f30858b = obj;
        this.f30859c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f30857a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f30858b;
                Runnable runnable = (Runnable) this.f30859c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((ld) this.f30858b).removeView((di.f4) this.f30859c);
                return;
            case 2:
                int i10 = ChatActivityEnterView.f23661m5;
                ((ChatActivityEnterView) this.f30858b).removeView((di.f4) this.f30859c);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f30858b;
                int i11 = ChatActivityEnterView.f23661m5;
                chatActivityEnterView.setFieldText((CharSequence) this.f30859c);
                chatActivityEnterView.W = null;
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f30858b;
                int i12 = ChatActivityEnterView.f23661m5;
                ((sd) this.f30859c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.P2, true);
                return;
            case 5:
                pg pgVar = (pg) this.f30859c;
                ChatActivityEnterView chatActivityEnterView3 = ((sg) this.f30858b).V;
                chatActivityEnterView3.f23715i1 = chatActivityEnterView3.f23709h1.getAudioRightMs() - chatActivityEnterView3.f23709h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23709h1.getAudioLeftMs(), chatActivityEnterView3.f23709h1.getAudioRightMs(), pgVar);
                return;
            case 6:
                vi.u((vi) this.f30858b, (di.f4) this.f30859c);
                return;
            case 7:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f30859c;
                ((vi) this.f30858b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 8:
                vi viVar = (vi) this.f30858b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((oi) this.f30859c).f29075c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar.J1).updateAttachMenuBotsInCache();
                return;
            case 9:
                vi viVar2 = (vi) this.f30858b;
                MediaDataController.getInstance(viVar2.J1).loadAttachMenuBots(false, true);
                if (viVar2.f31340y0 == viVar2.f31336x0.get(((TLRPC.TL_attachMenuBot) this.f30859c).bot_id)) {
                    viVar2.Q1(viVar2.f31291j0);
                    return;
                }
                return;
            case 10:
                gj gjVar = (gj) this.f30858b;
                gjVar.H = false;
                gjVar.I = (ArrayList) this.f30859c;
                gjVar.P();
                return;
            case 11:
                gj gjVar2 = (gj) this.f30858b;
                ((vi) this.f30859c).Z0();
                gjVar2.L();
                gjVar2.f28753b.X1(gjVar2, 0);
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new uc(13, (xj) this.f30858b, ((wj) this.f30859c).run()));
                return;
            case 13:
                ((xj) this.f30858b).setStatus((CharSequence) this.f30859c);
                return;
            case 14:
                nk nkVar = (nk) this.f30858b;
                String str = (String) this.f30859c;
                nkVar.getClass();
                ArrayList arrayList = new ArrayList(nkVar.X.v.f26740c);
                if (nkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, nkVar.X.v.f26741e);
                }
                Utilities.searchQueue.postRunnable(new bi.e4(nkVar, str, !nkVar.R.isEmpty(), arrayList, 17));
                return;
            case 15:
                nk nkVar2 = (nk) this.f30858b;
                ArrayList arrayList2 = (ArrayList) this.f30859c;
                ok okVar = nkVar2.X;
                boolean z11 = okVar.f29086b0;
                dk dkVar = okVar.f29092r;
                if (z11) {
                    s4.h0 adapter = dkVar.getAdapter();
                    nk nkVar3 = okVar.f29096y;
                    if (adapter != nkVar3) {
                        dkVar.setAdapter(nkVar3);
                    }
                }
                nkVar2.f28774s = arrayList2;
                nkVar2.l();
                return;
            case 16:
                gl glVar = (gl) this.f30858b;
                float[] fArr = (float[]) this.f30859c;
                glVar.getClass();
                glVar.b0(fArr[0], fArr[1]);
                return;
            case 17:
                ni niVar = (ni) this.f30859c;
                boolean z12 = ChatAttachAlertPhotoLayout.f23831q1;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                tl tlVar = ((ChatAttachAlertPhotoLayout) this.f30858b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                tlVar.scrollBy(0, listTopPadding);
                return;
            case 18:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30859c;
                dm dmVar = ((ChatAttachAlertPhotoLayout) this.f30858b).P;
                if (dmVar != null) {
                    dmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 19:
                ni niVar2 = (ni) this.f30859c;
                int currentItemTop2 = niVar2.getCurrentItemTop();
                int listTopPadding2 = niVar2.getListTopPadding();
                bi.o0 o0Var = ((qm) this.f30858b).f29769r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                o0Var.scrollBy(0, listTopPadding2);
                return;
            case 20:
                io.a(((go) this.f30858b).f26471c);
                ((ig.g) this.f30859c).run();
                return;
            case 21:
                ((gp) this.f30858b).f26479b.x((List) this.f30859c);
                return;
            case 22:
                ((hp) this.f30858b).f26780b.x((List) this.f30859c);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.f3) this.f30858b).dismiss();
                of.f.s((Context) this.f30859c, "https://t.me/BotFather?start=deletebot");
                return;
            case 24:
                lr lrVar = (lr) this.f30858b;
                lrVar.getClass();
                ((di.d) this.f30859c).setLoading(false);
                lrVar.dismiss();
                return;
            case 25:
                lr lrVar2 = (lr) this.f30858b;
                TLObject tLObject = (TLObject) this.f30859c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    lrVar2.f28292b0 = groupcallstreamrtmpurl.url;
                    lrVar2.f28293c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lrVar2.f28293c0);
                    lrVar2.f28294d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f28591a |= 256;
                    obj.f28592b = 0;
                    obj.f28593c = spannableStringBuilder.length();
                    lrVar2.f28294d0.setSpan(new o01(obj, 0), 0, lrVar2.f28294d0.length(), 0);
                    lrVar2.f28295e0.N(false);
                    return;
                }
                return;
            case 26:
                ps psVar = (ps) this.f30858b;
                TLObject tLObject2 = (TLObject) this.f30859c;
                ls lsVar = psVar.f29479b;
                ArrayList arrayList3 = psVar.h;
                int i13 = psVar.f29478a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    psVar.f29483g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    psVar.f29481e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    psVar.f29482f = currentTimeMillis;
                    if (!psVar.f29484i) {
                        psVar.f29484i = true;
                        String str3 = psVar.f29483g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f20016id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(psVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    psVar.f29480c = false;
                    lsVar.run();
                    return;
                }
                psVar.f29483g = null;
                psVar.f29481e = true;
                psVar.f29480c = false;
                lsVar.run();
                return;
            case 27:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f30859c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new uc(28, (nt) this.f30858b, decodeFile));
                return;
            case 28:
                ((nt) this.f30858b).setImage((Bitmap) this.f30859c);
                return;
            default:
                ((EditTextBoldCursor) this.f30858b).hintLayout.draw((Canvas) this.f30859c);
                return;
        }
    }
}
