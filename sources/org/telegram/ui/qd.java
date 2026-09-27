package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class qd implements Runnable {
    public final int f36715a;
    public final me f36716b;
    public final int f36717c;

    public qd(me meVar, int i10, int i11) {
        this.f36715a = i11;
        this.f36716b = meVar;
        this.f36717c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f36715a;
        int i11 = this.f36717c;
        me meVar = this.f36716b;
        switch (i10) {
            case 0:
                nf.f.s(meVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                qd qdVar = meVar.f35649i1;
                fi.o oVar = meVar.Y0;
                org.telegram.ui.Components.qc.e();
                if (meVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    meVar.W0 = true;
                    meVar.X0 = meVar.N0.amount;
                } else {
                    meVar.W0 = false;
                    meVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                meVar.V0 = true;
                oVar.setText(Long.toString(meVar.X0));
                oVar.setSelection(oVar.getText().length());
                meVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
                return;
            default:
                qd qdVar2 = meVar.f35649i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ce ceVar = meVar.Q0;
                if (meVar.X0 <= 0 && meVar.L0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ceVar.setEnabled(z10);
                if (currentTime < meVar.L0) {
                    ceVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (meVar.f35648h1 == null) {
                        meVar.f35648h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(R.drawable.mini_switch_lock, 0);
                        qqVar.setTopOffset(1);
                        meVar.f35648h1.setSpan(qqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) meVar.f35648h1).append((CharSequence) yh.g.j0(meVar.L0 - currentTime));
                    ceVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = meVar.Z0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.qk.q(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(meVar.L0 - currentTime)}, ((org.telegram.ui.Components.yb) meVar.Z0.e).f30642b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(qdVar2);
                    AndroidUtilities.runOnUIThread(qdVar2, 1000L);
                    return;
                }
                ceVar.f(null, true);
                if (meVar.W0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) meVar.X0);
                }
                ceVar.g(yh.v7.V0(false, formatPluralStringSpaced, meVar.R0), true, true);
                return;
        }
    }
}
