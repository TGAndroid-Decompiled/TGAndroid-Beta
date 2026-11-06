package org.telegram.ui.Components;
public final class s51 implements Runnable {
    public final int f37914a;
    public final Object f37915b;

    public s51(Object obj, int i7) {
        this.f37914a = i7;
        this.f37915b = obj;
    }

    @Override
    public final void run() {
        switch (this.f37914a) {
            case 0:
                t51 t51Var = (t51) ((li.b6) this.f37915b).f18482f;
                t51Var.f38222a0.removeCallbacksAndMessages(null);
                t51Var.K.F(false, null);
                return;
            case 1:
                ((v51) this.f37915b).f38866g = false;
                return;
            case 2:
                ((l71) ((w30) ((org.telegram.ui.ActionBar.h1) this.f37915b).f27503b).f39844b).f35571w.b();
                return;
            default:
                ((h71) this.f37915b).d(false, true);
                return;
        }
    }
}
