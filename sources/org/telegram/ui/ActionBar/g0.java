package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f18673a;
    public final v0 f18674b;
    public final int f18675c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f18673a = i11;
        this.f18674b = v0Var;
        this.f18675c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18673a) {
            case 0:
                v0 v0Var = this.f18674b;
                if (v0Var.f19578b.getSwipeBack() != null) {
                    v0Var.f19578b.getSwipeBack().e(this.f18675c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f18674b;
                if (v0Var2.f19578b.getSwipeBack() != null) {
                    v0Var2.f19578b.getSwipeBack().e(this.f18675c);
                    return;
                }
                return;
        }
    }
}
