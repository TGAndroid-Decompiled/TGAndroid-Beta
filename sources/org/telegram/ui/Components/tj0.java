package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class tj0 implements Runnable {
    public final int f30608a;
    public final uj0 f30609b;

    public tj0(uj0 uj0Var, int i10) {
        this.f30608a = i10;
        this.f30609b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f30608a) {
            case 0:
                uj0 uj0Var = this.f30609b;
                uj0Var.getClass();
                try {
                    zf.e eVar = uj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(uj0Var.f31007z0);
                return;
            case 1:
                uj0 uj0Var2 = this.f30609b;
                uj0Var2.P = null;
                uj0Var2.p();
                return;
            case 2:
                uj0.h(this.f30609b);
                return;
            case 3:
                uj0.e(this.f30609b);
                return;
            case 4:
                uj0.d(this.f30609b);
                return;
            case 5:
                uj0.f(this.f30609b);
                return;
            default:
                this.f30609b.m();
                return;
        }
    }
}
