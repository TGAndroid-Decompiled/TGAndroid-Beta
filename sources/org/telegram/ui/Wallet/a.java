package org.telegram.ui.Wallet;
public final class a {
    public String a;
    public y05 b;
    public byte[] c;
    public final c d;

    public a(c cVar) {
        this.d = cVar;
    }

    public final void a() {
        y05 y05Var = this.b;
        this.b = null;
        try {
            this.d.c0(y05Var, false, new u05(this, (byte) 0));
        } finally {
            y05Var.close();
        }
    }
}
