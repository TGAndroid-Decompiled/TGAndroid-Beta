package org.telegram.ui;
public final class m8 implements Runnable {
    public final int f49174a;
    public final i9 f49175b;

    public m8(i9 i9Var, int i7) {
        this.f49174a = i7;
        this.f49175b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f49174a) {
            case 0:
                this.f49175b.m0(false);
                return;
            default:
                this.f49175b.h0();
                return;
        }
    }
}
