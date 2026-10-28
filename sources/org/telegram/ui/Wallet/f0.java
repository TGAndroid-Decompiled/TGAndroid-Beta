package org.telegram.ui.Wallet;
public final class f0 {
    public String f36559a;
    public i0 f36560b;
    public byte[] f36561c;
    public final l0 d;

    public f0(l0 l0Var) {
        this.d = l0Var;
    }

    public final void a() {
        i0 i0Var = this.f36560b;
        this.f36560b = null;
        try {
            this.d.U(i0Var, false, new e0(this, 0));
        } finally {
            i0Var.close();
        }
    }
}
