package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class fj0 implements Runnable {
    public final int f26925a;
    public final hj0 f26926b;

    public fj0(hj0 hj0Var, int i10) {
        this.f26925a = i10;
        this.f26926b = hj0Var;
    }

    @Override
    public final void run() {
        switch (this.f26925a) {
            case 0:
                hj0 hj0Var = this.f26926b;
                hj0Var.getClass();
                try {
                    lf.g gVar = hj0Var.A0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(hj0Var.f27551y0);
                return;
            case 1:
                hj0 hj0Var2 = this.f26926b;
                hj0Var2.N = null;
                hj0Var2.n();
                return;
            case 2:
                hj0.h(this.f26926b);
                return;
            case 3:
                hj0.e(this.f26926b);
                return;
            case 4:
                hj0.d(this.f26926b);
                return;
            case 5:
                hj0.f(this.f26926b);
                return;
            default:
                this.f26926b.k();
                return;
        }
    }
}
