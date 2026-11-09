package org.telegram.ui;
public final class mg0 implements Runnable {
    public final int f47873a;
    public final sg0 f47874b;

    public mg0(sg0 sg0Var, int i7) {
        this.f47873a = i7;
        this.f47874b = sg0Var;
    }

    @Override
    public final void run() {
        switch (this.f47873a) {
            case 0:
                this.f47874b.dismiss();
                return;
            case 1:
                this.f47874b.g1(true, false);
                return;
            default:
                this.f47874b.g1(true, false);
                return;
        }
    }
}
