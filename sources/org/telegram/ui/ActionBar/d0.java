package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f27404a;
    public final r0 f27405b;
    public final int f27406c;

    public d0(r0 r0Var, int i7, int i10) {
        this.f27404a = i10;
        this.f27405b = r0Var;
        this.f27406c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27404a) {
            case 0:
                r0 r0Var = this.f27405b;
                if (r0Var.f28425b.getSwipeBack() != null) {
                    r0Var.f28425b.getSwipeBack().e(this.f27406c);
                    return;
                }
                return;
            default:
                r0 r0Var2 = this.f27405b;
                if (r0Var2.f28425b.getSwipeBack() != null) {
                    r0Var2.f28425b.getSwipeBack().e(this.f27406c);
                    return;
                }
                return;
        }
    }
}
