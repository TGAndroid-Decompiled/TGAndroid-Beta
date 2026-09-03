package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class qd implements Runnable {
    public final int f37388a;
    public final me f37389b;
    public final int f37390c;

    public qd(me meVar, int i10, int i11) {
        this.f37388a = i11;
        this.f37389b = meVar;
        this.f37390c = i10;
    }

    @Override
    public final void run() {
        boolean z4;
        String formatPluralStringSpaced;
        int i10 = this.f37388a;
        int i11 = this.f37390c;
        me meVar = this.f37389b;
        switch (i10) {
            case 0:
                ze.d.s(meVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                qd qdVar = meVar.f36042f1;
                lh.n nVar = meVar.V0;
                org.telegram.ui.Components.ic.e();
                if (meVar.K0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    meVar.T0 = true;
                    meVar.U0 = meVar.K0.amount;
                } else {
                    meVar.T0 = false;
                    meVar.U0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                meVar.S0 = true;
                nVar.setText(Long.toString(meVar.U0));
                nVar.setSelection(nVar.getText().length());
                meVar.S0 = false;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
                return;
            default:
                qd qdVar2 = meVar.f36042f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                de deVar = meVar.N0;
                if (meVar.U0 <= 0 && meVar.I0 <= currentTime) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                deVar.setEnabled(z4);
                if (currentTime < meVar.I0) {
                    deVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (meVar.f36041e1 == null) {
                        meVar.f36041e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.mini_switch_lock, 0);
                        lqVar.setTopOffset(1);
                        meVar.f36041e1.setSpan(lqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) meVar.f36041e1).append((CharSequence) lh.q.j0(meVar.I0 - currentTime));
                    deVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.ic icVar = meVar.W0;
                    if (icVar != null) {
                        org.telegram.ui.Components.nb nbVar = icVar.e;
                        if ((nbVar instanceof org.telegram.ui.Components.qb) && nbVar.isAttachedToWindow()) {
                            b.o(R.string.BotStarsWithdrawalToast, new Object[]{lh.q.j0(meVar.I0 - currentTime)}, ((org.telegram.ui.Components.qb) meVar.W0.e).f28137b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(qdVar2);
                    AndroidUtilities.runOnUIThread(qdVar2, 1000L);
                    return;
                }
                deVar.f(null, true);
                if (meVar.T0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) meVar.U0);
                }
                deVar.g(lh.ja.V0(false, formatPluralStringSpaced, meVar.O0), true, true);
                return;
        }
    }
}
