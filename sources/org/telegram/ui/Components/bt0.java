package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class bt0 extends b10 {
    public final ps0 U;
    public final tv0 V;

    public bt0(tv0 tv0Var, Context context, ps0 ps0Var) {
        super(context, null);
        this.V = tv0Var;
        this.U = ps0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f30711m1[tv0.q0(this.U.F) ? 1 : 0];
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
                } else if (tv0.q0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        tv0 tv0Var = this.V;
        tv0Var.T0.setColor(tv0Var.i0(org.telegram.ui.ActionBar.h6.f20987d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), tv0Var.T0);
        super.onDraw(canvas);
    }
}
