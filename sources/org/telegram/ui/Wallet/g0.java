package org.telegram.ui.Wallet;
public final class g0 {
    public String f42517a;
    public j0 f42518b;
    public byte[] f42519c;
    public final m0 d;

    public g0(m0 m0Var) {
        this.d = m0Var;
    }

    public final void a() {
        j0 j0Var = this.f42518b;
        this.f42518b = null;
        try {
            this.d.U(j0Var, false, new f0(this, 0));
        } finally {
            j0Var.close();
        }
    }
}
