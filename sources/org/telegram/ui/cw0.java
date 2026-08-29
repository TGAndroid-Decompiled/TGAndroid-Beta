package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class cw0 extends cg.l2 {
    public final dw0 J;

    public cw0(dw0 dw0Var, Context context) {
        super(context);
        this.J = dw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f3206r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            dw0 dw0Var = this.J;
            dw0Var.d.f37915n.f35919j0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f3205n.h, dw0Var.d.f37915n.K);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), dw0Var.d.f37915n.f35919j0.f3319f);
        }
        super.dispatchDraw(canvas);
    }
}
