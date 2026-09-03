package org.telegram.ui;
public final class p60 implements Runnable {
    public final int f39902a;
    public final z60 f39903b;

    public p60(z60 z60Var, int i10) {
        this.f39902a = i10;
        this.f39903b = z60Var;
    }

    @Override
    public final void run() {
        switch (this.f39902a) {
            case 0:
                this.f39903b.finishFragment();
                return;
            case 1:
                z60 z60Var = this.f39903b;
                z60Var.i0();
                z60Var.e0();
                return;
            case 2:
                z60 z60Var2 = this.f39903b;
                z60Var2.getClass();
                z60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                z60 z60Var3 = this.f39903b;
                z60Var3.f43828n.postOnAnimation(new p60(z60Var3, 1));
                return;
        }
    }
}
