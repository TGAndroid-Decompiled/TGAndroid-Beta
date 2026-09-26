package org.telegram.ui;
public final class hh1 implements Runnable {
    public final int f34226a;
    public final ih1 f34227b;

    public hh1(ih1 ih1Var, int i10) {
        this.f34226a = i10;
        this.f34227b = ih1Var;
    }

    @Override
    public final void run() {
        switch (this.f34226a) {
            case 0:
                org.telegram.ui.Components.m61 m61Var = this.f34227b.f26682a;
                if (m61Var != null) {
                    m61Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.m61 m61Var2 = this.f34227b.f26682a;
                if (m61Var2 != null) {
                    m61Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
