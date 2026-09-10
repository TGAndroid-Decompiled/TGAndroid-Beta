package org.telegram.ui.Components;
public final class a00 implements Runnable {
    public final int f21331a;
    public final boolean f21332b;
    public final boolean f21333c;
    public final boolean d;
    public final Object e;

    public a00(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f21331a = i10;
        this.e = obj;
        this.f21332b = z10;
        this.f21333c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f21331a) {
            case 0:
                c00 c00Var = (c00) this.e;
                if (this.f21332b) {
                    g00 g00Var = c00Var.J;
                    g00Var.f23136a = true;
                    g00Var.f23139b = true;
                }
                if (this.f21333c) {
                    c00Var.f21943x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(c00Var.f21932a0 - currentTimeMillis) > 30) {
                    c00Var.f21932a0 = currentTimeMillis;
                    c00Var.f21937d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.xg0) this.e).w1(this.f21332b, this.f21333c, this.d);
                return;
        }
    }
}
