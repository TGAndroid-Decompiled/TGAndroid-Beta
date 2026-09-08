package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20477a;
    public final v0 f20478b;
    public final int f20479c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20477a = i11;
        this.f20478b = v0Var;
        this.f20479c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20477a) {
            case 0:
                v0 v0Var = this.f20478b;
                if (v0Var.f21405b.getSwipeBack() != null) {
                    v0Var.f21405b.getSwipeBack().e(this.f20479c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20478b;
                if (v0Var2.f21405b.getSwipeBack() != null) {
                    v0Var2.f21405b.getSwipeBack().e(this.f20479c);
                    return;
                }
                return;
        }
    }
}
