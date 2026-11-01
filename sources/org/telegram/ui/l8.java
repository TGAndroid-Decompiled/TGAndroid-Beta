package org.telegram.ui;
public final class l8 implements Runnable {
    public final int f39113a;
    public final j9 f39114b;

    public l8(j9 j9Var, int i10) {
        this.f39113a = i10;
        this.f39114b = j9Var;
    }

    @Override
    public final void run() {
        switch (this.f39113a) {
            case 0:
                this.f39114b.m0(false);
                return;
            default:
                this.f39114b.h0();
                return;
        }
    }
}
