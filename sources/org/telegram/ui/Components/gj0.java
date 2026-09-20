package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class gj0 implements Runnable {
    public final int f24379a;
    public final hj0 f24380b;

    public gj0(hj0 hj0Var, int i10) {
        this.f24379a = i10;
        this.f24380b = hj0Var;
    }

    @Override
    public final void run() {
        switch (this.f24379a) {
            case 0:
                hj0 hj0Var = this.f24380b;
                hj0Var.getClass();
                try {
                    yf.e eVar = hj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(hj0Var.f24711z0);
                return;
            case 1:
                hj0 hj0Var2 = this.f24380b;
                hj0Var2.P = null;
                hj0Var2.p();
                return;
            case 2:
                hj0.h(this.f24380b);
                return;
            case 3:
                hj0.e(this.f24380b);
                return;
            case 4:
                hj0.d(this.f24380b);
                return;
            case 5:
                hj0.f(this.f24380b);
                return;
            default:
                this.f24380b.m();
                return;
        }
    }
}
