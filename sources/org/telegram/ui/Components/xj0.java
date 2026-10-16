package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f30940a;
    public final yj0 f30941b;

    public xj0(yj0 yj0Var, int i10) {
        this.f30940a = i10;
        this.f30941b = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f30940a) {
            case 0:
                yj0 yj0Var = this.f30941b;
                yj0Var.getClass();
                try {
                    zf.f fVar = yj0Var.B0;
                    if (fVar != null) {
                        fVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(yj0Var.f31318z0);
                return;
            case 1:
                yj0 yj0Var2 = this.f30941b;
                yj0Var2.P = null;
                yj0Var2.p();
                return;
            case 2:
                yj0.h(this.f30941b);
                return;
            case 3:
                yj0.e(this.f30941b);
                return;
            case 4:
                yj0.d(this.f30941b);
                return;
            case 5:
                yj0.f(this.f30941b);
                return;
            default:
                this.f30941b.m();
                return;
        }
    }
}
