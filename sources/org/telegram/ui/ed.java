package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.ConnectionsManager;
public final class ed implements Runnable {
    public final int f45289a;
    public final zd f45290b;
    public final int f45291c;

    public ed(zd zdVar, int i7, int i10) {
        this.f45289a = i10;
        this.f45290b = zdVar;
        this.f45291c = i7;
    }

    @Override
    public final void run() {
        boolean z9;
        String H;
        int i7 = this.f45289a;
        int i10 = this.f45291c;
        zd zdVar = this.f45290b;
        switch (i7) {
            case 0:
                vf.c.t(zdVar.getContext(), org.telegram.messenger.hd.M0(i10, null));
                return;
            case 1:
                ed edVar = zdVar.f52529f1;
                bi.v vVar = zdVar.O0;
                org.telegram.ui.Components.cc.e();
                if (zdVar.D0.amount < org.telegram.messenger.qp.s1(i10).R5) {
                    zdVar.M0 = true;
                    zdVar.N0 = zdVar.D0.amount;
                } else {
                    zdVar.M0 = false;
                    zdVar.N0 = org.telegram.messenger.qp.s1(i10).R5;
                }
                zdVar.L0 = true;
                vVar.setText(Long.toString(zdVar.N0));
                vVar.setSelection(vVar.getText().length());
                zdVar.L0 = false;
                org.telegram.messenger.g0.r(edVar);
                edVar.run();
                return;
            default:
                ed edVar2 = zdVar.f52529f1;
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                pd pdVar = zdVar.G0;
                if (zdVar.N0 <= 0 && zdVar.B0 <= currentTime) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                pdVar.setEnabled(z9);
                if (currentTime < zdVar.B0) {
                    pdVar.i(org.telegram.messenger.hd.M0(2131748366, null), true, true);
                    if (zdVar.f52528e1 == null) {
                        zdVar.f52528e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231976, 0);
                        wpVar.f40054n = 1;
                        zdVar.f52528e1.setSpan(wpVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) zdVar.f52528e1).append((CharSequence) bi.z.w0(zdVar.B0 - currentTime));
                    pdVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.cc ccVar = zdVar.P0;
                    if (ccVar != null) {
                        org.telegram.ui.Components.gb gbVar = ccVar.f32519e;
                        if ((gbVar instanceof org.telegram.ui.Components.kb) && gbVar.isAttachedToWindow()) {
                            org.telegram.messenger.k5.r(null, null, 2131752952, new Object[]{bi.z.w0(zdVar.B0 - currentTime)}, ((org.telegram.ui.Components.kb) zdVar.P0.f32519e).f35249b);
                        }
                    }
                    org.telegram.messenger.g0.r(edVar2);
                    org.telegram.messenger.g0.i3(edVar2, 1000L);
                    return;
                }
                pdVar.g(null, true);
                if (zdVar.M0) {
                    H = org.telegram.messenger.hd.M0(2131748367, null);
                } else {
                    H = org.telegram.messenger.hd.H(' ', "MonetizationStarsWithdraw", (int) zdVar.N0);
                }
                pdVar.i(bi.dd.Y0(false, H, zdVar.H0), true, true);
                return;
        }
    }
}
