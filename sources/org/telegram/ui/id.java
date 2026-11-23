package org.telegram.ui;
public final class id implements Runnable {
    public final int f48789a;
    public final xd f48790b;
    public final b51 f48791c;
    public final TwoStepVerificationActivity d;

    public id(xd xdVar, b51 b51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48789a = i7;
        this.f48790b = xdVar;
        this.f48791c = b51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f48789a) {
            case 0:
                this.f48790b.B0.setLoading(false);
                this.f48791c.presentFragment(this.d);
                return;
            case 1:
                this.f48790b.H0.setLoading(false);
                this.f48791c.presentFragment(this.d);
                return;
            default:
                this.f48790b.H0.setLoading(false);
                this.f48791c.presentFragment(this.d);
                return;
        }
    }
}
