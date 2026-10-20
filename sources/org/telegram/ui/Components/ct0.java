package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class ct0 extends b10 {
    public final qs0 U;
    public final uv0 V;

    public ct0(uv0 uv0Var, Context context, qs0 qs0Var) {
        super(context, null);
        this.V = uv0Var;
        this.U = qs0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f31049m1[uv0.q0(this.U.F) ? 1 : 0];
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
                } else if (uv0.q0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        uv0 uv0Var = this.V;
        uv0Var.T0.setColor(uv0Var.i0(org.telegram.ui.ActionBar.h6.f20990d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), uv0Var.T0);
        super.onDraw(canvas);
    }
}
