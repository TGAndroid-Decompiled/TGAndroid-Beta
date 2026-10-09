package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class bk0 implements Runnable {
    public final int f25042a;
    public final ck0 f25043b;

    public bk0(ck0 ck0Var, int i10) {
        this.f25042a = i10;
        this.f25043b = ck0Var;
    }

    @Override
    public final void run() {
        switch (this.f25042a) {
            case 0:
                ck0 ck0Var = this.f25043b;
                ck0Var.getClass();
                try {
                    yf.e eVar = ck0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(ck0Var.f25429z0);
                return;
            case 1:
                ck0 ck0Var2 = this.f25043b;
                ck0Var2.P = null;
                ck0Var2.p();
                return;
            case 2:
                ck0.h(this.f25043b);
                return;
            case 3:
                ck0.e(this.f25043b);
                return;
            case 4:
                ck0.d(this.f25043b);
                return;
            case 5:
                ck0.f(this.f25043b);
                return;
            default:
                this.f25043b.m();
                return;
        }
    }
}
