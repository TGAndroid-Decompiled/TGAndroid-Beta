package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f20641a;
    public final v0 f20642b;
    public final int f20643c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f20641a = i11;
        this.f20642b = v0Var;
        this.f20643c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20641a) {
            case 0:
                v0 v0Var = this.f20642b;
                if (v0Var.f21575b.getSwipeBack() != null) {
                    v0Var.f21575b.getSwipeBack().e(this.f20643c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f20642b;
                if (v0Var2.f21575b.getSwipeBack() != null) {
                    v0Var2.f21575b.getSwipeBack().e(this.f20643c);
                    return;
                }
                return;
        }
    }
}
