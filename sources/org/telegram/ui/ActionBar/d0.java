package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f28921a;
    public final q0 f28922b;
    public final int f28923c;

    public d0(q0 q0Var, int i7, int i10) {
        this.f28921a = i10;
        this.f28922b = q0Var;
        this.f28923c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28921a) {
            case 0:
                q0 q0Var = this.f28922b;
                if (q0Var.f29959b.getSwipeBack() != null) {
                    q0Var.f29959b.getSwipeBack().e(this.f28923c);
                    return;
                }
                return;
            default:
                q0 q0Var2 = this.f28922b;
                if (q0Var2.f29959b.getSwipeBack() != null) {
                    q0Var2.f29959b.getSwipeBack().e(this.f28923c);
                    return;
                }
                return;
        }
    }
}
