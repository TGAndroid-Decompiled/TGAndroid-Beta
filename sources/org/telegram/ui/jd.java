package org.telegram.ui;
public final class jd implements Runnable {
    public final int f46935a;
    public final zd f46936b;
    public final d51 f46937c;
    public final TwoStepVerificationActivity d;

    public jd(zd zdVar, d51 d51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46935a = i7;
        this.f46936b = zdVar;
        this.f46937c = d51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46935a) {
            case 0:
                this.f46936b.A0.setLoading(false);
                this.f46937c.presentFragment(this.d);
                return;
            case 1:
                this.f46936b.G0.setLoading(false);
                this.f46937c.presentFragment(this.d);
                return;
            default:
                this.f46936b.G0.setLoading(false);
                this.f46937c.presentFragment(this.d);
                return;
        }
    }
}
