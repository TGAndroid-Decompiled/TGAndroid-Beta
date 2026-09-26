package org.telegram.ui.Components;
public final class hh0 implements Runnable {
    public final int f24795a;
    public final kh0 f24796b;

    public hh0(kh0 kh0Var, int i10) {
        this.f24795a = i10;
        this.f24796b = kh0Var;
    }

    @Override
    public final void run() {
        switch (this.f24795a) {
            case 0:
                this.f24796b.a(true);
                return;
            default:
                this.f24796b.d();
                return;
        }
    }
}
