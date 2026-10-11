package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class dk0 implements Runnable {
    public final int f25624a;
    public final ek0 f25625b;

    public dk0(ek0 ek0Var, int i10) {
        this.f25624a = i10;
        this.f25625b = ek0Var;
    }

    @Override
    public final void run() {
        switch (this.f25624a) {
            case 0:
                ek0 ek0Var = this.f25625b;
                ek0Var.getClass();
                try {
                    yf.e eVar = ek0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(ek0Var.f26071z0);
                return;
            case 1:
                ek0 ek0Var2 = this.f25625b;
                ek0Var2.P = null;
                ek0Var2.p();
                return;
            case 2:
                ek0.h(this.f25625b);
                return;
            case 3:
                ek0.e(this.f25625b);
                return;
            case 4:
                ek0.d(this.f25625b);
                return;
            case 5:
                ek0.f(this.f25625b);
                return;
            default:
                this.f25625b.m();
                return;
        }
    }
}
