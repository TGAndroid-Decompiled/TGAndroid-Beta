package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class hs0 extends t00 {
    public final vr0 U;
    public final zu0 V;

    public hs0(zu0 zu0Var, Context context, vr0 vr0Var) {
        super(context, null);
        this.V = zu0Var;
        this.U = vr0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f30635m1[zu0.p0(this.U.F) ? 1 : 0];
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
        zu0 zu0Var = this.V;
        zu0Var.T0.setColor(zu0Var.h0(org.telegram.ui.ActionBar.j6.f18862d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), zu0Var.T0);
        super.onDraw(canvas);
    }
}
