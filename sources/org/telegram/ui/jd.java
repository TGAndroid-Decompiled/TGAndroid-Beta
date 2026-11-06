package org.telegram.ui;
public final class jd implements Runnable {
    public final int f46910a;
    public final zd f46911b;
    public final c51 f46912c;
    public final TwoStepVerificationActivity d;

    public jd(zd zdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46910a = i7;
        this.f46911b = zdVar;
        this.f46912c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46910a) {
            case 0:
                this.f46911b.A0.setLoading(false);
                this.f46912c.presentFragment(this.d);
                return;
            case 1:
                this.f46911b.G0.setLoading(false);
                this.f46912c.presentFragment(this.d);
                return;
            default:
                this.f46911b.G0.setLoading(false);
                this.f46912c.presentFragment(this.d);
                return;
        }
    }
}
