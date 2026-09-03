package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f21372a;
    public final w0 f21373b;
    public final int f21374c;

    public g0(w0 w0Var, int i10, int i11) {
        this.f21372a = i11;
        this.f21373b = w0Var;
        this.f21374c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21372a) {
            case 0:
                w0 w0Var = this.f21373b;
                if (w0Var.f22346b.getSwipeBack() != null) {
                    w0Var.f22346b.getSwipeBack().e(this.f21374c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f21373b;
                if (w0Var2.f22346b.getSwipeBack() != null) {
                    w0Var2.f22346b.getSwipeBack().e(this.f21374c);
                    return;
                }
                return;
        }
    }
}
