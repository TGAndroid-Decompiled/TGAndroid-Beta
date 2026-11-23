package org.telegram.ui.Components;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class h7 implements Runnable {
    public final int f35810a;
    public final f8 f35811b;
    public final TLRPC.TL_error f35812c;

    public h7(f8 f8Var, TLRPC.TL_error tL_error, int i7) {
        this.f35810a = i7;
        this.f35811b = f8Var;
        this.f35812c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        org.telegram.ui.ActionBar.h6 h6Var;
        switch (this.f35810a) {
            case 0:
                f8 f8Var = this.f35811b;
                frameLayout = (FrameLayout) f8Var.f30176b;
                h6Var = f8Var.J0;
                break;
            case 1:
                f8 f8Var2 = this.f35811b;
                frameLayout = (FrameLayout) f8Var2.f30176b;
                h6Var = f8Var2.J0;
                break;
            case 2:
                f8 f8Var3 = this.f35811b;
                frameLayout = (FrameLayout) f8Var3.f30176b;
                h6Var = f8Var3.J0;
                break;
            default:
                f8 f8Var4 = this.f35811b;
                frameLayout = (FrameLayout) f8Var4.f30176b;
                h6Var = f8Var4.J0;
                break;
        }
        org.telegram.ui.Cells.c0.t(frameLayout, h6Var, this.f35812c, false);
    }
}
