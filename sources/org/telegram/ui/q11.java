package org.telegram.ui;
public final class q11 implements Runnable {
    public final int f39580a;
    public final t11 f39581b;
    public final int f39582c;

    public q11(t11 t11Var, int i10, int i11) {
        this.f39580a = i11;
        this.f39581b = t11Var;
        this.f39582c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39580a) {
            case 0:
                t11 t11Var = this.f39581b;
                org.telegram.ui.Components.f91 f91Var = t11Var.f40674n;
                s11 s11Var = t11Var.f40676s;
                int i10 = this.f39582c;
                f91Var.d(i10, s11Var.i(i10));
                return;
            default:
                t11 t11Var2 = this.f39581b;
                org.telegram.ui.Components.f91 f91Var2 = t11Var2.f40674n;
                s11 s11Var2 = t11Var2.f40676s;
                int i11 = this.f39582c;
                f91Var2.d(i11, s11Var2.i(i11));
                return;
        }
    }
}
