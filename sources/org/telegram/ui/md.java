package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class md implements Runnable {
    public final int f35265a;
    public final je f35266b;
    public final int f35267c;

    public md(je jeVar, int i10, int i11) {
        this.f35265a = i11;
        this.f35266b = jeVar;
        this.f35267c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f35265a;
        int i11 = this.f35267c;
        je jeVar = this.f35266b;
        switch (i10) {
            case 0:
                nf.f.s(jeVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                md mdVar = jeVar.f34424i1;
                fi.o oVar = jeVar.Y0;
                org.telegram.ui.Components.qc.e();
                if (jeVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    jeVar.W0 = true;
                    jeVar.X0 = jeVar.N0.amount;
                } else {
                    jeVar.W0 = false;
                    jeVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                jeVar.V0 = true;
                oVar.setText(Long.toString(jeVar.X0));
                oVar.setSelection(oVar.getText().length());
                jeVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(mdVar);
                mdVar.run();
                return;
            default:
                md mdVar2 = jeVar.f34424i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ae aeVar = jeVar.Q0;
                if (jeVar.X0 <= 0 && jeVar.L0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                aeVar.setEnabled(z10);
                if (currentTime < jeVar.L0) {
                    aeVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (jeVar.f34423h1 == null) {
                        jeVar.f34423h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(R.drawable.mini_switch_lock, 0);
                        pqVar.setTopOffset(1);
                        jeVar.f34423h1.setSpan(pqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) jeVar.f34423h1).append((CharSequence) yh.g.j0(jeVar.L0 - currentTime));
                    aeVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = jeVar.Z0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.ul.q(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(jeVar.L0 - currentTime)}, ((org.telegram.ui.Components.yb) jeVar.Z0.e).f30192b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(mdVar2);
                    AndroidUtilities.runOnUIThread(mdVar2, 1000L);
                    return;
                }
                aeVar.f(null, true);
                if (jeVar.W0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) jeVar.X0);
                }
                aeVar.g(yh.w7.V0(false, formatPluralStringSpaced, jeVar.R0), true, true);
                return;
        }
    }
}
