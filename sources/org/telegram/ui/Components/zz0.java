package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class zz0 extends nd0 {
    public final a01 f35478y0;

    public zz0(a01 a01Var, Context context) {
        super(context, 13, null);
        this.f35478y0 = a01Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23465j5, false);
        a01 a01Var = this.f35478y0;
        if (x02 != a01Var.f26377a) {
            a01Var.f26377a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        a01Var.e.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23430h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, a01Var.e);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, a01Var.e);
    }
}
