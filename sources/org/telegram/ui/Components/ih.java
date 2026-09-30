package org.telegram.ui.Components;

import android.text.TextUtils;
public final class ih implements Runnable {
    public final int f25122a;
    public final xi f25123b;

    public ih(xi xiVar, int i10) {
        this.f25122a = i10;
        this.f25123b = xiVar;
    }

    @Override
    public final void run() {
        mu muVar;
        boolean z10;
        long j3;
        boolean G1;
        switch (this.f25122a) {
            case 0:
                xi xiVar = this.f25123b;
                if (xiVar.f30260c0) {
                    muVar = xiVar.P0;
                } else {
                    muVar = xiVar.E0;
                }
                if (muVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(muVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xiVar.M1(z10);
                return;
            case 1:
                xi xiVar2 = this.f25123b;
                of ofVar = xiVar2.f30276h0;
                if (ofVar != null) {
                    j3 = ofVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                hi hiVar = xiVar2.I0;
                xiVar2.N0 = j10;
                hiVar.setEffect(j10);
                pi piVar = xiVar2.f30331y0;
                if (piVar != xiVar2.f30282j0 && piVar != xiVar2.f30302q0) {
                    if (!piVar.I(0, false, 0, xiVar2.s1(), j10)) {
                        xiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = xiVar2.G1(0, false, 0, xiVar2.s1(), j10);
                }
                of ofVar2 = xiVar2.f30276h0;
                if (ofVar2 != null) {
                    ofVar2.h(!G1);
                    xiVar2.f30276h0 = null;
                    return;
                }
                return;
            case 2:
                this.f25123b.F1();
                return;
            default:
                xi.w(this.f25123b);
                return;
        }
    }
}
