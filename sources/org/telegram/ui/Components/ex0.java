package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class ex0 extends qb0 {
    public final fx0 f34863z0;

    public ex0(fx0 fx0Var, Context context) {
        super(13, context, null);
        this.f34863z0 = fx0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29559j5, false);
        fx0 fx0Var = this.f34863z0;
        if (x02 != fx0Var.f35219a) {
            fx0Var.f35219a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(31.0f);
        fx0Var.f35222e.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h7, false));
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), L, fx0Var.f35222e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), measuredHeight, fx0Var.f35222e);
    }
}
