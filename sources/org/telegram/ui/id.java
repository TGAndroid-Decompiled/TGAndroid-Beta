package org.telegram.ui;
public final class id implements Runnable {
    public final int f48021a;
    public final xd f48022b;
    public final z41 f48023c;
    public final TwoStepVerificationActivity d;

    public id(xd xdVar, z41 z41Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48021a = i7;
        this.f48022b = xdVar;
        this.f48023c = z41Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f48021a) {
            case 0:
                this.f48022b.B0.setLoading(false);
                this.f48023c.presentFragment(this.d);
                return;
            case 1:
                this.f48022b.H0.setLoading(false);
                this.f48023c.presentFragment(this.d);
                return;
            default:
                this.f48022b.H0.setLoading(false);
                this.f48023c.presentFragment(this.d);
                return;
        }
    }
}
