package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f18905a;
    public final v0 f18906b;
    public final int f18907c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f18905a = i11;
        this.f18906b = v0Var;
        this.f18907c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18905a) {
            case 0:
                v0 v0Var = this.f18906b;
                if (v0Var.f19812b.getSwipeBack() != null) {
                    v0Var.f19812b.getSwipeBack().e(this.f18907c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f18906b;
                if (v0Var2.f19812b.getSwipeBack() != null) {
                    v0Var2.f19812b.getSwipeBack().e(this.f18907c);
                    return;
                }
                return;
        }
    }
}
