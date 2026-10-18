package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;
public final class ee implements Runnable {
    public final int f25916a;
    public final Object f25917b;
    public final Object f25918c;

    public ee(int i10, Object obj, Object obj2) {
        this.f25916a = i10;
        this.f25917b = obj;
        this.f25918c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        boolean z10;
        String str;
        Bitmap createBitmap;
        String str2 = "";
        switch (this.f25916a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25917b;
                int i10 = ChatActivityEnterView.f23911n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f25918c);
                chatActivityEnterView.W = null;
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f25917b;
                int i11 = ChatActivityEnterView.f23911n5;
                ((rd) this.f25918c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 2:
                pg pgVar = (pg) this.f25918c;
                ChatActivityEnterView chatActivityEnterView3 = ((sg) this.f25917b).V;
                chatActivityEnterView3.f23964i1 = chatActivityEnterView3.f23958h1.getAudioRightMs() - chatActivityEnterView3.f23958h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23958h1.getAudioLeftMs(), chatActivityEnterView3.f23958h1.getAudioRightMs(), pgVar);
                return;
            case 3:
                ti.o((ti) this.f25917b, (ei.x3) this.f25918c);
                return;
            case 4:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f25918c;
                ((ti) this.f25917b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f25918c;
                if (!((ti) this.f25917b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 6:
                ti tiVar = (ti) this.f25917b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((mi) this.f25918c).f28525c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                tiVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(tiVar.M1).updateAttachMenuBotsInCache();
                return;
            case 7:
                ti tiVar2 = (ti) this.f25917b;
                MediaDataController.getInstance(tiVar2.M1).loadAttachMenuBots(false, true);
                if (tiVar2.B0 == tiVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f25918c).bot_id)) {
                    tiVar2.U1(tiVar2.f30593j0);
                    return;
                }
                return;
            case 8:
                fj fjVar = (fj) this.f25917b;
                fjVar.G = false;
                fjVar.H = (ArrayList) this.f25918c;
                fjVar.S();
                return;
            case 9:
                fj fjVar2 = (fj) this.f25917b;
                ((ti) this.f25918c).b1();
                fjVar2.O();
                fjVar2.f28245b.b2(fjVar2, 0);
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ee(11, (wj) this.f25917b, ((vj) this.f25918c).run()));
                return;
            case 11:
                ((wj) this.f25917b).setStatus((CharSequence) this.f25918c);
                return;
            case 12:
                mk mkVar = (mk) this.f25917b;
                String str3 = (String) this.f25918c;
                mkVar.getClass();
                ArrayList arrayList = new ArrayList(mkVar.X.v.f26585c);
                if (mkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, mkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.x9(mkVar, str3, !mkVar.R.isEmpty(), arrayList, 17));
                return;
            case 13:
                mk mkVar2 = (mk) this.f25917b;
                ArrayList arrayList2 = (ArrayList) this.f25918c;
                nk nkVar = mkVar2.X;
                boolean z11 = nkVar.f28775b0;
                ck ckVar = nkVar.f28781r;
                if (z11) {
                    s4.g0 adapter = ckVar.getAdapter();
                    mk mkVar3 = nkVar.f28785y;
                    if (adapter != mkVar3) {
                        ckVar.setAdapter(mkVar3);
                    }
                }
                mkVar2.f28540s = arrayList2;
                mkVar2.l();
                return;
            case 14:
                ti tiVar3 = ((al) this.f25917b).f28245b;
                tiVar3.dismiss();
                tiVar3.f30581f0.presentFragment(org.telegram.ui.sn.W9(((TLRPC.User) this.f25918c).f20426id));
                return;
            case 15:
                org.telegram.messenger.g0.q(R.string.WalletAddressCopiedBulletin, new xc((al) this.f25917b, (org.telegram.ui.ActionBar.d6) this.f25918c), R.raw.copy, 36);
                return;
            case 16:
                rl rlVar = (rl) this.f25917b;
                float[] fArr = (float[]) this.f25918c;
                rlVar.getClass();
                rlVar.e0(fArr[0], fArr[1]);
                return;
            case 17:
                li liVar = (li) this.f25918c;
                boolean z12 = ChatAttachAlertPhotoLayout.f24080q1;
                int currentItemTop = liVar.getCurrentItemTop();
                int listTopPadding = liVar.getListTopPadding();
                em emVar = ((ChatAttachAlertPhotoLayout) this.f25917b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                emVar.scrollBy(0, listTopPadding);
                return;
            case 18:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25918c;
                om omVar = ((ChatAttachAlertPhotoLayout) this.f25917b).P;
                if (omVar != null) {
                    omVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 19:
                li liVar2 = (li) this.f25918c;
                int currentItemTop2 = liVar2.getCurrentItemTop();
                int listTopPadding2 = liVar2.getListTopPadding();
                ai.u1 u1Var = ((bn) this.f25917b).f25016r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                u1Var.scrollBy(0, listTopPadding2);
                return;
            case 20:
                to.a(((ro) this.f25917b).f30008c);
                ((ig.g) this.f25918c).run();
                return;
            case 21:
                ((rp) this.f25917b).f30010b.z((List) this.f25918c);
                return;
            case 22:
                ((sp) this.f25917b).f30310b.z((List) this.f25918c);
                return;
            case 23:
                ((org.telegram.ui.ActionBar.f3) this.f25917b).dismiss();
                pf.d.r((Context) this.f25918c, "https://t.me/BotFather?start=deletebot");
                return;
            case 24:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.f25917b;
                TreeSet treeSet = (TreeSet) this.f25918c;
                String charSequence = i3Var.getText().toString();
                if (!nr.a(charSequence, "bot") && nr.c(charSequence, treeSet) == null) {
                    str2 = "bot";
                }
                org.telegram.ui.Cells.g3 g3Var = i3Var.f22405b;
                g3Var.setRightText(str2);
                int dp = AndroidUtilities.dp(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                g3Var.setPadding(0, dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(15.0f));
                return;
            case 25:
                xr xrVar = (xr) this.f25917b;
                xrVar.getClass();
                ((ei.d) this.f25918c).setLoading(false);
                xrVar.dismiss();
                return;
            case 26:
                xr xrVar2 = (xr) this.f25917b;
                TLObject tLObject = (TLObject) this.f25918c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    xrVar2.f32441b0 = groupcallstreamrtmpurl.url;
                    xrVar2.f32442c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xrVar2.f32442c0);
                    xrVar2.f32443d0 = spannableStringBuilder;
                    ?? obj = new Object();
                    obj.f28056a |= 256;
                    obj.f28057b = 0;
                    obj.f28058c = spannableStringBuilder.length();
                    xrVar2.f32443d0.setSpan(new m11(obj, 0), 0, xrVar2.f32443d0.length(), 0);
                    xrVar2.f32444e0.N(false);
                    return;
                }
                return;
            case 27:
                zs zsVar = (zs) this.f25917b;
                TLObject tLObject2 = (TLObject) this.f25918c;
                ws wsVar = zsVar.f33025b;
                ArrayList arrayList3 = zsVar.h;
                int i12 = zsVar.f33024a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList3.addAll(popularappbots.users);
                    String str4 = popularappbots.next_offset;
                    zsVar.f33028g = str4;
                    if (str4 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zsVar.e = z10;
                    long currentTimeMillis = System.currentTimeMillis();
                    zsVar.f33027f = currentTimeMillis;
                    if (!zsVar.f33029i) {
                        zsVar.f33029i = true;
                        String str5 = zsVar.f33028g;
                        if (str5 == null) {
                            str = "";
                        } else {
                            str = str5;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList3.size(); i13 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.User) arrayList3.get(i13)).f20426id, arrayList4, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new ai.z(zsVar, messagesStorage, arrayList4, currentTimeMillis, str, 10));
                    }
                    zsVar.f33026c = false;
                    wsVar.run();
                    return;
                }
                zsVar.f33028g = null;
                zsVar.e = true;
                zsVar.f33026c = false;
                wsVar.run();
                return;
            case 28:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.f25918c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                float max = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new ee(29, (xt) this.f25917b, decodeFile));
                return;
            default:
                ((xt) this.f25917b).setImage((Bitmap) this.f25918c);
                return;
        }
    }
}
