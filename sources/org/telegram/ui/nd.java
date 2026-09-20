package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class nd implements Runnable {
    public final int f35983a;
    public final ke f35984b;
    public final int f35985c;

    public nd(ke keVar, int i10, int i11) {
        this.f35983a = i11;
        this.f35984b = keVar;
        this.f35985c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f35983a;
        int i11 = this.f35985c;
        ke keVar = this.f35984b;
        switch (i10) {
            case 0:
                nf.f.s(keVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                nd ndVar = keVar.f35140i1;
                fi.o oVar = keVar.Y0;
                org.telegram.ui.Components.pc.e();
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
                nd ndVar2 = keVar.f35140i1;
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
                    if (keVar.f35139h1 == null) {
                        keVar.f35139h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                        oqVar.setTopOffset(1);
                        keVar.f35139h1.setSpan(oqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) keVar.f35139h1).append((CharSequence) yh.g.j0(keVar.L0 - currentTime));
                    beVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.pc pcVar = keVar.Z0;
                    if (pcVar != null) {
                        org.telegram.ui.Components.tb tbVar = pcVar.e;
                        if ((tbVar instanceof org.telegram.ui.Components.xb) && tbVar.isAttachedToWindow()) {
                            org.telegram.messenger.rk.q(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(keVar.L0 - currentTime)}, ((org.telegram.ui.Components.xb) keVar.Z0.e).f30222b);
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
                beVar.g(yh.w7.V0(false, formatPluralStringSpaced, keVar.R0), true, true);
                return;
        }
    }
}
