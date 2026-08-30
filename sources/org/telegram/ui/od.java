package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class od implements Runnable {
    public final int f36875a;
    public final ke f36876b;
    public final int f36877c;

    public od(ke keVar, int i10, int i11) {
        this.f36875a = i11;
        this.f36876b = keVar;
        this.f36877c = i10;
    }

    @Override
    public final void run() {
        boolean z4;
        String formatPluralStringSpaced;
        int i10 = this.f36875a;
        int i11 = this.f36877c;
        ke keVar = this.f36876b;
        switch (i10) {
            case 0:
                af.g.s(keVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                od odVar = keVar.f35635f1;
                lh.n nVar = keVar.V0;
                org.telegram.ui.Components.ic.e();
                if (keVar.K0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    keVar.T0 = true;
                    keVar.U0 = keVar.K0.amount;
                } else {
                    keVar.T0 = false;
                    keVar.U0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                keVar.S0 = true;
                nVar.setText(Long.toString(keVar.U0));
                nVar.setSelection(nVar.getText().length());
                keVar.S0 = false;
                AndroidUtilities.cancelRunOnUIThread(odVar);
                odVar.run();
                return;
            default:
                od odVar2 = keVar.f35635f1;
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
                    if (keVar.f35634e1 == null) {
                        keVar.f35634e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.mini_switch_lock, 0);
                        mqVar.setTopOffset(1);
                        keVar.f35634e1.setSpan(mqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) keVar.f35634e1).append((CharSequence) lh.q.j0(keVar.I0 - currentTime));
                    beVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.ic icVar = keVar.W0;
                    if (icVar != null) {
                        org.telegram.ui.Components.nb nbVar = icVar.e;
                        if ((nbVar instanceof org.telegram.ui.Components.qb) && nbVar.isAttachedToWindow()) {
                            b.o(R.string.BotStarsWithdrawalToast, new Object[]{lh.q.j0(keVar.I0 - currentTime)}, ((org.telegram.ui.Components.qb) keVar.W0.e).f28100b);
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
                beVar.g(lh.ja.V0(false, formatPluralStringSpaced, keVar.O0), true, true);
                return;
        }
    }
}
