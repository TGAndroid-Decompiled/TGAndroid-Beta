package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;

public final class jb0 extends org.telegram.ui.ActionBar.h5 {
    public final Paint I0;
    public final org.telegram.ui.ActionBar.c6 J0;

    public jb0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.J0 = c6Var;
        this.I0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.K5, this.J0);
        Paint paint = this.I0;
        paint.setColor(iV0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - AndroidUtilities.dp(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
