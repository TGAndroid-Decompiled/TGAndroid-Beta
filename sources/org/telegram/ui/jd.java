package org.telegram.ui;
public final class jd implements Runnable {
    public final int f46954a;
    public final zd f46955b;
    public final e51 f46956c;
    public final TwoStepVerificationActivity d;

    public jd(zd zdVar, e51 e51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46954a = i7;
        this.f46955b = zdVar;
        this.f46956c = e51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46954a) {
            case 0:
                this.f46955b.A0.setLoading(false);
                this.f46956c.presentFragment(this.d);
                return;
            case 1:
                this.f46955b.G0.setLoading(false);
                this.f46956c.presentFragment(this.d);
                return;
            default:
                this.f46955b.G0.setLoading(false);
                this.f46956c.presentFragment(this.d);
                return;
        }
    }
}
