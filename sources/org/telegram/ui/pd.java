package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class pd implements Runnable {
    public final int f40053a;
    public final ke f40054b;
    public final int f40055c;

    public pd(ke keVar, int i10, int i11) {
        this.f40053a = i11;
        this.f40054b = keVar;
        this.f40055c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f40053a;
        int i11 = this.f40055c;
        ke keVar = this.f40054b;
        switch (i10) {
            case 0:
                pf.d.r(keVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                pd pdVar = keVar.f38481i1;
                ai.t tVar = keVar.Y0;
                org.telegram.ui.Components.qc.e();
                if (keVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    keVar.W0 = true;
                    keVar.X0 = keVar.N0.amount;
                } else {
                    keVar.W0 = false;
                    keVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                keVar.V0 = true;
                tVar.setText(Long.toString(keVar.X0));
                tVar.setSelection(tVar.getText().length());
                keVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                pdVar.run();
                return;
            default:
                pd pdVar2 = keVar.f38481i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                be beVar = keVar.Q0;
                if (keVar.X0 <= 0 && keVar.L0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                beVar.setEnabled(z10);
                if (currentTime < keVar.L0) {
                    beVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (keVar.f38480h1 == null) {
                        keVar.f38480h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.mini_switch_lock, 0);
                        yqVar.setTopOffset(1);
                        keVar.f38480h1.setSpan(yqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) keVar.f38480h1).append((CharSequence) ai.x.j0(keVar.L0 - currentTime));
                    beVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = keVar.Z0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.lk.r(R.string.BotStarsWithdrawalToast, new Object[]{ai.x.j0(keVar.L0 - currentTime)}, ((org.telegram.ui.Components.yb) keVar.Z0.e).f32599b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(pdVar2);
                    AndroidUtilities.runOnUIThread(pdVar2, 1000L);
                    return;
                }
                beVar.f(null, true);
                if (keVar.W0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) keVar.X0);
                }
                beVar.g(ai.md.W0(false, formatPluralStringSpaced, keVar.R0), true, true);
                return;
        }
    }
}
