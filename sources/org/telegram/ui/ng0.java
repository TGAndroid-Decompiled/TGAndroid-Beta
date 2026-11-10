package org.telegram.ui;
public final class ng0 implements Runnable {
    public final int f48207a;
    public final tg0 f48208b;

    public ng0(tg0 tg0Var, int i7) {
        this.f48207a = i7;
        this.f48208b = tg0Var;
    }

    @Override
    public final void run() {
        switch (this.f48207a) {
            case 0:
                this.f48208b.dismiss();
                return;
            case 1:
                this.f48208b.g1(true, false);
                return;
            default:
                this.f48208b.g1(true, false);
                return;
        }
    }
}
