package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class od implements Runnable {
    public final int f39657a;
    public final ke f39658b;
    public final int f39659c;

    public od(ke keVar, int i10, int i11) {
        this.f39657a = i11;
        this.f39658b = keVar;
        this.f39659c = i10;
    }

    @Override
    public final void run() {
        boolean z4;
        String formatPluralStringSpaced;
        int i10 = this.f39657a;
        int i11 = this.f39659c;
        ke keVar = this.f39658b;
        switch (i10) {
            case 0:
                af.g.s(keVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                od odVar = keVar.f38266f1;
                mh.m mVar = keVar.V0;
                org.telegram.ui.Components.ic.e();
                if (keVar.K0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    keVar.T0 = true;
                    keVar.U0 = keVar.K0.amount;
                } else {
                    keVar.T0 = false;
                    keVar.U0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                keVar.S0 = true;
                mVar.setText(Long.toString(keVar.U0));
                mVar.setSelection(mVar.getText().length());
                keVar.S0 = false;
                AndroidUtilities.cancelRunOnUIThread(odVar);
                odVar.run();
                return;
            default:
                od odVar2 = keVar.f38266f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                be beVar = keVar.N0;
                if (keVar.U0 <= 0 && keVar.I0 <= currentTime) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                beVar.setEnabled(z4);
                if (currentTime < keVar.I0) {
                    beVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (keVar.f38265e1 == null) {
                        keVar.f38265e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                        oqVar.setTopOffset(1);
                        keVar.f38265e1.setSpan(oqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) keVar.f38265e1).append((CharSequence) mh.p.j0(keVar.I0 - currentTime));
                    beVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.ic icVar = keVar.W0;
                    if (icVar != null) {
                        org.telegram.ui.Components.nb nbVar = icVar.f27774e;
                        if ((nbVar instanceof org.telegram.ui.Components.qb) && nbVar.isAttachedToWindow()) {
                            b.o(R.string.BotStarsWithdrawalToast, new Object[]{mh.p.j0(keVar.I0 - currentTime)}, ((org.telegram.ui.Components.qb) keVar.W0.f27774e).f30375b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(odVar2);
                    AndroidUtilities.runOnUIThread(odVar2, 1000L);
                    return;
                }
                beVar.f(null, true);
                if (keVar.T0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) keVar.U0);
                }
                beVar.g(mh.ja.V0(false, formatPluralStringSpaced, keVar.O0), true, true);
                return;
        }
    }
}
