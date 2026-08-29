package org.telegram.ui.Components;

import android.text.TextUtils;
public final class zg implements Runnable {
    public final int f35336a;
    public final ni f35337b;

    public zg(ni niVar, int i10) {
        this.f35336a = i10;
        this.f35337b = niVar;
    }

    @Override
    public final void run() {
        au auVar;
        boolean z10;
        long j10;
        boolean G1;
        switch (this.f35336a) {
            case 0:
                ni niVar = this.f35337b;
                if (niVar.Y) {
                    auVar = niVar.L0;
                } else {
                    auVar = niVar.A0;
                }
                if (auVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(auVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                niVar.M1(z10);
                return;
            case 1:
                ni niVar2 = this.f35337b;
                ff ffVar = niVar2.f30997d0;
                if (ffVar != null) {
                    j10 = ffVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                yh yhVar = niVar2.E0;
                niVar2.J0 = j11;
                yhVar.setEffect(j11);
                fi fiVar = niVar2.f31051u0;
                if (fiVar != niVar2.f31005f0 && fiVar != niVar2.m0) {
                    if (!fiVar.H(0, false, 0, niVar2.s1(), j11)) {
                        niVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = niVar2.G1(0, false, 0, niVar2.s1(), j11);
                }
                ff ffVar2 = niVar2.f30997d0;
                if (ffVar2 != null) {
                    ffVar2.h(!G1);
                    niVar2.f30997d0 = null;
                    return;
                }
                return;
            case 2:
                this.f35337b.F1();
                return;
            default:
                ni.w(this.f35337b);
                return;
        }
    }
}
