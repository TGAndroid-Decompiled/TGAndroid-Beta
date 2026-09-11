package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class nd implements Runnable {
    public final int f38927a;
    public final ke f38928b;
    public final int f38929c;

    public nd(ke keVar, int i10, int i11) {
        this.f38927a = i11;
        this.f38928b = keVar;
        this.f38929c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f38927a;
        int i11 = this.f38929c;
        ke keVar = this.f38928b;
        switch (i10) {
            case 0:
                of.f.s(keVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                nd ndVar = keVar.f38021i1;
                gi.o oVar = keVar.Y0;
                org.telegram.ui.Components.qc.e();
                if (keVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    keVar.W0 = true;
                    keVar.X0 = keVar.N0.amount;
                } else {
                    keVar.W0 = false;
                    keVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                keVar.V0 = true;
                oVar.setText(Long.toString(keVar.X0));
                oVar.setSelection(oVar.getText().length());
                keVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(ndVar);
                ndVar.run();
                return;
            default:
                nd ndVar2 = keVar.f38021i1;
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
                    if (keVar.f38020h1 == null) {
                        keVar.f38020h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(R.drawable.mini_switch_lock, 0);
                        nqVar.setTopOffset(1);
                        keVar.f38020h1.setSpan(nqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) keVar.f38020h1).append((CharSequence) zh.g.j0(keVar.L0 - currentTime));
                    beVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = keVar.Z0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.f29675e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.vl.p(R.string.BotStarsWithdrawalToast, new Object[]{zh.g.j0(keVar.L0 - currentTime)}, ((org.telegram.ui.Components.yb) keVar.Z0.f29675e).f32876b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(ndVar2);
                    AndroidUtilities.runOnUIThread(ndVar2, 1000L);
                    return;
                }
                beVar.f(null, true);
                if (keVar.W0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) keVar.X0);
                }
                beVar.g(zh.v7.V0(false, formatPluralStringSpaced, keVar.R0), true, true);
                return;
        }
    }
}
