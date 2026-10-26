package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f22633a;
    public final w0 f22634b;
    public final int f22635c;

    public g0(w0 w0Var, int i10, int i11) {
        this.f22633a = i11;
        this.f22634b = w0Var;
        this.f22635c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22633a) {
            case 0:
                w0 w0Var = this.f22634b;
                if (w0Var.f23176b.getSwipeBack() != null) {
                    w0Var.f23176b.getSwipeBack().e(this.f22635c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f22634b;
                if (w0Var2.f23176b.getSwipeBack() != null) {
                    w0Var2.f23176b.getSwipeBack().e(this.f22635c);
                    return;
                }
                return;
        }
    }
}
