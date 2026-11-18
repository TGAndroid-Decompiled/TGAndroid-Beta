package org.telegram.ui;
public final class f11 implements Runnable {
    public final int f47380a;
    public final bi.u f47381b;

    public f11(bi.u uVar, int i7) {
        this.f47380a = i7;
        this.f47381b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47380a) {
            case 0:
                org.telegram.messenger.g0.I3(((j01) this.f47381b.f4072f2).h);
                return;
            default:
                this.f47381b.requestFocus();
                return;
        }
    }
}
