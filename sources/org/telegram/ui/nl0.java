package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class nl0 extends org.telegram.ui.Components.tj0 {
    public final int f48019f3;
    public final wl0 f48020g3;

    public nl0(wl0 wl0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f48020g3 = wl0Var;
        this.f48019f3 = i3;
    }

    @Override
    public final Integer V0(int i3) {
        wl0 wl0Var = this.f48020g3;
        if ((i3 >= wl0Var.f51205c0 && i3 < wl0Var.f51206d0) || (i3 >= wl0Var.f51208e0 && i3 < wl0Var.f51210f0)) {
            return 0;
        }
        return super.V0(i3);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        wl0 wl0Var = this.f48020g3;
        if (wl0Var.H && wl0Var.F != null && wl0Var.G != null) {
            int save = canvas.save();
            canvas.translate(wl0Var.F.getLeft() + wl0Var.G.getLeft(), wl0Var.G.getTop());
            wl0Var.F.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        ci.v8 v8Var;
        super.onLayout(z10, i3, i10, i11, i12);
        wl0 wl0Var = this.f48020g3;
        cm0 cm0Var = wl0Var.f51221q0;
        wl0Var.h();
        if (wl0Var.L != null) {
            if (wl0Var.K != null && wl0Var.c()) {
                wl0Var.K.g(false);
                return;
            }
            return;
        }
        if (this.f48019f3 == 1) {
            v8Var = cm0Var.f44392c;
        } else {
            v8Var = cm0Var.f44390b;
        }
        if (v8Var != null && wl0Var.c()) {
            v8Var.a();
        }
    }
}
