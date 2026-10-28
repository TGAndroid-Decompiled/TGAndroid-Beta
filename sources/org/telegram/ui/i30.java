package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class i30 extends TextView {
    public final RectF f40035a;
    public final x50 f40036b;

    public i30(x50 x50Var, Context context) {
        super(context);
        this.f40036b = x50Var;
        this.f40035a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f40035a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f40036b.f45517g1);
        super.onDraw(canvas);
    }
}
