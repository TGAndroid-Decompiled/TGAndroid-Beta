package org.telegram.ui;
public final class f11 implements Runnable {
    public final int f47424a;
    public final bi.u f47425b;

    public f11(bi.u uVar, int i7) {
        this.f47424a = i7;
        this.f47425b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47424a) {
            case 0:
                org.telegram.messenger.g0.I3(((j01) this.f47425b.f4101f2).h);
                return;
            default:
                this.f47425b.requestFocus();
                return;
        }
    }
}
