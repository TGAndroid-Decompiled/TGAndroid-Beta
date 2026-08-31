package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f21370a;
    public final w0 f21371b;
    public final int f21372c;

    public g0(w0 w0Var, int i10, int i11) {
        this.f21370a = i11;
        this.f21371b = w0Var;
        this.f21372c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21370a) {
            case 0:
                w0 w0Var = this.f21371b;
                if (w0Var.f22344b.getSwipeBack() != null) {
                    w0Var.f22344b.getSwipeBack().e(this.f21372c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f21371b;
                if (w0Var2.f22344b.getSwipeBack() != null) {
                    w0Var2.f22344b.getSwipeBack().e(this.f21372c);
                    return;
                }
                return;
        }
    }
}
