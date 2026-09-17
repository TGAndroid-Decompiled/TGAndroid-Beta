package org.telegram.ui;
public final class ph1 implements Runnable {
    public final int f39552a;
    public final qh1 f39553b;

    public ph1(qh1 qh1Var, int i10) {
        this.f39552a = i10;
        this.f39553b = qh1Var;
    }

    @Override
    public final void run() {
        switch (this.f39552a) {
            case 0:
                org.telegram.ui.Components.x51 x51Var = this.f39553b.f32877a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.x51 x51Var2 = this.f39553b.f32877a;
                if (x51Var2 != null) {
                    x51Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
