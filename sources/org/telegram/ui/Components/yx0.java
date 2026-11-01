package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class yx0 extends ac0 {
    public final zx0 f32924y0;

    public yx0(zx0 zx0Var, Context context) {
        super(13, context, null);
        this.f32924y0 = zx0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21038j5, false);
        zx0 zx0Var = this.f32924y0;
        if (x02 != zx0Var.f33254a) {
            zx0Var.f33254a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.i0.L(31.0f);
        zx0Var.e.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21004h7, false));
        canvas.drawLine(org.telegram.messenger.i0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.i0.L(2.0f), L, zx0Var.e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.i0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.i0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.i0.L(2.0f), measuredHeight, zx0Var.e);
    }
}
