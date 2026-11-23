package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class wq0 extends vz {
    public final jq0 V;
    public final it0 W;

    public wq0(it0 it0Var, Context context, jq0 jq0Var) {
        super(context, null);
        this.W = it0Var;
        this.V = jq0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.W.f36139p1[it0.z0(this.V.F) ? 1 : 0];
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        int i7 = this.V.F;
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
                    if (this.W.L0.getTabsCount() == 1) {
                        setIsSingleCell(true);
                        return 1;
                    }
                } else if (it0.z0(i7)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        it0 it0Var = this.W;
        it0Var.W0.setColor(it0Var.s0(org.telegram.ui.ActionBar.n6.f29451d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), it0Var.W0);
        super.onDraw(canvas);
    }
}
