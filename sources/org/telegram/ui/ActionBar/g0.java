package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f22634a;
    public final w0 f22635b;
    public final int f22636c;

    public g0(w0 w0Var, int i10, int i11) {
        this.f22634a = i11;
        this.f22635b = w0Var;
        this.f22636c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22634a) {
            case 0:
                w0 w0Var = this.f22635b;
                if (w0Var.f23177b.getSwipeBack() != null) {
                    w0Var.f23177b.getSwipeBack().e(this.f22636c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f22635b;
                if (w0Var2.f23177b.getSwipeBack() != null) {
                    w0Var2.f23177b.getSwipeBack().e(this.f22636c);
                    return;
                }
                return;
        }
    }
}
