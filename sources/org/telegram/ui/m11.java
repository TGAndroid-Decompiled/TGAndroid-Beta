package org.telegram.ui;
public final class m11 implements Runnable {
    public final int f35955a;
    public final q11 f35956b;
    public final int f35957c;

    public m11(q11 q11Var, int i10, int i11) {
        this.f35955a = i11;
        this.f35956b = q11Var;
        this.f35957c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35955a) {
            case 0:
                q11 q11Var = this.f35956b;
                org.telegram.ui.Components.k81 k81Var = q11Var.f37277n;
                p11 p11Var = q11Var.f37279s;
                int i10 = this.f35957c;
                k81Var.d(i10, p11Var.i(i10));
                return;
            default:
                q11 q11Var2 = this.f35956b;
                org.telegram.ui.Components.k81 k81Var2 = q11Var2.f37277n;
                p11 p11Var2 = q11Var2.f37279s;
                int i11 = this.f35957c;
                k81Var2.d(i11, p11Var2.i(i11));
                return;
        }
    }
}
