package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class p30 extends TextView {
    public final RectF f36382a;
    public final d60 f36383b;

    public p30(d60 d60Var, Context context) {
        super(context);
        this.f36383b = d60Var;
        this.f36382a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f36382a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f36383b.f32945g1);
        super.onDraw(canvas);
    }
}
