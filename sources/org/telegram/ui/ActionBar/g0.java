package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f19674a;
    public final w0 f19675b;
    public final int f19676c;

    public g0(w0 w0Var, int i10, int i11) {
        this.f19674a = i11;
        this.f19675b = w0Var;
        this.f19676c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19674a) {
            case 0:
                w0 w0Var = this.f19675b;
                if (w0Var.f20624b.getSwipeBack() != null) {
                    w0Var.f20624b.getSwipeBack().e(this.f19676c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f19675b;
                if (w0Var2.f20624b.getSwipeBack() != null) {
                    w0Var2.f20624b.getSwipeBack().e(this.f19676c);
                    return;
                }
                return;
        }
    }
}
