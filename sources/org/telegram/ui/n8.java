package org.telegram.ui;
public final class n8 implements Runnable {
    public final int f50257a;
    public final j9 f50258b;

    public n8(j9 j9Var, int i7) {
        this.f50257a = i7;
        this.f50258b = j9Var;
    }

    @Override
    public final void run() {
        switch (this.f50257a) {
            case 0:
                this.f50258b.m0(false);
                return;
            default:
                this.f50258b.h0();
                return;
        }
    }
}
