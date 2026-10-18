package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nw0 extends sg.r1 {
    public final ow0 N;

    public nw0(ow0 ow0Var, Context context) {
        super(context);
        this.N = ow0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f46409r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ow0 ow0Var = this.N;
            ow0Var.d.f40216n.f33502n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f46408n.h, ow0Var.d.f40216n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ow0Var.d.f40216n.f33502n0.f46184f);
        }
        super.dispatchDraw(canvas);
    }
}
