package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class b30 extends TextView {
    public final RectF f35499a;
    public final q50 f35500b;

    public b30(q50 q50Var, Context context) {
        super(context);
        this.f35500b = q50Var;
        this.f35499a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f35499a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f35500b.f40401g1);
        super.onDraw(canvas);
    }
}
