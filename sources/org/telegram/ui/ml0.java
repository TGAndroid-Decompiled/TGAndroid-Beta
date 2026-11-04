package org.telegram.ui;
public final class ml0 implements Runnable {
    public final int f47698a;
    public final wl0 f47699b;

    public ml0(wl0 wl0Var, int i3) {
        this.f47698a = i3;
        this.f47699b = wl0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f47698a;
        wl0 wl0Var = this.f47699b;
        switch (i3) {
            case 0:
                if (wl0Var.H) {
                    wl0Var.f51202b.invalidate();
                    return;
                }
                return;
            case 1:
                wl0Var.h();
                return;
            case 2:
                int i10 = wl0.f51199r0;
                wl0Var.h();
                return;
            default:
                int i11 = wl0.f51199r0;
                wl0Var.h();
                return;
        }
    }
}
