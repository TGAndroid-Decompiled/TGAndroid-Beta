package org.telegram.ui.Components;

import android.text.TextUtils;
public final class hh implements Runnable {
    public final int f24793a;
    public final wi f24794b;

    public hh(wi wiVar, int i10) {
        this.f24793a = i10;
        this.f24794b = wiVar;
    }

    @Override
    public final void run() {
        lu luVar;
        boolean z10;
        long j3;
        boolean G1;
        switch (this.f24793a) {
            case 0:
                wi wiVar = this.f24794b;
                if (wiVar.f30010c0) {
                    luVar = wiVar.P0;
                } else {
                    luVar = wiVar.E0;
                }
                if (luVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(luVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wiVar.M1(z10);
                return;
            case 1:
                wi wiVar2 = this.f24794b;
                nf nfVar = wiVar2.f30026h0;
                if (nfVar != null) {
                    j3 = nfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                gi giVar = wiVar2.I0;
                wiVar2.N0 = j10;
                giVar.setEffect(j10);
                oi oiVar = wiVar2.f30081y0;
                if (oiVar != wiVar2.f30032j0 && oiVar != wiVar2.f30052q0) {
                    if (!oiVar.I(0, false, 0, wiVar2.s1(), j10)) {
                        wiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = wiVar2.G1(0, false, 0, wiVar2.s1(), j10);
                }
                nf nfVar2 = wiVar2.f30026h0;
                if (nfVar2 != null) {
                    nfVar2.h(!G1);
                    wiVar2.f30026h0 = null;
                    return;
                }
                return;
            case 2:
                this.f24794b.F1();
                return;
            default:
                wi.w(this.f24794b);
                return;
        }
    }
}
