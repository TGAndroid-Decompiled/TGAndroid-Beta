package org.telegram.ui.Components;

import android.text.TextUtils;
public final class gh implements Runnable {
    public final int f24353a;
    public final vi f24354b;

    public gh(vi viVar, int i10) {
        this.f24353a = i10;
        this.f24354b = viVar;
    }

    @Override
    public final void run() {
        ju juVar;
        boolean z10;
        long j3;
        boolean G1;
        switch (this.f24353a) {
            case 0:
                vi viVar = this.f24354b;
                if (viVar.f29088c0) {
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
                vi viVar2 = this.f24354b;
                mf mfVar = viVar2.f29104h0;
                if (mfVar != null) {
                    j3 = mfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                fi fiVar = viVar2.I0;
                viVar2.N0 = j10;
                fiVar.setEffect(j10);
                ni niVar = viVar2.f29159y0;
                if (niVar != viVar2.f29110j0 && niVar != viVar2.f29130q0) {
                    if (!niVar.I(0, false, 0, viVar2.s1(), j10)) {
                        viVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = viVar2.G1(0, false, 0, viVar2.s1(), j10);
                }
                mf mfVar2 = viVar2.f29104h0;
                if (mfVar2 != null) {
                    mfVar2.h(!G1);
                    viVar2.f29104h0 = null;
                    return;
                }
                return;
            case 2:
                this.f24354b.F1();
                return;
            default:
                vi.w(this.f24354b);
                return;
        }
    }
}
