package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;
public final class fh implements Runnable {
    public final int f35132a;
    public final ti f35133b;

    public fh(ti tiVar, int i7) {
        this.f35132a = i7;
        this.f35133b = tiVar;
    }

    @Override
    public final void run() {
        wt wtVar;
        boolean z10;
        long j3;
        boolean v12;
        li liVar;
        pm pmVar;
        switch (this.f35132a) {
            case 0:
                ti tiVar = this.f35133b;
                if (tiVar.X1) {
                    wtVar = tiVar.N2;
                } else {
                    wtVar = tiVar.C2;
                }
                if (wtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(wtVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tiVar.C1(z10);
                return;
            case 1:
                ti tiVar2 = this.f35133b;
                tiVar2.A0 = null;
                tiVar2.B0 = 0;
                tiVar2.L();
                return;
            case 2:
                ti tiVar3 = this.f35133b;
                ef efVar = tiVar3.f39962c2;
                if (efVar != null) {
                    j3 = efVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                bi biVar = tiVar3.G2;
                tiVar3.L2 = j10;
                biVar.setEffect(j10);
                li liVar2 = tiVar3.f40029w2;
                if (liVar2 != tiVar3.f39967e2 && liVar2 != tiVar3.f39987l2) {
                    if (!liVar2.M(false, 0, 0, j10, tiVar3.g1())) {
                        tiVar3.dismiss();
                    }
                    v12 = false;
                } else {
                    v12 = tiVar3.v1(false, 0, 0, j10, tiVar3.g1());
                }
                ef efVar2 = tiVar3.f39962c2;
                if (efVar2 != null) {
                    efVar2.h(!v12);
                    tiVar3.f39962c2 = null;
                    return;
                }
                return;
            case 3:
                ti tiVar4 = this.f35133b;
                tiVar4.a(true);
                org.telegram.ui.ActionBar.g2 g2Var = tiVar4.f39956a2;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                this.f35133b.u1();
                return;
            default:
                ti tiVar5 = this.f35133b;
                tiVar5.f40010r3 = null;
                li liVar3 = tiVar5.f40029w2;
                if (liVar3 != tiVar5.f39967e2 && (liVar = tiVar5.f40033x2) != (pmVar = tiVar5.f39987l2) && liVar3 != liVar && liVar3 != pmVar) {
                    tiVar5.f30226b.removeView(liVar3);
                }
                tiVar5.f40029w2.setVisibility(8);
                tiVar5.f40029w2.t();
                tiVar5.f40033x2.I();
                tiVar5.f40029w2 = tiVar5.f40033x2;
                tiVar5.f40033x2 = null;
                int[] iArr = tiVar5.Z3;
                iArr[0] = iArr[1];
                tiVar5.w1(tiVar5.X1, false);
                tiVar5.M1();
                return;
        }
    }
}
