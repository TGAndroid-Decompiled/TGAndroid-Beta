package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class gs0 extends u00 {
    public final ur0 R;
    public final zu0 S;

    public gs0(zu0 zu0Var, Context context, ur0 ur0Var) {
        super(context, null);
        this.S = zu0Var;
        this.R = ur0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.S.f33985j1[zu0.p0(this.R.C) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i10 = this.R.C;
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
                    if (this.S.F0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (zu0.p0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        zu0 zu0Var = this.S;
        zu0Var.Q0.setColor(zu0Var.h0(org.telegram.ui.ActionBar.k6.f21659d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zu0Var.Q0);
        super.onDraw(canvas);
    }
}
