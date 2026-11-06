package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f27416a;
    public final r0 f27417b;
    public final int f27418c;

    public d0(r0 r0Var, int i7, int i10) {
        this.f27416a = i10;
        this.f27417b = r0Var;
        this.f27418c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27416a) {
            case 0:
                r0 r0Var = this.f27417b;
                if (r0Var.f28420b.getSwipeBack() != null) {
                    r0Var.f28420b.getSwipeBack().e(this.f27418c);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f27417b;
                if (r0Var2.f28420b.getSwipeBack() != null) {
                    r0Var2.f28420b.getSwipeBack().e(this.f27418c);
                    return;
                }
                return;
        }
    }
}
