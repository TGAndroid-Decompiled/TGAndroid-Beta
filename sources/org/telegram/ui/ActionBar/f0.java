package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20880a;
    public final u0 f20881b;
    public final int f20882c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20880a = i11;
        this.f20881b = u0Var;
        this.f20882c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20880a) {
            case 0:
                u0 u0Var = this.f20881b;
                if (u0Var.f21875b.getSwipeBack() != null) {
                    u0Var.f21875b.getSwipeBack().e(this.f20882c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20881b;
                if (u0Var2.f21875b.getSwipeBack() != null) {
                    u0Var2.f21875b.getSwipeBack().e(this.f20882c);
                    return;
                }
                return;
        }
    }
}
