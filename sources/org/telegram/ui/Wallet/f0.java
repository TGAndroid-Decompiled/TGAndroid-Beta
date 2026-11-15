package org.telegram.ui.Wallet;
public final class f0 {
    public String f43815a;
    public i0 f43816b;
    public byte[] f43817c;
    public final l0 d;

    public f0(l0 l0Var) {
        this.d = l0Var;
    }

    public final void a() {
        i0 i0Var = this.f43816b;
        this.f43816b = null;
        try {
            this.d.U(i0Var, false, new e0(this, 0));
        } finally {
            i0Var.close();
        }
    }
}
