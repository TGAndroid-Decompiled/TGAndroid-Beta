package org.telegram.ui.Components;
public final class hw0 implements Runnable {
    public final int f24747a;
    public final jw0 f24748b;

    public hw0(jw0 jw0Var, int i10) {
        this.f24747a = i10;
        this.f24748b = jw0Var;
    }

    @Override
    public final void run() {
        switch (this.f24747a) {
            case 0:
                jw0 jw0Var = this.f24748b;
                jw0Var.V0 = false;
                if (!jw0Var.Y0 && jw0Var.W0) {
                    jw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f24748b.V0 = false;
                return;
            case 2:
                jw0 jw0Var2 = this.f24748b;
                jw0Var2.Y0 = false;
                if (!jw0Var2.V0 && jw0Var2.W0) {
                    jw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f24748b.Y0 = false;
                return;
        }
    }
}
