package org.telegram.ui;
public final class m8 implements Runnable {
    public final int f49178a;
    public final i9 f49179b;

    public m8(i9 i9Var, int i7) {
        this.f49178a = i7;
        this.f49179b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f49178a) {
            case 0:
                this.f49179b.m0(false);
                return;
            default:
                this.f49179b.h0();
                return;
        }
    }
}
