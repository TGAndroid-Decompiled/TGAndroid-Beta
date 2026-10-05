package org.telegram.ui;
public final class q11 implements Runnable {
    public final int f39664a;
    public final t11 f39665b;
    public final int f39666c;

    public q11(t11 t11Var, int i10, int i11) {
        this.f39664a = i11;
        this.f39665b = t11Var;
        this.f39666c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39664a) {
            case 0:
                t11 t11Var = this.f39665b;
                org.telegram.ui.Components.g91 g91Var = t11Var.f40686n;
                s11 s11Var = t11Var.f40688s;
                int i10 = this.f39666c;
                g91Var.d(i10, s11Var.i(i10));
                return;
            default:
                t11 t11Var2 = this.f39665b;
                org.telegram.ui.Components.g91 g91Var2 = t11Var2.f40686n;
                s11 s11Var2 = t11Var2.f40688s;
                int i11 = this.f39666c;
                g91Var2.d(i11, s11Var2.i(i11));
                return;
        }
    }
}
