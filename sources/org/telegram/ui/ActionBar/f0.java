package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20790a;
    public final u0 f20791b;
    public final int f20792c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20790a = i11;
        this.f20791b = u0Var;
        this.f20792c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20790a) {
            case 0:
                u0 u0Var = this.f20791b;
                if (u0Var.f21729b.getSwipeBack() != null) {
                    u0Var.f21729b.getSwipeBack().e(this.f20792c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20791b;
                if (u0Var2.f21729b.getSwipeBack() != null) {
                    u0Var2.f21729b.getSwipeBack().e(this.f20792c);
                    return;
                }
                return;
        }
    }
}
