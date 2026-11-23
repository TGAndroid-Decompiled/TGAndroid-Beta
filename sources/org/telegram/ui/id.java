package org.telegram.ui;
public final class id implements Runnable {
    public final int f48738a;
    public final xd f48739b;
    public final c51 f48740c;
    public final TwoStepVerificationActivity d;

    public id(xd xdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48738a = i7;
        this.f48739b = xdVar;
        this.f48740c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f48738a) {
            case 0:
                this.f48739b.B0.setLoading(false);
                this.f48740c.presentFragment(this.d);
                return;
            case 1:
                this.f48739b.H0.setLoading(false);
                this.f48740c.presentFragment(this.d);
                return;
            default:
                this.f48739b.H0.setLoading(false);
                this.f48740c.presentFragment(this.d);
                return;
        }
    }
}
