package org.telegram.ui.Wallet;
public final class f0 {
    public String f34476a;
    public i0 f34477b;
    public byte[] f34478c;
    public final l0 d;

    public f0(l0 l0Var) {
        this.d = l0Var;
    }

    public final void a() {
        i0 i0Var = this.f34477b;
        this.f34477b = null;
        try {
            this.d.S(i0Var, false, new e0(this, 0));
        } finally {
            i0Var.close();
        }
    }
}
