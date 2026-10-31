package org.telegram.ui.Components;
public final class ai0 implements Runnable {
    public final int f24416a;
    public final bi0 f24417b;

    public ai0(bi0 bi0Var, int i10) {
        this.f24416a = i10;
        this.f24417b = bi0Var;
    }

    @Override
    public final void run() {
        switch (this.f24416a) {
            case 0:
                bi0 bi0Var = this.f24417b;
                bi0Var.getClass();
                try {
                    rf.e eVar = bi0Var.B0;
                    if (eVar != null) {
                        eVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.i0.g3(bi0Var.f24785z0);
                return;
            case 1:
                bi0 bi0Var2 = this.f24417b;
                bi0Var2.P = null;
                bi0Var2.p();
                return;
            case 2:
                bi0.h(this.f24417b);
                return;
            case 3:
                bi0.e(this.f24417b);
                return;
            case 4:
                bi0.d(this.f24417b);
                return;
            case 5:
                bi0.f(this.f24417b);
                return;
            default:
                this.f24417b.m();
                return;
        }
    }
}
