package org.telegram.ui;
public final class g11 implements Runnable {
    public final int f47911a;
    public final bi.u f47912b;

    public g11(bi.u uVar, int i7) {
        this.f47911a = i7;
        this.f47912b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47911a) {
            case 0:
                org.telegram.messenger.g0.I3(((k01) this.f47912b.f4135f2).h);
                return;
            default:
                this.f47912b.requestFocus();
                return;
        }
    }
}
