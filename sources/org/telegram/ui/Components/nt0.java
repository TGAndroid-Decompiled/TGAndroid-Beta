package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class nt0 extends c10 {
    public final bt0 U;
    public final bw0 V;

    public nt0(bw0 bw0Var, Context context, bt0 bt0Var) {
        super(context, null);
        this.V = bw0Var;
        this.U = bt0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.V.f26969o1[bw0.w0(this.U.E) ? 1 : 0];
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
                } else if (bw0.w0(i10)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        bw0 bw0Var = this.V;
        bw0Var.V0.setColor(bw0Var.p0(org.telegram.ui.ActionBar.y6.f23357d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), bw0Var.V0);
        super.onDraw(canvas);
    }
}
