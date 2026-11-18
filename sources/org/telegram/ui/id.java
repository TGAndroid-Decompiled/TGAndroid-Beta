package org.telegram.ui;
public final class id implements Runnable {
    public final int f48709a;
    public final xd f48710b;
    public final c51 f48711c;
    public final TwoStepVerificationActivity d;

    public id(xd xdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48709a = i7;
        this.f48710b = xdVar;
        this.f48711c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f48709a) {
            case 0:
                this.f48710b.B0.setLoading(false);
                this.f48711c.presentFragment(this.d);
                return;
            case 1:
                this.f48710b.H0.setLoading(false);
                this.f48711c.presentFragment(this.d);
                return;
            default:
                this.f48710b.H0.setLoading(false);
                this.f48711c.presentFragment(this.d);
                return;
        }
    }
}
