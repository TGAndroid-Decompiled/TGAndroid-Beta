package org.telegram.ui.Components;
public final class i1 implements Runnable {
    public final int f36057a;
    public final b5 f36058b;
    public final org.telegram.ui.ActionBar.t1 f36059c;
    public final org.telegram.ui.ActionBar.g2 d;

    public i1(b5 b5Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.f36057a = i7;
        this.f36058b = b5Var;
        this.f36059c = t1Var;
        this.d = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f36057a) {
            case 0:
                org.telegram.messenger.g0.g3(new i1(this.f36058b, this.f36059c, this.d, 1));
                return;
            default:
                c5.b0(this.f36058b, this.f36059c, this.d);
                return;
        }
    }
}
