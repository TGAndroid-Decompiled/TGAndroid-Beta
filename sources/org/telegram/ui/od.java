package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class od implements Runnable {
    public final int f35464a;
    public final le f35465b;
    public final int f35466c;

    public od(le leVar, int i10, int i11) {
        this.f35464a = i11;
        this.f35465b = leVar;
        this.f35466c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f35464a;
        int i11 = this.f35466c;
        le leVar = this.f35465b;
        switch (i10) {
            case 0:
                nf.f.s(leVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                od odVar = leVar.f34670i1;
                ei.o oVar = leVar.Y0;
                org.telegram.ui.Components.pc.e();
                if (leVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    leVar.W0 = true;
                    leVar.X0 = leVar.N0.amount;
                } else {
                    leVar.W0 = false;
                    leVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                leVar.V0 = true;
                oVar.setText(Long.toString(leVar.X0));
                oVar.setSelection(oVar.getText().length());
                leVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(odVar);
                odVar.run();
                return;
            default:
                od odVar2 = leVar.f34670i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ce ceVar = leVar.Q0;
                if (leVar.X0 <= 0 && leVar.L0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ceVar.setEnabled(z10);
                if (currentTime < leVar.L0) {
                    ceVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (leVar.f34669h1 == null) {
                        leVar.f34669h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.mini_switch_lock, 0);
                        uqVar.setTopOffset(1);
                        leVar.f34669h1.setSpan(uqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) leVar.f34669h1).append((CharSequence) xh.h.j0(leVar.L0 - currentTime));
                    ceVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.pc pcVar = leVar.Z0;
                    if (pcVar != null) {
                        org.telegram.ui.Components.tb tbVar = pcVar.e;
                        if ((tbVar instanceof org.telegram.ui.Components.xb) && tbVar.isAttachedToWindow()) {
                            org.telegram.messenger.em.p(R.string.BotStarsWithdrawalToast, new Object[]{xh.h.j0(leVar.L0 - currentTime)}, ((org.telegram.ui.Components.xb) leVar.Z0.e).f29000b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(odVar2);
                    AndroidUtilities.runOnUIThread(odVar2, 1000L);
                    return;
                }
                ceVar.f(null, true);
                if (leVar.W0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) leVar.X0);
                }
                ceVar.g(xh.z7.V0(false, formatPluralStringSpaced, leVar.R0), true, true);
                return;
        }
    }
}
