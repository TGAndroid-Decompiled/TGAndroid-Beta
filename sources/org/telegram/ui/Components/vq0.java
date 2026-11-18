package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class vq0 extends wz {
    public final iq0 V;
    public final gt0 W;

    public vq0(gt0 gt0Var, Context context, iq0 iq0Var) {
        super(context, null);
        this.W = gt0Var;
        this.V = iq0Var;
    }

    @Override
    public final int getColumnsCount() {
        return this.W.f35615p1[gt0.z0(this.V.F) ? 1 : 0];
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
                } else if (gt0.z0(i7)) {
                    return 27;
                }
                return 1;
            }
        }
        return 6;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gt0 gt0Var = this.W;
        gt0Var.W0.setColor(gt0Var.s0(org.telegram.ui.ActionBar.n6.f29396d6));
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), gt0Var.W0);
        super.onDraw(canvas);
    }
}
