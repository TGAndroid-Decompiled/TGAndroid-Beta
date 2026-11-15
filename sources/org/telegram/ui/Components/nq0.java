package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class nq0 extends pz {
    public final aq0 V;
    public final ys0 W;

    public nq0(ys0 ys0Var, Context context, aq0 aq0Var) {
        super(context, null);
        this.W = ys0Var;
        this.V = aq0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.W.f42125p1[ys0.z0(this.V.F) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i7 = this.V.F;
        if (i7 == 0 || i7 == 5) {
            return 2;
        }
        if (i7 == 1) {
            return 3;
        }
        if (i7 != 2 && i7 != 4) {
            if (i7 == 3) {
                return 5;
            }
            if (i7 != 7) {
                if (i7 == 6) {
                    if (this.W.L0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (ys0.z0(i7)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ys0 ys0Var = this.W;
        ys0Var.W0.setColor(ys0Var.s0(org.telegram.ui.ActionBar.j6.f28849d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ys0Var.W0);
        super.onDraw(canvas);
    }
}
