package org.telegram.ui.Components;

import android.text.TextUtils;
public final class wg implements Runnable {
    public final int f32747a;
    public final mi f32748b;

    public wg(mi miVar, int i10) {
        this.f32747a = i10;
        this.f32748b = miVar;
    }

    @Override
    public final void run() {
        fu fuVar;
        boolean z4;
        long j10;
        boolean G1;
        switch (this.f32747a) {
            case 0:
                mi miVar = this.f32748b;
                if (miVar.Z) {
                    fuVar = miVar.M0;
                } else {
                    fuVar = miVar.B0;
                }
                if (fuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(fuVar.getText().toString().trim())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                miVar.M1(z4);
                return;
            case 1:
                mi miVar2 = this.f32748b;
                cf cfVar = miVar2.f29065e0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                vh vhVar = miVar2.F0;
                miVar2.K0 = j11;
                vhVar.setEffect(j11);
                ei eiVar = miVar2.f29118v0;
                if (eiVar != miVar2.f29072g0 && eiVar != miVar2.f29092n0) {
                    if (!eiVar.H(0, false, 0, miVar2.s1(), j11)) {
                        miVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = miVar2.G1(0, false, 0, miVar2.s1(), j11);
                }
                cf cfVar2 = miVar2.f29065e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    miVar2.f29065e0 = null;
                    return;
                }
                return;
            case 2:
                this.f32748b.F1();
                return;
            default:
                mi.w(this.f32748b);
                return;
        }
    }
}
