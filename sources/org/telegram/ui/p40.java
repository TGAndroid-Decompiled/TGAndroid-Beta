package org.telegram.ui;
public final class p40 implements Runnable {
    public final int f50681a;
    public final z40 f50682b;

    public p40(z40 z40Var, int i7) {
        this.f50681a = i7;
        this.f50682b = z40Var;
    }

    @Override
    public final void run() {
        switch (this.f50681a) {
            case 0:
                this.f50682b.finishFragment();
                return;
            case 1:
                z40 z40Var = this.f50682b;
                z40Var.n0();
                z40Var.j0();
                return;
            case 2:
                z40 z40Var2 = this.f50682b;
                z40Var2.getClass();
                z40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                z40 z40Var3 = this.f50682b;
                z40Var3.f54373n.postOnAnimation(new p40(z40Var3, 1));
                return;
        }
    }
}
