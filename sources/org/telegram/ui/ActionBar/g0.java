package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f18671a;
    public final v0 f18672b;
    public final int f18673c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f18671a = i11;
        this.f18672b = v0Var;
        this.f18673c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18671a) {
            case 0:
                v0 v0Var = this.f18672b;
                if (v0Var.f19574b.getSwipeBack() != null) {
                    v0Var.f19574b.getSwipeBack().e(this.f18673c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f18672b;
                if (v0Var2.f19574b.getSwipeBack() != null) {
                    v0Var2.f19574b.getSwipeBack().e(this.f18673c);
                    return;
                }
                return;
        }
    }
}
