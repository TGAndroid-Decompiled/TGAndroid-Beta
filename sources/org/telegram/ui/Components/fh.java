package org.telegram.ui.Components;

import android.text.TextUtils;
public final class fh implements Runnable {
    public final int f23935a;
    public final vi f23936b;

    public fh(vi viVar, int i10) {
        this.f23935a = i10;
        this.f23936b = viVar;
    }

    @Override
    public final void run() {
        ju juVar;
        boolean z10;
        long j3;
        boolean G1;
        switch (this.f23935a) {
            case 0:
                vi viVar = this.f23936b;
                if (viVar.f28740c0) {
                    juVar = viVar.P0;
                } else {
                    juVar = viVar.E0;
                }
                if (juVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(juVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                viVar.M1(z10);
                return;
            case 1:
                vi viVar2 = this.f23936b;
                kf kfVar = viVar2.f28756h0;
                if (kfVar != null) {
                    j3 = kfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                fi fiVar = viVar2.I0;
                viVar2.N0 = j10;
                fiVar.setEffect(j10);
                ni niVar = viVar2.f28811y0;
                if (niVar != viVar2.f28762j0 && niVar != viVar2.f28782q0) {
                    if (!niVar.I(0, false, 0, viVar2.s1(), j10)) {
                        viVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = viVar2.G1(0, false, 0, viVar2.s1(), j10);
                }
                kf kfVar2 = viVar2.f28756h0;
                if (kfVar2 != null) {
                    kfVar2.h(!G1);
                    viVar2.f28756h0 = null;
                    return;
                }
                return;
            case 2:
                this.f23936b.F1();
                return;
            default:
                vi.w(this.f23936b);
                return;
        }
    }
}
