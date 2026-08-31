package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class q30 extends TextView {
    public final RectF f40334a;
    public final d60 f40335b;

    public q30(d60 d60Var, Context context) {
        super(context);
        this.f40335b = d60Var;
        this.f40334a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f40334a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f40335b.f36024d1);
        super.onDraw(canvas);
    }
}
