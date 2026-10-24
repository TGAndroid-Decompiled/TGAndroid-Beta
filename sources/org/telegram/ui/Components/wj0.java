package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wj0 implements Runnable {
    public final int f32259a;
    public final xj0 f32260b;

    public wj0(xj0 xj0Var, int i10) {
        this.f32259a = i10;
        this.f32260b = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f32259a) {
            case 0:
                xj0 xj0Var = this.f32260b;
                xj0Var.getClass();
                try {
                    zf.e eVar = xj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(xj0Var.f32627z0);
                return;
            case 1:
                xj0 xj0Var2 = this.f32260b;
                xj0Var2.P = null;
                xj0Var2.p();
                return;
            case 2:
                xj0.h(this.f32260b);
                return;
            case 3:
                xj0.e(this.f32260b);
                return;
            case 4:
                xj0.d(this.f32260b);
                return;
            case 5:
                xj0.f(this.f32260b);
                return;
            default:
                this.f32260b.m();
                return;
        }
    }
}
