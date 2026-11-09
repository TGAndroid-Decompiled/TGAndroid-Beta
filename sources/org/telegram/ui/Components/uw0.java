package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class uw0 extends ib0 {
    public final vw0 f38817y0;

    public uw0(vw0 vw0Var, Context context) {
        super(13, context, null);
        this.f38817y0 = vw0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27973j5, false);
        vw0 vw0Var = this.f38817y0;
        if (x02 != vw0Var.f39820a) {
            vw0Var.f39820a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(31.0f);
        vw0Var.f39823e.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h7, false));
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), L, vw0Var.f39823e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), measuredHeight, vw0Var.f39823e);
    }
}
