package org.telegram.ui;
public final class id implements Runnable {
    public final int f48718a;
    public final xd f48719b;
    public final c51 f48720c;
    public final TwoStepVerificationActivity d;

    public id(xd xdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48718a = i7;
        this.f48719b = xdVar;
        this.f48720c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f48718a) {
            case 0:
                this.f48719b.B0.setLoading(false);
                this.f48720c.presentFragment(this.d);
                return;
            case 1:
                this.f48719b.H0.setLoading(false);
                this.f48720c.presentFragment(this.d);
                return;
            default:
                this.f48719b.H0.setLoading(false);
                this.f48720c.presentFragment(this.d);
                return;
        }
    }
}
