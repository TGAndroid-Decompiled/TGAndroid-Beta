package org.telegram.ui;
public final class d11 implements Runnable {
    public final int f36446a;
    public final h11 f36447b;
    public final int f36448c;

    public d11(h11 h11Var, int i10, int i11) {
        this.f36446a = i11;
        this.f36447b = h11Var;
        this.f36448c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36446a) {
            case 0:
                h11 h11Var = this.f36447b;
                org.telegram.ui.Components.k91 k91Var = h11Var.f37714n;
                g11 g11Var = h11Var.f37716s;
                int i10 = this.f36448c;
                k91Var.d(i10, g11Var.i(i10));
                return;
            default:
                h11 h11Var2 = this.f36447b;
                org.telegram.ui.Components.k91 k91Var2 = h11Var2.f37714n;
                g11 g11Var2 = h11Var2.f37716s;
                int i11 = this.f36448c;
                k91Var2.d(i11, g11Var2.i(i11));
                return;
        }
    }
}
