package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class d30 extends TextView {
    public final RectF f37284a;
    public final r50 f37285b;

    public d30(r50 r50Var, Context context) {
        super(context);
        this.f37285b = r50Var;
        this.f37284a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f37284a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f37285b.f41878c1);
        super.onDraw(canvas);
    }
}
