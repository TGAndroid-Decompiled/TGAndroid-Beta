package org.telegram.ui;
public final class ng0 implements Runnable {
    public final int f50315a;
    public final tg0 f50316b;

    public ng0(tg0 tg0Var, int i7) {
        this.f50315a = i7;
        this.f50316b = tg0Var;
    }

    @Override
    public final void run() {
        switch (this.f50315a) {
            case 0:
                this.f50316b.dismiss();
                return;
            case 1:
                this.f50316b.h1(true, false);
                return;
            default:
                this.f50316b.h1(true, false);
                return;
        }
    }
}
