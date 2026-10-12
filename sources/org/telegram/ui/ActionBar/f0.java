package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f19770a;
    public final u0 f19771b;
    public final int f19772c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f19770a = i11;
        this.f19771b = u0Var;
        this.f19772c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19770a) {
            case 0:
                u0 u0Var = this.f19771b;
                if (u0Var.f20675b.getSwipeBack() != null) {
                    u0Var.f20675b.getSwipeBack().e(this.f19772c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f19771b;
                if (u0Var2.f20675b.getSwipeBack() != null) {
                    u0Var2.f20675b.getSwipeBack().e(this.f19772c);
                    return;
                }
                return;
        }
    }
}
