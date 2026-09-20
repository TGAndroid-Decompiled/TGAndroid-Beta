package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f18890a;
    public final v0 f18891b;
    public final int f18892c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f18890a = i11;
        this.f18891b = v0Var;
        this.f18892c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18890a) {
            case 0:
                v0 v0Var = this.f18891b;
                if (v0Var.f19797b.getSwipeBack() != null) {
                    v0Var.f19797b.getSwipeBack().e(this.f18892c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f18891b;
                if (v0Var2.f19797b.getSwipeBack() != null) {
                    v0Var2.f19797b.getSwipeBack().e(this.f18892c);
                    return;
                }
                return;
        }
    }
}
