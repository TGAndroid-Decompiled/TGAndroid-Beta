package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.tgnet.ConnectionsManager;
public final class nd implements Runnable {
    public final int f39856a;
    public final le f39857b;
    public final int f39858c;

    public nd(le leVar, int i10, int i11) {
        this.f39856a = i11;
        this.f39857b = leVar;
        this.f39858c = i10;
    }

    @Override
    public final void run() {
        boolean z10;
        String H;
        int i10 = this.f39856a;
        int i11 = this.f39858c;
        le leVar = this.f39857b;
        switch (i10) {
            case 0:
                gf.f.r(leVar.getContext(), org.telegram.messenger.dd.L0(i11, null));
                return;
            case 1:
                nd ndVar = leVar.f39206f1;
                zd zdVar = leVar.O0;
                org.telegram.ui.Components.wb.e();
                if (leVar.D0.amount < org.telegram.messenger.wp.r1(i11).S5) {
                    leVar.M0 = true;
                    leVar.N0 = leVar.D0.amount;
                } else {
                    leVar.M0 = false;
                    leVar.N0 = org.telegram.messenger.wp.r1(i11).S5;
                }
                leVar.L0 = true;
                zdVar.setText(Long.toString(leVar.N0));
                zdVar.setSelection(zdVar.getText().length());
                leVar.L0 = false;
                org.telegram.messenger.i0.r(ndVar);
                ndVar.run();
                return;
            default:
                nd ndVar2 = leVar.f39206f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                be beVar = leVar.G0;
                if (leVar.N0 <= 0 && leVar.B0 <= currentTime) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                beVar.setEnabled(z10);
                if (currentTime < leVar.B0) {
                    beVar.i(org.telegram.messenger.dd.L0(2131748382, null), true, true);
                    if (leVar.f39205e1 == null) {
                        leVar.f39205e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231975, 0);
                        dqVar.f25567n = 1;
                        leVar.f39205e1.setSpan(dqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) leVar.f39205e1).append((CharSequence) rh.i.w0(leVar.B0 - currentTime));
                    beVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.wb wbVar = leVar.P0;
                    if (wbVar != null) {
                        org.telegram.ui.Components.bb bbVar = wbVar.e;
                        if ((bbVar instanceof org.telegram.ui.Components.eb) && bbVar.isAttachedToWindow()) {
                            org.telegram.messenger.m5.q(null, null, 2131752952, new Object[]{rh.i.w0(leVar.B0 - currentTime)}, ((org.telegram.ui.Components.eb) leVar.P0.e).f25779b);
                        }
                    }
                    org.telegram.messenger.i0.r(ndVar2);
                    org.telegram.messenger.i0.h3(ndVar2, 1000L);
                    return;
                }
                beVar.g(null, true);
                if (leVar.M0) {
                    H = org.telegram.messenger.dd.L0(2131748383, null);
                } else {
                    H = org.telegram.messenger.dd.H(' ', "MonetizationStarsWithdraw", (int) leVar.N0);
                }
                beVar.i(rh.h8.Y0(false, H, leVar.H0), true, true);
                return;
        }
    }
}
