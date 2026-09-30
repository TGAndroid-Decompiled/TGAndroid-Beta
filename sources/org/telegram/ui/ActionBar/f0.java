package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f18881a;
    public final u0 f18882b;
    public final int f18883c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f18881a = i11;
        this.f18882b = u0Var;
        this.f18883c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18881a) {
            case 0:
                u0 u0Var = this.f18882b;
                if (u0Var.f19805b.getSwipeBack() != null) {
                    u0Var.f19805b.getSwipeBack().e(this.f18883c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f18882b;
                if (u0Var2.f19805b.getSwipeBack() != null) {
                    u0Var2.f19805b.getSwipeBack().e(this.f18883c);
                    return;
                }
                return;
        }
    }
}
