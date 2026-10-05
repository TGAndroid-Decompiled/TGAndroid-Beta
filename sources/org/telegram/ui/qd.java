package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class qd implements Runnable {
    public final int f39766a;
    public final me f39767b;
    public final int f39768c;

    public qd(me meVar, int i10, int i11) {
        this.f39766a = i11;
        this.f39767b = meVar;
        this.f39768c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f39766a;
        int i11 = this.f39768c;
        me meVar = this.f39767b;
        switch (i10) {
            case 0:
                nf.f.s(meVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                qd qdVar = meVar.f38585f1;
                fi.o oVar = meVar.O0;
                org.telegram.ui.Components.rc.e();
                if (meVar.D0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    meVar.M0 = true;
                    meVar.N0 = meVar.D0.amount;
                } else {
                    meVar.M0 = false;
                    meVar.N0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                meVar.L0 = true;
                oVar.setText(Long.toString(meVar.N0));
                oVar.setSelection(oVar.getText().length());
                meVar.L0 = false;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
                return;
            default:
                qd qdVar2 = meVar.f38585f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ce ceVar = meVar.G0;
                if (meVar.N0 <= 0 && meVar.B0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ceVar.setEnabled(z10);
                if (currentTime < meVar.B0) {
                    ceVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (meVar.f38584e1 == null) {
                        meVar.f38584e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.mini_switch_lock, 0);
                        rqVar.setTopOffset(1);
                        meVar.f38584e1.setSpan(rqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) meVar.f38584e1).append((CharSequence) yh.h.r0(meVar.B0 - currentTime));
                    ceVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.rc rcVar = meVar.P0;
                    if (rcVar != null) {
                        org.telegram.ui.Components.vb vbVar = rcVar.f30423e;
                        if ((vbVar instanceof org.telegram.ui.Components.zb) && vbVar.isAttachedToWindow()) {
                            org.telegram.messenger.bi.p(R.string.BotStarsWithdrawalToast, new Object[]{yh.h.r0(meVar.B0 - currentTime)}, ((org.telegram.ui.Components.zb) meVar.P0.f30423e).f33480b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(qdVar2);
                    AndroidUtilities.runOnUIThread(qdVar2, 1000L);
                    return;
                }
                ceVar.f(null, true);
                if (meVar.M0) {
                    formatPluralStringSpaced = LocaleController.getString(R.string.MonetizationStarsWithdrawAll);
                } else {
                    formatPluralStringSpaced = LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) meVar.N0);
                }
                ceVar.g(yh.z7.b1(false, formatPluralStringSpaced, meVar.H0), true, true);
                return;
        }
    }
}
