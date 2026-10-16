package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f19470a;
    public final u0 f19471b;
    public final int f19472c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f19470a = i11;
        this.f19471b = u0Var;
        this.f19472c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19470a) {
            case 0:
                u0 u0Var = this.f19471b;
                if (u0Var.f20375b.getSwipeBack() != null) {
                    u0Var.f20375b.getSwipeBack().e(this.f19472c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f19471b;
                if (u0Var2.f20375b.getSwipeBack() != null) {
                    u0Var2.f20375b.getSwipeBack().e(this.f19472c);
                    return;
                }
                return;
        }
    }
}
