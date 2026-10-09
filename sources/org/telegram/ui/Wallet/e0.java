package org.telegram.ui.Wallet;
public final class e0 {
    public String f34846a;
    public h0 f34847b;
    public byte[] f34848c;
    public final k0 d;

    public e0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a() {
        h0 h0Var = this.f34847b;
        this.f34847b = null;
        try {
            this.d.R(h0Var, false, new d0(this, 0));
        } finally {
            h0Var.close();
        }
    }
}
