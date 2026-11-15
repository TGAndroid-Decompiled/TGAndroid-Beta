package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class ww0 extends ib0 {
    public final xw0 f41465z0;

    public ww0(xw0 xw0Var, Context context) {
        super(13, context, null);
        this.f41465z0 = xw0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28957j5, false);
        xw0 xw0Var = this.f41465z0;
        if (x02 != xw0Var.f41771a) {
            xw0Var.f41771a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(31.0f);
        xw0Var.f41774e.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h7, false));
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), L, xw0Var.f41774e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), measuredHeight, xw0Var.f41774e);
    }
}
