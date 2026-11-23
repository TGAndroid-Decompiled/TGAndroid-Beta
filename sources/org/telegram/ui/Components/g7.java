package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class g7 implements Runnable {
    public final int f35344a;
    public final e8 f35345b;
    public final TLRPC.TL_error f35346c;

    public g7(e8 e8Var, TLRPC.TL_error tL_error, int i7) {
        this.f35344a = i7;
        this.f35345b = e8Var;
        this.f35346c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.i6 i6Var;
        switch (this.f35344a) {
            case 0:
                e8 e8Var = this.f35345b;
                frameLayout = (FrameLayout) e8Var.f30226b;
                i6Var = e8Var.J0;
                break;
            case 1:
                e8 e8Var2 = this.f35345b;
                frameLayout = (FrameLayout) e8Var2.f30226b;
                i6Var = e8Var2.J0;
                break;
            case 2:
                e8 e8Var3 = this.f35345b;
                frameLayout = (FrameLayout) e8Var3.f30226b;
                i6Var = e8Var3.J0;
                break;
            default:
                e8 e8Var4 = this.f35345b;
                frameLayout = (FrameLayout) e8Var4.f30226b;
                i6Var = e8Var4.J0;
                break;
        }
        org.telegram.ui.Cells.c0.t(frameLayout, i6Var, this.f35346c, false);
    }
}
