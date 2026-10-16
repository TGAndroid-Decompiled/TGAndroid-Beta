package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class qz0 extends ud0 {
    public final rz0 f28382w0;

    public qz0(rz0 rz0Var, Context context) {
        super(context, 13, null);
        this.f28382w0 = rz0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        rz0 rz0Var = this.f28382w0;
        rz0Var.d.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19674h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, rz0Var.d);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, rz0Var.d);
    }
}
