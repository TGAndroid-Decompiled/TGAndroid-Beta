package org.telegram.ui.Wallet;
public final class a {
    public String a;
    public c35 b;
    public byte[] c;
    public final c d;

    public a(c cVar) {
        this.d = cVar;
    }

    public final void a() {
        c35 c35Var = this.b;
        this.b = null;
        try {
            this.d.e0(c35Var, false, new y25(this, (byte) 0));
        } finally {
            c35Var.close();
        }
    }
}
