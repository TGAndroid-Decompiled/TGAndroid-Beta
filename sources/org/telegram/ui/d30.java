package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class d30 extends TextView {
    public final RectF f36078a;
    public final s50 f36079b;

    public d30(s50 s50Var, Context context) {
        super(context);
        this.f36079b = s50Var;
        this.f36078a = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f36078a;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.f36079b.f40960g1);
        super.onDraw(canvas);
    }
}
