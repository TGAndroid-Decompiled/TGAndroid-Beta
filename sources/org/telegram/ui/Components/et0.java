package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class et0 extends z00 {
    public final ss0 U;
    public final wv0 V;

    public et0(wv0 wv0Var, Context context, ss0 ss0Var) {
        super(context, null);
        this.V = wv0Var;
        this.U = ss0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f32389m1[wv0.r0(this.U.F) ? 1 : 0];
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
                } else if (wv0.r0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        wv0 wv0Var = this.V;
        wv0Var.T0.setColor(wv0Var.j0(org.telegram.ui.ActionBar.k6.f21184d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), wv0Var.T0);
        super.onDraw(canvas);
    }
}
