package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class g7 implements Runnable {
    public final int f35359a;
    public final g8 f35360b;
    public final TLRPC.TL_error f35361c;

    public g7(g8 g8Var, TLRPC.TL_error tL_error, int i7) {
        this.f35359a = i7;
        this.f35360b = g8Var;
        this.f35361c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.i6 i6Var;
        switch (this.f35359a) {
            case 0:
                g8 g8Var = this.f35360b;
                frameLayout = (FrameLayout) g8Var.f30192b;
                i6Var = g8Var.J0;
                break;
            case 1:
                g8 g8Var2 = this.f35360b;
                frameLayout = (FrameLayout) g8Var2.f30192b;
                i6Var = g8Var2.J0;
                break;
            case 2:
                g8 g8Var3 = this.f35360b;
                frameLayout = (FrameLayout) g8Var3.f30192b;
                i6Var = g8Var3.J0;
                break;
            default:
                g8 g8Var4 = this.f35360b;
                frameLayout = (FrameLayout) g8Var4.f30192b;
                i6Var = g8Var4.J0;
                break;
        }
        org.telegram.ui.Cells.c0.t(frameLayout, i6Var, this.f35361c, false);
    }
}
