package org.telegram.ui;

public final class pd implements Runnable {

    public final int f41328a;

    public final fe f41329b;

    public final q91 f41330c;
    public final TwoStepVerificationActivity d;

    public pd(fe feVar, q91 q91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f41328a = i10;
        this.f41329b = feVar;
        this.f41330c = q91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41328a) {
            case 0:
                this.f41329b.G0.setLoading(false);
                this.f41330c.presentFragment(this.d);
                break;
            case 1:
                this.f41329b.M0.setLoading(false);
                this.f41330c.presentFragment(this.d);
                break;
            default:
                this.f41329b.M0.setLoading(false);
                this.f41330c.presentFragment(this.d);
                break;
        }
    }
}
