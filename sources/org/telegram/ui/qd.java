package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class qd implements Runnable {
    public final int f42669a;
    public final ke f42670b;
    public final int f42671c;

    public qd(ke keVar, int i10, int i11) {
        this.f42669a = i11;
        this.f42670b = keVar;
        this.f42671c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f42669a;
        int i11 = this.f42671c;
        ke keVar = this.f42670b;
        switch (i10) {
            case 0:
                qf.d.r(keVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                qd qdVar = keVar.f40760f1;
                bi.t tVar = keVar.O0;
                org.telegram.ui.Components.qc.e();
                if (keVar.D0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    keVar.M0 = true;
                    keVar.N0 = keVar.D0.amount;
                } else {
                    keVar.M0 = false;
                    keVar.N0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                keVar.L0 = true;
                tVar.setText(Long.toString(keVar.N0));
                tVar.setSelection(tVar.getText().length());
                keVar.L0 = false;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
                return;
            default:
                qd qdVar2 = keVar.f40760f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ae aeVar = keVar.G0;
                if (keVar.N0 <= 0 && keVar.B0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                aeVar.setEnabled(z10);
                if (currentTime < keVar.B0) {
                    aeVar.i(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (keVar.f40759e1 == null) {
                        keVar.f40759e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.mini_switch_lock, 0);
                        zqVar.setTopOffset(1);
                        keVar.f40759e1.setSpan(zqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) keVar.f40759e1).append((CharSequence) bi.y.s0(keVar.B0 - currentTime));
                    aeVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = keVar.P0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.wh.o(R.string.BotStarsWithdrawalToast, new Object[]{bi.y.s0(keVar.B0 - currentTime)}, ((org.telegram.ui.Components.yb) keVar.P0.e).f35028b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(qdVar2);
                    AndroidUtilities.runOnUIThread(qdVar2, 1000L);
                    return;
                }
                aeVar.g(null, true);
                if (keVar.M0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) keVar.N0);
                }
                aeVar.i(bi.dd.U0(false, formatPluralStringSpaced, keVar.H0), true, true);
                return;
        }
    }
}
