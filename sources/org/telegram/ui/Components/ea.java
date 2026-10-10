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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class ea implements Runnable {
    public final int f25978a;
    public final Object f25979b;
    public final Object f25980c;

    public ea(int i10, Object obj, Object obj2) {
        this.f25978a = i10;
        this.f25979b = obj;
        this.f25980c = obj2;
    }

    @Override
    public final void run() {
        float f7;
        switch (this.f25978a) {
            case 0:
                ga gaVar = (ga) this.f25979b;
                TLObject tLObject = (TLObject) this.f25980c;
                gaVar.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    gaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    return;
                }
                return;
            case 1:
                tc tcVar = (tc) this.f25979b;
                CharSequence charSequence = (CharSequence) this.f25980c;
                tcVar.f31100n = true;
                xb xbVar = tcVar.f31092e;
                if (xbVar instanceof yb) {
                    zb zbVar = (zb) ((yb) xbVar);
                    zbVar.f24917b.setText(charSequence);
                    AndroidUtilities.updateViewShow(zbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(zbVar.f24917b, true, false, true);
                }
                tcVar.i(true);
                return;
            case 2:
                boolean[] zArr = (boolean[]) this.f25979b;
                Runnable runnable = (Runnable) this.f25980c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ((od) this.f25979b).removeView((ci.d4) this.f25980c);
                return;
            case 4:
                int i10 = ChatActivityEnterView.f23854n5;
                ((ChatActivityEnterView) this.f25979b).removeView((ci.d4) this.f25980c);
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f25979b;
                int i11 = ChatActivityEnterView.f23854n5;
                chatActivityEnterView.setFieldText((CharSequence) this.f25980c);
                chatActivityEnterView.W = null;
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.f25979b;
                int i12 = ChatActivityEnterView.f23854n5;
                ((vd) this.f25980c).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                return;
            case 7:
                rg rgVar = (rg) this.f25980c;
                ChatActivityEnterView chatActivityEnterView3 = ((ug) this.f25979b).V;
                chatActivityEnterView3.f23908i1 = chatActivityEnterView3.f23902h1.getAudioRightMs() - chatActivityEnterView3.f23902h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.f23902h1.getAudioLeftMs(), chatActivityEnterView3.f23902h1.getAudioRightMs(), rgVar);
                return;
            case 8:
                ((yi) this.f25979b).containerView.removeView((ci.d4) this.f25980c);
                return;
            case 9:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f25980c;
                ((yi) this.f25979b).dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 10:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f25980c;
                if (!((yi) this.f25979b).isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            case 11:
                yi yiVar = (yi) this.f25979b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ri) this.f25980c).f30471c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                yiVar.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(yiVar.M1).updateAttachMenuBotsInCache();
                return;
            case 12:
                yi yiVar2 = (yi) this.f25979b;
                MediaDataController.getInstance(yiVar2.M1).loadAttachMenuBots(false, true);
                if (yiVar2.B0 == yiVar2.A0.get(((TLRPC.TL_attachMenuBot) this.f25980c).bot_id)) {
                    yiVar2.U1(yiVar2.f33247j0);
                    return;
                }
                return;
            case 13:
                kj kjVar = (kj) this.f25979b;
                kjVar.G = false;
                kjVar.H = (ArrayList) this.f25980c;
                kjVar.S();
                return;
            case 14:
                kj kjVar2 = (kj) this.f25979b;
                ((yi) this.f25980c).b1();
                kjVar2.O();
                kjVar2.f30211b.b2(kjVar2, 0);
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ea(16, (bk) this.f25979b, ((ak) this.f25980c).run()));
                return;
            case 16:
                ((bk) this.f25979b).setStatus((CharSequence) this.f25980c);
                return;
            case 17:
                rk rkVar = (rk) this.f25979b;
                String str = (String) this.f25980c;
                rkVar.getClass();
                ArrayList arrayList = new ArrayList(rkVar.X.v.f28365c);
                if (rkVar.X.v.d.isEmpty()) {
                    arrayList.addAll(0, rkVar.X.v.f28366e);
                }
                Utilities.searchQueue.postRunnable(new ai.t4(rkVar, str, !rkVar.R.isEmpty(), arrayList, 18));
                return;
            case 18:
                rk rkVar2 = (rk) this.f25979b;
                ArrayList arrayList2 = (ArrayList) this.f25980c;
                sk skVar = rkVar2.X;
                boolean z10 = skVar.f30804b0;
                hk hkVar = skVar.f30810r;
                if (z10) {
                    s4.i0 adapter = hkVar.getAdapter();
                    rk rkVar3 = skVar.f30814y;
                    if (adapter != rkVar3) {
                        hkVar.setAdapter(rkVar3);
                    }
                }
                rkVar2.f30476s = arrayList2;
                rkVar2.l();
                return;
            case 19:
                yi yiVar3 = ((gl) this.f25979b).f30211b;
                yiVar3.dismiss();
                yiVar3.f33235f0.presentFragment(org.telegram.ui.zn.W9(((TLRPC.User) this.f25980c).f20189id));
                return;
            case 20:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, new ad((gl) this.f25979b, (org.telegram.ui.ActionBar.e6) this.f25980c), R.raw.copy, 36);
                return;
            case 21:
                xl xlVar = (xl) this.f25979b;
                float[] fArr = (float[]) this.f25980c;
                xlVar.getClass();
                xlVar.e0(fArr[0], fArr[1]);
                return;
            case 22:
                qi qiVar = (qi) this.f25980c;
                boolean z11 = ChatAttachAlertPhotoLayout.f24025q1;
                int currentItemTop = qiVar.getCurrentItemTop();
                int listTopPadding = qiVar.getListTopPadding();
                km kmVar = ((ChatAttachAlertPhotoLayout) this.f25979b).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                kmVar.scrollBy(0, listTopPadding);
                return;
            case 23:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25980c;
                um umVar = ((ChatAttachAlertPhotoLayout) this.f25979b).P;
                if (umVar != null) {
                    umVar.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 24:
                qi qiVar2 = (qi) this.f25980c;
                int currentItemTop2 = qiVar2.getCurrentItemTop();
                int listTopPadding2 = qiVar2.getListTopPadding();
                ai.w0 w0Var = ((hn) this.f25979b).f27080r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                return;
            case 25:
                zo.a(((xo) this.f25979b).f33007c);
                ((hg.h) this.f25980c).run();
                return;
            case 26:
                ((xp) this.f25979b).f33009b.z((List) this.f25980c);
                return;
            case 27:
                ((yp) this.f25979b).f33386b.z((List) this.f25980c);
                return;
            case 28:
                ((org.telegram.ui.ActionBar.f3) this.f25979b).dismiss();
                of.f.s((Context) this.f25980c, "https://t.me/BotFather?start=deletebot");
                return;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.f25979b;
                TreeSet treeSet = (TreeSet) this.f25980c;
                String charSequence2 = j3Var.getText().toString();
                String str2 = "bot";
                str2 = (tr.a(charSequence2, "bot") || tr.c(charSequence2, treeSet) != null) ? "" : "";
                org.telegram.ui.Cells.h3 h3Var = j3Var.f22301b;
                h3Var.setRightText(str2);
                int dp = AndroidUtilities.dp(15.0f);
                if (TextUtils.isEmpty(str2)) {
                    f7 = 21.0f;
                } else {
                    f7 = 63.0f;
                }
                h3Var.setPadding(0, dp, AndroidUtilities.dp(f7), AndroidUtilities.dp(15.0f));
                return;
        }
    }
}
