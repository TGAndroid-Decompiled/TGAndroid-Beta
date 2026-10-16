package org.telegram.ui.Wallet;
public final class e0 {
    public String f32810a;
    public h0 f32811b;
    public byte[] f32812c;
    public final k0 d;

    public e0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a() {
        h0 h0Var = this.f32811b;
        this.f32811b = null;
        try {
            this.d.R(h0Var, false, new d0(this, 0));
        } finally {
            h0Var.close();
        }
    }
}
