package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class nd implements Runnable {
    public final int f39534a;
    public final ie f39535b;
    public final int f39536c;

    public nd(ie ieVar, int i10, int i11) {
        this.f39534a = i11;
        this.f39535b = ieVar;
        this.f39536c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f39534a;
        int i11 = this.f39536c;
        ie ieVar = this.f39535b;
        switch (i10) {
            case 0:
                pf.d.r(ieVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                nd ndVar = ieVar.f37938i1;
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
                nd ndVar2 = ieVar.f37938i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                zd zdVar = ieVar.Q0;
                if (ieVar.X0 <= 0 && ieVar.L0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                zdVar.setEnabled(z10);
                if (currentTime < ieVar.L0) {
                    zdVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (ieVar.f37937h1 == null) {
                        ieVar.f37937h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.mini_switch_lock, 0);
                        yqVar.setTopOffset(1);
                        ieVar.f37937h1.setSpan(yqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ieVar.f37937h1).append((CharSequence) ai.x.j0(ieVar.L0 - currentTime));
                    zdVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = ieVar.Z0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.mk.r(R.string.BotStarsWithdrawalToast, new Object[]{ai.x.j0(ieVar.L0 - currentTime)}, ((org.telegram.ui.Components.yb) ieVar.Z0.e).f32624b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(ndVar2);
                    AndroidUtilities.runOnUIThread(ndVar2, 1000L);
                    return;
                }
                zdVar.f(null, true);
                if (ieVar.W0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) ieVar.X0);
                }
                zdVar.g(ai.md.W0(false, formatPluralStringSpaced, ieVar.R0), true, true);
                return;
        }
    }
}
