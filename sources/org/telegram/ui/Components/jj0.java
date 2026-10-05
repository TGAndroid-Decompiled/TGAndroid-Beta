package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class jj0 implements Runnable {
    public final int f27871a;
    public final kj0 f27872b;

    public jj0(kj0 kj0Var, int i10) {
        this.f27871a = i10;
        this.f27872b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f27871a) {
            case 0:
                kj0 kj0Var = this.f27872b;
                kj0Var.getClass();
                try {
                    yf.e eVar = kj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(kj0Var.f28244z0);
                return;
            case 1:
                kj0 kj0Var2 = this.f27872b;
                kj0Var2.P = null;
                kj0Var2.p();
                return;
            case 2:
                kj0.h(this.f27872b);
                return;
            case 3:
                kj0.e(this.f27872b);
                return;
            case 4:
                kj0.d(this.f27872b);
                return;
            case 5:
                kj0.f(this.f27872b);
                return;
            default:
                this.f27872b.m();
                return;
        }
    }
}
