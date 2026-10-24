package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class qr0 implements Runnable {
    public final int f29982a;
    public final wv0 f29983b;

    public qr0(wv0 wv0Var, int i10) {
        this.f29982a = i10;
        this.f29983b = wv0Var;
    }

    @Override
    public final void run() {
        switch (this.f29982a) {
            case 0:
                wv0 wv0Var = this.f29983b;
                ss ssVar = wv0Var.P0;
                wv0Var.f32367c2 = (int) ssVar.c(AndroidUtilities.dp(14.0f));
                ms0 ms0Var = wv0Var.V;
                if (ms0Var != null) {
                    ms0Var.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) ssVar.c(AndroidUtilities.dp(7.0f))));
                }
                pu0[] pu0VarArr = wv0Var.f32386k0;
                if (pu0VarArr != null) {
                    for (pu0 pu0Var : pu0VarArr) {
                        if (pu0Var != null) {
                            int paddingTop = pu0Var.h.getPaddingTop();
                            vs0 vs0Var = pu0Var.h;
                            int paddingLeft = vs0Var.getPaddingLeft();
                            int a02 = wv0Var.a0(pu0Var.F);
                            int paddingRight = pu0Var.h.getPaddingRight();
                            vs0 vs0Var2 = pu0Var.h;
                            int Z = wv0Var.Z(wv0Var.y0());
                            vs0Var2.f29392f3 = Z;
                            vs0Var.setPadding(paddingLeft, a02, paddingRight, Z);
                            AndroidUtilities.doOnLayout(pu0Var.h, new yr0(pu0Var, paddingTop - pu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                wv0 wv0Var2 = this.f29983b;
                wv0Var2.e1(false);
                wv0Var2.G.g(true);
                wv0Var2.f32359a1 = 0;
                return;
            default:
                this.f29983b.m0();
                return;
        }
    }
}
