package org.telegram.ui.ActionBar;
public final class c0 implements Runnable {
    public final int f27443a;
    public final q0 f27444b;
    public final int f27445c;

    public c0(q0 q0Var, int i3, int i10) {
        this.f27443a = i10;
        this.f27444b = q0Var;
        this.f27445c = i3;
    }

    @Override
    public final void run() {
        switch (this.f27443a) {
            case 0:
                q0 q0Var = this.f27444b;
                if (q0Var.f28440b.getSwipeBack() != null) {
                    q0Var.f28440b.getSwipeBack().e(this.f27445c);
                    return;
                }
                return;
            default:
                q0 q0Var2 = this.f27444b;
                if (q0Var2.f28440b.getSwipeBack() != null) {
                    q0Var2.f28440b.getSwipeBack().e(this.f27445c);
                    return;
                }
                return;
        }
    }
}
