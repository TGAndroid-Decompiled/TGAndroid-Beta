package org.telegram.ui;
public final class b11 implements Runnable {
    public final int f45554a;
    public final bi.u f45555b;

    public b11(bi.u uVar, int i7) {
        this.f45554a = i7;
        this.f45555b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f45554a) {
            case 0:
                org.telegram.messenger.g0.J3(((f01) this.f45555b.f3887f2).h);
                return;
            default:
                this.f45555b.requestFocus();
                return;
        }
    }
}
