package org.telegram.ui.ActionBar;
public final class h0 implements Runnable {
    public final int f18702a;
    public final w0 f18703b;
    public final int f18704c;

    public h0(w0 w0Var, int i10, int i11) {
        this.f18702a = i11;
        this.f18703b = w0Var;
        this.f18704c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18702a) {
            case 0:
                w0 w0Var = this.f18703b;
                if (w0Var.f19606b.getSwipeBack() != null) {
                    w0Var.f19606b.getSwipeBack().e(this.f18704c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f18703b;
                if (w0Var2.f19606b.getSwipeBack() != null) {
                    w0Var2.f19606b.getSwipeBack().e(this.f18704c);
                    return;
                }
                return;
        }
    }
}
