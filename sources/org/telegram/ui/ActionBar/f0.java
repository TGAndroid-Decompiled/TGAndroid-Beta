package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20793a;
    public final u0 f20794b;
    public final int f20795c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20793a = i11;
        this.f20794b = u0Var;
        this.f20795c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20793a) {
            case 0:
                u0 u0Var = this.f20794b;
                if (u0Var.f21732b.getSwipeBack() != null) {
                    u0Var.f21732b.getSwipeBack().e(this.f20795c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20794b;
                if (u0Var2.f21732b.getSwipeBack() != null) {
                    u0Var2.f21732b.getSwipeBack().e(this.f20795c);
                    return;
                }
                return;
        }
    }
}
