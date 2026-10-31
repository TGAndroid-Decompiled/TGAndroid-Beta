package org.telegram.ui.Components;
public final class av0 implements Runnable {
    public final int f24468a;
    public final cv0 f24469b;

    public av0(cv0 cv0Var, int i10) {
        this.f24468a = i10;
        this.f24469b = cv0Var;
    }

    @Override
    public final void run() {
        switch (this.f24468a) {
            case 0:
                cv0 cv0Var = this.f24469b;
                cv0Var.V0 = false;
                if (!cv0Var.Y0 && cv0Var.W0) {
                    cv0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f24469b.V0 = false;
                return;
            case 2:
                cv0 cv0Var2 = this.f24469b;
                cv0Var2.Y0 = false;
                if (!cv0Var2.V0 && cv0Var2.W0) {
                    cv0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f24469b.Y0 = false;
                return;
        }
    }
}
