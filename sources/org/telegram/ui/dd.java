package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.ConnectionsManager;
public final class dd implements Runnable {
    public final int f46919a;
    public final xd f46920b;
    public final int f46921c;

    public dd(xd xdVar, int i7, int i10) {
        this.f46919a = i10;
        this.f46920b = xdVar;
        this.f46921c = i7;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i7 = this.f46919a;
        int i10 = this.f46921c;
        xd xdVar = this.f46920b;
        switch (i7) {
            case 0:
                vf.c.t(xdVar.getContext(), org.telegram.messenger.hd.N0(i10, null));
                return;
            case 1:
                dd ddVar = xdVar.f53839g1;
                di.q qVar = xdVar.P0;
                org.telegram.ui.Components.gc.e();
                if (xdVar.E0.amount < org.telegram.messenger.np.u1(i10).U5) {
                    xdVar.N0 = true;
                    xdVar.O0 = xdVar.E0.amount;
                } else {
                    xdVar.N0 = false;
                    xdVar.O0 = org.telegram.messenger.np.u1(i10).U5;
                }
                xdVar.M0 = true;
                qVar.setText(Long.toString(xdVar.O0));
                qVar.setSelection(qVar.getText().length());
                xdVar.M0 = false;
                org.telegram.messenger.g0.r(ddVar);
                ddVar.run();
                return;
            default:
                dd ddVar2 = xdVar.f53839g1;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                nd ndVar = xdVar.H0;
                if (xdVar.O0 <= 0 && xdVar.C0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ndVar.setEnabled(z10);
                if (currentTime < xdVar.C0) {
                    ndVar.i(org.telegram.messenger.hd.N0(2131748174, null), true, true);
                    if (xdVar.f53838f1 == null) {
                        xdVar.f53838f1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(2131231977, 0);
                        nqVar.f37950n = 1;
                        xdVar.f53838f1.setSpan(nqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) xdVar.f53838f1).append((CharSequence) di.t.x0(xdVar.C0 - currentTime));
                    ndVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.gc gcVar = xdVar.Q0;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.f35523e;
                        if ((lbVar instanceof org.telegram.ui.Components.ob) && lbVar.isAttachedToWindow()) {
                            org.telegram.messenger.f3.q(null, null, 2131752940, new Object[]{di.t.x0(xdVar.C0 - currentTime)}, ((org.telegram.ui.Components.ob) xdVar.Q0.f35523e).f38158b);
                        }
                    }
                    org.telegram.messenger.g0.r(ddVar2);
                    org.telegram.messenger.g0.h3(ddVar2, 1000L);
                    return;
                }
                ndVar.g(null, true);
                if (xdVar.N0) {
                    H = org.telegram.messenger.hd.N0(2131748175, null);
                } else {
                    H = org.telegram.messenger.hd.H(' ', "MonetizationStarsWithdraw", (int) xdVar.O0);
                }
                ndVar.i(di.pb.Z0(false, H, xdVar.I0), true, true);
                return;
        }
    }
}
