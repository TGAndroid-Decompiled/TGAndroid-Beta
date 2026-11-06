package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class lq0 extends lz {
    public final zp0 U;
    public final xs0 V;

    public lq0(xs0 xs0Var, Context context, zp0 zp0Var) {
        super(context, null);
        this.V = xs0Var;
        this.U = zp0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f40379o1[xs0.z0(this.U.E) ? 1 : 0];
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
                } else if (xs0.z0(i7)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        xs0 xs0Var = this.V;
        xs0Var.V0.setColor(xs0Var.s0(org.telegram.ui.ActionBar.k6.f27848d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), xs0Var.V0);
        super.onDraw(canvas);
    }
}
