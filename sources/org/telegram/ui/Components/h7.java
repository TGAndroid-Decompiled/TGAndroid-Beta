package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class h7 implements Runnable {
    public final int f35817a;
    public final f8 f35818b;
    public final TLRPC.TL_error f35819c;

    public h7(f8 f8Var, TLRPC.TL_error tL_error, int i7) {
        this.f35817a = i7;
        this.f35818b = f8Var;
        this.f35819c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.h6 h6Var;
        switch (this.f35817a) {
            case 0:
                f8 f8Var = this.f35818b;
                frameLayout = (FrameLayout) f8Var.f30173b;
                h6Var = f8Var.J0;
                break;
            case 1:
                f8 f8Var2 = this.f35818b;
                frameLayout = (FrameLayout) f8Var2.f30173b;
                h6Var = f8Var2.J0;
                break;
            case 2:
                f8 f8Var3 = this.f35818b;
                frameLayout = (FrameLayout) f8Var3.f30173b;
                h6Var = f8Var3.J0;
                break;
            default:
                f8 f8Var4 = this.f35818b;
                frameLayout = (FrameLayout) f8Var4.f30173b;
                h6Var = f8Var4.J0;
                break;
        }
        org.telegram.ui.Cells.c0.t(frameLayout, h6Var, this.f35819c, false);
    }
}
