package org.telegram.ui;
public final class e11 implements Runnable {
    public final int f47293a;
    public final bi.u f47294b;

    public e11(bi.u uVar, int i7) {
        this.f47293a = i7;
        this.f47294b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47293a) {
            case 0:
                org.telegram.messenger.g0.I3(((i01) this.f47294b.f4085f2).h);
                return;
            default:
                this.f47294b.requestFocus();
                return;
        }
    }
}
