package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ej0 implements Runnable {
    public final int f24621a;
    public final gj0 f24622b;

    public ej0(gj0 gj0Var, int i10) {
        this.f24621a = i10;
        this.f24622b = gj0Var;
    }

    @Override
    public final void run() {
        switch (this.f24621a) {
            case 0:
                gj0 gj0Var = this.f24622b;
                gj0Var.getClass();
                try {
                    kf.g gVar = gj0Var.A0;
                    if (gVar != null) {
                        gVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(gj0Var.f25185y0);
                return;
            case 1:
                gj0 gj0Var2 = this.f24622b;
                gj0Var2.N = null;
                gj0Var2.n();
                return;
            case 2:
                gj0.h(this.f24622b);
                return;
            case 3:
                gj0.e(this.f24622b);
                return;
            case 4:
                gj0.d(this.f24622b);
                return;
            case 5:
                gj0.f(this.f24622b);
                return;
            default:
                this.f24622b.k();
                return;
        }
    }
}
