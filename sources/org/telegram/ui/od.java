package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
public final class od implements Runnable {
    public final int f36307a;
    public final le f36308b;
    public final int f36309c;

    public od(le leVar, int i10, int i11) {
        this.f36307a = i11;
        this.f36308b = leVar;
        this.f36309c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String formatPluralStringSpaced;
        int i10 = this.f36307a;
        int i11 = this.f36309c;
        le leVar = this.f36308b;
        switch (i10) {
            case 0:
                nf.f.s(leVar.getContext(), LocaleController.getString(i11));
                return;
            case 1:
                od odVar = leVar.f35512i1;
                fi.o oVar = leVar.Y0;
                org.telegram.ui.Components.oc.e();
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
                od odVar2 = leVar.f35512i1;
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
                    if (leVar.f35511h1 == null) {
                        leVar.f35511h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                        oqVar.setTopOffset(1);
                        leVar.f35511h1.setSpan(oqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) leVar.f35511h1).append((CharSequence) yh.g.j0(leVar.L0 - currentTime));
                    ceVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.oc ocVar = leVar.Z0;
                    if (ocVar != null) {
                        org.telegram.ui.Components.sb sbVar = ocVar.e;
                        if ((sbVar instanceof org.telegram.ui.Components.wb) && sbVar.isAttachedToWindow()) {
                            org.telegram.messenger.wl.p(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(leVar.L0 - currentTime)}, ((org.telegram.ui.Components.wb) leVar.Z0.e).f29623b);
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
                ceVar.g(yh.y7.V0(false, formatPluralStringSpaced, leVar.R0), true, true);
                return;
        }
    }
}
