package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bx0 extends rg.p1 {
    public final cx0 N;

    public bx0(cx0 cx0Var, Context context) {
        super(context);
        this.N = cx0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f42765r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            cx0 cx0Var = this.N;
            cx0Var.d.f33062n.f31460n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f42764n.h, cx0Var.d.f33062n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), cx0Var.d.f33062n.f31460n0.f42885f);
        }
        super.dispatchDraw(canvas);
    }
}
