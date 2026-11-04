package org.telegram.ui;
public final class id implements Runnable {
    public final int f46241a;
    public final xd f46242b;
    public final r41 f46243c;
    public final TwoStepVerificationActivity d;

    public id(xd xdVar, r41 r41Var, TwoStepVerificationActivity twoStepVerificationActivity, int i3) {
        this.f46241a = i3;
        this.f46242b = xdVar;
        this.f46243c = r41Var;
        this.d = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.f46241a) {
            case 0:
                this.f46242b.B0.setLoading(false);
                this.f46243c.presentFragment(this.d);
                return;
            case 1:
                this.f46242b.H0.setLoading(false);
                this.f46243c.presentFragment(this.d);
                return;
            default:
                this.f46242b.H0.setLoading(false);
                this.f46243c.presentFragment(this.d);
                return;
        }
    }
}
