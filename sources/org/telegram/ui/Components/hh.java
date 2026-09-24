package org.telegram.ui.Components;

import android.text.TextUtils;
public final class hh implements Runnable {
    public final int f24740a;
    public final wi f24741b;

    public hh(wi wiVar, int i10) {
        this.f24740a = i10;
        this.f24741b = wiVar;
    }

    @Override
    public final void run() {
        ku kuVar;
        boolean z10;
        long j3;
        boolean G1;
        switch (this.f24740a) {
            case 0:
                wi wiVar = this.f24741b;
                if (wiVar.f29975c0) {
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
                wi wiVar2 = this.f24741b;
                nf nfVar = wiVar2.f29991h0;
                if (nfVar != null) {
                    j3 = nfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                gi giVar = wiVar2.I0;
                wiVar2.N0 = j10;
                giVar.setEffect(j10);
                oi oiVar = wiVar2.f30046y0;
                if (oiVar != wiVar2.f29997j0 && oiVar != wiVar2.f30017q0) {
                    if (!oiVar.I(0, false, 0, wiVar2.s1(), j10)) {
                        wiVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = wiVar2.G1(0, false, 0, wiVar2.s1(), j10);
                }
                nf nfVar2 = wiVar2.f29991h0;
                if (nfVar2 != null) {
                    nfVar2.h(!G1);
                    wiVar2.f29991h0 = null;
                    return;
                }
                return;
            case 2:
                this.f24741b.F1();
                return;
            default:
                wi.w(this.f24741b);
                return;
        }
    }
}
