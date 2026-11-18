package org.telegram.ui;
public final class id implements Runnable {
    public final int f48704a;
    public final xd f48705b;
    public final c51 f48706c;
    public final TwoStepVerificationActivity d;

    public id(xd xdVar, c51 c51Var, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.f48704a = i7;
        this.f48705b = xdVar;
        this.f48706c = c51Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f48704a) {
            case 0:
                this.f48705b.B0.setLoading(false);
                this.f48706c.presentFragment(this.d);
                return;
            case 1:
                this.f48705b.H0.setLoading(false);
                this.f48706c.presentFragment(this.d);
                return;
            default:
                this.f48705b.H0.setLoading(false);
                this.f48706c.presentFragment(this.d);
                return;
        }
    }
}
