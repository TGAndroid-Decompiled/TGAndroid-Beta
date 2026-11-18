package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;
public final class eh implements Runnable {
    public final int f34702a;
    public final si f34703b;

    public eh(si siVar, int i7) {
        this.f34702a = i7;
        this.f34703b = siVar;
    }

    @Override
    public final void run() {
        wt wtVar;
        boolean z10;
        long j3;
        boolean v12;
        ki kiVar;
        pm pmVar;
        switch (this.f34702a) {
            case 0:
                si siVar = this.f34703b;
                if (siVar.X1) {
                    wtVar = siVar.N2;
                } else {
                    wtVar = siVar.C2;
                }
                if (wtVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(wtVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                siVar.C1(z10);
                return;
            case 1:
                si siVar2 = this.f34703b;
                siVar2.A0 = null;
                siVar2.B0 = 0;
                siVar2.L();
                return;
            case 2:
                si siVar3 = this.f34703b;
                df dfVar = siVar3.f39665c2;
                if (dfVar != null) {
                    j3 = dfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ai aiVar = siVar3.G2;
                siVar3.L2 = j10;
                aiVar.setEffect(j10);
                ki kiVar2 = siVar3.f39732w2;
                if (kiVar2 != siVar3.f39670e2 && kiVar2 != siVar3.f39690l2) {
                    if (!kiVar2.M(false, 0, 0, j10, siVar3.g1())) {
                        siVar3.dismiss();
                    }
                    v12 = false;
                } else {
                    v12 = siVar3.v1(false, 0, 0, j10, siVar3.g1());
                }
                df dfVar2 = siVar3.f39665c2;
                if (dfVar2 != null) {
                    dfVar2.h(!v12);
                    siVar3.f39665c2 = null;
                    return;
                }
                return;
            case 3:
                si siVar4 = this.f34703b;
                siVar4.a(true);
                org.telegram.ui.ActionBar.h2 h2Var = siVar4.f39659a2;
                if (h2Var != null) {
                    h2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                this.f34703b.u1();
                return;
            default:
                si siVar5 = this.f34703b;
                siVar5.f39713r3 = null;
                ki kiVar3 = siVar5.f39732w2;
                if (kiVar3 != siVar5.f39670e2 && (kiVar = siVar5.f39736x2) != (pmVar = siVar5.f39690l2) && kiVar3 != kiVar && kiVar3 != pmVar) {
                    siVar5.f30192b.removeView(kiVar3);
                }
                siVar5.f39732w2.setVisibility(8);
                siVar5.f39732w2.t();
                siVar5.f39736x2.J();
                siVar5.f39732w2 = siVar5.f39736x2;
                siVar5.f39736x2 = null;
                int[] iArr = siVar5.Z3;
                iArr[0] = iArr[1];
                siVar5.w1(siVar5.X1, false);
                siVar5.M1();
                return;
        }
    }
}
