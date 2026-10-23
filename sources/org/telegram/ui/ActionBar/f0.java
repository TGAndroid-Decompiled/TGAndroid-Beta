package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20797a;
    public final u0 f20798b;
    public final int f20799c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20797a = i11;
        this.f20798b = u0Var;
        this.f20799c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20797a) {
            case 0:
                u0 u0Var = this.f20798b;
                if (u0Var.f21736b.getSwipeBack() != null) {
                    u0Var.f21736b.getSwipeBack().e(this.f20799c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20798b;
                if (u0Var2.f21736b.getSwipeBack() != null) {
                    u0Var2.f21736b.getSwipeBack().e(this.f20799c);
                    return;
                }
                return;
        }
    }
}
