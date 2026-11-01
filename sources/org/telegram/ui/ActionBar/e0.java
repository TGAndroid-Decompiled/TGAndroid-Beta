package org.telegram.ui.ActionBar;
public final class e0 implements Runnable {
    public final int f20278a;
    public final t0 f20279b;
    public final int f20280c;

    public e0(t0 t0Var, int i10, int i11) {
        this.f20278a = i11;
        this.f20279b = t0Var;
        this.f20280c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20278a) {
            case 0:
                t0 t0Var = this.f20279b;
                if (t0Var.f20827b.getSwipeBack() != null) {
                    t0Var.f20827b.getSwipeBack().e(this.f20280c);
                    return;
                }
                return;
            default:
                t0 t0Var2 = this.f20279b;
                if (t0Var2.f20827b.getSwipeBack() != null) {
                    t0Var2.f20827b.getSwipeBack().e(this.f20280c);
                    return;
                }
                return;
        }
    }
}
