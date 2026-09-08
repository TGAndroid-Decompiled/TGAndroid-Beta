package org.telegram.ui.Components;

import android.text.TextUtils;
public final class hh implements Runnable {
    public final int f26759a;
    public final vi f26760b;

    public hh(vi viVar, int i10) {
        this.f26759a = i10;
        this.f26760b = viVar;
    }

    @Override
    public final void run() {
        hu huVar;
        boolean z10;
        long j3;
        boolean G1;
        switch (this.f26759a) {
            case 0:
                vi viVar = this.f26760b;
                if (viVar.f31295c0) {
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
                vi viVar2 = this.f26760b;
                nf nfVar = viVar2.f31312h0;
                if (nfVar != null) {
                    j3 = nfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                fi fiVar = viVar2.I0;
                viVar2.N0 = j10;
                fiVar.setEffect(j10);
                ni niVar = viVar2.f31367y0;
                if (niVar != viVar2.f31318j0 && niVar != viVar2.f31338q0) {
                    if (!niVar.I(0, false, 0, viVar2.s1(), j10)) {
                        viVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = viVar2.G1(0, false, 0, viVar2.s1(), j10);
                }
                nf nfVar2 = viVar2.f31312h0;
                if (nfVar2 != null) {
                    nfVar2.h(!G1);
                    viVar2.f31312h0 = null;
                    return;
                }
                return;
            case 2:
                this.f26760b.F1();
                return;
            default:
                vi.w(this.f26760b);
                return;
        }
    }
}
