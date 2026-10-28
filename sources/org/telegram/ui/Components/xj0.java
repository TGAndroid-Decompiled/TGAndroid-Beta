package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f34788a;
    public final yj0 f34789b;

    public xj0(yj0 yj0Var, int i10) {
        this.f34788a = i10;
        this.f34789b = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f34788a) {
            case 0:
                yj0 yj0Var = this.f34789b;
                yj0Var.getClass();
                try {
                    ag.k kVar = yj0Var.B0;
                    if (kVar != null) {
                        kVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(yj0Var.f35100z0);
                return;
            case 1:
                yj0 yj0Var2 = this.f34789b;
                yj0Var2.P = null;
                yj0Var2.p();
                return;
            case 2:
                yj0.h(this.f34789b);
                return;
            case 3:
                yj0.e(this.f34789b);
                return;
            case 4:
                yj0.d(this.f34789b);
                return;
            case 5:
                yj0.f(this.f34789b);
                return;
            default:
                this.f34789b.m();
                return;
        }
    }
}
