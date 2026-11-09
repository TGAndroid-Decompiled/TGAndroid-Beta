package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class c7 implements Runnable {
    public final int f32552a;
    public final b8 f32553b;
    public final TLRPC.TL_error f32554c;

    public c7(b8 b8Var, TLRPC.TL_error tL_error, int i7) {
        this.f32552a = i7;
        this.f32553b = b8Var;
        this.f32554c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.f32552a) {
            case 0:
                b8 b8Var = this.f32553b;
                frameLayout = (FrameLayout) b8Var.f28624b;
                g6Var = b8Var.I0;
                break;
            case 1:
                b8 b8Var2 = this.f32553b;
                frameLayout = (FrameLayout) b8Var2.f28624b;
                g6Var = b8Var2.I0;
                break;
            case 2:
                b8 b8Var3 = this.f32553b;
                frameLayout = (FrameLayout) b8Var3.f28624b;
                g6Var = b8Var3.I0;
                break;
            default:
                b8 b8Var4 = this.f32553b;
                frameLayout = (FrameLayout) b8Var4.f28624b;
                g6Var = b8Var4.I0;
                break;
        }
        org.telegram.ui.Cells.f1.r(frameLayout, g6Var, this.f32554c, false);
    }
}
