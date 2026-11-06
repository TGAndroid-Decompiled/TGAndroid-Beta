package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f27417a;
    public final r0 f27418b;
    public final int f27419c;

    public d0(r0 r0Var, int i7, int i10) {
        this.f27417a = i10;
        this.f27418b = r0Var;
        this.f27419c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27417a) {
            case 0:
                r0 r0Var = this.f27418b;
                if (r0Var.f28421b.getSwipeBack() != null) {
                    r0Var.f28421b.getSwipeBack().e(this.f27419c);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f27418b;
                if (r0Var2.f28421b.getSwipeBack() != null) {
                    r0Var2.f28421b.getSwipeBack().e(this.f27419c);
                    return;
                }
                return;
        }
    }
}
