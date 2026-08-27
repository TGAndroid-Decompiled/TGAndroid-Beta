package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class dw0 extends ag.e3 {
    public final ew0 J;

    public dw0(ew0 ew0Var, Context context) {
        super(context);
        this.J = ew0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f363r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ew0 ew0Var = this.J;
            ew0Var.d.f38219n.f35856j0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f362n.h, ew0Var.d.f38219n.K);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ew0Var.d.f38219n.f35856j0.f458f);
        }
        super.dispatchDraw(canvas);
    }
}
