package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class p30 extends TextView {
    public final RectF f37168a;
    public final c60 f37169b;

    public p30(c60 c60Var, Context context) {
        super(context);
        this.f37169b = c60Var;
        this.f37168a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f37168a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f37169b.f33111d1);
        super.onDraw(canvas);
    }
}
