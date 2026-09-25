package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class hj0 implements Runnable {
    public final int f24793a;
    public final ij0 f24794b;

    public hj0(ij0 ij0Var, int i10) {
        this.f24793a = i10;
        this.f24794b = ij0Var;
    }

    @Override
    public final void run() {
        switch (this.f24793a) {
            case 0:
                ij0 ij0Var = this.f24794b;
                ij0Var.getClass();
                try {
                    yf.e eVar = ij0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(ij0Var.f25102z0);
                return;
            case 1:
                ij0 ij0Var2 = this.f24794b;
                ij0Var2.P = null;
                ij0Var2.p();
                return;
            case 2:
                ij0.h(this.f24794b);
                return;
            case 3:
                ij0.e(this.f24794b);
                return;
            case 4:
                ij0.d(this.f24794b);
                return;
            case 5:
                ij0.f(this.f24794b);
                return;
            default:
                this.f24794b.m();
                return;
        }
    }
}
