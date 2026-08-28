package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class mr0 extends e00 {
    public final ar0 Q;
    public final eu0 R;

    public mr0(eu0 eu0Var, Context context, ar0 ar0Var) {
        super(context, null);
        this.R = eu0Var;
        this.Q = ar0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.R.f28142i1[eu0.p0(this.Q.B) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i9 = this.Q.B;
        if (i9 == 0 || i9 == 5) {
            return 2;
        }
        if (i9 == 1) {
            return 3;
        }
        if (i9 != 2 && i9 != 4) {
            if (i9 == 3) {
                return 5;
            }
            if (i9 != 7) {
                if (i9 == 6) {
                    if (this.R.E0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (eu0.p0(i9)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eu0 eu0Var = this.R;
        eu0Var.P0.setColor(eu0Var.h0(org.telegram.ui.ActionBar.f6.f23001d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), eu0Var.P0);
        super.onDraw(canvas);
    }
}
