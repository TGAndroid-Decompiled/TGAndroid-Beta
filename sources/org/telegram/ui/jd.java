package org.telegram.ui;
public final class jd implements Runnable {
    public final int f46934a;
    public final zd f46935b;
    public final c51 f46936c;
    public final TwoStepVerificationActivity d;

    public jd(zd zdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46934a = i7;
        this.f46935b = zdVar;
        this.f46936c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46934a) {
            case 0:
                this.f46935b.A0.setLoading(false);
                this.f46936c.presentFragment(this.d);
                return;
            case 1:
                this.f46935b.G0.setLoading(false);
                this.f46936c.presentFragment(this.d);
                return;
            default:
                this.f46935b.G0.setLoading(false);
                this.f46936c.presentFragment(this.d);
                return;
        }
    }
}
