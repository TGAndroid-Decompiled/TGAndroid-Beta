package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class gx0 extends rg.q1 {
    public final hx0 N;

    public gx0(hx0 hx0Var, Context context) {
        super(context);
        this.N = hx0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f47502r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            hx0 hx0Var = this.N;
            hx0Var.d.f38799n.f34171n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f47501n.h, hx0Var.d.f38799n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), hx0Var.d.f38799n.f34171n0.f47269f);
        }
        super.dispatchDraw(canvas);
    }
}
