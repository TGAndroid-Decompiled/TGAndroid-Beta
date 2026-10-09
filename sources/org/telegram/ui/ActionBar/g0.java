package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20628a;
    public final v0 f20629b;
    public final int f20630c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20628a = i11;
        this.f20629b = v0Var;
        this.f20630c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20628a) {
            case 0:
                v0 v0Var = this.f20629b;
                if (v0Var.f21579b.getSwipeBack() != null) {
                    v0Var.f21579b.getSwipeBack().e(this.f20630c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20629b;
                if (v0Var2.f21579b.getSwipeBack() != null) {
                    v0Var2.f21579b.getSwipeBack().e(this.f20630c);
                    return;
                }
                return;
        }
    }
}
