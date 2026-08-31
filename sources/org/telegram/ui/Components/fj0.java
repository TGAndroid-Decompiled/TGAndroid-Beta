package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class fj0 implements Runnable {
    public final int f26926a;
    public final ij0 f26927b;

    public fj0(ij0 ij0Var, int i10) {
        this.f26926a = i10;
        this.f26927b = ij0Var;
    }

    @Override
    public final void run() {
        switch (this.f26926a) {
            case 0:
                ij0 ij0Var = this.f26927b;
                ij0Var.getClass();
                try {
                    lf.g gVar = ij0Var.A0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(ij0Var.f27844y0);
                return;
            case 1:
                ij0 ij0Var2 = this.f26927b;
                ij0Var2.N = null;
                ij0Var2.n();
                return;
            case 2:
                ij0.h(this.f26927b);
                return;
            case 3:
                ij0.e(this.f26927b);
                return;
            case 4:
                ij0.d(this.f26927b);
                return;
            case 5:
                ij0.f(this.f26927b);
                return;
            default:
                this.f26927b.k();
                return;
        }
    }
}
