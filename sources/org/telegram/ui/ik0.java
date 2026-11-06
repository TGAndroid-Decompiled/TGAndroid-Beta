package org.telegram.ui;
public final class ik0 implements Runnable {
    public final int f46682a;
    public final hl0 f46683b;

    public ik0(hl0 hl0Var, int i7) {
        this.f46682a = i7;
        this.f46683b = hl0Var;
    }

    @Override
    public final void run() {
        switch (this.f46682a) {
            case 0:
                this.f46683b.z0();
                return;
            case 1:
                hl0 hl0Var = this.f46683b;
                hl0Var.getMessagesController().f24819l7 = null;
                if (hl0Var.f46423f1 == 3 && !hl0Var.isFinishing()) {
                    hl0Var.f46423f1 = 4;
                    gl0 gl0Var = hl0Var.Z0;
                    if (gl0Var != null) {
                        gl0Var.b(4);
                    }
                    hl0Var.finishFragment();
                    return;
                } else if (hl0Var.f46423f1 == 1 && !hl0Var.isFinishing()) {
                    hl0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 2:
                hl0 hl0Var2 = this.f46683b;
                if (hl0Var2.f46416d0 != null) {
                    hl0Var2.C0();
                    hl0Var2.f46416d0 = null;
                    return;
                }
                return;
            default:
                hl0 hl0Var3 = this.f46683b;
                hl0Var3.f46421f[0].requestFocus();
                org.telegram.messenger.g0.K3(hl0Var3.f46421f[0]);
                return;
        }
    }
}
