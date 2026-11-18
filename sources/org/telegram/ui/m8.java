package org.telegram.ui;
public final class m8 implements Runnable {
    public final int f49735a;
    public final i9 f49736b;

    public m8(i9 i9Var, int i7) {
        this.f49735a = i7;
        this.f49736b = i9Var;
    }

    @Override
    public final void run() {
        switch (this.f49735a) {
            case 0:
                this.f49736b.m0(false);
                return;
            default:
                this.f49736b.h0();
                return;
        }
    }
}
