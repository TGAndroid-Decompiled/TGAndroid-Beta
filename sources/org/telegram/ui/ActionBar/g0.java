package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20451a;
    public final v0 f20452b;
    public final int f20453c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20451a = i11;
        this.f20452b = v0Var;
        this.f20453c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20451a) {
            case 0:
                v0 v0Var = this.f20452b;
                if (v0Var.f21379b.getSwipeBack() != null) {
                    v0Var.f21379b.getSwipeBack().e(this.f20453c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20452b;
                if (v0Var2.f21379b.getSwipeBack() != null) {
                    v0Var2.f21379b.getSwipeBack().e(this.f20453c);
                    return;
                }
                return;
        }
    }
}
