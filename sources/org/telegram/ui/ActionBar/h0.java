package org.telegram.ui.ActionBar;
public final class h0 implements Runnable {
    public final int f18930a;
    public final w0 f18931b;
    public final int f18932c;

    public h0(w0 w0Var, int i10, int i11) {
        this.f18930a = i11;
        this.f18931b = w0Var;
        this.f18932c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18930a) {
            case 0:
                w0 w0Var = this.f18931b;
                if (w0Var.f19838b.getSwipeBack() != null) {
                    w0Var.f19838b.getSwipeBack().e(this.f18932c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f18931b;
                if (w0Var2.f19838b.getSwipeBack() != null) {
                    w0Var2.f19838b.getSwipeBack().e(this.f18932c);
                    return;
                }
                return;
        }
    }
}
