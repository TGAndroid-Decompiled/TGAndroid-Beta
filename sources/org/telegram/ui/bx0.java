package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bx0 extends rg.r1 {
    public final cx0 N;

    public bx0(cx0 cx0Var, Context context) {
        super(context);
        this.N = cx0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f46293r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            cx0 cx0Var = this.N;
            cx0Var.d.f35861n.f34140n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f46292n.h, cx0Var.d.f35861n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), cx0Var.d.f35861n.f34140n0.f46045f);
        }
        super.dispatchDraw(canvas);
    }
}
