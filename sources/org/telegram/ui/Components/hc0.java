package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class hc0 extends org.telegram.ui.ActionBar.l5 {
    public final Paint M0;
    public final org.telegram.ui.ActionBar.f6 N0;

    public hc0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.N0 = f6Var;
        this.M0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.K5, this.N0);
        Paint paint = this.M0;
        paint.setColor(v02);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
