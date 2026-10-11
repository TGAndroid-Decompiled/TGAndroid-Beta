package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20583a;
    public final u0 f20584b;
    public final int f20585c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20583a = i11;
        this.f20584b = u0Var;
        this.f20585c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20583a) {
            case 0:
                u0 u0Var = this.f20584b;
                if (u0Var.f21535b.getSwipeBack() != null) {
                    u0Var.f21535b.getSwipeBack().e(this.f20585c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20584b;
                if (u0Var2.f21535b.getSwipeBack() != null) {
                    u0Var2.f21535b.getSwipeBack().e(this.f20585c);
                    return;
                }
                return;
        }
    }
}
