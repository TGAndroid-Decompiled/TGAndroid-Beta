package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class xx0 extends ac0 {
    public final yx0 f32557y0;

    public xx0(yx0 yx0Var, Context context) {
        super(13, context, null);
        this.f32557y0 = yx0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21037j5, false);
        yx0 yx0Var = this.f32557y0;
        if (x02 != yx0Var.f32822a) {
            yx0Var.f32822a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.i0.L(31.0f);
        yx0Var.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21003h7, false));
        canvas.drawLine(org.telegram.messenger.i0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.i0.L(2.0f), L, yx0Var.e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.i0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.i0.L(2.0f), measuredHeight, yx0Var.e);
    }
}
