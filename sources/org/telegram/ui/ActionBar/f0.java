package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f18865a;
    public final u0 f18866b;
    public final int f18867c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f18865a = i11;
        this.f18866b = u0Var;
        this.f18867c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18865a) {
            case 0:
                u0 u0Var = this.f18866b;
                if (u0Var.f19789b.getSwipeBack() != null) {
                    u0Var.f19789b.getSwipeBack().e(this.f18867c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f18866b;
                if (u0Var2.f19789b.getSwipeBack() != null) {
                    u0Var2.f19789b.getSwipeBack().e(this.f18867c);
                    return;
                }
                return;
        }
    }
}
