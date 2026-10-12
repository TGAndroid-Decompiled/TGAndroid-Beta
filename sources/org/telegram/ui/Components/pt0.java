package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class pt0 extends m10 {
    public final dt0 U;
    public final hw0 V;

    public pt0(hw0 hw0Var, Context context, dt0 dt0Var) {
        super(context, null);
        this.V = hw0Var;
        this.U = dt0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f26936m1[hw0.p0(this.U.F) ? 1 : 0];
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
                } else if (hw0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hw0 hw0Var = this.V;
        hw0Var.T0.setColor(hw0Var.h0(org.telegram.ui.ActionBar.h6.f20560d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), hw0Var.T0);
        super.onDraw(canvas);
    }
}
