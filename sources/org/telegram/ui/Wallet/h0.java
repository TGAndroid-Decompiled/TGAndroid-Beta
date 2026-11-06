package org.telegram.ui.Wallet;
public final class h0 {
    public String f42546a;
    public k0 f42547b;
    public byte[] f42548c;
    public final n0 d;

    public h0(n0 n0Var) {
        this.d = n0Var;
    }

    public final void a() {
        k0 k0Var = this.f42547b;
        this.f42547b = null;
        try {
            this.d.U(k0Var, false, new g0(this, 0));
        } finally {
            k0Var.close();
        }
    }
}
