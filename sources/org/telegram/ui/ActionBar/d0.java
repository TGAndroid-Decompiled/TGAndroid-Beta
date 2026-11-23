package org.telegram.ui.ActionBar;
public final class d0 implements Runnable {
    public final int f28836a;
    public final q0 f28837b;
    public final int f28838c;

    public d0(q0 q0Var, int i7, int i10) {
        this.f28836a = i10;
        this.f28837b = q0Var;
        this.f28838c = i7;
    }

    @Override
    public final void run() {
        switch (this.f28836a) {
            case 0:
                q0 q0Var = this.f28837b;
                if (q0Var.f29868b.getSwipeBack() != null) {
                    q0Var.f29868b.getSwipeBack().e(this.f28838c);
                    return;
                }
                return;
            default:
                q0 q0Var2 = this.f28837b;
                if (q0Var2.f29868b.getSwipeBack() != null) {
                    q0Var2.f29868b.getSwipeBack().e(this.f28838c);
                    return;
                }
                return;
        }
    }
}
