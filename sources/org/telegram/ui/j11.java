package org.telegram.ui;
public final class j11 implements Runnable {
    public final int f40392a;
    public final l11 f40393b;
    public final int f40394c;

    public j11(l11 l11Var, int i10, int i11) {
        this.f40392a = i11;
        this.f40393b = l11Var;
        this.f40394c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40392a) {
            case 0:
                l11 l11Var = this.f40393b;
                org.telegram.ui.Components.t91 t91Var = l11Var.f41112b;
                k11 k11Var = l11Var.d;
                int i10 = this.f40394c;
                t91Var.d(i10, k11Var.i(i10));
                return;
            default:
                l11 l11Var2 = this.f40393b;
                org.telegram.ui.Components.t91 t91Var2 = l11Var2.f41112b;
                k11 k11Var2 = l11Var2.d;
                int i11 = this.f40394c;
                t91Var2.d(i11, k11Var2.i(i11));
                return;
        }
    }
}
