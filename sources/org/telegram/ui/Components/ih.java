package org.telegram.ui.Components;

import android.text.TextUtils;
public final class ih implements Runnable {
    public final int f27413a;
    public final xi f27414b;

    public ih(xi xiVar, int i10) {
        this.f27413a = i10;
        this.f27414b = xiVar;
    }

    @Override
    public final void run() {
        mu muVar;
        boolean z10;
        long j3;
        boolean D1;
        switch (this.f27413a) {
            case 0:
                xi xiVar = this.f27414b;
                if (xiVar.f32802c0) {
                    muVar = xiVar.P0;
                } else {
                    muVar = xiVar.E0;
                }
                if (muVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(muVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xiVar.J1(z10);
                return;
            case 1:
                xi xiVar2 = this.f27414b;
                of ofVar = xiVar2.f32819h0;
                if (ofVar != null) {
                    j3 = ofVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ei eiVar = xiVar2.I0;
                xiVar2.N0 = j10;
                eiVar.setEffect(j10);
                pi piVar = xiVar2.f32874y0;
                if (piVar != xiVar2.f32825j0 && piVar != xiVar2.f32845q0) {
                    if (!piVar.G(0, false, 0, xiVar2.p1(), j10)) {
                        xiVar2.dismiss();
                    }
                    D1 = false;
                } else {
                    D1 = xiVar2.D1(0, false, 0, xiVar2.p1(), j10);
                }
                of ofVar2 = xiVar2.f32819h0;
                if (ofVar2 != null) {
                    ofVar2.h(!D1);
                    xiVar2.f32819h0 = null;
                    return;
                }
                return;
            case 2:
                this.f27414b.C1();
                return;
            default:
                xi.n(this.f27414b);
                return;
        }
    }
}
