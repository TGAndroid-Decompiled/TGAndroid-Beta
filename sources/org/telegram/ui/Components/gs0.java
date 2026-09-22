package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class gs0 extends t00 {
    public final ur0 U;
    public final yu0 V;

    public gs0(yu0 yu0Var, Context context, ur0 ur0Var) {
        super(context, null);
        this.V = yu0Var;
        this.U = ur0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f30368m1[yu0.p0(this.U.F) ? 1 : 0];
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
                } else if (yu0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        yu0 yu0Var = this.V;
        yu0Var.T0.setColor(yu0Var.h0(org.telegram.ui.ActionBar.i6.f18834d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), yu0Var.T0);
        super.onDraw(canvas);
    }
}
