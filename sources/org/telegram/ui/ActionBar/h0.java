package org.telegram.ui.ActionBar;
public final class h0 implements Runnable {
    public final int f18701a;
    public final w0 f18702b;
    public final int f18703c;

    public h0(w0 w0Var, int i10, int i11) {
        this.f18701a = i11;
        this.f18702b = w0Var;
        this.f18703c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18701a) {
            case 0:
                w0 w0Var = this.f18702b;
                if (w0Var.f19605b.getSwipeBack() != null) {
                    w0Var.f19605b.getSwipeBack().e(this.f18703c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f18702b;
                if (w0Var2.f19605b.getSwipeBack() != null) {
                    w0Var2.f19605b.getSwipeBack().e(this.f18703c);
                    return;
                }
                return;
        }
    }
}
