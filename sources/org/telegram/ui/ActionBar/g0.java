package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20636a;
    public final v0 f20637b;
    public final int f20638c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20636a = i11;
        this.f20637b = v0Var;
        this.f20638c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20636a) {
            case 0:
                v0 v0Var = this.f20637b;
                if (v0Var.f21570b.getSwipeBack() != null) {
                    v0Var.f21570b.getSwipeBack().e(this.f20638c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20637b;
                if (v0Var2.f21570b.getSwipeBack() != null) {
                    v0Var2.f21570b.getSwipeBack().e(this.f20638c);
                    return;
                }
                return;
        }
    }
}
