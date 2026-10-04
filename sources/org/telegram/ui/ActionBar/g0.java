package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20637a;
    public final v0 f20638b;
    public final int f20639c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20637a = i11;
        this.f20638b = v0Var;
        this.f20639c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20637a) {
            case 0:
                v0 v0Var = this.f20638b;
                if (v0Var.f21571b.getSwipeBack() != null) {
                    v0Var.f21571b.getSwipeBack().e(this.f20639c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20638b;
                if (v0Var2.f21571b.getSwipeBack() != null) {
                    v0Var2.f21571b.getSwipeBack().e(this.f20639c);
                    return;
                }
                return;
        }
    }
}
