package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class jd implements Runnable {
    public final int f39442a;
    public final fe f39443b;
    public final int f39444c;

    public jd(fe feVar, int i9, int i10) {
        this.f39442a = i10;
        this.f39443b = feVar;
        this.f39444c = i9;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i9 = this.f39442a;
        int i10 = this.f39444c;
        fe feVar = this.f39443b;
        switch (i9) {
            case 0:
                ve.e.s(feVar.getContext(), LocaleController.getString(i10));
                return;
            case 1:
                jd jdVar = feVar.f38222e1;
                gh.o oVar = feVar.U0;
                org.telegram.ui.Components.gc.e();
                if (feVar.J0.amount < MessagesController.getInstance(i10).starsRevenueWithdrawalMin) {
                    feVar.S0 = true;
                    feVar.T0 = feVar.J0.amount;
                } else {
                    feVar.S0 = false;
                    feVar.T0 = MessagesController.getInstance(i10).starsRevenueWithdrawalMin;
                }
                feVar.R0 = true;
                oVar.setText(Long.toString(feVar.T0));
                oVar.setSelection(oVar.getText().length());
                feVar.R0 = false;
                AndroidUtilities.cancelRunOnUIThread(jdVar);
                jdVar.run();
                return;
            default:
                jd jdVar2 = feVar.f38222e1;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                wd wdVar = feVar.M0;
                if (feVar.T0 <= 0 && feVar.H0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                wdVar.setEnabled(z10);
                if (currentTime < feVar.H0) {
                    wdVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (feVar.f38221d1 == null) {
                        feVar.f38221d1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_switch_lock, 0);
                        eqVar.setTopOffset(1);
                        feVar.f38221d1.setSpan(eqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) feVar.f38221d1).append((CharSequence) gh.r.i0(feVar.H0 - currentTime));
                    wdVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.gc gcVar = feVar.V0;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.f28733e;
                        if ((lbVar instanceof org.telegram.ui.Components.ob) && lbVar.isAttachedToWindow()) {
                            org.telegram.messenger.ll.q(R.string.BotStarsWithdrawalToast, new Object[]{gh.r.i0(feVar.H0 - currentTime)}, ((org.telegram.ui.Components.ob) feVar.V0.f28733e).f31343b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(jdVar2);
                    AndroidUtilities.runOnUIThread(jdVar2, 1000L);
                    return;
                }
                wdVar.f(null, true);
                if (feVar.S0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) feVar.T0);
                }
                wdVar.g(gh.oa.V0(false, formatPluralStringSpaced, feVar.N0), true, true);
                return;
        }
    }
}
