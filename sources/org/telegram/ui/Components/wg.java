package org.telegram.ui.Components;

import android.text.TextUtils;
public final class wg implements Runnable {
    public final int f30247a;
    public final li f30248b;

    public wg(li liVar, int i10) {
        this.f30247a = i10;
        this.f30248b = liVar;
    }

    @Override
    public final void run() {
        cu cuVar;
        boolean z4;
        long j10;
        boolean G1;
        switch (this.f30247a) {
            case 0:
                li liVar = this.f30248b;
                if (liVar.Z) {
                    cuVar = liVar.M0;
                } else {
                    cuVar = liVar.B0;
                }
                if (cuVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(cuVar.getText().toString().trim())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                liVar.M1(z4);
                return;
            case 1:
                li liVar2 = this.f30248b;
                cf cfVar = liVar2.f26691e0;
                if (cfVar != null) {
                    j10 = cfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                vh vhVar = liVar2.F0;
                liVar2.K0 = j11;
                vhVar.setEffect(j11);
                di diVar = liVar2.f26744v0;
                if (diVar != liVar2.f26698g0 && diVar != liVar2.f26718n0) {
                    if (!diVar.H(0, false, 0, liVar2.s1(), j11)) {
                        liVar2.dismiss();
                    }
                    G1 = false;
                } else {
                    G1 = liVar2.G1(0, false, 0, liVar2.s1(), j11);
                }
                cf cfVar2 = liVar2.f26691e0;
                if (cfVar2 != null) {
                    cfVar2.h(!G1);
                    liVar2.f26691e0 = null;
                    return;
                }
                return;
            case 2:
                this.f30248b.F1();
                return;
            default:
                li.w(this.f30248b);
                return;
        }
    }
}
