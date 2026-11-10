package org.telegram.ui.Components;
public final class y0 implements Runnable {
    public final int f40450a;
    public final t4 f40451b;
    public final org.telegram.ui.ActionBar.u1 f40452c;
    public final org.telegram.ui.ActionBar.f2 d;

    public y0(t4 t4Var, org.telegram.ui.ActionBar.u1 u1Var, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.f40450a = i7;
        this.f40451b = t4Var;
        this.f40452c = u1Var;
        this.d = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f40450a) {
            case 0:
                org.telegram.messenger.g0.h3(new y0(this.f40451b, this.f40452c, this.d, 1));
                return;
            default:
                u4.b0(this.f40451b, this.f40452c, this.d);
                return;
        }
    }
}
