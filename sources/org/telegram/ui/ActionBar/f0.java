package org.telegram.ui.ActionBar;
public final class f0 implements Runnable {
    public final int f20619a;
    public final u0 f20620b;
    public final int f20621c;

    public f0(u0 u0Var, int i10, int i11) {
        this.f20619a = i11;
        this.f20620b = u0Var;
        this.f20621c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20619a) {
            case 0:
                u0 u0Var = this.f20620b;
                if (u0Var.f21571b.getSwipeBack() != null) {
                    u0Var.f21571b.getSwipeBack().e(this.f20621c);
                    return;
                }
                return;
            default:
                u0 u0Var2 = this.f20620b;
                if (u0Var2.f21571b.getSwipeBack() != null) {
                    u0Var2.f21571b.getSwipeBack().e(this.f20621c);
                    return;
                }
                return;
        }
    }
}
