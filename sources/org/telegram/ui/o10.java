package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class o10 extends TextView {
    public final RectF f48168a;
    public final x30 f48169b;

    public o10(x30 x30Var, Context context) {
        super(context);
        this.f48169b = x30Var;
        this.f48168a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f48168a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.f48169b.Y2);
        super.onDraw(canvas);
    }
}
