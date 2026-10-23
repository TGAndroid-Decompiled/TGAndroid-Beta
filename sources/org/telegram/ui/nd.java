package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class nd implements Runnable {
    public final int f39847a;
    public final ie f39848b;
    public final int f39849c;

    public nd(ie ieVar, int i10, int i11) {
        this.f39847a = i11;
        this.f39848b = ieVar;
        this.f39849c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f39847a;
        int i11 = this.f39849c;
        ie ieVar = this.f39848b;
        switch (i10) {
            case 0:
                pf.d.r(ieVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                nd ndVar = ieVar.f38162i1;
                ai.t tVar = ieVar.Y0;
                org.telegram.ui.Components.qc.e();
                if (ieVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    ieVar.W0 = true;
                    ieVar.X0 = ieVar.N0.amount;
                } else {
                    ieVar.W0 = false;
                    ieVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                ieVar.V0 = true;
                tVar.setText(Long.toString(ieVar.X0));
                tVar.setSelection(tVar.getText().length());
                ieVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(ndVar);
                ndVar.run();
                return;
            default:
                nd ndVar2 = ieVar.f38162i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                zd zdVar = ieVar.Q0;
                if (ieVar.X0 <= 0 && ieVar.L0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zdVar.setEnabled(z10);
                if (currentTime < ieVar.L0) {
                    zdVar.i(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (ieVar.f38161h1 == null) {
                        ieVar.f38161h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.mini_switch_lock, 0);
                        xqVar.setTopOffset(1);
                        ieVar.f38161h1.setSpan(xqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ieVar.f38161h1).append((CharSequence) ai.x.j0(ieVar.L0 - currentTime));
                    zdVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = ieVar.Z0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.sl.r(R.string.BotStarsWithdrawalToast, new Object[]{ai.x.j0(ieVar.L0 - currentTime)}, ((org.telegram.ui.Components.yb) ieVar.Z0.e).f32863b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(ndVar2);
                    AndroidUtilities.runOnUIThread(ndVar2, 1000L);
                    return;
                }
                zdVar.g(null, true);
                if (ieVar.W0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) ieVar.X0);
                }
                zdVar.i(ai.nd.W0(false, formatPluralStringSpaced, ieVar.R0), true, true);
                return;
        }
    }
}
