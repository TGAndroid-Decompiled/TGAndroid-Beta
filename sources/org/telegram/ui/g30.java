package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class g30 extends TextView {
    public final RectF f39530a;
    public final v50 f39531b;

    public g30(v50 v50Var, Context context) {
        super(context);
        this.f39531b = v50Var;
        this.f39530a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f39530a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f39531b.f44633g1);
        super.onDraw(canvas);
    }
}
