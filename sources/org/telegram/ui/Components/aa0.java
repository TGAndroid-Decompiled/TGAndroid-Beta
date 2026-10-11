package org.telegram.ui.Components;
public final class aa0 implements Runnable {
    public final int f24543a;
    public final ba0 f24544b;
    public final fa0 f24545c;

    public aa0(ba0 ba0Var, fa0 fa0Var, int i10) {
        this.f24543a = i10;
        this.f24544b = ba0Var;
        this.f24545c = fa0Var;
    }

    @Override
    public final void run() {
        switch (this.f24543a) {
            case 0:
                this.f24544b.k(this.f24545c, false);
                return;
            default:
                this.f24544b.k(this.f24545c, false);
                return;
        }
    }
}
