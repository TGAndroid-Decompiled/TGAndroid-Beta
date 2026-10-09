package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class hx0 extends rg.q1 {
    public final ix0 N;

    public hx0(ix0 ix0Var, Context context) {
        super(context);
        this.N = ix0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f47410r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ix0 ix0Var = this.N;
            ix0Var.d.f39040n.f34143n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f47409n.h, ix0Var.d.f39040n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ix0Var.d.f39040n.f34143n0.f47177f);
        }
        super.dispatchDraw(canvas);
    }
}
