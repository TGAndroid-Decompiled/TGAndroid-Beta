package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class us0 extends w00 {
    public final is0 U;
    public final mv0 V;

    public us0(mv0 mv0Var, Context context, is0 is0Var) {
        super(context, null);
        this.V = mv0Var;
        this.U = is0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f26428m1[mv0.p0(this.U.F) ? 1 : 0];
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
                } else if (mv0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        mv0 mv0Var = this.V;
        mv0Var.T0.setColor(mv0Var.h0(org.telegram.ui.ActionBar.h6.f19076d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), mv0Var.T0);
        super.onDraw(canvas);
    }
}
