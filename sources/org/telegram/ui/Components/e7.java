package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class e7 implements Runnable {
    public final int f34633a;
    public final g8 f34634b;
    public final y60 f34635c;

    public e7(g8 g8Var, y60 y60Var, int i7) {
        this.f34633a = i7;
        this.f34634b = g8Var;
        this.f34635c = y60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f34633a;
        y60 y60Var = this.f34635c;
        g8 g8Var = this.f34634b;
        switch (i7) {
            case 0:
                g8Var.getClass();
                y60Var.v();
                g8Var.Q0(1);
                return;
            case 1:
                g8Var.getClass();
                y60Var.v();
                g8Var.Q0(2);
                return;
            case 2:
                g8Var.getClass();
                y60Var.v();
                g8Var.Q0(4);
                return;
            case 3:
                g8Var.getClass();
                y60Var.v();
                g8Var.Q0(7);
                return;
            default:
                g8Var.V0(true);
                org.telegram.messenger.f3.n(null, 2131753910, new lc((FrameLayout) g8Var.f30192b, g8Var.J0), 2131624191, 36);
                y60Var.v();
                return;
        }
    }
}
