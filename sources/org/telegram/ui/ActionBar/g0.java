package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20646a;
    public final v0 f20647b;
    public final int f20648c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20646a = i11;
        this.f20647b = v0Var;
        this.f20648c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20646a) {
            case 0:
                v0 v0Var = this.f20647b;
                if (v0Var.f21579b.getSwipeBack() != null) {
                    v0Var.f21579b.getSwipeBack().e(this.f20648c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20647b;
                if (v0Var2.f21579b.getSwipeBack() != null) {
                    v0Var2.f21579b.getSwipeBack().e(this.f20648c);
                    return;
                }
                return;
        }
    }
}
