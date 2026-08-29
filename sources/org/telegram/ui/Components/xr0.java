package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class xr0 extends p00 {
    public final lr0 Q;
    public final qu0 R;

    public xr0(qu0 qu0Var, Context context, lr0 lr0Var) {
        super(context, null);
        this.R = qu0Var;
        this.Q = lr0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.R.f32075i1[qu0.p0(this.Q.B) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i10 = this.Q.B;
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
                    if (this.R.E0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (qu0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qu0 qu0Var = this.R;
        qu0Var.P0.setColor(qu0Var.h0(org.telegram.ui.ActionBar.g6.f23062d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), qu0Var.P0);
        super.onDraw(canvas);
    }
}
