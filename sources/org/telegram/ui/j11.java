package org.telegram.ui;
public final class j11 implements Runnable {
    public final int f40389a;
    public final l11 f40390b;
    public final int f40391c;

    public j11(l11 l11Var, int i10, int i11) {
        this.f40389a = i11;
        this.f40390b = l11Var;
        this.f40391c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40389a) {
            case 0:
                l11 l11Var = this.f40390b;
                org.telegram.ui.Components.t91 t91Var = l11Var.f41109b;
                k11 k11Var = l11Var.d;
                int i10 = this.f40391c;
                t91Var.d(i10, k11Var.i(i10));
                return;
            default:
                l11 l11Var2 = this.f40390b;
                org.telegram.ui.Components.t91 t91Var2 = l11Var2.f41109b;
                k11 k11Var2 = l11Var2.d;
                int i11 = this.f40391c;
                t91Var2.d(i11, k11Var2.i(i11));
                return;
        }
    }
}
