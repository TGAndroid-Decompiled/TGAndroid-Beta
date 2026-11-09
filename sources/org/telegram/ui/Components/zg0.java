package org.telegram.ui.Components;
public final class zg0 implements Runnable {
    public final int f40982a;
    public final ah0 f40983b;

    public zg0(ah0 ah0Var, int i7) {
        this.f40982a = i7;
        this.f40983b = ah0Var;
    }

    @Override
    public final void run() {
        switch (this.f40982a) {
            case 0:
                ah0 ah0Var = this.f40983b;
                ah0Var.getClass();
                try {
                    bg.i iVar = ah0Var.B0;
                    if (iVar != null) {
                        iVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.h3(ah0Var.f31854z0);
                return;
            case 1:
                ah0 ah0Var2 = this.f40983b;
                ah0Var2.P = null;
                ah0Var2.p();
                return;
            case 2:
                ah0.h(this.f40983b);
                return;
            case 3:
                ah0.e(this.f40983b);
                return;
            case 4:
                ah0.d(this.f40983b);
                return;
            case 5:
                ah0.f(this.f40983b);
                return;
            default:
                this.f40983b.m();
                return;
        }
    }
}
