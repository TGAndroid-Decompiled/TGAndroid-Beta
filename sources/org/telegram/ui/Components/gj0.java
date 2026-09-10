package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class gj0 implements Runnable {
    public final int f23365a;
    public final hj0 f23366b;

    public gj0(hj0 hj0Var, int i10) {
        this.f23365a = i10;
        this.f23366b = hj0Var;
    }

    @Override
    public final void run() {
        switch (this.f23365a) {
            case 0:
                hj0 hj0Var = this.f23366b;
                hj0Var.getClass();
                try {
                    xf.e eVar = hj0Var.D0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(hj0Var.B0);
                return;
            case 1:
                hj0 hj0Var2 = this.f23366b;
                hj0Var2.Q = null;
                hj0Var2.p();
                return;
            case 2:
                hj0.h(this.f23366b);
                return;
            case 3:
                hj0.e(this.f23366b);
                return;
            case 4:
                hj0.d(this.f23366b);
                return;
            case 5:
                hj0.f(this.f23366b);
                return;
            default:
                this.f23366b.m();
                return;
        }
    }
}
