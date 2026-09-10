package org.telegram.ui.ActionBar;
public final class h0 implements Runnable {
    public final int f17754a;
    public final w0 f17755b;
    public final int f17756c;

    public h0(w0 w0Var, int i10, int i11) {
        this.f17754a = i11;
        this.f17755b = w0Var;
        this.f17756c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17754a) {
            case 0:
                w0 w0Var = this.f17755b;
                if (w0Var.f18686b.getSwipeBack() != null) {
                    w0Var.f18686b.getSwipeBack().e(this.f17756c);
                    return;
                }
                return;
            default:
                w0 w0Var2 = this.f17755b;
                if (w0Var2.f18686b.getSwipeBack() != null) {
                    w0Var2.f18686b.getSwipeBack().e(this.f17756c);
                    return;
                }
                return;
        }
    }
}
