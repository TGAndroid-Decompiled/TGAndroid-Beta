package org.telegram.ui.ActionBar;

public final class g0 implements Runnable {

    public final int f22961a;

    public final v0 f22962b;

    public final int f22963c;

    public g0(v0 v0Var, int i10, int i11) {
        this.f22961a = i11;
        this.f22962b = v0Var;
        this.f22963c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22961a) {
            case 0:
                v0 v0Var = this.f22962b;
                if (v0Var.f23854b.getSwipeBack() != null) {
                    v0Var.f23854b.getSwipeBack().e(this.f22963c);
                }
                break;
            default:
                v0 v0Var2 = this.f22962b;
                if (v0Var2.f23854b.getSwipeBack() != null) {
                    v0Var2.f23854b.getSwipeBack().e(this.f22963c);
                }
                break;
        }
    }
}
