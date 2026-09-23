package org.telegram.ui.ActionBar;
public final class g0 implements Runnable {
    public final int f18661a;
    public final v0 f18662b;
    public final int f18663c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f18661a = i11;
        this.f18662b = v0Var;
        this.f18663c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18661a) {
            case 0:
                v0 v0Var = this.f18662b;
                if (v0Var.f19561b.getSwipeBack() != null) {
                    v0Var.f19561b.getSwipeBack().e(this.f18663c);
                    return;
                }
                return;
            default:
                v0 v0Var2 = this.f18662b;
                if (v0Var2.f19561b.getSwipeBack() != null) {
                    v0Var2.f19561b.getSwipeBack().e(this.f18663c);
                    return;
                }
                return;
        }
    }
}
