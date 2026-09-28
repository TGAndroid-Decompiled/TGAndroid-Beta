package org.telegram.ui;
public final class hh1 implements Runnable {
    public final int f34227a;
    public final ih1 f34228b;

    public hh1(ih1 ih1Var, int i10) {
        this.f34227a = i10;
        this.f34228b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f34227a) {
            case 0:
                org.telegram.ui.Components.n61 n61Var = this.f34228b.f26973a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.n61 n61Var2 = this.f34228b.f26973a;
                if (n61Var2 != null) {
                    n61Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
