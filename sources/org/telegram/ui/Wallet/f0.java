package org.telegram.ui.Wallet;
public final class f0 {
    public String f36541a;
    public i0 f36542b;
    public byte[] f36543c;
    public final l0 d;

    public f0(l0 l0Var) {
        this.d = l0Var;
    }

    public final void a() {
        i0 i0Var = this.f36542b;
        this.f36542b = null;
        try {
            this.d.S(i0Var, false, new e0(this, 0));
        } finally {
            i0Var.close();
        }
    }
}
