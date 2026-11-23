package org.telegram.ui;
public final class f11 implements Runnable {
    public final int f47414a;
    public final bi.u f47415b;

    public f11(bi.u uVar, int i7) {
        this.f47414a = i7;
        this.f47415b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47414a) {
            case 0:
                org.telegram.messenger.g0.I3(((j01) this.f47415b.f4085f2).h);
                return;
            default:
                this.f47415b.requestFocus();
                return;
        }
    }
}
