package org.telegram.ui.Components;

import android.text.TextUtils;
public final class hh implements Runnable {
    public final int f24837a;
    public final wi f24838b;

    public hh(wi wiVar, int i10) {
        this.f24837a = i10;
        this.f24838b = wiVar;
    }

    @Override
    public final void run() {
        lu luVar;
        boolean z10;
        long j3;
        boolean D1;
        switch (this.f24837a) {
            case 0:
                wi wiVar = this.f24838b;
                if (wiVar.f29952c0) {
                    luVar = wiVar.P0;
                } else {
                    luVar = wiVar.E0;
                }
                if (luVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(luVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wiVar.J1(z10);
                return;
            case 1:
                wi wiVar2 = this.f24838b;
                nf nfVar = wiVar2.f29968h0;
                if (nfVar != null) {
                    j3 = nfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                di diVar = wiVar2.I0;
                wiVar2.N0 = j10;
                diVar.setEffect(j10);
                oi oiVar = wiVar2.f30023y0;
                if (oiVar != wiVar2.f29974j0 && oiVar != wiVar2.f29994q0) {
                    if (!oiVar.I(0, false, 0, wiVar2.p1(), j10)) {
                        wiVar2.dismiss();
                    }
                    D1 = false;
                } else {
                    D1 = wiVar2.D1(0, false, 0, wiVar2.p1(), j10);
                }
                nf nfVar2 = wiVar2.f29968h0;
                if (nfVar2 != null) {
                    nfVar2.h(!D1);
                    wiVar2.f29968h0 = null;
                    return;
                }
                return;
            case 2:
                this.f24838b.C1();
                return;
            default:
                wi.n(this.f24838b);
                return;
        }
    }
}
