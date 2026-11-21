package org.telegram.ui;
public final class g11 implements Runnable {
    public final int f47907a;
    public final bi.u f47908b;

    public g11(bi.u uVar, int i7) {
        this.f47907a = i7;
        this.f47908b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f47907a) {
            case 0:
                org.telegram.messenger.g0.I3(((k01) this.f47908b.f4130f2).h);
                return;
            default:
                this.f47908b.requestFocus();
                return;
        }
    }
}
