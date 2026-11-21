package org.telegram.ui.Components;
public final class ju0 implements Runnable {
    public final int f36703a;
    public final lu0 f36704b;

    public ju0(lu0 lu0Var, int i7) {
        this.f36703a = i7;
        this.f36704b = lu0Var;
    }

    @Override
    public final void run() {
        switch (this.f36703a) {
            case 0:
                lu0 lu0Var = this.f36704b;
                lu0Var.W0 = false;
                if (!lu0Var.Z0 && lu0Var.X0) {
                    lu0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f36704b.W0 = false;
                return;
            case 2:
                lu0 lu0Var2 = this.f36704b;
                lu0Var2.Z0 = false;
                if (!lu0Var2.W0 && lu0Var2.X0) {
                    lu0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f36704b.Z0 = false;
                return;
        }
    }
}
