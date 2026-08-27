package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

public final class by0 extends fc0 {

    public final cy0 f27223s0;

    public by0(cy0 cy0Var, Context context) {
        super(context, 13, null);
        this.f27223s0 = cy0Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fDp = AndroidUtilities.dp(31.0f);
        cy0 cy0Var = this.f27223s0;
        cy0Var.d.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126h7, false));
        canvas.drawLine(AndroidUtilities.dp(2.0f), fDp, getMeasuredWidth() - AndroidUtilities.dp(2.0f), fDp, cy0Var.d);
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(31.0f);
        canvas.drawLine(AndroidUtilities.dp(2.0f), measuredHeight, getMeasuredWidth() - AndroidUtilities.dp(2.0f), measuredHeight, cy0Var.d);
    }
}
