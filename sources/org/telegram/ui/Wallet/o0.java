package org.telegram.ui.Wallet;
public final class o0 {
    public String f44782a;
    public s0 f44783b;
    public byte[] f44784c;
    public final v0 d;

    public o0(v0 v0Var) {
        this.d = v0Var;
    }

    public final void a() {
        s0 s0Var = this.f44783b;
        this.f44783b = null;
        try {
            this.d.d0(s0Var, false, new n0(this, 0));
        } finally {
            s0Var.close();
        }
    }
}
