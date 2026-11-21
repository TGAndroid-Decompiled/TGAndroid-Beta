package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.ui.PremiumPreviewFragment;
public final class gh implements Runnable {
    public final int f35553a;
    public final ui f35554b;

    public gh(ui uiVar, int i7) {
        this.f35553a = i7;
        this.f35554b = uiVar;
    }

    @Override
    public final void run() {
        yt ytVar;
        boolean z10;
        long j3;
        boolean v12;
        mi miVar;
        rm rmVar;
        switch (this.f35553a) {
            case 0:
                ui uiVar = this.f35554b;
                if (uiVar.X1) {
                    ytVar = uiVar.N2;
                } else {
                    ytVar = uiVar.C2;
                }
                if (ytVar.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(ytVar.getText().toString().trim())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uiVar.C1(z10);
                return;
            case 1:
                ui uiVar2 = this.f35554b;
                uiVar2.A0 = null;
                uiVar2.B0 = 0;
                uiVar2.L();
                return;
            case 2:
                ui uiVar3 = this.f35554b;
                df dfVar = uiVar3.f40381c2;
                if (dfVar != null) {
                    j3 = dfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ci ciVar = uiVar3.G2;
                uiVar3.L2 = j10;
                ciVar.setEffect(j10);
                mi miVar2 = uiVar3.f40448w2;
                if (miVar2 != uiVar3.f40386e2 && miVar2 != uiVar3.f40406l2) {
                    if (!miVar2.M(false, 0, 0, j10, uiVar3.g1())) {
                        uiVar3.dismiss();
                    }
                    v12 = false;
                } else {
                    v12 = uiVar3.v1(false, 0, 0, j10, uiVar3.g1());
                }
                df dfVar2 = uiVar3.f40381c2;
                if (dfVar2 != null) {
                    dfVar2.h(!v12);
                    uiVar3.f40381c2 = null;
                    return;
                }
                return;
            case 3:
                ui uiVar4 = this.f35554b;
                uiVar4.a(true);
                org.telegram.ui.ActionBar.g2 g2Var = uiVar4.f40375a2;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    return;
                }
                return;
            case 4:
                this.f35554b.u1();
                return;
            default:
                ui uiVar5 = this.f35554b;
                uiVar5.f40429r3 = null;
                mi miVar3 = uiVar5.f40448w2;
                if (miVar3 != uiVar5.f40386e2 && (miVar = uiVar5.f40452x2) != (rmVar = uiVar5.f40406l2) && miVar3 != miVar && miVar3 != rmVar) {
                    uiVar5.f30173b.removeView(miVar3);
                }
                uiVar5.f40448w2.setVisibility(8);
                uiVar5.f40448w2.t();
                uiVar5.f40452x2.J();
                uiVar5.f40448w2 = uiVar5.f40452x2;
                uiVar5.f40452x2 = null;
                int[] iArr = uiVar5.Z3;
                iArr[0] = iArr[1];
                uiVar5.w1(uiVar5.X1, false);
                uiVar5.M1();
                return;
        }
    }
}
