package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20632a;
    public final v0 f20633b;
    public final int f20634c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20632a = i11;
        this.f20633b = v0Var;
        this.f20634c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20632a) {
            case 0:
                v0 v0Var = this.f20633b;
                if (v0Var.f21583b.getSwipeBack() != null) {
                    v0Var.f21583b.getSwipeBack().e(this.f20634c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20633b;
                if (v0Var2.f21583b.getSwipeBack() != null) {
                    v0Var2.f21583b.getSwipeBack().e(this.f20634c);
                    return;
                }
                return;
        }
    }
}
