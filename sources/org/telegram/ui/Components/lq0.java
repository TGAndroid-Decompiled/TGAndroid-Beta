package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class lq0 extends iz {
    public final zp0 V;
    public final ws0 W;

    public lq0(ws0 ws0Var, Context context, zp0 zp0Var) {
        super(context, null);
        this.W = ws0Var;
        this.V = zp0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.W.f40115p1[ws0.z0(this.V.F) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i3 = this.V.F;
        if (i3 == 0 || i3 == 5) {
            return 2;
        }
        if (i3 == 1) {
            return 3;
        }
        if (i3 != 2 && i3 != 4) {
            if (i3 == 3) {
                return 5;
            }
            if (i3 != 7) {
                if (i3 == 6) {
                    if (this.W.L0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (ws0.z0(i3)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ws0 ws0Var = this.W;
        ws0Var.W0.setColor(ws0Var.s0(org.telegram.ui.ActionBar.k6.f27878d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), ws0Var.W0);
        super.onDraw(canvas);
    }
}
