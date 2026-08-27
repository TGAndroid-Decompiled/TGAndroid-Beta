package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;

public final class nr0 extends h00 {
    public final br0 Q;
    public final hu0 R;

    public nr0(hu0 hu0Var, Context context, br0 br0Var) {
        super(context, null);
        this.R = hu0Var;
        this.Q = br0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.R.f29127i1[hu0.p0(this.Q.B) ? 1 : 0];
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
                } else if (hu0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hu0 hu0Var = this.R;
        hu0Var.P0.setColor(hu0Var.h0(org.telegram.ui.ActionBar.g6.f23053d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), hu0Var.P0);
        super.onDraw(canvas);
    }
}
