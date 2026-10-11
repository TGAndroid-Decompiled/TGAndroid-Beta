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
    public final int f32664a;
    public final Object f32665b;
    public final Object f32666c;

    public wc(int i10, Object obj, Object obj2) {
        this.f32664a = i10;
        this.f32665b = obj;
        this.f32666c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f32664a) {
            case 0:
                sc scVar = (sc) this.f32665b;
                CharSequence charSequence = (CharSequence) this.f32666c;
                scVar.f30837n = true;
                wb wbVar = scVar.f30829e;
                if (wbVar instanceof xb) {
                    yb ybVar = (yb) ((xb) wbVar);
                    ybVar.f24555b.setText(charSequence);
                    AndroidUtilities.updateViewShow(ybVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(ybVar.f24555b, true, false, true);
                }
                scVar.i(true);
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.f32665b;
                Runnable runnable = (Runnable) this.f32666c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ((od) this.f32665b).removeView((ci.d4) this.f32666c);
                return;
            case 3:
                int i10 = ChatActivityEnterView.f23878n5;
                ((ChatActivityEnterView) this.f32665b).removeView((ci.d4) this.f32666c);
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f32665b;
                int i11 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f32666c);
                chatActivityEnterView.W = null;
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f32665b;
                int i12 = ChatActivityEnterView.f23878n5;
                ((vd) this.f32666c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 6:
                rg rgVar = (rg) this.f32666c;
                ChatActivityEnterView chatActivityEnterView3 = ((ug) this.f32665b).V;
                chatActivityEnterView3.f23932i1 = chatActivityEnterView3.f23926h1.getAudioRightMs() - chatActivityEnterView3.f23926h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23926h1.getAudioLeftMs(), chatActivityEnterView3.f23926h1.getAudioRightMs(), rgVar);
                return;
            case 7:
                ((yi) this.f32665b).containerView.removeView((ci.d4) this.f32666c);
                return;
            case 8:
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f32666c;
                ((yi) this.f32665b).dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 9:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f32666c;
                if (!((yi) this.f32665b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 10:
                yi yiVar = (yi) this.f32665b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ri) this.f32666c).f30530c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                yiVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(yiVar.M1).updateAttachMenuBotsInCache();
                return;
            case 11:
                yi yiVar2 = (yi) this.f32665b;
                MediaDataController.getInstance(yiVar2.M1).loadAttachMenuBots(false, true);
                if (yiVar2.B0 == yiVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f32666c).bot_id)) {
                    yiVar2.U1(yiVar2.f33301j0);
                    return;
                }
                return;
            case 12:
                kj kjVar = (kj) this.f32665b;
                kjVar.G = false;
                kjVar.H = (ArrayList) this.f32666c;
                kjVar.S();
                return;
            case 13:
                kj kjVar2 = (kj) this.f32665b;
                ((yi) this.f32666c).b1();
                kjVar2.O();
                kjVar2.f30245b.b2(kjVar2, 0);
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new wc(15, (bk) this.f32665b, ((ak) this.f32666c).run()));
                return;
            case 15:
                ((bk) this.f32665b).setStatus((CharSequence) this.f32666c);
                return;
            case 16:
                rk rkVar = (rk) this.f32665b;
                String str = (String) this.f32666c;
                rkVar.getClass();
                ArrayList arrayList = new ArrayList(rkVar.X.v.f28441c);
                if (rkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, rkVar.X.v.f28442e);
                }
                Utilities.searchQueue.postRunnable(new ai.t4(rkVar, str, !rkVar.R.isEmpty(), arrayList, 18));
                return;
            case 17:
                rk rkVar2 = (rk) this.f32665b;
                ArrayList arrayList2 = (ArrayList) this.f32666c;
                sk skVar = rkVar2.X;
                boolean z10 = skVar.f30884b0;
                hk hkVar = skVar.f30890r;
                if (z10) {
                    s4.i0 adapter = hkVar.getAdapter();
                    rk rkVar3 = skVar.f30894y;
                    if (adapter != rkVar3) {
                        hkVar.setAdapter(rkVar3);
                    }
                }
                rkVar2.f30535s = arrayList2;
                rkVar2.l();
                return;
            case 18:
                yi yiVar3 = ((gl) this.f32665b).f30245b;
                yiVar3.dismiss();
                yiVar3.f33289f0.presentFragment(org.telegram.ui.zn.W9(((TLRPC.User) this.f32666c).f20215id));
                return;
            case 19:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, new ad((gl) this.f32665b, (org.telegram.ui.ActionBar.d6) this.f32666c), R.raw.copy, 36);
                return;
            case 20:
                xl xlVar = (xl) this.f32665b;
                float[] fArr = (float[]) this.f32666c;
                xlVar.getClass();
                xlVar.e0(fArr[0], fArr[1]);
                return;
            case 21:
                qi qiVar = (qi) this.f32666c;
                boolean z11 = ChatAttachAlertPhotoLayout.f24049q1;
                int currentItemTop = qiVar.getCurrentItemTop();
                int listTopPadding = qiVar.getListTopPadding();
                km kmVar = ((ChatAttachAlertPhotoLayout) this.f32665b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                kmVar.scrollBy(0, listTopPadding);
                return;
            case 22:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f32666c;
                um umVar = ((ChatAttachAlertPhotoLayout) this.f32665b).P;
                if (umVar != null) {
                    umVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 23:
                qi qiVar2 = (qi) this.f32666c;
                int currentItemTop2 = qiVar2.getCurrentItemTop();
                int listTopPadding2 = qiVar2.getListTopPadding();
                ai.w0 w0Var = ((hn) this.f32665b).f27170r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 24:
                zo.a(((xo) this.f32665b).f33045c);
                ((hg.h) this.f32666c).run();
                return;
            case 25:
                ((xp) this.f32665b).f33047b.z((List) this.f32666c);
                return;
            case 26:
                ((yp) this.f32665b).f33440b.z((List) this.f32666c);
                return;
            case 27:
                ((org.telegram.ui.ActionBar.e3) this.f32665b).dismiss();
                of.f.s((Context) this.f32666c, "https://t.me/BotFather?start=deletebot");
                return;
            case 28:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f32665b;
                TreeSet treeSet = (TreeSet) this.f32666c;
                String charSequence2 = j3Var.getText().toString();
                String str2 = "bot";
                str2 = (tr.a(charSequence2, "bot") || tr.c(charSequence2, treeSet) != null) ? "" : "";
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22325b;
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
                es esVar = (es) this.f32665b;
                esVar.getClass();
                ((ci.d) this.f32666c).setLoading(false);
                esVar.dismiss();
                return;
        }
    }
}
