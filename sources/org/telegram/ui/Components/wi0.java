package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wi0 implements Runnable {
    public final int f32299a;
    public final xi0 f32300b;

    public wi0(xi0 xi0Var, int i10) {
        this.f32299a = i10;
        this.f32300b = xi0Var;
    }

    @Override
    public final void run() {
        switch (this.f32299a) {
            case 0:
                xi0 xi0Var = this.f32300b;
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
                xi0 xi0Var2 = this.f32300b;
                xi0Var2.Q = null;
                xi0Var2.n();
                return;
            case 2:
                xi0.h(this.f32300b);
                return;
            case 3:
                xi0.e(this.f32300b);
                return;
            case 4:
                xi0.d(this.f32300b);
                return;
            case 5:
                xi0.f(this.f32300b);
                return;
            default:
                this.f32300b.k();
                return;
        }
    }
}
