package org.telegram.ui.Components;
public final class s51 implements Runnable {
    public final int f37873a;
    public final Object f37874b;

    public s51(Object obj, int i7) {
        this.f37873a = i7;
        this.f37874b = obj;
    }

    @Override
    public final void run() {
        switch (this.f37873a) {
            case 0:
                t51 t51Var = (t51) ((li.b6) this.f37874b).f18488f;
                t51Var.f38195a0.removeCallbacksAndMessages(null);
                t51Var.K.F(false, null);
                return;
            case 1:
                ((v51) this.f37874b).f38869g = false;
                return;
            case 2:
                ((l71) ((w30) ((org.telegram.ui.ActionBar.h1) this.f37874b).f27516b).f39869b).f35599w.b();
                return;
            default:
                ((h71) this.f37874b).d(false, true);
                return;
        }
    }
}
