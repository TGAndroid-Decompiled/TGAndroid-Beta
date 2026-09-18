package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f18858a;
    public final v0 f18859b;
    public final int f18860c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f18858a = i11;
        this.f18859b = v0Var;
        this.f18860c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18858a) {
            case 0:
                v0 v0Var = this.f18859b;
                if (v0Var.f19765b.getSwipeBack() != null) {
                    v0Var.f19765b.getSwipeBack().e(this.f18860c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f18859b;
                if (v0Var2.f19765b.getSwipeBack() != null) {
                    v0Var2.f19765b.getSwipeBack().e(this.f18860c);
                    return;
                }
                return;
        }
    }
}
