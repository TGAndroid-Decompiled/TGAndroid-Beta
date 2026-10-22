package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class uj0 implements Runnable {
    public final int f30955a;
    public final vj0 f30956b;

    public uj0(vj0 vj0Var, int i10) {
        this.f30955a = i10;
        this.f30956b = vj0Var;
    }

    @Override
    public final void run() {
        switch (this.f30955a) {
            case 0:
                vj0 vj0Var = this.f30956b;
                vj0Var.getClass();
                try {
                    zf.e eVar = vj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(vj0Var.f31301z0);
                return;
            case 1:
                vj0 vj0Var2 = this.f30956b;
                vj0Var2.P = null;
                vj0Var2.p();
                return;
            case 2:
                vj0.h(this.f30956b);
                return;
            case 3:
                vj0.e(this.f30956b);
                return;
            case 4:
                vj0.d(this.f30956b);
                return;
            case 5:
                vj0.f(this.f30956b);
                return;
            default:
                this.f30956b.m();
                return;
        }
    }
}
