package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f23400a;
    public final w0 f23401b;
    public final int f23402c;

    public g0(w0 w0Var, int i9, int i10) {
        this.f23400a = i10;
        this.f23401b = w0Var;
        this.f23402c = i9;
    }

    @Override
    public final void run() {
        switch (this.f23400a) {
            case 0:
                w0 w0Var = this.f23401b;
                if (w0Var.f23901b.getSwipeBack() != null) {
                    w0Var.f23901b.getSwipeBack().e(this.f23402c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f23401b;
                if (w0Var2.f23901b.getSwipeBack() != null) {
                    w0Var2.f23901b.getSwipeBack().e(this.f23402c);
                    return;
                }
                return;
        }
    }
}
