package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f18850a;
    public final u0 f18851b;
    public final int f18852c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f18850a = i11;
        this.f18851b = u0Var;
        this.f18852c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18850a) {
            case 0:
                u0 u0Var = this.f18851b;
                if (u0Var.f19774b.getSwipeBack() != null) {
                    u0Var.f19774b.getSwipeBack().e(this.f18852c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f18851b;
                if (u0Var2.f19774b.getSwipeBack() != null) {
                    u0Var2.f19774b.getSwipeBack().e(this.f18852c);
                    return;
                }
                return;
        }
    }
}
