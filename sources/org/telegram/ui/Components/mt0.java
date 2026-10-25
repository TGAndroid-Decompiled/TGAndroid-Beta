package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class mt0 extends c10 {
    public final at0 U;
    public final aw0 V;

    public mt0(aw0 aw0Var, Context context, at0 at0Var) {
        super(context, null);
        this.V = aw0Var;
        this.U = at0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f26679o1[aw0.w0(this.U.E) ? 1 : 0];
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
                } else if (aw0.w0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        aw0 aw0Var = this.V;
        aw0Var.V0.setColor(aw0Var.p0(org.telegram.ui.ActionBar.y6.f23354d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), aw0Var.V0);
        super.onDraw(canvas);
    }
}
