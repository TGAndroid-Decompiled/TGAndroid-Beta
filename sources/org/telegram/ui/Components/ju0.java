package org.telegram.ui.Components;
public final class ju0 implements Runnable {
    public final int f36652a;
    public final lu0 f36653b;

    public ju0(lu0 lu0Var, int i7) {
        this.f36652a = i7;
        this.f36653b = lu0Var;
    }

    @Override
    public final void run() {
        switch (this.f36652a) {
            case 0:
                lu0 lu0Var = this.f36653b;
                lu0Var.W0 = false;
                if (!lu0Var.Z0 && lu0Var.X0) {
                    lu0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f36653b.W0 = false;
                return;
            case 2:
                lu0 lu0Var2 = this.f36653b;
                lu0Var2.Z0 = false;
                if (!lu0Var2.W0 && lu0Var2.X0) {
                    lu0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f36653b.Z0 = false;
                return;
        }
    }
}
