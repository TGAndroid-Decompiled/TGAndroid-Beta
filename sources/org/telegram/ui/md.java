package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class md implements Runnable {
    public final int f39940a;
    public final je f39941b;
    public final int f39942c;

    public md(je jeVar, int i10, int i11) {
        this.f39940a = i11;
        this.f39941b = jeVar;
        this.f39942c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f39940a;
        int i11 = this.f39942c;
        je jeVar = this.f39941b;
        switch (i10) {
            case 0:
                of.f.s(jeVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                md mdVar = jeVar.f39037i1;
                fi.o oVar = jeVar.Y0;
                org.telegram.ui.Components.sc.e();
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
                md mdVar2 = jeVar.f39037i1;
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
                    if (jeVar.f39036h1 == null) {
                        jeVar.f39036h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.mini_switch_lock, 0);
                        erVar.setTopOffset(1);
                        jeVar.f39036h1.setSpan(erVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) jeVar.f39036h1).append((CharSequence) yh.g.j0(jeVar.L0 - currentTime));
                    aeVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.sc scVar = jeVar.Z0;
                    if (scVar != null) {
                        org.telegram.ui.Components.wb wbVar = scVar.f30829e;
                        if ((wbVar instanceof org.telegram.ui.Components.ac) && wbVar.isAttachedToWindow()) {
                            org.telegram.messenger.ai.r(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(jeVar.L0 - currentTime)}, ((org.telegram.ui.Components.ac) jeVar.Z0.f30829e).f24555b);
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
                aeVar.g(yh.p7.W0(false, formatPluralStringSpaced, jeVar.R0), true, true);
                return;
        }
    }
}
