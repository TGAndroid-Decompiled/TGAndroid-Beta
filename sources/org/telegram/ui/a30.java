package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a30 extends TextView {
    public final RectF f36356a;
    public final o50 f36357b;

    public a30(o50 o50Var, Context context) {
        super(context);
        this.f36357b = o50Var;
        this.f36356a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f36356a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f36357b.f40890c1);
        super.onDraw(canvas);
    }
}
