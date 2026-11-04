package org.telegram.ui.Components;
public final class bh0 implements Runnable {
    public final int f32210a;
    public final ch0 f32211b;

    public bh0(ch0 ch0Var, int i3) {
        this.f32210a = i3;
        this.f32211b = ch0Var;
    }

    @Override
    public final void run() {
        switch (this.f32210a) {
            case 0:
                ch0 ch0Var = this.f32211b;
                ch0Var.getClass();
                try {
                    cg.h hVar = ch0Var.C0;
                    if (hVar != null) {
                        hVar.b();
                    }
                } catch (Throwable unused) {
                }
                org.telegram.messenger.g0.h3(ch0Var.A0);
                return;
            case 1:
                ch0 ch0Var2 = this.f32211b;
                ch0Var2.Q = null;
                ch0Var2.p();
                return;
            case 2:
                ch0.h(this.f32211b);
                return;
            case 3:
                ch0.e(this.f32211b);
                return;
            case 4:
                ch0.d(this.f32211b);
                return;
            case 5:
                ch0.f(this.f32211b);
                return;
            default:
                this.f32211b.m();
                return;
        }
    }
}
