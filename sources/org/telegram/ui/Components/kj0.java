package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class kj0 implements Runnable {
    public final int f25777a;
    public final lj0 f25778b;

    public kj0(lj0 lj0Var, int i10) {
        this.f25777a = i10;
        this.f25778b = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f25777a) {
            case 0:
                lj0 lj0Var = this.f25778b;
                lj0Var.getClass();
                try {
                    yf.e eVar = lj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(lj0Var.f26041z0);
                return;
            case 1:
                lj0 lj0Var2 = this.f25778b;
                lj0Var2.P = null;
                lj0Var2.p();
                return;
            case 2:
                lj0.h(this.f25778b);
                return;
            case 3:
                lj0.e(this.f25778b);
                return;
            case 4:
                lj0.d(this.f25778b);
                return;
            case 5:
                lj0.f(this.f25778b);
                return;
            default:
                this.f25778b.m();
                return;
        }
    }
}
