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
    public final int f28794a;
    public final Object f28795b;
    public final Object f28796c;

    public uc(int i10, Object obj, Object obj2) {
        this.f28794a = i10;
        this.f28795b = obj;
        this.f28796c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        Bitmap createBitmap;
        switch (this.f28794a) {
            case 0:
                boolean[] zArr = (boolean[]) this.f28795b;
                Runnable runnable = (Runnable) this.f28796c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ((md) this.f28795b).removeView((ci.e4) this.f28796c);
                return;
            case 2:
                int i10 = ChatActivityEnterView.f21954n5;
                ((ChatActivityEnterView) this.f28795b).removeView((ci.e4) this.f28796c);
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f28795b;
                int i11 = ChatActivityEnterView.f21954n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f28796c);
                chatActivityEnterView.W = null;
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f28795b;
                int i12 = ChatActivityEnterView.f21954n5;
                ((td) this.f28796c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 5:
                pg pgVar = (pg) this.f28796c;
                ChatActivityEnterView chatActivityEnterView3 = ((sg) this.f28795b).V;
                chatActivityEnterView3.f22007i1 = chatActivityEnterView3.f22001h1.getAudioRightMs() - chatActivityEnterView3.f22001h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f22001h1.getAudioLeftMs(), chatActivityEnterView3.f22001h1.getAudioRightMs(), pgVar);
                return;
            case 6:
                wi.u((wi) this.f28795b, (ci.e4) this.f28796c);
                return;
            case 7:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f28796c;
                ((wi) this.f28795b).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 8:
                wi wiVar = (wi) this.f28795b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((pi) this.f28796c).f27355c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                wiVar.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(wiVar.J1).updateAttachMenuBotsInCache();
                return;
            case 9:
                wi wiVar2 = (wi) this.f28795b;
                MediaDataController.getInstance(wiVar2.J1).loadAttachMenuBots(false, true);
                if (wiVar2.f29995y0 == wiVar2.f29991x0.get(((TLRPC.TL_attachMenuBot) this.f28796c).bot_id)) {
                    wiVar2.Q1(wiVar2.f29946j0);
                    return;
                }
                return;
            case 10:
                ij ijVar = (ij) this.f28795b;
                ijVar.G = false;
                ijVar.H = (ArrayList) this.f28796c;
                ijVar.P();
                return;
            case 11:
                ij ijVar2 = (ij) this.f28795b;
                ((wi) this.f28796c).Z0();
                ijVar2.L();
                ijVar2.f27075b.X1(ijVar2, 0);
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new uc(13, (zj) this.f28795b, ((yj) this.f28796c).run()));
                return;
            case 13:
                ((zj) this.f28795b).setStatus((CharSequence) this.f28796c);
                return;
            case 14:
                pk pkVar = (pk) this.f28795b;
                String str = (String) this.f28796c;
                pkVar.getClass();
                ArrayList arrayList = new ArrayList(pkVar.X.v.f25470c);
                if (pkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, pkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(pkVar, str, !pkVar.R.isEmpty(), arrayList, 18));
                return;
            case 15:
                pk pkVar2 = (pk) this.f28795b;
                ArrayList arrayList2 = (ArrayList) this.f28796c;
                qk qkVar = pkVar2.X;
                boolean z11 = qkVar.f27734b0;
                fk fkVar = qkVar.f27740r;
                if (z11) {
                    s4.h0 adapter = fkVar.getAdapter();
                    pk pkVar3 = qkVar.f27744y;
                    if (adapter != pkVar3) {
                        fkVar.setAdapter(pkVar3);
                    }
                }
                pkVar2.f27362s = arrayList2;
                pkVar2.l();
                return;
            case 16:
                il ilVar = (il) this.f28795b;
                float[] fArr = (float[]) this.f28796c;
                ilVar.getClass();
                ilVar.b0(fArr[0], fArr[1]);
                return;
            case 17:
                oi oiVar = (oi) this.f28796c;
                boolean z12 = ChatAttachAlertPhotoLayout.f22122q1;
                int currentItemTop = oiVar.getCurrentItemTop();
                int listTopPadding = oiVar.getListTopPadding();
                vl vlVar = ((ChatAttachAlertPhotoLayout) this.f28795b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                vlVar.scrollBy(0, listTopPadding);
                return;
            case 18:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28796c;
                fm fmVar = ((ChatAttachAlertPhotoLayout) this.f28795b).P;
                if (fmVar != null) {
                    fmVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 19:
                oi oiVar2 = (oi) this.f28796c;
                int currentItemTop2 = oiVar2.getCurrentItemTop();
                int listTopPadding2 = oiVar2.getListTopPadding();
                ai.w0 w0Var = ((sm) this.f28795b).f28312r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 20:
                lo.a(((jo) this.f28795b).f25494c);
                ((hg.h) this.f28796c).run();
                return;
            case 21:
                ((jp) this.f28795b).f25496b.x((List) this.f28796c);
                return;
            case 22:
                ((kp) this.f28795b).f25780b.x((List) this.f28796c);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.e3) this.f28795b).dismiss();
                nf.f.s((Context) this.f28796c, "https://t.me/BotFather?start=deletebot");
                return;
            case 24:
                or orVar = (or) this.f28795b;
                orVar.getClass();
                ((ci.d) this.f28796c).setLoading(false);
                orVar.dismiss();
                return;
            case 25:
                or orVar2 = (or) this.f28795b;
                TLObject tLObject = (TLObject) this.f28796c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    orVar2.f27174b0 = groupcallstreamrtmpurl.url;
                    orVar2.f27175c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(orVar2.f27175c0);
                    orVar2.f27176d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f23467a |= 256;
                    obj.f23468b = 0;
                    obj.f23469c = spannableStringBuilder.length();
                    orVar2.f27176d0.setSpan(new e11(obj, 0), 0, orVar2.f27176d0.length(), 0);
                    orVar2.f27177e0.N(false);
                    return;
                }
                return;
            case 26:
                ss ssVar = (ss) this.f28795b;
                TLObject tLObject2 = (TLObject) this.f28796c;
                os osVar = ssVar.f28360b;
                ArrayList arrayList3 = ssVar.h;
                int i13 = ssVar.f28359a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    ssVar.f28363g = str2;
                    if (str2 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ssVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    ssVar.f28362f = currentTimeMillis;
                    if (!ssVar.f28364i) {
                        ssVar.f28364i = true;
                        String str3 = ssVar.f28363g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList4 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList3.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList3.get(i14)).f18484id, arrayList4, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(ssVar, messagesStorage, arrayList4, currentTimeMillis, str4, 3));
                    }
                    ssVar.f28361c = false;
                    osVar.run();
                    return;
                }
                ssVar.f28363g = null;
                ssVar.e = true;
                ssVar.f28361c = false;
                osVar.run();
                return;
            case 27:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f28796c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new uc(28, (rt) this.f28795b, decodeFile));
                return;
            case 28:
                ((rt) this.f28795b).setImage((Bitmap) this.f28796c);
                return;
            default:
                ((EditTextBoldCursor) this.f28795b).hintLayout.draw((Canvas) this.f28796c);
                return;
        }
    }
}
