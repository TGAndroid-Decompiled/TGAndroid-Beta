package org.telegram.ui.Components;

import android.widget.FrameLayout;
public final class w6 implements Runnable {
    public final int f32088a;
    public final w7 f32089b;
    public final z60 f32090c;

    public w6(w7 w7Var, z60 z60Var, int i10) {
        this.f32088a = i10;
        this.f32089b = w7Var;
        this.f32090c = z60Var;
    }

    @Override
    public final void run() {
        int i10 = this.f32088a;
        z60 z60Var = this.f32090c;
        w7 w7Var = this.f32089b;
        switch (i10) {
            case 0:
                w7Var.getClass();
                z60Var.u();
                w7Var.P0(1);
                return;
            case 1:
                w7Var.getClass();
                z60Var.u();
                w7Var.P0(2);
                return;
            case 2:
                w7Var.getClass();
                z60Var.u();
                w7Var.P0(4);
                return;
            case 3:
                w7Var.getClass();
                z60Var.u();
                w7Var.P0(7);
                return;
            default:
                w7Var.U0(true);
                org.telegram.messenger.m5.n(null, 2131753912, new cc((FrameLayout) w7Var.f21587b, w7Var.I0), 2131624188, 36);
                z60Var.u();
                return;
        }
    }
}
