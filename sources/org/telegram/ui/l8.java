package org.telegram.ui;
public final class l8 implements Runnable {
    public final int f47465a;
    public final i9 f47466b;

    public l8(i9 i9Var, int i7) {
        this.f47465a = i7;
        this.f47466b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f47465a) {
            case 0:
                this.f47466b.m0(false);
                return;
            default:
                this.f47466b.h0();
                return;
        }
    }
}
