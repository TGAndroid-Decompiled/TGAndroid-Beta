package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20478a;
    public final v0 f20479b;
    public final int f20480c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20478a = i11;
        this.f20479b = v0Var;
        this.f20480c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20478a) {
            case 0:
                v0 v0Var = this.f20479b;
                if (v0Var.f21406b.getSwipeBack() != null) {
                    v0Var.f21406b.getSwipeBack().e(this.f20480c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20479b;
                if (v0Var2.f21406b.getSwipeBack() != null) {
                    v0Var2.f21406b.getSwipeBack().e(this.f20480c);
                    return;
                }
                return;
        }
    }
}
