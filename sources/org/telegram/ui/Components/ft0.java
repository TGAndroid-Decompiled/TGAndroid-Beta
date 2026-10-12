package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class ft0 extends f10 {
    public final ts0 U;
    public final xv0 V;

    public ft0(xv0 xv0Var, Context context, ts0 ts0Var) {
        super(context, null);
        this.V = xv0Var;
        this.U = ts0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f31367m1[xv0.p0(this.U.F) ? 1 : 0];
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
                } else if (xv0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xv0 xv0Var = this.V;
        xv0Var.T0.setColor(xv0Var.h0(org.telegram.ui.ActionBar.g6.f19901d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), xv0Var.T0);
        super.onDraw(canvas);
    }
}
