package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wi0 implements Runnable {
    public final int f29727a;
    public final xi0 f29728b;

    public wi0(xi0 xi0Var, int i10) {
        this.f29727a = i10;
        this.f29728b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f29727a) {
            case 0:
                xi0 xi0Var = this.f29728b;
                xi0Var.getClass();
                try {
                    yf.e eVar = xi0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xi0Var.f29976z0);
                return;
            case 1:
                xi0 xi0Var2 = this.f29728b;
                xi0Var2.P = null;
                xi0Var2.p();
                return;
            case 2:
                xi0.h(this.f29728b);
                return;
            case 3:
                xi0.e(this.f29728b);
                return;
            case 4:
                xi0.d(this.f29728b);
                return;
            case 5:
                xi0.f(this.f29728b);
                return;
            default:
                this.f29728b.m();
                return;
        }
    }
}
