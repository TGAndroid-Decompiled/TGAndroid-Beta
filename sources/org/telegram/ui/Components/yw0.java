package org.telegram.ui.Components;
public final class yw0 implements Runnable {
    public final int f33378a;
    public final ax0 f33379b;

    public yw0(ax0 ax0Var, int i10) {
        this.f33378a = i10;
        this.f33379b = ax0Var;
    }

    @Override
    public final void run() {
        switch (this.f33378a) {
            case 0:
                ax0 ax0Var = this.f33379b;
                ax0Var.V0 = false;
                if (!ax0Var.Y0 && ax0Var.W0) {
                    ax0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f33379b.V0 = false;
                return;
            case 2:
                ax0 ax0Var2 = this.f33379b;
                ax0Var2.Y0 = false;
                if (!ax0Var2.V0 && ax0Var2.W0) {
                    ax0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f33379b.Y0 = false;
                return;
        }
    }
}
