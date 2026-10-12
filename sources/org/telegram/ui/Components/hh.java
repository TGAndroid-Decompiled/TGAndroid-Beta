package org.telegram.ui.Components;

import android.text.TextUtils;
public final class hh implements Runnable {
    public final int f25662a;
    public final vi f25663b;

    public hh(vi viVar, int i10) {
        this.f25662a = i10;
        this.f25663b = viVar;
    }

    @Override
    public final void run() {
        vu vuVar;
        boolean z10;
        long j10;
        boolean J1;
        switch (this.f25662a) {
            case 0:
                vi viVar = this.f25663b;
                if (viVar.f29991c0) {
                    vuVar = viVar.S0;
                } else {
                    vuVar = viVar.H0;
                }
                if (vuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(vuVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                viVar.Q1(z10);
                return;
            case 1:
                vi.v(this.f25663b);
                return;
            case 2:
                vi viVar2 = this.f25663b;
                of ofVar = viVar2.f30007h0;
                if (ofVar != null) {
                    j10 = ofVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                fi fiVar = viVar2.L0;
                viVar2.Q0 = j11;
                fiVar.setEffect(j11);
                ni niVar = viVar2.B0;
                if (niVar != viVar2.f30013j0 && niVar != viVar2.f30033q0) {
                    if (!niVar.K(0, false, 0, viVar2.u1(), j11)) {
                        viVar2.dismiss();
                    }
                    J1 = false;
                } else {
                    J1 = viVar2.J1(0, false, 0, viVar2.u1(), j11);
                }
                of ofVar2 = viVar2.f30007h0;
                if (ofVar2 != null) {
                    ofVar2.h(!J1);
                    viVar2.f30007h0 = null;
                    return;
                }
                return;
            case 3:
                this.f25663b.I1();
                return;
            default:
                vi.z(this.f25663b);
                return;
        }
    }
}
