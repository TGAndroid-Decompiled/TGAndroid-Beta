package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;
public final class gh implements Runnable {
    public final int f28583a;
    public final ti f28584b;

    public gh(ti tiVar, int i10) {
        this.f28583a = i10;
        this.f28584b = tiVar;
    }

    @Override
    public final void run() {
        ru ruVar;
        boolean z10;
        long j10;
        boolean N1;
        switch (this.f28583a) {
            case 0:
                ti tiVar = this.f28584b;
                if (tiVar.f32980c0) {
                    ruVar = tiVar.S0;
                } else {
                    ruVar = tiVar.H0;
                }
                if (ruVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ruVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tiVar.U1(z10);
                return;
            case 1:
                ti.w(this.f28584b);
                return;
            case 2:
                ti tiVar2 = this.f28584b;
                mf mfVar = tiVar2.f32996h0;
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
                if (liVar != tiVar2.f33002j0 && liVar != tiVar2.f33022q0) {
                    if (!liVar.K(0, false, 0, tiVar2.x1(), j11)) {
                        tiVar2.dismiss();
                    }
                    N1 = false;
                } else {
                    N1 = tiVar2.N1(0, false, 0, tiVar2.x1(), j11);
                }
                mf mfVar2 = tiVar2.f32996h0;
                if (mfVar2 != null) {
                    mfVar2.g(!N1);
                    tiVar2.f32996h0 = null;
                    return;
                }
                return;
            case 3:
                ti tiVar3 = this.f28584b;
                tiVar3.dismiss(true);
                org.telegram.ui.ActionBar.r2 r2Var = tiVar3.f32990f0;
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                this.f28584b.M1();
                return;
            default:
                ti.y(this.f28584b);
                return;
        }
    }
}
