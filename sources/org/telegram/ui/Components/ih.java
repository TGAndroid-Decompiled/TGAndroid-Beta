package org.telegram.ui.Components;

import android.text.TextUtils;
public final class ih implements Runnable {
    public final int f27513a;
    public final xi f27514b;

    public ih(xi xiVar, int i10) {
        this.f27513a = i10;
        this.f27514b = xiVar;
    }

    @Override
    public final void run() {
        mu muVar;
        boolean z10;
        long j3;
        boolean F1;
        switch (this.f27513a) {
            case 0:
                xi xiVar = this.f27514b;
                if (xiVar.f32899c0) {
                    muVar = xiVar.P0;
                } else {
                    muVar = xiVar.E0;
                }
                if (muVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(muVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xiVar.L1(z10);
                return;
            case 1:
                xi xiVar2 = this.f27514b;
                of ofVar = xiVar2.f32916h0;
                if (ofVar != null) {
                    j3 = ofVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ei eiVar = xiVar2.I0;
                xiVar2.N0 = j10;
                eiVar.setEffect(j10);
                pi piVar = xiVar2.f32971y0;
                if (piVar != xiVar2.f32922j0 && piVar != xiVar2.f32942q0) {
                    if (!piVar.G(0, false, 0, xiVar2.r1(), j10)) {
                        xiVar2.dismiss();
                    }
                    F1 = false;
                } else {
                    F1 = xiVar2.F1(0, false, 0, xiVar2.r1(), j10);
                }
                of ofVar2 = xiVar2.f32916h0;
                if (ofVar2 != null) {
                    ofVar2.h(!F1);
                    xiVar2.f32916h0 = null;
                    return;
                }
                return;
            case 2:
                this.f27514b.E1();
                return;
            default:
                xi.n(this.f27514b);
                return;
        }
    }
}
