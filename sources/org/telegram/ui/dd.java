package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.ConnectionsManager;
public final class dd implements Runnable {
    public final int f44631a;
    public final xd f44632b;
    public final int f44633c;

    public dd(xd xdVar, int i3, int i10) {
        this.f44631a = i10;
        this.f44632b = xdVar;
        this.f44633c = i3;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i3 = this.f44631a;
        int i10 = this.f44633c;
        xd xdVar = this.f44632b;
        switch (i3) {
            case 0:
                sf.c.t(xdVar.getContext(), org.telegram.messenger.bd.M0(i10, null));
                return;
            case 1:
                dd ddVar = xdVar.f51920g1;
                ci.s sVar = xdVar.P0;
                org.telegram.ui.Components.ac.e();
                if (xdVar.E0.amount < org.telegram.messenger.hp.s1(i10).R5) {
                    xdVar.N0 = true;
                    xdVar.O0 = xdVar.E0.amount;
                } else {
                    xdVar.N0 = false;
                    xdVar.O0 = org.telegram.messenger.hp.s1(i10).R5;
                }
                xdVar.M0 = true;
                sVar.setText(Long.toString(xdVar.O0));
                sVar.setSelection(sVar.getText().length());
                xdVar.M0 = false;
                org.telegram.messenger.g0.r(ddVar);
                ddVar.run();
                return;
            default:
                dd ddVar2 = xdVar.f51920g1;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                nd ndVar = xdVar.H0;
                if (xdVar.O0 <= 0 && xdVar.C0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ndVar.setEnabled(z10);
                if (currentTime < xdVar.C0) {
                    ndVar.i(org.telegram.messenger.bd.M0(2131748375, null), true, true);
                    if (xdVar.f51919f1 == null) {
                        xdVar.f51919f1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231976, 0);
                        wpVar.f40044n = 1;
                        xdVar.f51919f1.setSpan(wpVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) xdVar.f51919f1).append((CharSequence) ci.v.w0(xdVar.C0 - currentTime));
                    ndVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.ac acVar = xdVar.Q0;
                    if (acVar != null) {
                        org.telegram.ui.Components.fb fbVar = acVar.f31788e;
                        if ((fbVar instanceof org.telegram.ui.Components.ib) && fbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.r(null, null, 2131752952, new Object[]{ci.v.w0(xdVar.C0 - currentTime)}, ((org.telegram.ui.Components.ib) xdVar.Q0.f31788e).f34651b);
                        }
                    }
                    org.telegram.messenger.g0.r(ddVar2);
                    org.telegram.messenger.g0.i3(ddVar2, 1000L);
                    return;
                }
                ndVar.g(null, true);
                if (xdVar.N0) {
                    H = org.telegram.messenger.bd.M0(2131748376, null);
                } else {
                    H = org.telegram.messenger.bd.H(' ', "MonetizationStarsWithdraw", (int) xdVar.O0);
                }
                ndVar.i(ci.wb.Y0(false, H, xdVar.I0), true, true);
                return;
        }
    }
}
