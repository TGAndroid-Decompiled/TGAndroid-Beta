package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f18864a;
    public final u0 f18865b;
    public final int f18866c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f18864a = i11;
        this.f18865b = u0Var;
        this.f18866c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18864a) {
            case 0:
                u0 u0Var = this.f18865b;
                if (u0Var.f19788b.getSwipeBack() != null) {
                    u0Var.f19788b.getSwipeBack().e(this.f18866c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f18865b;
                if (u0Var2.f19788b.getSwipeBack() != null) {
                    u0Var2.f19788b.getSwipeBack().e(this.f18866c);
                    return;
                }
                return;
        }
    }
}
