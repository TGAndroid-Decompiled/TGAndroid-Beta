package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ax0 extends rg.p1 {
    public final bx0 N;

    public ax0(bx0 bx0Var, Context context) {
        super(context);
        this.N = bx0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f42387r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            bx0 bx0Var = this.N;
            bx0Var.d.f32435n.f31143n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f42386n.h, bx0Var.d.f32435n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), bx0Var.d.f32435n.f31143n0.f42507f);
        }
        super.dispatchDraw(canvas);
    }
}
