package org.telegram.ui;
public final class jd implements Runnable {
    public final int f46931a;
    public final zd f46932b;
    public final c51 f46933c;
    public final TwoStepVerificationActivity d;

    public jd(zd zdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f46931a = i7;
        this.f46932b = zdVar;
        this.f46933c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46931a) {
            case 0:
                this.f46932b.A0.setLoading(false);
                this.f46933c.presentFragment(this.d);
                return;
            case 1:
                this.f46932b.G0.setLoading(false);
                this.f46933c.presentFragment(this.d);
                return;
            default:
                this.f46932b.G0.setLoading(false);
                this.f46933c.presentFragment(this.d);
                return;
        }
    }
}
