package org.telegram.ui;
public final class od implements Runnable {
    public final int f41092a;
    public final de f41093b;
    public final t91 f41094c;
    public final TwoStepVerificationActivity d;

    public od(de deVar, t91 t91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41092a = i10;
        this.f41093b = deVar;
        this.f41094c = t91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41092a) {
            case 0:
                this.f41093b.G0.setLoading(false);
                this.f41094c.presentFragment(this.d);
                return;
            case 1:
                this.f41093b.M0.setLoading(false);
                this.f41094c.presentFragment(this.d);
                return;
            default:
                this.f41093b.M0.setLoading(false);
                this.f41094c.presentFragment(this.d);
                return;
        }
    }
}
