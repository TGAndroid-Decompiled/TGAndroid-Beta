package org.telegram.ui.Components;
public final class r51 implements Runnable {
    public final int f37556a;
    public final Object f37557b;

    public r51(Object obj, int i7) {
        this.f37556a = i7;
        this.f37557b = obj;
    }

    @Override
    public final void run() {
        switch (this.f37556a) {
            case 0:
                s51 s51Var = (s51) ((li.b6) this.f37557b).f18482f;
                s51Var.f37900a0.removeCallbacksAndMessages(null);
                s51Var.K.F(false, null);
                return;
            case 1:
                ((u51) this.f37557b).f38509g = false;
                return;
            case 2:
                ((k71) ((w30) ((org.telegram.ui.ActionBar.h1) this.f37557b).f27502b).f39822b).f35231w.b();
                return;
            default:
                ((g71) this.f37557b).d(false, true);
                return;
        }
    }
}
