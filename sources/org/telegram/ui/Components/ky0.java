package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class ky0 extends qc0 {
    public final ly0 f30171s0;

    public ky0(ly0 ly0Var, Context context) {
        super(context, 13, null);
        this.f30171s0 = ly0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dp = AndroidUtilities.dp(31.0f);
        ly0 ly0Var = this.f30171s0;
        ly0Var.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23135h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), dp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), dp, ly0Var.d);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, ly0Var.d);
    }
}
