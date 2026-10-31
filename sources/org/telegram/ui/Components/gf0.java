package org.telegram.ui.Components;
public final class gf0 implements o1.f {
    public final int f26365a;
    public final float f26366b;
    public final Object f26367c;

    public gf0(Object obj, float f7, int i10) {
        this.f26365a = i10;
        this.f26367c = obj;
        this.f26366b = f7;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        float L;
        switch (this.f26365a) {
            case 0:
                hf0 hf0Var = (hf0) this.f26367c;
                if (!z10) {
                    jf0 jf0Var = hf0Var.d;
                    o1.k kVar = jf0Var.M.f13957m;
                    int i10 = jf0Var.H;
                    float f11 = (i10 / 2.0f) + this.f26366b;
                    int i11 = org.telegram.messenger.i0.f16026q.x;
                    if (f11 >= i11 / 2.0f) {
                        L = (i11 - i10) - org.telegram.messenger.i0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(16.0f);
                    }
                    kVar.f13964i = L;
                    return;
                }
                return;
            case 1:
                vh.o8 o8Var = (vh.o8) this.f26367c;
                if (!z10) {
                    o8Var.M0.setTranslationY(this.f26366b);
                    o8Var.M0.K = false;
                    o8Var.f51650o2 = null;
                    o8Var.f51653p2 = null;
                    return;
                }
                return;
            default:
                xh.h3 h3Var = (xh.h3) this.f26367c;
                h3Var.f53793w = null;
                float f12 = this.f26366b;
                if (!z10) {
                    h3Var.f53789f = f12;
                    h3Var.c();
                    return;
                }
                h3Var.h = f12;
                return;
        }
    }
}
