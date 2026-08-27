package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class d30 extends TextView {

    public final RectF f37246a;

    public final s50 f37247b;

    public d30(s50 s50Var, Context context) {
        super(context);
        this.f37247b = s50Var;
        this.f37246a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f37246a;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f37247b.f42419c1);
        super.onDraw(canvas);
    }
}
