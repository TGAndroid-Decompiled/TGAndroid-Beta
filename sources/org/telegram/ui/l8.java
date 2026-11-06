package org.telegram.ui;
public final class l8 implements Runnable {
    public final int f47441a;
    public final i9 f47442b;

    public l8(i9 i9Var, int i7) {
        this.f47441a = i7;
        this.f47442b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f47441a) {
            case 0:
                this.f47442b.m0(false);
                return;
            default:
                this.f47442b.h0();
                return;
        }
    }
}
