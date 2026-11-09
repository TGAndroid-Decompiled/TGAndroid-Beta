package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class nq0 extends mz {
    public final aq0 U;
    public final zs0 V;

    public nq0(zs0 zs0Var, Context context, aq0 aq0Var) {
        super(context, null);
        this.V = zs0Var;
        this.U = aq0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f41101o1[zs0.z0(this.U.E) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i7 = this.U.E;
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
                    if (this.V.K0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (zs0.z0(i7)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zs0 zs0Var = this.V;
        zs0Var.V0.setColor(zs0Var.s0(org.telegram.ui.ActionBar.l6.f27865d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zs0Var.V0);
        super.onDraw(canvas);
    }
}
