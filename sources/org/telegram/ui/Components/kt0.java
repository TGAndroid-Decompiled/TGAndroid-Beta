package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class kt0 extends k10 {
    public final ys0 U;
    public final cw0 V;

    public kt0(cw0 cw0Var, Context context, ys0 ys0Var) {
        super(context, null);
        this.V = cw0Var;
        this.U = ys0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f25515m1[cw0.p0(this.U.F) ? 1 : 0];
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
                } else if (cw0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cw0 cw0Var = this.V;
        cw0Var.T0.setColor(cw0Var.h0(org.telegram.ui.ActionBar.h6.f20822d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), cw0Var.T0);
        super.onDraw(canvas);
    }
}
