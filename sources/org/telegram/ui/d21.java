package org.telegram.ui;
public final class d21 implements Runnable {
    public final int f34852a;
    public final h21 f34853b;
    public final int f34854c;

    public d21(h21 h21Var, int i10, int i11) {
        this.f34852a = i11;
        this.f34853b = h21Var;
        this.f34854c = i10;
    }

    @Override
    public final void run() {
        switch (this.f34852a) {
            case 0:
                h21 h21Var = this.f34853b;
                org.telegram.ui.Components.k91 k91Var = h21Var.f36375n;
                g21 g21Var = h21Var.f36377s;
                int i10 = this.f34854c;
                k91Var.d(i10, g21Var.i(i10));
                return;
            default:
                h21 h21Var2 = this.f34853b;
                org.telegram.ui.Components.k91 k91Var2 = h21Var2.f36375n;
                g21 g21Var2 = h21Var2.f36377s;
                int i11 = this.f34854c;
                k91Var2.d(i11, g21Var2.i(i11));
                return;
        }
    }
}
