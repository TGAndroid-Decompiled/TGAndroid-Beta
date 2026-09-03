package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class jg0 implements o1.f {
    public final int f25959a;
    public final float f25960b;
    public final Object f25961c;

    public jg0(Object obj, float f10, int i10) {
        this.f25959a = i10;
        this.f25961c = obj;
        this.f25960b = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        float dp;
        switch (this.f25959a) {
            case 0:
                kg0 kg0Var = (kg0) this.f25961c;
                if (!z4) {
                    mg0 mg0Var = kg0Var.d;
                    o1.k kVar = mg0Var.J.f16178u;
                    int i10 = mg0Var.E;
                    float f12 = (i10 / 2.0f) + this.f25960b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f16184i = dp;
                    return;
                }
                return;
            case 1:
                ph.da daVar = (ph.da) this.f25961c;
                if (!z4) {
                    daVar.J0.setTranslationY(this.f25960b);
                    daVar.J0.H = false;
                    daVar.f41547l2 = null;
                    daVar.f41549m2 = null;
                    return;
                }
                return;
            default:
                rh.m3 m3Var = (rh.m3) this.f25961c;
                m3Var.v = null;
                float f13 = this.f25960b;
                if (!z4) {
                    m3Var.f43682f = f13;
                    m3Var.c();
                    return;
                }
                m3Var.h = f13;
                return;
        }
    }
}
