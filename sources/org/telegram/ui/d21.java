package org.telegram.ui;
public final class d21 implements Runnable {
    public final int f31811a;
    public final h21 f31812b;
    public final int f31813c;

    public d21(h21 h21Var, int i10, int i11) {
        this.f31811a = i11;
        this.f31812b = h21Var;
        this.f31813c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31811a) {
            case 0:
                h21 h21Var = this.f31812b;
                org.telegram.ui.Components.u81 u81Var = h21Var.f33250n;
                g21 g21Var = h21Var.f33252s;
                int i10 = this.f31813c;
                u81Var.d(i10, g21Var.i(i10));
                return;
            default:
                h21 h21Var2 = this.f31812b;
                org.telegram.ui.Components.u81 u81Var2 = h21Var2.f33250n;
                g21 g21Var2 = h21Var2.f33252s;
                int i11 = this.f31813c;
                u81Var2.d(i11, g21Var2.i(i11));
                return;
        }
    }
}
