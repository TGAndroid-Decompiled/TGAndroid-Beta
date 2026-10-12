package org.telegram.ui.Wallet;
public final class d0 {
    public String f33033a;
    public g0 f33034b;
    public byte[] f33035c;
    public final j0 d;

    public d0(j0 j0Var) {
        this.d = j0Var;
    }

    public final void a() {
        g0 g0Var = this.f33034b;
        this.f33034b = null;
        try {
            this.d.R(g0Var, false, new c0(this, 0));
        } finally {
            g0Var.close();
        }
    }
}
