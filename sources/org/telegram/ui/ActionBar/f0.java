package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20377a;
    public final u0 f20378b;
    public final int f20379c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20377a = i11;
        this.f20378b = u0Var;
        this.f20379c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20377a) {
            case 0:
                u0 u0Var = this.f20378b;
                if (u0Var.f21310b.getSwipeBack() != null) {
                    u0Var.f21310b.getSwipeBack().e(this.f20379c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20378b;
                if (u0Var2.f21310b.getSwipeBack() != null) {
                    u0Var2.f21310b.getSwipeBack().e(this.f20379c);
                    return;
                }
                return;
        }
    }
}
