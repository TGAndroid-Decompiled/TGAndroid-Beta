package org.telegram.ui.Wallet;
public final class e0 {
    public String f42448a;
    public h0 f42449b;
    public byte[] f42450c;
    public final k0 d;

    public e0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a() {
        h0 h0Var = this.f42449b;
        this.f42449b = null;
        try {
            this.d.U(h0Var, false, new d0(this, 0));
        } finally {
            h0Var.close();
        }
    }
}
