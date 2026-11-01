package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f32747a;
    public final w7 f32748b;
    public final TLRPC.TL_error f32749c;

    public y6(w7 w7Var, TLRPC.TL_error tL_error, int i10) {
        this.f32747a = i10;
        this.f32748b = w7Var;
        this.f32749c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.p6 p6Var;
        switch (this.f32747a) {
            case 0:
                w7 w7Var = this.f32748b;
                frameLayout = (FrameLayout) w7Var.f21587b;
                p6Var = w7Var.I0;
                break;
            case 1:
                w7 w7Var2 = this.f32748b;
                frameLayout = (FrameLayout) w7Var2.f21587b;
                p6Var = w7Var2.I0;
                break;
            case 2:
                w7 w7Var3 = this.f32748b;
                frameLayout = (FrameLayout) w7Var3.f21587b;
                p6Var = w7Var3.I0;
                break;
            default:
                w7 w7Var4 = this.f32748b;
                frameLayout = (FrameLayout) w7Var4.f21587b;
                p6Var = w7Var4.I0;
                break;
        }
        org.telegram.ui.Cells.f1.s(frameLayout, p6Var, this.f32749c, false);
    }
}
