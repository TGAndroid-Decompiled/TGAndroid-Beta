package org.telegram.ui.Components;

import android.text.TextUtils;
public final class gh implements Runnable {
    public final int f26607a;
    public final ti f26608b;

    public gh(ti tiVar, int i10) {
        this.f26607a = i10;
        this.f26608b = tiVar;
    }

    @Override
    public final void run() {
        qu quVar;
        boolean z10;
        long j10;
        boolean N1;
        switch (this.f26607a) {
            case 0:
                ti tiVar = this.f26608b;
                if (tiVar.f30720c0) {
                    quVar = tiVar.S0;
                } else {
                    quVar = tiVar.H0;
                }
                if (quVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(quVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tiVar.U1(z10);
                return;
            case 1:
                ti.u(this.f26608b);
                return;
            case 2:
                ti tiVar2 = this.f26608b;
                mf mfVar = tiVar2.f30736h0;
                if (mfVar != null) {
                    j10 = mfVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                ei eiVar = tiVar2.L0;
                tiVar2.Q0 = j11;
                eiVar.setEffect(j11);
                li liVar = tiVar2.B0;
                if (liVar != tiVar2.f30742j0 && liVar != tiVar2.f30762q0) {
                    if (!liVar.K(0, false, 0, tiVar2.x1(), j11)) {
                        tiVar2.dismiss();
                    }
                    N1 = false;
                } else {
                    N1 = tiVar2.N1(0, false, 0, tiVar2.x1(), j11);
                }
                mf mfVar2 = tiVar2.f30736h0;
                if (mfVar2 != null) {
                    mfVar2.g(!N1);
                    tiVar2.f30736h0 = null;
                    return;
                }
                return;
            case 3:
                this.f26608b.M1();
                return;
            default:
                ti.y(this.f26608b);
                return;
        }
    }
}
