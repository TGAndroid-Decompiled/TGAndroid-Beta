package org.telegram.ui;
public final class l8 implements Runnable {
    public final int f47542a;
    public final i9 f47543b;

    public l8(i9 i9Var, int i7) {
        this.f47542a = i7;
        this.f47543b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f47542a) {
            case 0:
                this.f47543b.m0(false);
                return;
            default:
                this.f47543b.h0();
                return;
        }
    }
}
