package org.telegram.ui.Wallet;
public final class f0 {
    public String f34882a;
    public i0 f34883b;
    public byte[] f34884c;
    public final l0 d;

    public f0(l0 l0Var) {
        this.d = l0Var;
    }

    public final void a() {
        i0 i0Var = this.f34883b;
        this.f34883b = null;
        try {
            this.d.R(i0Var, false, new e0(this, 0));
        } finally {
            i0Var.close();
        }
    }
}
