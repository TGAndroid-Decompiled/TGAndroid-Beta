package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f28867a;
    public final q0 f28868b;
    public final int f28869c;

    public d0(q0 q0Var, int i7, int i10) {
        this.f28867a = i10;
        this.f28868b = q0Var;
        this.f28869c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28867a) {
            case 0:
                q0 q0Var = this.f28868b;
                if (q0Var.f29899b.getSwipeBack() != null) {
                    q0Var.f29899b.getSwipeBack().e(this.f28869c);
                    return;
                }
                return;
            default:
                q0 q0Var2 = this.f28868b;
                if (q0Var2.f29899b.getSwipeBack() != null) {
                    q0Var2.f29899b.getSwipeBack().e(this.f28869c);
                    return;
                }
                return;
        }
    }
}
