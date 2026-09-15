package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wi0 implements Runnable {
    public final int f29730a;
    public final xi0 f29731b;

    public wi0(xi0 xi0Var, int i10) {
        this.f29730a = i10;
        this.f29731b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f29730a) {
            case 0:
                xi0 xi0Var = this.f29731b;
                xi0Var.getClass();
                try {
                    yf.e eVar = xi0Var.D0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xi0Var.B0);
                return;
            case 1:
                xi0 xi0Var2 = this.f29731b;
                xi0Var2.Q = null;
                xi0Var2.p();
                return;
            case 2:
                xi0.h(this.f29731b);
                return;
            case 3:
                xi0.e(this.f29731b);
                return;
            case 4:
                xi0.d(this.f29731b);
                return;
            case 5:
                xi0.f(this.f29731b);
                return;
            default:
                this.f29731b.m();
                return;
        }
    }
}
