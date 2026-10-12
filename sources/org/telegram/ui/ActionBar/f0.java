package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20376a;
    public final u0 f20377b;
    public final int f20378c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20376a = i11;
        this.f20377b = u0Var;
        this.f20378c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20376a) {
            case 0:
                u0 u0Var = this.f20377b;
                if (u0Var.f21309b.getSwipeBack() != null) {
                    u0Var.f21309b.getSwipeBack().e(this.f20378c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20377b;
                if (u0Var2.f21309b.getSwipeBack() != null) {
                    u0Var2.f21309b.getSwipeBack().e(this.f20378c);
                    return;
                }
                return;
        }
    }
}
