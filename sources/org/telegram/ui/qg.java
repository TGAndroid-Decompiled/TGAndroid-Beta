package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.Utilities;
public final class qg implements Utilities.Callback0Return {
    public final int f41791a;
    public final qn f41792b;

    public qg(qn qnVar, int i9) {
        this.f41791a = i9;
        this.f41792b = qnVar;
    }

    @Override
    public final Object run() {
        boolean z10;
        switch (this.f41791a) {
            case 0:
                if (LiteMode.isEnabled(65536) && org.telegram.ui.Components.d01.c()) {
                    qn qnVar = this.f41792b;
                    org.telegram.ui.Components.d01 d01Var = qnVar.f42050r0;
                    if (d01Var == null || d01Var.f27623e) {
                        if (qnVar.getParentActivity() != null && org.telegram.ui.Components.d01.c() && qnVar.f42077t0 != null && qnVar.T0 != null) {
                            org.telegram.ui.Components.d01 d01Var2 = qnVar.f42050r0;
                            if (d01Var2 != null) {
                                AndroidUtilities.removeFromParent(d01Var2);
                            }
                            org.telegram.ui.Components.d01 d01Var3 = new org.telegram.ui.Components.d01(qnVar.getParentActivity(), new rd(2, qnVar, r2));
                            qnVar.f42050r0 = d01Var3;
                            org.telegram.ui.Components.d01[] d01VarArr = {d01Var3};
                            im imVar = qnVar.T0;
                            imVar.addView(d01Var3, imVar.indexOfChild(qnVar.f42077t0) + 1, g7.e6.c(-1.0f, -1));
                        }
                    }
                    return qnVar.f42050r0;
                }
                return null;
            default:
                this.f41792b.getClass();
                if (org.telegram.ui.Components.d01.c() && LiteMode.isEnabled(65536)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
