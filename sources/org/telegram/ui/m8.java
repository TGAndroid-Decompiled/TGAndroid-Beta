package org.telegram.ui;
public final class m8 implements Runnable {
    public final int f49779a;
    public final j9 f49780b;

    public m8(j9 j9Var, int i7) {
        this.f49779a = i7;
        this.f49780b = j9Var;
    }

    @Override
    public final void run() {
        switch (this.f49779a) {
            case 0:
                this.f49780b.m0(false);
                return;
            default:
                this.f49780b.h0();
                return;
        }
    }
}
