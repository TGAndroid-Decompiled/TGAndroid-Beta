package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f31264a;
    public final yj0 f31265b;

    public xj0(yj0 yj0Var, int i10) {
        this.f31264a = i10;
        this.f31265b = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31264a) {
            case 0:
                yj0 yj0Var = this.f31265b;
                yj0Var.getClass();
                try {
                    zf.f fVar = yj0Var.B0;
                    if (fVar != null) {
                        fVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(yj0Var.f31635z0);
                return;
            case 1:
                yj0 yj0Var2 = this.f31265b;
                yj0Var2.P = null;
                yj0Var2.p();
                return;
            case 2:
                yj0.h(this.f31265b);
                return;
            case 3:
                yj0.e(this.f31265b);
                return;
            case 4:
                yj0.d(this.f31265b);
                return;
            case 5:
                yj0.f(this.f31265b);
                return;
            default:
                this.f31265b.m();
                return;
        }
    }
}
