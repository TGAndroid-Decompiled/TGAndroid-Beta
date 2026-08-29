package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class qa implements mg.a {
    public final int f41603a;
    public final Object f41604b;

    public qa(Object obj, int i10) {
        this.f41603a = i10;
        this.f41604b = obj;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f41603a) {
            case 0:
                ((lb) this.f41604b).Z(canvas, rectF);
                return;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.f41604b;
                org.telegram.ui.Components.jl0 jl0Var = premiumPreviewFragment.f35905a;
                rg.c.b(jl0Var, canvas, rectF, jl0Var, premiumPreviewFragment.Z);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f41603a) {
            case 0:
            default:
                xVar.f6956b = true;
                return;
        }
    }
}
