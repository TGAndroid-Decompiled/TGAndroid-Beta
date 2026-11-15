package org.telegram.ui;
public final class id implements Runnable {
    public final int f48031a;
    public final xd f48032b;
    public final z41 f48033c;
    public final TwoStepVerificationActivity d;

    public id(xd xdVar, z41 z41Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48031a = i7;
        this.f48032b = xdVar;
        this.f48033c = z41Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f48031a) {
            case 0:
                this.f48032b.B0.setLoading(false);
                this.f48033c.presentFragment(this.d);
                return;
            case 1:
                this.f48032b.H0.setLoading(false);
                this.f48033c.presentFragment(this.d);
                return;
            default:
                this.f48032b.H0.setLoading(false);
                this.f48033c.presentFragment(this.d);
                return;
        }
    }
}
