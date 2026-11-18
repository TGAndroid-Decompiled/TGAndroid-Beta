package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class dx0 extends sb0 {
    public final ex0 f34527z0;

    public dx0(ex0 ex0Var, Context context) {
        super(13, context, null);
        this.f34527z0 = ex0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29504j5, false);
        ex0 ex0Var = this.f34527z0;
        if (x02 != ex0Var.f34824a) {
            ex0Var.f34824a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(31.0f);
        ex0Var.f34827e.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h7, false));
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), L, ex0Var.f34827e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), measuredHeight, ex0Var.f34827e);
    }
}
