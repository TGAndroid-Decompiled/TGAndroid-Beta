package org.telegram.ui.Components;
public final class yg0 implements Runnable {
    public final int f40613a;
    public final zg0 f40614b;

    public yg0(zg0 zg0Var, int i7) {
        this.f40613a = i7;
        this.f40614b = zg0Var;
    }

    @Override
    public final void run() {
        switch (this.f40613a) {
            case 0:
                zg0 zg0Var = this.f40614b;
                zg0Var.getClass();
                try {
                    bg.i iVar = zg0Var.B0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.h3(zg0Var.f40959z0);
                return;
            case 1:
                zg0 zg0Var2 = this.f40614b;
                zg0Var2.P = null;
                zg0Var2.p();
                return;
            case 2:
                zg0.h(this.f40614b);
                return;
            case 3:
                zg0.e(this.f40614b);
                return;
            case 4:
                zg0.d(this.f40614b);
                return;
            case 5:
                zg0.f(this.f40614b);
                return;
            default:
                this.f40614b.m();
                return;
        }
    }
}
