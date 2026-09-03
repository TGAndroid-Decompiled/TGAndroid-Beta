package org.telegram.ui;
public final class l11 implements Runnable {
    public final int f38466a;
    public final q11 f38467b;
    public final int f38468c;

    public l11(q11 q11Var, int i10, int i11) {
        this.f38466a = i11;
        this.f38467b = q11Var;
        this.f38468c = i10;
    }

    @Override
    public final void run() {
        switch (this.f38466a) {
            case 0:
                q11 q11Var = this.f38467b;
                org.telegram.ui.Components.k81 k81Var = q11Var.f40297n;
                p11 p11Var = q11Var.f40299s;
                int i10 = this.f38468c;
                k81Var.d(i10, p11Var.i(i10));
                return;
            default:
                q11 q11Var2 = this.f38467b;
                org.telegram.ui.Components.k81 k81Var2 = q11Var2.f40297n;
                p11 p11Var2 = q11Var2.f40299s;
                int i11 = this.f38468c;
                k81Var2.d(i11, p11Var2.i(i11));
                return;
        }
    }
}
