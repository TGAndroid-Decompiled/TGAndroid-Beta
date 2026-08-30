package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ig0 implements o1.f {
    public final int f25714a;
    public final float f25715b;
    public final Object f25716c;

    public ig0(Object obj, float f10, int i10) {
        this.f25714a = i10;
        this.f25716c = obj;
        this.f25715b = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        float dp;
        switch (this.f25714a) {
            case 0:
                jg0 jg0Var = (jg0) this.f25716c;
                if (!z4) {
                    lg0 lg0Var = jg0Var.d;
                    o1.k kVar = lg0Var.J.f16198u;
                    int i10 = lg0Var.E;
                    float f12 = (i10 / 2.0f) + this.f25715b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f16204i = dp;
                    return;
                }
                return;
            case 1:
                ph.da daVar = (ph.da) this.f25716c;
                if (!z4) {
                    daVar.J0.setTranslationY(this.f25715b);
                    daVar.J0.H = false;
                    daVar.f41509l2 = null;
                    daVar.f41511m2 = null;
                    return;
                }
                return;
            default:
                rh.n3 n3Var = (rh.n3) this.f25716c;
                n3Var.v = null;
                float f13 = this.f25715b;
                if (!z4) {
                    n3Var.f43630f = f13;
                    n3Var.c();
                    return;
                }
                n3Var.h = f13;
                return;
        }
    }
}
