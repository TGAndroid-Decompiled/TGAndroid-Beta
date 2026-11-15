package org.telegram.ui;
public final class b11 implements Runnable {
    public final int f45560a;
    public final bi.u f45561b;

    public b11(bi.u uVar, int i7) {
        this.f45560a = i7;
        this.f45561b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f45560a) {
            case 0:
                org.telegram.messenger.g0.J3(((f01) this.f45561b.f3884f2).h);
                return;
            default:
                this.f45561b.requestFocus();
                return;
        }
    }
}
