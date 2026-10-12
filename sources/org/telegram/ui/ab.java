package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ab implements ch.a {
    public final int f34125a;
    public final Object f34126b;

    public ab(Object obj, int i10) {
        this.f34125a = i10;
        this.f34126b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f34125a) {
            case 0:
            case 1:
            default:
                aVar.f2740a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f34125a) {
            case 0:
                ((xb) this.f34126b).Z(canvas, rectF);
                return;
            case 1:
                gq0 gq0Var = (gq0) this.f34126b;
                l0 l0Var = gq0Var.d;
                rp0 rp0Var = gq0Var.h.f34305b;
                hh.d.a(rp0Var, canvas, rectF, rp0Var, l0Var);
                rp0 rp0Var2 = gq0Var.f36463n.f34305b;
                hh.d.a(rp0Var2, canvas, rectF, rp0Var2, l0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f34126b;
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.f32445a;
                hh.d.a(mm0Var, canvas, rectF, mm0Var, premiumPreviewFragment.f32451d0);
                return;
        }
    }
}
