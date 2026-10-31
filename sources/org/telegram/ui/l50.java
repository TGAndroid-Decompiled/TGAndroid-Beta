package org.telegram.ui;
public final class l50 implements Runnable {
    public final int f39056a;
    public final v50 f39057b;

    public l50(v50 v50Var, int i10) {
        this.f39056a = i10;
        this.f39057b = v50Var;
    }

    @Override
    public final void run() {
        switch (this.f39056a) {
            case 0:
                this.f39057b.finishFragment();
                return;
            case 1:
                v50 v50Var = this.f39057b;
                v50Var.m0();
                v50Var.i0();
                return;
            case 2:
                v50 v50Var2 = this.f39057b;
                v50Var2.getClass();
                v50Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                v50 v50Var3 = this.f39057b;
                v50Var3.f42621n.postOnAnimation(new l50(v50Var3, 1));
                return;
        }
    }
}
