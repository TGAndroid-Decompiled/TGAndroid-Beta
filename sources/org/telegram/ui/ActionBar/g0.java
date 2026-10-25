package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f22631a;
    public final w0 f22632b;
    public final int f22633c;

    public g0(w0 w0Var, int i10, int i11) {
        this.f22631a = i11;
        this.f22632b = w0Var;
        this.f22633c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22631a) {
            case 0:
                w0 w0Var = this.f22632b;
                if (w0Var.f23174b.getSwipeBack() != null) {
                    w0Var.f23174b.getSwipeBack().e(this.f22633c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f22632b;
                if (w0Var2.f23174b.getSwipeBack() != null) {
                    w0Var2.f23174b.getSwipeBack().e(this.f22633c);
                    return;
                }
                return;
        }
    }
}
