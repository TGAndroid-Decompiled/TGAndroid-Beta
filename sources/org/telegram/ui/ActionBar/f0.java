package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20792a;
    public final u0 f20793b;
    public final int f20794c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20792a = i11;
        this.f20793b = u0Var;
        this.f20794c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20792a) {
            case 0:
                u0 u0Var = this.f20793b;
                if (u0Var.f21731b.getSwipeBack() != null) {
                    u0Var.f21731b.getSwipeBack().e(this.f20794c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20793b;
                if (u0Var2.f21731b.getSwipeBack() != null) {
                    u0Var2.f21731b.getSwipeBack().e(this.f20794c);
                    return;
                }
                return;
        }
    }
}
