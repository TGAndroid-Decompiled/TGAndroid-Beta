package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f19699a;
    public final w0 f19700b;
    public final int f19701c;

    public g0(w0 w0Var, int i10, int i11) {
        this.f19699a = i11;
        this.f19700b = w0Var;
        this.f19701c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19699a) {
            case 0:
                w0 w0Var = this.f19700b;
                if (w0Var.f20649b.getSwipeBack() != null) {
                    w0Var.f20649b.getSwipeBack().e(this.f19701c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f19700b;
                if (w0Var2.f20649b.getSwipeBack() != null) {
                    w0Var2.f20649b.getSwipeBack().e(this.f19701c);
                    return;
                }
                return;
        }
    }
}
