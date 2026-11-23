package org.telegram.ui.Components;
public final class iu0 implements Runnable {
    public final int f36175a;
    public final ku0 f36176b;

    public iu0(ku0 ku0Var, int i7) {
        this.f36175a = i7;
        this.f36176b = ku0Var;
    }

    @Override
    public final void run() {
        switch (this.f36175a) {
            case 0:
                ku0 ku0Var = this.f36176b;
                ku0Var.W0 = false;
                if (!ku0Var.Z0 && ku0Var.X0) {
                    ku0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f36176b.W0 = false;
                return;
            case 2:
                ku0 ku0Var2 = this.f36176b;
                ku0Var2.Z0 = false;
                if (!ku0Var2.W0 && ku0Var2.X0) {
                    ku0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f36176b.Z0 = false;
                return;
        }
    }
}
