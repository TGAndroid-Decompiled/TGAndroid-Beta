package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f28499a;
    public final q0 f28500b;
    public final int f28501c;

    public d0(q0 q0Var, int i7, int i10) {
        this.f28499a = i10;
        this.f28500b = q0Var;
        this.f28501c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28499a) {
            case 0:
                q0 q0Var = this.f28500b;
                if (q0Var.f29497b.getSwipeBack() != null) {
                    q0Var.f29497b.getSwipeBack().e(this.f28501c);
                    return;
                }
                return;
            default:
                q0 q0Var2 = this.f28500b;
                if (q0Var2.f29497b.getSwipeBack() != null) {
                    q0Var2.f29497b.getSwipeBack().e(this.f28501c);
                    return;
                }
                return;
        }
    }
}
