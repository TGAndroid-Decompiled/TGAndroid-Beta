package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.ConnectionsManager;
public final class dd implements Runnable {
    public final int f46342a;
    public final xd f46343b;
    public final int f46344c;

    public dd(xd xdVar, int i7, int i10) {
        this.f46342a = i10;
        this.f46343b = xdVar;
        this.f46344c = i7;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i7 = this.f46342a;
        int i10 = this.f46344c;
        xd xdVar = this.f46343b;
        switch (i7) {
            case 0:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.hd.M0(i10, null));
                return;
            case 1:
                dd ddVar = xdVar.f53183g1;
                di.q qVar = xdVar.P0;
                org.telegram.ui.Components.xb.e();
                if (xdVar.E0.amount < org.telegram.messenger.np.s1(i10).S5) {
                    xdVar.N0 = true;
                    xdVar.O0 = xdVar.E0.amount;
                } else {
                    xdVar.N0 = false;
                    xdVar.O0 = org.telegram.messenger.np.s1(i10).S5;
                }
                xdVar.M0 = true;
                qVar.setText(Long.toString(xdVar.O0));
                qVar.setSelection(qVar.getText().length());
                xdVar.M0 = false;
                org.telegram.messenger.g0.r(ddVar);
                ddVar.run();
                return;
            default:
                dd ddVar2 = xdVar.f53183g1;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                nd ndVar = xdVar.H0;
                if (xdVar.O0 <= 0 && xdVar.C0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ndVar.setEnabled(z10);
                if (currentTime < xdVar.C0) {
                    ndVar.i(org.telegram.messenger.hd.M0(2131748367, null), true, true);
                    if (xdVar.f53182f1 == null) {
                        xdVar.f53182f1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(2131231976, 0);
                        eqVar.f34413n = 1;
                        xdVar.f53182f1.setSpan(eqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) xdVar.f53182f1).append((CharSequence) di.t.w0(xdVar.C0 - currentTime));
                    ndVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.xb xbVar = xdVar.Q0;
                    if (xbVar != null) {
                        org.telegram.ui.Components.cb cbVar = xbVar.f41631e;
                        if ((cbVar instanceof org.telegram.ui.Components.fb) && cbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.q(null, null, 2131752952, new Object[]{di.t.w0(xdVar.C0 - currentTime)}, ((org.telegram.ui.Components.fb) xdVar.Q0.f41631e).f34556b);
                        }
                    }
                    org.telegram.messenger.g0.r(ddVar2);
                    org.telegram.messenger.g0.i3(ddVar2, 1000L);
                    return;
                }
                ndVar.g(null, true);
                if (xdVar.N0) {
                    H = org.telegram.messenger.hd.M0(2131748368, null);
                } else {
                    H = org.telegram.messenger.hd.H(' ', "MonetizationStarsWithdraw", (int) xdVar.O0);
                }
                ndVar.i(di.lb.Y0(false, H, xdVar.I0), true, true);
                return;
        }
    }
}
