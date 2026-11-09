package org.telegram.ui;
public final class o40 implements Runnable {
    public final int f48335a;
    public final y40 f48336b;

    public o40(y40 y40Var, int i7) {
        this.f48335a = i7;
        this.f48336b = y40Var;
    }

    @Override
    public final void run() {
        switch (this.f48335a) {
            case 0:
                this.f48336b.finishFragment();
                return;
            case 1:
                y40 y40Var = this.f48336b;
                y40Var.n0();
                y40Var.j0();
                return;
            case 2:
                y40 y40Var2 = this.f48336b;
                y40Var2.getClass();
                y40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                y40 y40Var3 = this.f48336b;
                y40Var3.f51872n.postOnAnimation(new o40(y40Var3, 1));
                return;
        }
    }
}
