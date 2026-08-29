package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ui0 implements Runnable {
    public final int f33243a;
    public final xi0 f33244b;

    public ui0(xi0 xi0Var, int i10) {
        this.f33243a = i10;
        this.f33244b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f33243a) {
            case 0:
                xi0 xi0Var = this.f33244b;
                xi0Var.getClass();
                try {
                    jf.g gVar = xi0Var.f34765z0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xi0Var.f34762x0);
                return;
            case 1:
                xi0 xi0Var2 = this.f33244b;
                xi0Var2.M = null;
                xi0Var2.n();
                return;
            case 2:
                xi0.h(this.f33244b);
                return;
            case 3:
                xi0.e(this.f33244b);
                return;
            case 4:
                xi0.d(this.f33244b);
                return;
            case 5:
                xi0.f(this.f33244b);
                return;
            default:
                this.f33244b.k();
                return;
        }
    }
}
