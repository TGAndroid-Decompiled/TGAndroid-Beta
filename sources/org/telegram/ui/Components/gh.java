package org.telegram.ui.Components;

import android.text.TextUtils;
public final class gh implements Runnable {
    public final int f28567a;
    public final ti f28568b;

    public gh(ti tiVar, int i10) {
        this.f28567a = i10;
        this.f28568b = tiVar;
    }

    @Override
    public final void run() {
        ru ruVar;
        boolean z10;
        long j10;
        boolean M1;
        switch (this.f28567a) {
            case 0:
                ti tiVar = this.f28568b;
                if (tiVar.f33008c0) {
                    ruVar = tiVar.S0;
                } else {
                    ruVar = tiVar.H0;
                }
                if (ruVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ruVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tiVar.T1(z10);
                return;
            case 1:
                ti.n(this.f28568b);
                return;
            case 2:
                ti tiVar2 = this.f28568b;
                mf mfVar = tiVar2.f33024h0;
                if (mfVar != null) {
                    j10 = mfVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                bi biVar = tiVar2.L0;
                tiVar2.Q0 = j11;
                biVar.setEffect(j11);
                li liVar = tiVar2.B0;
                if (liVar != tiVar2.f33030j0 && liVar != tiVar2.f33050q0) {
                    if (!liVar.K(0, false, 0, tiVar2.w1(), j11)) {
                        tiVar2.dismiss();
                    }
                    M1 = false;
                } else {
                    M1 = tiVar2.M1(0, false, 0, tiVar2.w1(), j11);
                }
                mf mfVar2 = tiVar2.f33024h0;
                if (mfVar2 != null) {
                    mfVar2.g(!M1);
                    tiVar2.f33024h0 = null;
                    return;
                }
                return;
            case 3:
                this.f28568b.L1();
                return;
            default:
                ti.m(this.f28568b);
                return;
        }
    }
}
