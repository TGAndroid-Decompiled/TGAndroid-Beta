package org.telegram.ui;
public final class m40 implements Runnable {
    public final int f47661a;
    public final w40 f47662b;

    public m40(w40 w40Var, int i7) {
        this.f47661a = i7;
        this.f47662b = w40Var;
    }

    @Override
    public final void run() {
        switch (this.f47661a) {
            case 0:
                this.f47662b.finishFragment();
                return;
            case 1:
                w40 w40Var = this.f47662b;
                w40Var.n0();
                w40Var.j0();
                return;
            case 2:
                w40 w40Var2 = this.f47662b;
                w40Var2.getClass();
                w40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                w40 w40Var3 = this.f47662b;
                w40Var3.f50941n.postOnAnimation(new m40(w40Var3, 1));
                return;
        }
    }
}
