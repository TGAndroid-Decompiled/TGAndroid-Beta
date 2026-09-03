package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class kg0 implements o1.f {
    public final int f28413a;
    public final float f28414b;
    public final Object f28415c;

    public kg0(Object obj, float f10, int i10) {
        this.f28413a = i10;
        this.f28415c = obj;
        this.f28414b = f10;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        float dp;
        switch (this.f28413a) {
            case 0:
                lg0 lg0Var = (lg0) this.f28415c;
                if (!z4) {
                    ng0 ng0Var = lg0Var.d;
                    o1.k kVar = ng0Var.J.f16338u;
                    int i10 = ng0Var.E;
                    float f12 = (i10 / 2.0f) + this.f28414b;
                    int i11 = AndroidUtilities.displaySize.x;
                    if (f12 >= i11 / 2.0f) {
                        dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(16.0f);
                    }
                    kVar.f16345i = dp;
                    return;
                }
                return;
            case 1:
                qh.ba baVar = (qh.ba) this.f28415c;
                if (!z4) {
                    baVar.J0.setTranslationY(this.f28414b);
                    baVar.J0.H = false;
                    baVar.f45078l2 = null;
                    baVar.f45080m2 = null;
                    return;
                }
                return;
            default:
                sh.m3 m3Var = (sh.m3) this.f28415c;
                m3Var.v = null;
                float f13 = this.f28414b;
                if (!z4) {
                    m3Var.f47567f = f13;
                    m3Var.c();
                    return;
                }
                m3Var.h = f13;
                return;
        }
    }
}
