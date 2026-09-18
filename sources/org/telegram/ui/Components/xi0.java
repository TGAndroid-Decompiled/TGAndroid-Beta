package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xi0 implements Runnable {
    public final int f29918a;
    public final yi0 f29919b;

    public xi0(yi0 yi0Var, int i10) {
        this.f29918a = i10;
        this.f29919b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f29918a) {
            case 0:
                yi0 yi0Var = this.f29919b;
                yi0Var.getClass();
                try {
                    yf.e eVar = yi0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(yi0Var.f30255z0);
                return;
            case 1:
                yi0 yi0Var2 = this.f29919b;
                yi0Var2.P = null;
                yi0Var2.p();
                return;
            case 2:
                yi0.h(this.f29919b);
                return;
            case 3:
                yi0.e(this.f29919b);
                return;
            case 4:
                yi0.d(this.f29919b);
                return;
            case 5:
                yi0.f(this.f29919b);
                return;
            default:
                this.f29919b.m();
                return;
        }
    }
}
