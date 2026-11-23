package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f28870a;
    public final q0 f28871b;
    public final int f28872c;

    public d0(q0 q0Var, int i7, int i10) {
        this.f28870a = i10;
        this.f28871b = q0Var;
        this.f28872c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28870a) {
            case 0:
                q0 q0Var = this.f28871b;
                if (q0Var.f29902b.getSwipeBack() != null) {
                    q0Var.f29902b.getSwipeBack().e(this.f28872c);
                    return;
                }
                return;
            default:
                q0 q0Var2 = this.f28871b;
                if (q0Var2.f29902b.getSwipeBack() != null) {
                    q0Var2.f29902b.getSwipeBack().e(this.f28872c);
                    return;
                }
                return;
        }
    }
}
