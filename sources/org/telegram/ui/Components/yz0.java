package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class yz0 extends md0 {
    public final zz0 f35152y0;

    public yz0(zz0 zz0Var, Context context) {
        super(context, 13, null);
        this.f35152y0 = zz0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23462j5, false);
        zz0 zz0Var = this.f35152y0;
        if (x02 != zz0Var.f35442a) {
            zz0Var.f35442a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        zz0Var.e.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23427h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, zz0Var.e);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, zz0Var.e);
    }
}
