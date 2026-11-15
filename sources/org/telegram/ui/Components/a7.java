package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class a7 implements Runnable {
    public final int f32906a;
    public final y7 f32907b;
    public final TLRPC.TL_error f32908c;

    public a7(y7 y7Var, TLRPC.TL_error tL_error, int i7) {
        this.f32906a = i7;
        this.f32907b = y7Var;
        this.f32908c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.f32906a) {
            case 0:
                y7 y7Var = this.f32907b;
                frameLayout = (FrameLayout) y7Var.f29682b;
                e6Var = y7Var.J0;
                break;
            case 1:
                y7 y7Var2 = this.f32907b;
                frameLayout = (FrameLayout) y7Var2.f29682b;
                e6Var = y7Var2.J0;
                break;
            case 2:
                y7 y7Var3 = this.f32907b;
                frameLayout = (FrameLayout) y7Var3.f29682b;
                e6Var = y7Var3.J0;
                break;
            default:
                y7 y7Var4 = this.f32907b;
                frameLayout = (FrameLayout) y7Var4.f29682b;
                e6Var = y7Var4.J0;
                break;
        }
        org.telegram.ui.Cells.y0.q(frameLayout, e6Var, this.f32908c, false);
    }
}
