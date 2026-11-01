package org.telegram.ui;
public final class k50 implements Runnable {
    public final int f38653a;
    public final u50 f38654b;

    public k50(u50 u50Var, int i10) {
        this.f38653a = i10;
        this.f38654b = u50Var;
    }

    @Override
    public final void run() {
        switch (this.f38653a) {
            case 0:
                this.f38654b.finishFragment();
                return;
            case 1:
                u50 u50Var = this.f38654b;
                u50Var.n0();
                u50Var.j0();
                return;
            case 2:
                u50 u50Var2 = this.f38654b;
                u50Var2.getClass();
                u50Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                u50 u50Var3 = this.f38654b;
                u50Var3.f41816n.postOnAnimation(new k50(u50Var3, 1));
                return;
        }
    }
}
