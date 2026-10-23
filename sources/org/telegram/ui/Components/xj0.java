package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xj0 implements Runnable {
    public final int f32588a;
    public final yj0 f32589b;

    public xj0(yj0 yj0Var, int i10) {
        this.f32588a = i10;
        this.f32589b = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f32588a) {
            case 0:
                yj0 yj0Var = this.f32589b;
                yj0Var.getClass();
                try {
                    zf.e eVar = yj0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                AndroidUtilities.runOnUIThread(yj0Var.f32966z0);
                return;
            case 1:
                yj0 yj0Var2 = this.f32589b;
                yj0Var2.P = null;
                yj0Var2.p();
                return;
            case 2:
                yj0.h(this.f32589b);
                return;
            case 3:
                yj0.e(this.f32589b);
                return;
            case 4:
                yj0.d(this.f32589b);
                return;
            case 5:
                yj0.f(this.f32589b);
                return;
            default:
                this.f32589b.m();
                return;
        }
    }
}
