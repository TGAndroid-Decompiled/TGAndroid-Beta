package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class xs0 extends w00 {
    public final ls0 U;
    public final pv0 V;

    public xs0(pv0 pv0Var, Context context, ls0 ls0Var) {
        super(context, null);
        this.V = pv0Var;
        this.U = ls0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f29785m1[pv0.p0(this.U.F) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i10 = this.U.F;
        if (i10 == 0 || i10 == 5) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 != 2 && i10 != 4) {
            if (i10 == 3) {
                return 5;
            }
            if (i10 != 7) {
                if (i10 == 6) {
                    if (this.V.I0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (pv0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        pv0 pv0Var = this.V;
        pv0Var.T0.setColor(pv0Var.h0(org.telegram.ui.ActionBar.i6.f20822d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), pv0Var.T0);
        super.onDraw(canvas);
    }
}
