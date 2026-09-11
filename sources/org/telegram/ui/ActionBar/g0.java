package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20450a;
    public final v0 f20451b;
    public final int f20452c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20450a = i11;
        this.f20451b = v0Var;
        this.f20452c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20450a) {
            case 0:
                v0 v0Var = this.f20451b;
                if (v0Var.f21378b.getSwipeBack() != null) {
                    v0Var.f21378b.getSwipeBack().e(this.f20452c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20451b;
                if (v0Var2.f21378b.getSwipeBack() != null) {
                    v0Var2.f21378b.getSwipeBack().e(this.f20452c);
                    return;
                }
                return;
        }
    }
}
