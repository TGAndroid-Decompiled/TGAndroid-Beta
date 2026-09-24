package org.telegram.ui;
public final class hh1 implements Runnable {
    public final int f34214a;
    public final ih1 f34215b;

    public hh1(ih1 ih1Var, int i10) {
        this.f34214a = i10;
        this.f34215b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f34214a) {
            case 0:
                org.telegram.ui.Components.l61 l61Var = this.f34215b.f26364a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.l61 l61Var2 = this.f34215b.f26364a;
                if (l61Var2 != null) {
                    l61Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
