package org.telegram.ui.Components;
public final class h1 implements Runnable {
    public final int f35607a;
    public final a5 f35608b;
    public final org.telegram.ui.ActionBar.t1 f35609c;
    public final org.telegram.ui.ActionBar.g2 d;

    public h1(a5 a5Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.f35607a = i7;
        this.f35608b = a5Var;
        this.f35609c = t1Var;
        this.d = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f35607a) {
            case 0:
                org.telegram.messenger.g0.g3(new h1(this.f35608b, this.f35609c, this.d, 1));
                return;
            default:
                b5.b0(this.f35608b, this.f35609c, this.d);
                return;
        }
    }
}
