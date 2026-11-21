package org.telegram.ui;
public final class id implements Runnable {
    public final int f48734a;
    public final xd f48735b;
    public final c51 f48736c;
    public final TwoStepVerificationActivity d;

    public id(xd xdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48734a = i7;
        this.f48735b = xdVar;
        this.f48736c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f48734a) {
            case 0:
                this.f48735b.B0.setLoading(false);
                this.f48736c.presentFragment(this.d);
                return;
            case 1:
                this.f48735b.H0.setLoading(false);
                this.f48736c.presentFragment(this.d);
                return;
            default:
                this.f48735b.H0.setLoading(false);
                this.f48736c.presentFragment(this.d);
                return;
        }
    }
}
