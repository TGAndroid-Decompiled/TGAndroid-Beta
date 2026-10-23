package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20879a;
    public final u0 f20880b;
    public final int f20881c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20879a = i11;
        this.f20880b = u0Var;
        this.f20881c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20879a) {
            case 0:
                u0 u0Var = this.f20880b;
                if (u0Var.f21874b.getSwipeBack() != null) {
                    u0Var.f21874b.getSwipeBack().e(this.f20881c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20880b;
                if (u0Var2.f21874b.getSwipeBack() != null) {
                    u0Var2.f21874b.getSwipeBack().e(this.f20881c);
                    return;
                }
                return;
        }
    }
}
