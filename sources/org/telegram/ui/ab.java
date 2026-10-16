package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ab implements ch.a {
    public final int f33828a;
    public final Object f33829b;

    public ab(Object obj, int i10) {
        this.f33828a = i10;
        this.f33829b = obj;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f33828a) {
            case 0:
            case 1:
            default:
                aVar.f2744a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.f33828a) {
            case 0:
                ((xb) this.f33829b).Z(canvas, rectF);
                return;
            case 1:
                eq0 eq0Var = (eq0) this.f33829b;
                l0 l0Var = eq0Var.d;
                pp0 pp0Var = eq0Var.h.f41863b;
                hh.d.a(pp0Var, canvas, rectF, pp0Var, l0Var);
                pp0 pp0Var2 = eq0Var.f35362n.f41863b;
                hh.d.a(pp0Var2, canvas, rectF, pp0Var2, l0Var);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f33829b;
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.f32147a;
                hh.d.a(mm0Var, canvas, rectF, mm0Var, premiumPreviewFragment.f32153d0);
                return;
        }
    }
}
