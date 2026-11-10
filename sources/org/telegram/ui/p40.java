package org.telegram.ui;
public final class p40 implements Runnable {
    public final int f48650a;
    public final z40 f48651b;

    public p40(z40 z40Var, int i7) {
        this.f48650a = i7;
        this.f48651b = z40Var;
    }

    @Override
    public final void run() {
        switch (this.f48650a) {
            case 0:
                this.f48651b.finishFragment();
                return;
            case 1:
                z40 z40Var = this.f48651b;
                z40Var.n0();
                z40Var.j0();
                return;
            case 2:
                z40 z40Var2 = this.f48651b;
                z40Var2.getClass();
                z40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                z40 z40Var3 = this.f48651b;
                z40Var3.f52227n.postOnAnimation(new p40(z40Var3, 1));
                return;
        }
    }
}
