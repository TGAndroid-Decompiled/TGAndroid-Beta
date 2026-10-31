package org.telegram.ui.ActionBar;
public final class e0 implements Runnable {
    public final int f20277a;
    public final t0 f20278b;
    public final int f20279c;

    public e0(t0 t0Var, int i10, int i11) {
        this.f20277a = i11;
        this.f20278b = t0Var;
        this.f20279c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20277a) {
            case 0:
                t0 t0Var = this.f20278b;
                if (t0Var.f20826b.getSwipeBack() != null) {
                    t0Var.f20826b.getSwipeBack().e(this.f20279c);
                    return;
                }
                return;
            default:
                t0 t0Var2 = this.f20278b;
                if (t0Var2.f20826b.getSwipeBack() != null) {
                    t0Var2.f20826b.getSwipeBack().e(this.f20279c);
                    return;
                }
                return;
        }
    }
}
