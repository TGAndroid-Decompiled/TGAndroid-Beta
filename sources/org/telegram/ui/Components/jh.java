package org.telegram.ui.Components;

import android.text.TextUtils;
public final class jh implements Runnable {
    public final int f27678a;
    public final yi f27679b;

    public jh(yi yiVar, int i10) {
        this.f27678a = i10;
        this.f27679b = yiVar;
    }

    @Override
    public final void run() {
        av avVar;
        boolean z10;
        long j3;
        boolean J1;
        switch (this.f27678a) {
            case 0:
                yi yiVar = this.f27679b;
                if (yiVar.f33224c0) {
                    avVar = yiVar.S0;
                } else {
                    avVar = yiVar.H0;
                }
                if (avVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(avVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yiVar.Q1(z10);
                return;
            case 1:
                yi.v(this.f27679b);
                return;
            case 2:
                yi yiVar2 = this.f27679b;
                pf pfVar = yiVar2.f33241h0;
                if (pfVar != null) {
                    j3 = pfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ii iiVar = yiVar2.L0;
                yiVar2.Q0 = j10;
                iiVar.setEffect(j10);
                qi qiVar = yiVar2.B0;
                if (qiVar != yiVar2.f33247j0 && qiVar != yiVar2.f33267q0) {
                    if (!qiVar.K(0, false, 0, yiVar2.u1(), j10)) {
                        yiVar2.dismiss();
                    }
                    J1 = false;
                } else {
                    J1 = yiVar2.J1(0, false, 0, yiVar2.u1(), j10);
                }
                pf pfVar2 = yiVar2.f33241h0;
                if (pfVar2 != null) {
                    pfVar2.h(!J1);
                    yiVar2.f33241h0 = null;
                    return;
                }
                return;
            case 3:
                this.f27679b.I1();
                return;
            default:
                yi.z(this.f27679b);
                return;
        }
    }
}
