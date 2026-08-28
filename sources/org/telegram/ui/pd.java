package org.telegram.ui;
public final class pd implements Runnable {
    public final int f41479a;
    public final fe f41480b;
    public final s91 f41481c;
    public final TwoStepVerificationActivity d;

    public pd(fe feVar, s91 s91Var, TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.f41479a = i9;
        this.f41480b = feVar;
        this.f41481c = s91Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f41479a) {
            case 0:
                this.f41480b.G0.setLoading(false);
                this.f41481c.presentFragment(this.d);
                return;
            case 1:
                this.f41480b.M0.setLoading(false);
                this.f41481c.presentFragment(this.d);
                return;
            default:
                this.f41480b.M0.setLoading(false);
                this.f41481c.presentFragment(this.d);
                return;
        }
    }
}
