package org.telegram.ui;
public final class l8 implements Runnable {
    public final int f47467a;
    public final i9 f47468b;

    public l8(i9 i9Var, int i7) {
        this.f47467a = i7;
        this.f47468b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f47467a) {
            case 0:
                this.f47468b.m0(false);
                return;
            default:
                this.f47468b.h0();
                return;
        }
    }
}
