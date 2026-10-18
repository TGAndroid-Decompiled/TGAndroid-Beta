package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20789a;
    public final u0 f20790b;
    public final int f20791c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20789a = i11;
        this.f20790b = u0Var;
        this.f20791c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20789a) {
            case 0:
                u0 u0Var = this.f20790b;
                if (u0Var.f21728b.getSwipeBack() != null) {
                    u0Var.f21728b.getSwipeBack().e(this.f20791c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20790b;
                if (u0Var2.f21728b.getSwipeBack() != null) {
                    u0Var2.f21728b.getSwipeBack().e(this.f20791c);
                    return;
                }
                return;
        }
    }
}
