package org.telegram.ui;
public final class h11 implements Runnable {
    public final int f37304a;
    public final m11 f37305b;
    public final int f37306c;

    public h11(m11 m11Var, int i10, int i11) {
        this.f37304a = i11;
        this.f37305b = m11Var;
        this.f37306c = i10;
    }

    @Override
    public final void run() {
        switch (this.f37304a) {
            case 0:
                m11 m11Var = this.f37305b;
                org.telegram.ui.Components.l81 l81Var = m11Var.f38931n;
                l11 l11Var = m11Var.f38933s;
                int i10 = this.f37306c;
                l81Var.d(i10, l11Var.i(i10));
                return;
            default:
                m11 m11Var2 = this.f37305b;
                org.telegram.ui.Components.l81 l81Var2 = m11Var2.f38931n;
                l11 l11Var2 = m11Var2.f38933s;
                int i11 = this.f37306c;
                l81Var2.d(i11, l11Var2.i(i11));
                return;
        }
    }
}
