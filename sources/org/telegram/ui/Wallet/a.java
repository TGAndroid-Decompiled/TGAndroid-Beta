package org.telegram.ui.Wallet;
public final class a {
    public String a;
    public y25 b;
    public byte[] c;
    public final c d;

    public a(c cVar) {
        this.d = cVar;
    }

    public final void a() {
        y25 y25Var = this.b;
        this.b = null;
        try {
            this.d.c0(y25Var, false, new u25(this, (byte) 0));
        } finally {
            y25Var.close();
        }
    }
}
