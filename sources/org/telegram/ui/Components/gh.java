package org.telegram.ui.Components;

import android.text.TextUtils;
public final class gh implements Runnable {
    public final int f24287a;
    public final wi f24288b;

    public gh(wi wiVar, int i10) {
        this.f24287a = i10;
        this.f24288b = wiVar;
    }

    @Override
    public final void run() {
        ku kuVar;
        boolean z10;
        long j3;
        boolean G1;
        switch (this.f24287a) {
            case 0:
                wi wiVar = this.f24288b;
                if (wiVar.f29655c0) {
                    kuVar = wiVar.P0;
                } else {
                    kuVar = wiVar.E0;
                }
                if (kuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(kuVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wiVar.M1(z10);
                return;
            case 1:
                wi wiVar2 = this.f24288b;
                mf mfVar = wiVar2.f29671h0;
                if (mfVar != null) {
                    j3 = mfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                gi giVar = wiVar2.I0;
                wiVar2.N0 = j10;
                giVar.setEffect(j10);
                oi oiVar = wiVar2.f29726y0;
                if (oiVar != wiVar2.f29677j0 && oiVar != wiVar2.f29697q0) {
                    if (!oiVar.I(0, false, 0, wiVar2.s1(), j10)) {
                        wiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = wiVar2.G1(0, false, 0, wiVar2.s1(), j10);
                }
                mf mfVar2 = wiVar2.f29671h0;
                if (mfVar2 != null) {
                    mfVar2.h(!G1);
                    wiVar2.f29671h0 = null;
                    return;
                }
                return;
            case 2:
                this.f24288b.F1();
                return;
            default:
                wi.w(this.f24288b);
                return;
        }
    }
}
