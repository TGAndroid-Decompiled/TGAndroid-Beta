package org.telegram.ui;
public final class m8 implements Runnable {
    public final int f49802a;
    public final i9 f49803b;

    public m8(i9 i9Var, int i7) {
        this.f49802a = i7;
        this.f49803b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f49802a) {
            case 0:
                this.f49803b.m0(false);
                return;
            default:
                this.f49803b.h0();
                return;
        }
    }
}
