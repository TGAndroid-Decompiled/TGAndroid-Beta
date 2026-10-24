package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class e30 extends TextView {
    public final RectF f36798a;
    public final u50 f36799b;

    public e30(u50 u50Var, Context context) {
        super(context);
        this.f36799b = u50Var;
        this.f36798a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f36798a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f36799b.f42243g1);
        super.onDraw(canvas);
    }
}
