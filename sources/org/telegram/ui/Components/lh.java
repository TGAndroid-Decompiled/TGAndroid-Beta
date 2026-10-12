package org.telegram.ui.Components;

import android.text.TextUtils;
public final class lh implements Runnable {
    public final int f28179a;
    public final aj f28180b;

    public lh(aj ajVar, int i10) {
        this.f28179a = i10;
        this.f28180b = ajVar;
    }

    @Override
    public final void run() {
        cv cvVar;
        boolean z10;
        long j3;
        boolean J1;
        switch (this.f28179a) {
            case 0:
                aj ajVar = this.f28180b;
                if (ajVar.f24327c0) {
                    cvVar = ajVar.S0;
                } else {
                    cvVar = ajVar.H0;
                }
                if (cvVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(cvVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ajVar.Q1(z10);
                return;
            case 1:
                aj.v(this.f28180b);
                return;
            case 2:
                aj ajVar2 = this.f28180b;
                rf rfVar = ajVar2.f24344h0;
                if (rfVar != null) {
                    j3 = rfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ki kiVar = ajVar2.L0;
                ajVar2.Q0 = j10;
                kiVar.setEffect(j10);
                si siVar = ajVar2.B0;
                if (siVar != ajVar2.f24350j0 && siVar != ajVar2.f24370q0) {
                    if (!siVar.K(0, false, 0, ajVar2.u1(), j10)) {
                        ajVar2.dismiss();
                    }
                    J1 = false;
                } else {
                    J1 = ajVar2.J1(0, false, 0, ajVar2.u1(), j10);
                }
                rf rfVar2 = ajVar2.f24344h0;
                if (rfVar2 != null) {
                    rfVar2.h(!J1);
                    ajVar2.f24344h0 = null;
                    return;
                }
                return;
            case 3:
                this.f28180b.I1();
                return;
            default:
                aj.z(this.f28180b);
                return;
        }
    }
}
