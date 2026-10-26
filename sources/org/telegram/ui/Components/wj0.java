package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wj0 implements Runnable {
    public final int f34469a;
    public final xj0 f34470b;

    public wj0(xj0 xj0Var, int i10) {
        this.f34469a = i10;
        this.f34470b = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f34469a) {
            case 0:
                xj0 xj0Var = this.f34470b;
                xj0Var.getClass();
                try {
                    ag.k kVar = xj0Var.B0;
                    if (kVar != null) {
                        kVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xj0Var.f34769z0);
                return;
            case 1:
                xj0 xj0Var2 = this.f34470b;
                xj0Var2.P = null;
                xj0Var2.p();
                return;
            case 2:
                xj0.h(this.f34470b);
                return;
            case 3:
                xj0.e(this.f34470b);
                return;
            case 4:
                xj0.d(this.f34470b);
                return;
            case 5:
                xj0.f(this.f34470b);
                return;
            default:
                this.f34470b.m();
                return;
        }
    }
}
