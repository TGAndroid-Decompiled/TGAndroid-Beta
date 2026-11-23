package org.telegram.ui;
public final class m8 implements Runnable {
    public final int f49756a;
    public final i9 f49757b;

    public m8(i9 i9Var, int i7) {
        this.f49756a = i7;
        this.f49757b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f49756a) {
            case 0:
                this.f49757b.m0(false);
                return;
            default:
                this.f49757b.h0();
                return;
        }
    }
}
