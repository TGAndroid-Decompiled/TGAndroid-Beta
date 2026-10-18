package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20796a;
    public final u0 f20797b;
    public final int f20798c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20796a = i11;
        this.f20797b = u0Var;
        this.f20798c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20796a) {
            case 0:
                u0 u0Var = this.f20797b;
                if (u0Var.f21735b.getSwipeBack() != null) {
                    u0Var.f21735b.getSwipeBack().e(this.f20798c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20797b;
                if (u0Var2.f21735b.getSwipeBack() != null) {
                    u0Var2.f21735b.getSwipeBack().e(this.f20798c);
                    return;
                }
                return;
        }
    }
}
