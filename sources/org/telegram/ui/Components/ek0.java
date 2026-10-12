package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ek0 implements Runnable {
    public final int f25722a;
    public final fk0 f25723b;

    public ek0(fk0 fk0Var, int i10) {
        this.f25722a = i10;
        this.f25723b = fk0Var;
    }

    @Override
    public final void run() {
        switch (this.f25722a) {
            case 0:
                fk0 fk0Var = this.f25723b;
                fk0Var.getClass();
                try {
                    yf.e eVar = fk0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(fk0Var.f26137z0);
                return;
            case 1:
                fk0 fk0Var2 = this.f25723b;
                fk0Var2.P = null;
                fk0Var2.p();
                return;
            case 2:
                fk0.h(this.f25723b);
                return;
            case 3:
                fk0.e(this.f25723b);
                return;
            case 4:
                fk0.d(this.f25723b);
                return;
            case 5:
                fk0.f(this.f25723b);
                return;
            default:
                this.f25723b.m();
                return;
        }
    }
}
