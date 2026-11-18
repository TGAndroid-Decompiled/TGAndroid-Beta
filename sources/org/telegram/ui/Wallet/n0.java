package org.telegram.ui.Wallet;
public final class n0 {
    public String f44606a;
    public r0 f44607b;
    public byte[] f44608c;
    public final u0 d;

    public n0(u0 u0Var) {
        this.d = u0Var;
    }

    public final void a() {
        r0 r0Var = this.f44607b;
        this.f44607b = null;
        try {
            this.d.d0(r0Var, false, new m0(this, 0));
        } finally {
            r0Var.close();
        }
    }
}
