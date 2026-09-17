package org.telegram.ui.Components;

import android.text.TextUtils;
public final class hh implements Runnable {
    public final int f26760a;
    public final vi f26761b;

    public hh(vi viVar, int i10) {
        this.f26760a = i10;
        this.f26761b = viVar;
    }

    @Override
    public final void run() {
        hu huVar;
        boolean z10;
        long j3;
        boolean G1;
        switch (this.f26760a) {
            case 0:
                vi viVar = this.f26761b;
                if (viVar.f31296c0) {
                    huVar = viVar.P0;
                } else {
                    huVar = viVar.E0;
                }
                if (huVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(huVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                viVar.M1(z10);
                return;
            case 1:
                vi viVar2 = this.f26761b;
                nf nfVar = viVar2.f31313h0;
                if (nfVar != null) {
                    j3 = nfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                fi fiVar = viVar2.I0;
                viVar2.N0 = j10;
                fiVar.setEffect(j10);
                ni niVar = viVar2.f31368y0;
                if (niVar != viVar2.f31319j0 && niVar != viVar2.f31339q0) {
                    if (!niVar.I(0, false, 0, viVar2.s1(), j10)) {
                        viVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = viVar2.G1(0, false, 0, viVar2.s1(), j10);
                }
                nf nfVar2 = viVar2.f31313h0;
                if (nfVar2 != null) {
                    nfVar2.h(!G1);
                    viVar2.f31313h0 = null;
                    return;
                }
                return;
            case 2:
                this.f26761b.F1();
                return;
            default:
                vi.w(this.f26761b);
                return;
        }
    }
}
