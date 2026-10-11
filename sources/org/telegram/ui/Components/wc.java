package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class wc implements Runnable {
    public final int f32609a;
    public final Object f32610b;
    public final Object f32611c;

    public wc(int i10, Object obj, Object obj2) {
        this.f32609a = i10;
        this.f32610b = obj;
        this.f32611c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f32609a) {
            case 0:
                sc scVar = (sc) this.f32610b;
                CharSequence charSequence = (CharSequence) this.f32611c;
                scVar.f30715n = true;
                wb wbVar = scVar.f30707e;
                if (wbVar instanceof xb) {
                    yb ybVar = (yb) ((xb) wbVar);
                    ybVar.f24488b.setText(charSequence);
                    AndroidUtilities.updateViewShow(ybVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(ybVar.f24488b, true, false, true);
                }
                scVar.i(true);
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.f32610b;
                Runnable runnable = (Runnable) this.f32611c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ((od) this.f32610b).removeView((ci.d4) this.f32611c);
                return;
            case 3:
                int i10 = ChatActivityEnterView.f23842n5;
                ((ChatActivityEnterView) this.f32610b).removeView((ci.d4) this.f32611c);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f32610b;
                int i11 = ChatActivityEnterView.f23842n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f32611c);
                chatActivityEnterView.W = null;
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f32610b;
                int i12 = ChatActivityEnterView.f23842n5;
                ((vd) this.f32611c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 6:
                rg rgVar = (rg) this.f32611c;
                ChatActivityEnterView chatActivityEnterView3 = ((ug) this.f32610b).V;
                chatActivityEnterView3.f23896i1 = chatActivityEnterView3.f23890h1.getAudioRightMs() - chatActivityEnterView3.f23890h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23890h1.getAudioLeftMs(), chatActivityEnterView3.f23890h1.getAudioRightMs(), rgVar);
                return;
            case 7:
                ((yi) this.f32610b).containerView.removeView((ci.d4) this.f32611c);
                return;
            case 8:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f32611c;
                ((yi) this.f32610b).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 9:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f32611c;
                if (!((yi) this.f32610b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 10:
                yi yiVar = (yi) this.f32610b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ri) this.f32611c).f30461c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                yiVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(yiVar.M1).updateAttachMenuBotsInCache();
                return;
            case 11:
                yi yiVar2 = (yi) this.f32610b;
                MediaDataController.getInstance(yiVar2.M1).loadAttachMenuBots(false, true);
                if (yiVar2.B0 == yiVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f32611c).bot_id)) {
                    yiVar2.U1(yiVar2.f33228j0);
                    return;
                }
                return;
            case 12:
                kj kjVar = (kj) this.f32610b;
                kjVar.G = false;
                kjVar.H = (ArrayList) this.f32611c;
                kjVar.S();
                return;
            case 13:
                kj kjVar2 = (kj) this.f32610b;
                ((yi) this.f32611c).b1();
                kjVar2.O();
                kjVar2.f30161b.b2(kjVar2, 0);
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new wc(15, (bk) this.f32610b, ((ak) this.f32611c).run()));
                return;
            case 15:
                ((bk) this.f32610b).setStatus((CharSequence) this.f32611c);
                return;
            case 16:
                rk rkVar = (rk) this.f32610b;
                String str = (String) this.f32611c;
                rkVar.getClass();
                ArrayList arrayList = new ArrayList(rkVar.X.v.f28355c);
                if (rkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, rkVar.X.v.f28356e);
                }
                Utilities.searchQueue.postRunnable(new ai.t4(rkVar, str, !rkVar.R.isEmpty(), arrayList, 18));
                return;
            case 17:
                rk rkVar2 = (rk) this.f32610b;
                ArrayList arrayList2 = (ArrayList) this.f32611c;
                sk skVar = rkVar2.X;
                boolean z10 = skVar.f30763b0;
                hk hkVar = skVar.f30769r;
                if (z10) {
                    s4.i0 adapter = hkVar.getAdapter();
                    rk rkVar3 = skVar.f30773y;
                    if (adapter != rkVar3) {
                        hkVar.setAdapter(rkVar3);
                    }
                }
                rkVar2.f30473s = arrayList2;
                rkVar2.l();
                return;
            case 18:
                yi yiVar3 = ((gl) this.f32610b).f30161b;
                yiVar3.dismiss();
                yiVar3.f33216f0.presentFragment(org.telegram.ui.zn.W9(((TLRPC.User) this.f32611c).f20179id));
                return;
            case 19:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, new ad((gl) this.f32610b, (org.telegram.ui.ActionBar.d6) this.f32611c), R.raw.copy, 36);
                return;
            case 20:
                xl xlVar = (xl) this.f32610b;
                float[] fArr = (float[]) this.f32611c;
                xlVar.getClass();
                xlVar.e0(fArr[0], fArr[1]);
                return;
            case 21:
                qi qiVar = (qi) this.f32611c;
                boolean z11 = ChatAttachAlertPhotoLayout.f24013q1;
                int currentItemTop = qiVar.getCurrentItemTop();
                int listTopPadding = qiVar.getListTopPadding();
                km kmVar = ((ChatAttachAlertPhotoLayout) this.f32610b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                kmVar.scrollBy(0, listTopPadding);
                return;
            case 22:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32611c;
                um umVar = ((ChatAttachAlertPhotoLayout) this.f32610b).P;
                if (umVar != null) {
                    umVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 23:
                qi qiVar2 = (qi) this.f32611c;
                int currentItemTop2 = qiVar2.getCurrentItemTop();
                int listTopPadding2 = qiVar2.getListTopPadding();
                ai.w0 w0Var = ((hn) this.f32610b).f27032r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 24:
                zo.a(((xo) this.f32610b).f32997c);
                ((hg.h) this.f32611c).run();
                return;
            case 25:
                ((xp) this.f32610b).f33001b.z((List) this.f32611c);
                return;
            case 26:
                ((yp) this.f32610b).f33318b.z((List) this.f32611c);
                return;
            case 27:
                ((org.telegram.ui.ActionBar.e3) this.f32610b).dismiss();
                of.f.s((Context) this.f32611c, "https://t.me/BotFather?start=deletebot");
                return;
            case 28:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f32610b;
                TreeSet treeSet = (TreeSet) this.f32611c;
                String charSequence2 = j3Var.getText().toString();
                String str2 = "bot";
                str2 = (tr.a(charSequence2, "bot") || tr.c(charSequence2, treeSet) != null) ? "" : "";
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22289b;
                h3Var.setRightText(str2);
                int dp = AndroidUtilities.dp(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                h3Var.setPadding(0, dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(15.0f));
                return;
            default:
                es esVar = (es) this.f32610b;
                esVar.getClass();
                ((ci.d) this.f32611c).setLoading(false);
                esVar.dismiss();
                return;
        }
    }
}
