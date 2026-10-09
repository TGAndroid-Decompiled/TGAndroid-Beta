package org.telegram.ui.Wallet;
public final class e0 {
    public String f34824a;
    public h0 f34825b;
    public byte[] f34826c;
    public final k0 d;

    public e0(k0 k0Var) {
        this.d = k0Var;
    }

    public final void a() {
        h0 h0Var = this.f34825b;
        this.f34825b = null;
        try {
            this.d.R(h0Var, false, new d0(this, 0));
        } finally {
            h0Var.close();
        }
    }
}
