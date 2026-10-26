package org.telegram.ui.Wallet;
public final class f0 {
    public String f36544a;
    public i0 f36545b;
    public byte[] f36546c;
    public final l0 d;

    public f0(l0 l0Var) {
        this.d = l0Var;
    }

    public final void a() {
        i0 i0Var = this.f36545b;
        this.f36545b = null;
        try {
            this.d.S(i0Var, false, new e0(this, 0));
        } finally {
            i0Var.close();
        }
    }
}
