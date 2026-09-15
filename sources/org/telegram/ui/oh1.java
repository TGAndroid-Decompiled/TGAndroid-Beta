package org.telegram.ui;
public final class oh1 implements Runnable {
    public final int f36218a;
    public final ph1 f36219b;

    public oh1(ph1 ph1Var, int i10) {
        this.f36218a = i10;
        this.f36219b = ph1Var;
    }

    @Override
    public final void run() {
        switch (this.f36218a) {
            case 0:
                org.telegram.ui.Components.y51 y51Var = this.f36219b.f30485a;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.y51 y51Var2 = this.f36219b.f30485a;
                if (y51Var2 != null) {
                    y51Var2.Y2.N(true);
                    return;
                }
                return;
        }
    }
}
