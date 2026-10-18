package org.telegram.ui.Components;

import android.text.TextUtils;
public final class gh implements Runnable {
    public final int f26571a;
    public final ti f26572b;

    public gh(ti tiVar, int i10) {
        this.f26571a = i10;
        this.f26572b = tiVar;
    }

    @Override
    public final void run() {
        qu quVar;
        boolean z10;
        long j10;
        boolean J1;
        switch (this.f26571a) {
            case 0:
                ti tiVar = this.f26572b;
                if (tiVar.f30571c0) {
                    quVar = tiVar.S0;
                } else {
                    quVar = tiVar.H0;
                }
                if (quVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(quVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tiVar.Q1(z10);
                return;
            case 1:
                ti.v(this.f26572b);
                return;
            case 2:
                ti tiVar2 = this.f26572b;
                mf mfVar = tiVar2.f30587h0;
                if (mfVar != null) {
                    j10 = mfVar.k();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ei eiVar = tiVar2.L0;
                tiVar2.Q0 = j11;
                eiVar.setEffect(j11);
                li liVar = tiVar2.B0;
                if (liVar != tiVar2.f30593j0 && liVar != tiVar2.f30613q0) {
                    if (!liVar.K(0, false, 0, tiVar2.u1(), j11)) {
                        tiVar2.dismiss();
                    }
                    J1 = false;
                } else {
                    J1 = tiVar2.J1(0, false, 0, tiVar2.u1(), j11);
                }
                mf mfVar2 = tiVar2.f30587h0;
                if (mfVar2 != null) {
                    mfVar2.h(!J1);
                    tiVar2.f30587h0 = null;
                    return;
                }
                return;
            case 3:
                this.f26572b.I1();
                return;
            default:
                ti.z(this.f26572b);
                return;
        }
    }
}
