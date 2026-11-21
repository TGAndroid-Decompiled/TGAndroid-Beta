package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
public final class fx0 extends tb0 {
    public final gx0 f35325z0;

    public fx0(gx0 gx0Var, Context context) {
        super(13, context, null);
        this.f35325z0 = gx0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29486j5, false);
        gx0 gx0Var = this.f35325z0;
        if (x02 != gx0Var.f35682a) {
            gx0Var.f35682a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float L = org.telegram.messenger.g0.L(31.0f);
        gx0Var.f35685e.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h7, false));
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), L, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), L, gx0Var.f35685e);
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(31.0f);
        canvas.drawLine(org.telegram.messenger.g0.L(2.0f), measuredHeight, getMeasuredWidth() - org.telegram.messenger.g0.L(2.0f), measuredHeight, gx0Var.f35685e);
    }
}
