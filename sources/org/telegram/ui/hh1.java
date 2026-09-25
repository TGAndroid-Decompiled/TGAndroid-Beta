package org.telegram.ui;
public final class hh1 implements Runnable {
    public final int f34228a;
    public final ih1 f34229b;

    public hh1(ih1 ih1Var, int i10) {
        this.f34228a = i10;
        this.f34229b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f34228a) {
            case 0:
                org.telegram.ui.Components.l61 l61Var = this.f34229b.f26372a;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.l61 l61Var2 = this.f34229b.f26372a;
                if (l61Var2 != null) {
                    l61Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
