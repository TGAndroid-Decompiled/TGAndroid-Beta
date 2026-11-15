package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class y6 implements Runnable {
    public final int f41881a;
    public final y7 f41882b;
    public final m60 f41883c;

    public y6(y7 y7Var, m60 m60Var, int i7) {
        this.f41881a = i7;
        this.f41882b = y7Var;
        this.f41883c = m60Var;
    }

    @Override
    public final void run() {
        int i7 = this.f41881a;
        m60 m60Var = this.f41883c;
        y7 y7Var = this.f41882b;
        switch (i7) {
            case 0:
                y7Var.getClass();
                m60Var.u();
                y7Var.P0(1);
                return;
            case 1:
                y7Var.getClass();
                m60Var.u();
                y7Var.P0(2);
                return;
            case 2:
                y7Var.getClass();
                m60Var.u();
                y7Var.P0(4);
                return;
            case 3:
                y7Var.getClass();
                m60Var.u();
                y7Var.P0(7);
                return;
            default:
                y7Var.U0(true);
                org.telegram.messenger.k5.n(null, 2131753912, new cc((FrameLayout) y7Var.f29682b, y7Var.J0), 2131624191, 36);
                m60Var.u();
                return;
        }
    }
}
