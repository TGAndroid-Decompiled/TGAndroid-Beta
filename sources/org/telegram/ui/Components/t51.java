package org.telegram.ui.Components;
public final class t51 implements Runnable {
    public final int f38300a;
    public final Object f38301b;

    public t51(Object obj, int i7) {
        this.f38300a = i7;
        this.f38301b = obj;
    }

    @Override
    public final void run() {
        switch (this.f38300a) {
            case 0:
                u51 u51Var = (u51) ((li.b6) this.f38301b).f18485f;
                u51Var.f38604a0.removeCallbacksAndMessages(null);
                u51Var.K.F(false, null);
                return;
            case 1:
                ((w51) this.f38301b).f39925g = false;
                return;
            case 2:
                ((m71) ((x30) ((org.telegram.ui.ActionBar.h1) this.f38301b).f27506b).f40285b).f36015w.b();
                return;
            default:
                ((i71) this.f38301b).d(false, true);
                return;
        }
    }
}
