package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class nr0 extends zz {
    public final br0 U;
    public final au0 V;

    public nr0(au0 au0Var, Context context, br0 br0Var) {
        super(context, null);
        this.V = au0Var;
        this.U = br0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f24542o1[au0.y0(this.U.E) ? 1 : 0];
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
                } else if (au0.y0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        au0 au0Var = this.V;
        au0Var.V0.setColor(au0Var.r0(org.telegram.ui.ActionBar.t6.f20930d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), au0Var.V0);
        super.onDraw(canvas);
    }
}
