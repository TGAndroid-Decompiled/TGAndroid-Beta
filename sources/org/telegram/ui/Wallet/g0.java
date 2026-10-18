package org.telegram.ui.Wallet;
public final class g0 {
    public String f34258a;
    public j0 f34259b;
    public byte[] f34260c;
    public final m0 d;

    public g0(m0 m0Var) {
        this.d = m0Var;
    }

    public final void a() {
        j0 j0Var = this.f34259b;
        this.f34259b = null;
        try {
            this.d.S(j0Var, false, new f0(this, 0));
        } finally {
            j0Var.close();
        }
    }
}
