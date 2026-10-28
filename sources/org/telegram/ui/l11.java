package org.telegram.ui;
public final class l11 implements Runnable {
    public final int f40953a;
    public final n11 f40954b;
    public final int f40955c;

    public l11(n11 n11Var, int i10, int i11) {
        this.f40953a = i11;
        this.f40954b = n11Var;
        this.f40955c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40953a) {
            case 0:
                n11 n11Var = this.f40954b;
                org.telegram.ui.Components.u91 u91Var = n11Var.f41609b;
                m11 m11Var = n11Var.d;
                int i10 = this.f40955c;
                u91Var.d(i10, m11Var.i(i10));
                return;
            default:
                n11 n11Var2 = this.f40954b;
                org.telegram.ui.Components.u91 u91Var2 = n11Var2.f41609b;
                m11 m11Var2 = n11Var2.d;
                int i11 = this.f40955c;
                u91Var2.d(i11, m11Var2.i(i11));
                return;
        }
    }
}
