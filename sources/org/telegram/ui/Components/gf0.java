package org.telegram.ui.Components;
public final class gf0 implements o1.f {
    public final int f26430a;
    public final float f26431b;
    public final Object f26432c;

    public gf0(Object obj, float f7, int i10) {
        this.f26430a = i10;
        this.f26432c = obj;
        this.f26431b = f7;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        float L;
        switch (this.f26430a) {
            case 0:
                hf0 hf0Var = (hf0) this.f26432c;
                if (!z10) {
                    jf0 jf0Var = hf0Var.d;
                    o1.k kVar = jf0Var.M.f13958m;
                    int i10 = jf0Var.H;
                    float f11 = (i10 / 2.0f) + this.f26431b;
                    int i11 = org.telegram.messenger.i0.f16172q.x;
                    if (f11 >= i11 / 2.0f) {
                        L = (i11 - i10) - org.telegram.messenger.i0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(16.0f);
                    }
                    kVar.f13965i = L;
                    return;
                }
                return;
            case 1:
                vh.o8 o8Var = (vh.o8) this.f26432c;
                if (!z10) {
                    o8Var.M0.setTranslationY(this.f26431b);
                    o8Var.M0.K = false;
                    o8Var.f51665o2 = null;
                    o8Var.f51668p2 = null;
                    return;
                }
                return;
            default:
                xh.i3 i3Var = (xh.i3) this.f26432c;
                i3Var.f53827w = null;
                float f12 = this.f26431b;
                if (!z10) {
                    i3Var.f53823f = f12;
                    i3Var.c();
                    return;
                }
                i3Var.h = f12;
                return;
        }
    }
}
