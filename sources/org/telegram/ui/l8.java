package org.telegram.ui;
public final class l8 implements Runnable {
    public final int f47494a;
    public final i9 f47495b;

    public l8(i9 i9Var, int i7) {
        this.f47494a = i7;
        this.f47495b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f47494a) {
            case 0:
                this.f47495b.m0(false);
                return;
            default:
                this.f47495b.h0();
                return;
        }
    }
}
