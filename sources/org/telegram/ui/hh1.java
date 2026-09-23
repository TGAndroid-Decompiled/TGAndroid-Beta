package org.telegram.ui;
public final class hh1 implements Runnable {
    public final int f33858a;
    public final ih1 f33859b;

    public hh1(ih1 ih1Var, int i10) {
        this.f33858a = i10;
        this.f33859b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f33858a) {
            case 0:
                org.telegram.ui.Components.x51 x51Var = this.f33859b.f30163a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.x51 x51Var2 = this.f33859b.f30163a;
                if (x51Var2 != null) {
                    x51Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
