package org.telegram.ui.Components;
public final class bi0 implements Runnable {
    public final int f24842a;
    public final ci0 f24843b;

    public bi0(ci0 ci0Var, int i10) {
        this.f24842a = i10;
        this.f24843b = ci0Var;
    }

    @Override
    public final void run() {
        switch (this.f24842a) {
            case 0:
                ci0 ci0Var = this.f24843b;
                ci0Var.getClass();
                try {
                    rf.e eVar = ci0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.i0.g3(ci0Var.f25164z0);
                return;
            case 1:
                ci0 ci0Var2 = this.f24843b;
                ci0Var2.P = null;
                ci0Var2.p();
                return;
            case 2:
                ci0.h(this.f24843b);
                return;
            case 3:
                ci0.e(this.f24843b);
                return;
            case 4:
                ci0.d(this.f24843b);
                return;
            case 5:
                ci0.f(this.f24843b);
                return;
            default:
                this.f24843b.m();
                return;
        }
    }
}
