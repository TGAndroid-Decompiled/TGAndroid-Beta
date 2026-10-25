package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wj0 implements Runnable {
    public final int f34466a;
    public final xj0 f34467b;

    public wj0(xj0 xj0Var, int i10) {
        this.f34466a = i10;
        this.f34467b = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f34466a) {
            case 0:
                xj0 xj0Var = this.f34467b;
                xj0Var.getClass();
                try {
                    ag.k kVar = xj0Var.B0;
                    if (kVar != null) {
                        kVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xj0Var.f34766z0);
                return;
            case 1:
                xj0 xj0Var2 = this.f34467b;
                xj0Var2.P = null;
                xj0Var2.p();
                return;
            case 2:
                xj0.h(this.f34467b);
                return;
            case 3:
                xj0.e(this.f34467b);
                return;
            case 4:
                xj0.d(this.f34467b);
                return;
            case 5:
                xj0.f(this.f34467b);
                return;
            default:
                this.f34467b.m();
                return;
        }
    }
}
