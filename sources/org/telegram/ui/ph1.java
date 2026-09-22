package org.telegram.ui;
public final class ph1 implements Runnable {
    public final int f36584a;
    public final qh1 f36585b;

    public ph1(qh1 qh1Var, int i10) {
        this.f36584a = i10;
        this.f36585b = qh1Var;
    }

    @Override
    public final void run() {
        switch (this.f36584a) {
            case 0:
                org.telegram.ui.Components.y51 y51Var = this.f36585b.f30482a;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.y51 y51Var2 = this.f36585b.f30482a;
                if (y51Var2 != null) {
                    y51Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
