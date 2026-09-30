package org.telegram.ui;
public final class hh1 implements Runnable {
    public final int f34320a;
    public final ih1 f34321b;

    public hh1(ih1 ih1Var, int i10) {
        this.f34320a = i10;
        this.f34321b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f34320a) {
            case 0:
                org.telegram.ui.Components.o61 o61Var = this.f34321b.f27258a;
                if (o61Var != null) {
                    o61Var.f28778f3.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.o61 o61Var2 = this.f34321b.f27258a;
                if (o61Var2 != null) {
                    o61Var2.f28778f3.N(true);
                    return;
                }
                return;
        }
    }
}
