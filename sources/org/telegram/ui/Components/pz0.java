package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class pz0 extends od0 {
    public final qz0 f29692y0;

    public pz0(qz0 qz0Var, Context context) {
        super(context, 13, null);
        this.f29692y0 = qz0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false);
        qz0 qz0Var = this.f29692y0;
        if (x02 != qz0Var.f30013a) {
            qz0Var.f30013a = x02;
            setTextColor(x02);
        }
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        qz0Var.e.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21257h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, qz0Var.e);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, qz0Var.e);
    }
}
