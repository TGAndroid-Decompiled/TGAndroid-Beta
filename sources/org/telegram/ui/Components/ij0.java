package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ij0 implements Runnable {
    public final int f25115a;
    public final jj0 f25116b;

    public ij0(jj0 jj0Var, int i10) {
        this.f25115a = i10;
        this.f25116b = jj0Var;
    }

    @Override
    public final void run() {
        switch (this.f25115a) {
            case 0:
                jj0 jj0Var = this.f25116b;
                jj0Var.getClass();
                try {
                    yf.e eVar = jj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(jj0Var.f25455z0);
                return;
            case 1:
                jj0 jj0Var2 = this.f25116b;
                jj0Var2.P = null;
                jj0Var2.p();
                return;
            case 2:
                jj0.h(this.f25116b);
                return;
            case 3:
                jj0.e(this.f25116b);
                return;
            case 4:
                jj0.d(this.f25116b);
                return;
            case 5:
                jj0.f(this.f25116b);
                return;
            default:
                this.f25116b.m();
                return;
        }
    }
}
