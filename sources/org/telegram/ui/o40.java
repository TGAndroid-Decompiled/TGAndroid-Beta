package org.telegram.ui;
public final class o40 implements Runnable {
    public final int f50520a;
    public final y40 f50521b;

    public o40(y40 y40Var, int i7) {
        this.f50520a = i7;
        this.f50521b = y40Var;
    }

    @Override
    public final void run() {
        switch (this.f50520a) {
            case 0:
                this.f50521b.finishFragment();
                return;
            case 1:
                y40 y40Var = this.f50521b;
                y40Var.n0();
                y40Var.j0();
                return;
            case 2:
                y40 y40Var2 = this.f50521b;
                y40Var2.getClass();
                y40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                y40 y40Var3 = this.f50521b;
                y40Var3.f54207n.postOnAnimation(new o40(y40Var3, 1));
                return;
        }
    }
}
