package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class b7 implements Runnable {
    public final int f32128a;
    public final a8 f32129b;
    public final TLRPC.TL_error f32130c;

    public b7(a8 a8Var, TLRPC.TL_error tL_error, int i7) {
        this.f32128a = i7;
        this.f32129b = a8Var;
        this.f32130c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.h6 h6Var;
        switch (this.f32128a) {
            case 0:
                a8 a8Var = this.f32129b;
                frameLayout = (FrameLayout) a8Var.f28672b;
                h6Var = a8Var.I0;
                break;
            case 1:
                a8 a8Var2 = this.f32129b;
                frameLayout = (FrameLayout) a8Var2.f28672b;
                h6Var = a8Var2.I0;
                break;
            case 2:
                a8 a8Var3 = this.f32129b;
                frameLayout = (FrameLayout) a8Var3.f28672b;
                h6Var = a8Var3.I0;
                break;
            default:
                a8 a8Var4 = this.f32129b;
                frameLayout = (FrameLayout) a8Var4.f28672b;
                h6Var = a8Var4.I0;
                break;
        }
        org.telegram.ui.Cells.f1.r(frameLayout, h6Var, this.f32130c, false);
    }
}
