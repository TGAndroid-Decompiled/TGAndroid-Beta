package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class mr0 extends zz {
    public final ar0 U;
    public final zt0 V;

    public mr0(zt0 zt0Var, Context context, ar0 ar0Var) {
        super(context, null);
        this.V = zt0Var;
        this.U = ar0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f33214o1[zt0.x0(this.U.E) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i10 = this.U.E;
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
                    if (this.V.K0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (zt0.x0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zt0 zt0Var = this.V;
        zt0Var.V0.setColor(zt0Var.q0(org.telegram.ui.ActionBar.t6.f20929d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zt0Var.V0);
        super.onDraw(canvas);
    }
}
