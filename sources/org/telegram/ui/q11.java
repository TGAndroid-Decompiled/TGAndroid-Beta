package org.telegram.ui;
public final class q11 implements Runnable {
    public final int f36599a;
    public final t11 f36600b;
    public final int f36601c;

    public q11(t11 t11Var, int i10, int i11) {
        this.f36599a = i11;
        this.f36600b = t11Var;
        this.f36601c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36599a) {
            case 0:
                t11 t11Var = this.f36600b;
                org.telegram.ui.Components.x81 x81Var = t11Var.f37625n;
                s11 s11Var = t11Var.f37627s;
                int i10 = this.f36601c;
                x81Var.d(i10, s11Var.i(i10));
                return;
            default:
                t11 t11Var2 = this.f36600b;
                org.telegram.ui.Components.x81 x81Var2 = t11Var2.f37625n;
                s11 s11Var2 = t11Var2.f37627s;
                int i11 = this.f36601c;
                x81Var2.d(i11, s11Var2.i(i11));
                return;
        }
    }
}
