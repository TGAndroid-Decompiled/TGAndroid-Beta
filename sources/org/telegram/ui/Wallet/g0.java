package org.telegram.ui.Wallet;
public final class g0 {
    public String f34227a;
    public j0 f34228b;
    public byte[] f34229c;
    public final m0 d;

    public g0(m0 m0Var) {
        this.d = m0Var;
    }

    public final void a() {
        j0 j0Var = this.f34228b;
        this.f34228b = null;
        try {
            this.d.S(j0Var, false, new f0(this, 0));
        } finally {
            j0Var.close();
        }
    }
}
