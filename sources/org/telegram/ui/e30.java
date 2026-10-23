package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class e30 extends TextView {
    public final RectF f36810a;
    public final u50 f36811b;

    public e30(u50 u50Var, Context context) {
        super(context);
        this.f36811b = u50Var;
        this.f36810a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f36810a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f36811b.f42197g1);
        super.onDraw(canvas);
    }
}
