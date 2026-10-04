package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class qd implements Runnable {
    public final int f39696a;
    public final me f39697b;
    public final int f39698c;

    public qd(me meVar, int i10, int i11) {
        this.f39696a = i11;
        this.f39697b = meVar;
        this.f39698c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f39696a;
        int i11 = this.f39698c;
        me meVar = this.f39697b;
        switch (i10) {
            case 0:
                nf.f.s(meVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                qd qdVar = meVar.f38550i2;
                fi.o oVar = meVar.R1;
                org.telegram.ui.Components.rc.e();
                if (meVar.G1.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    meVar.P1 = true;
                    meVar.Q1 = meVar.G1.amount;
                } else {
                    meVar.P1 = false;
                    meVar.Q1 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                meVar.O1 = true;
                oVar.setText(Long.toString(meVar.Q1));
                oVar.setSelection(oVar.getText().length());
                meVar.O1 = false;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
                return;
            default:
                qd qdVar2 = meVar.f38550i2;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ce ceVar = meVar.J1;
                if (meVar.Q1 <= 0 && meVar.E1 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ceVar.setEnabled(z10);
                if (currentTime < meVar.E1) {
                    ceVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (meVar.f38549h2 == null) {
                        meVar.f38549h2 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.mini_switch_lock, 0);
                        rqVar.setTopOffset(1);
                        meVar.f38549h2.setSpan(rqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) meVar.f38549h2).append((CharSequence) yh.g.j0(meVar.E1 - currentTime));
                    ceVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.rc rcVar = meVar.S1;
                    if (rcVar != null) {
                        org.telegram.ui.Components.vb vbVar = rcVar.f30334e;
                        if ((vbVar instanceof org.telegram.ui.Components.zb) && vbVar.isAttachedToWindow()) {
                            org.telegram.messenger.ok.q(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(meVar.E1 - currentTime)}, ((org.telegram.ui.Components.zb) meVar.S1.f30334e).f33465b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(qdVar2);
                    AndroidUtilities.runOnUIThread(qdVar2, 1000L);
                    return;
                }
                ceVar.f(null, true);
                if (meVar.P1) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) meVar.Q1);
                }
                ceVar.g(yh.x7.b1(false, formatPluralStringSpaced, meVar.K1), true, true);
                return;
        }
    }
}
