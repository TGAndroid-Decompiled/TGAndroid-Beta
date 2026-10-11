package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class lt0 extends k10 {
    public final zs0 U;
    public final dw0 V;

    public lt0(dw0 dw0Var, Context context, zs0 zs0Var) {
        super(context, null);
        this.V = dw0Var;
        this.U = zs0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f25714m1[dw0.p0(this.U.F) ? 1 : 0];
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
                } else if (dw0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        dw0 dw0Var = this.V;
        dw0Var.T0.setColor(dw0Var.h0(org.telegram.ui.ActionBar.h6.f20786d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), dw0Var.T0);
        super.onDraw(canvas);
    }
}
