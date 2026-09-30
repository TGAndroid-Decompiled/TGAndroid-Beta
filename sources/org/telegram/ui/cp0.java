package org.telegram.ui;
public final class cp0 implements Runnable {
    public final int f32845a;
    public final mp0 f32846b;

    public cp0(mp0 mp0Var, int i10) {
        this.f32845a = i10;
        this.f32846b = mp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32845a;
        mp0 mp0Var = this.f32846b;
        switch (i10) {
            case 0:
                if (mp0Var.G) {
                    mp0Var.f35734b.invalidate();
                    return;
                }
                return;
            case 1:
                mp0Var.h();
                return;
            case 2:
                int i11 = mp0.f35731q0;
                mp0Var.h();
                return;
            default:
                int i12 = mp0.f35731q0;
                mp0Var.h();
                return;
        }
    }
}
