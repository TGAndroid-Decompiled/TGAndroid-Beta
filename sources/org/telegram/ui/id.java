package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class id implements Runnable {
    public final int f39207a;
    public final de f39208b;
    public final int f39209c;

    public id(de deVar, int i10, int i11) {
        this.f39207a = i11;
        this.f39208b = deVar;
        this.f39209c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f39207a;
        int i11 = this.f39209c;
        de deVar = this.f39208b;
        switch (i10) {
            case 0:
                ye.d.s(deVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                id idVar = deVar.f37508e1;
                jh.m mVar = deVar.U0;
                org.telegram.ui.Components.mc.e();
                if (deVar.J0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    deVar.S0 = true;
                    deVar.T0 = deVar.J0.amount;
                } else {
                    deVar.S0 = false;
                    deVar.T0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                deVar.R0 = true;
                mVar.setText(Long.toString(deVar.T0));
                mVar.setSelection(mVar.getText().length());
                deVar.R0 = false;
                AndroidUtilities.cancelRunOnUIThread(idVar);
                idVar.run();
                return;
            default:
                id idVar2 = deVar.f37508e1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ud udVar = deVar.M0;
                if (deVar.T0 <= 0 && deVar.H0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                udVar.setEnabled(z10);
                if (currentTime < deVar.H0) {
                    udVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (deVar.f37507d1 == null) {
                        deVar.f37507d1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.mini_switch_lock, 0);
                        iqVar.setTopOffset(1);
                        deVar.f37507d1.setSpan(iqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) deVar.f37507d1).append((CharSequence) jh.q.j0(deVar.H0 - currentTime));
                    udVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.mc mcVar = deVar.V0;
                    if (mcVar != null) {
                        org.telegram.ui.Components.rb rbVar = mcVar.f30648e;
                        if ((rbVar instanceof org.telegram.ui.Components.ub) && rbVar.isAttachedToWindow()) {
                            b.p(R.string.BotStarsWithdrawalToast, new Object[]{jh.q.j0(deVar.H0 - currentTime)}, ((org.telegram.ui.Components.ub) deVar.V0.f30648e).f33185b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(idVar2);
                    AndroidUtilities.runOnUIThread(idVar2, 1000L);
                    return;
                }
                udVar.f(null, true);
                if (deVar.S0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) deVar.T0);
                }
                udVar.g(jh.ia.V0(false, formatPluralStringSpaced, deVar.N0), true, true);
                return;
        }
    }
}
