package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class tw0 extends cb0 {
    public final uw0 f38568z0;

    public tw0(uw0 uw0Var, Context context) {
        super(13, context, null);
        this.f38568z0 = uw0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false);
        uw0 uw0Var = this.f38568z0;
        if (x02 != uw0Var.f38892a) {
            uw0Var.f38892a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(31.0f);
        uw0Var.f38895e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h7, false));
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), L, uw0Var.f38895e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), measuredHeight, uw0Var.f38895e);
    }
}
