package org.telegram.ui;
public final class q60 implements Runnable {
    public final int f37316a;
    public final a70 f37317b;

    public q60(a70 a70Var, int i10) {
        this.f37316a = i10;
        this.f37317b = a70Var;
    }

    @Override
    public final void run() {
        switch (this.f37316a) {
            case 0:
                this.f37317b.finishFragment();
                return;
            case 1:
                a70 a70Var = this.f37317b;
                a70Var.i0();
                a70Var.e0();
                return;
            case 2:
                a70 a70Var2 = this.f37317b;
                a70Var2.getClass();
                a70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                a70 a70Var3 = this.f37317b;
                a70Var3.f32499n.postOnAnimation(new q60(a70Var3, 1));
                return;
        }
    }
}
