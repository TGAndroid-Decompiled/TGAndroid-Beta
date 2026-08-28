package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dw0 extends zf.p1 {
    public final ew0 J;

    public dw0(ew0 ew0Var, Context context) {
        super(context);
        this.J = ew0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f50662r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ew0 ew0Var = this.J;
            ew0Var.d.f38361n.f35853j0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f50661n.h, ew0Var.d.f38361n.K);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ew0Var.d.f38361n.f35853j0.f50792f);
        }
        super.dispatchDraw(canvas);
    }
}
