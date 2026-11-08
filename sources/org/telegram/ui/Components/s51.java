package org.telegram.ui.Components;
public final class s51 implements Runnable {
    public final int f37930a;
    public final Object f37931b;

    public s51(Object obj, int i7) {
        this.f37930a = i7;
        this.f37931b = obj;
    }

    @Override
    public final void run() {
        switch (this.f37930a) {
            case 0:
                t51 t51Var = (t51) ((li.b6) this.f37931b).f18485f;
                t51Var.f38250a0.removeCallbacksAndMessages(null);
                t51Var.K.F(false, null);
                return;
            case 1:
                ((v51) this.f37931b).f38901g = false;
                return;
            case 2:
                ((l71) ((w30) ((org.telegram.ui.ActionBar.h1) this.f37931b).f27506b).f39794b).f35589w.b();
                return;
            default:
                ((h71) this.f37931b).d(false, true);
                return;
        }
    }
}
