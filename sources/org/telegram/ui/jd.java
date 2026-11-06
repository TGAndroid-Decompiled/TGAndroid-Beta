package org.telegram.ui;
public final class jd implements Runnable {
    public final int f46933a;
    public final zd f46934b;
    public final c51 f46935c;
    public final TwoStepVerificationActivity d;

    public jd(zd zdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46933a = i7;
        this.f46934b = zdVar;
        this.f46935c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46933a) {
            case 0:
                this.f46934b.A0.setLoading(false);
                this.f46935c.presentFragment(this.d);
                return;
            case 1:
                this.f46934b.G0.setLoading(false);
                this.f46935c.presentFragment(this.d);
                return;
            default:
                this.f46934b.G0.setLoading(false);
                this.f46935c.presentFragment(this.d);
                return;
        }
    }
}
