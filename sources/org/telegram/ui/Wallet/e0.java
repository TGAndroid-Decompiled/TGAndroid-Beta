package org.telegram.ui.Wallet;
public final class e0 {
    public String f34437a;
    public h0 f34438b;
    public byte[] f34439c;
    public final k0 d;

    public e0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a() {
        h0 h0Var = this.f34438b;
        this.f34438b = null;
        try {
            this.d.U(h0Var, false, new d0(this, 0));
        } finally {
            h0Var.close();
        }
    }
}
