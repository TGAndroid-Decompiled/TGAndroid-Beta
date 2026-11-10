package org.telegram.ui.Components;
public final class yg0 implements Runnable {
    public final int f40578a;
    public final zg0 f40579b;

    public yg0(zg0 zg0Var, int i7) {
        this.f40578a = i7;
        this.f40579b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f40578a) {
            case 0:
                zg0 zg0Var = this.f40579b;
                zg0Var.getClass();
                try {
                    bg.i iVar = zg0Var.B0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.h3(zg0Var.f40996z0);
                return;
            case 1:
                zg0 zg0Var2 = this.f40579b;
                zg0Var2.P = null;
                zg0Var2.p();
                return;
            case 2:
                zg0.h(this.f40579b);
                return;
            case 3:
                zg0.e(this.f40579b);
                return;
            case 4:
                zg0.d(this.f40579b);
                return;
            case 5:
                zg0.f(this.f40579b);
                return;
            default:
                this.f40579b.m();
                return;
        }
    }
}
