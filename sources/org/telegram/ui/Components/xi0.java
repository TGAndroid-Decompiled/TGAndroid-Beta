package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xi0 implements Runnable {
    public final int f29915a;
    public final yi0 f29916b;

    public xi0(yi0 yi0Var, int i10) {
        this.f29915a = i10;
        this.f29916b = yi0Var;
    }

    @Override
    public final void run() {
        switch (this.f29915a) {
            case 0:
                yi0 yi0Var = this.f29916b;
                yi0Var.getClass();
                try {
                    yf.e eVar = yi0Var.D0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(yi0Var.B0);
                return;
            case 1:
                yi0 yi0Var2 = this.f29916b;
                yi0Var2.Q = null;
                yi0Var2.p();
                return;
            case 2:
                yi0.h(this.f29916b);
                return;
            case 3:
                yi0.e(this.f29916b);
                return;
            case 4:
                yi0.d(this.f29916b);
                return;
            case 5:
                yi0.f(this.f29916b);
                return;
            default:
                this.f29916b.m();
                return;
        }
    }
}
