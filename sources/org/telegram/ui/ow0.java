package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ow0 extends sg.r1 {
    public final pw0 N;

    public ow0(pw0 pw0Var, Context context) {
        super(context);
        this.N = pw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f46847r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            pw0 pw0Var = this.N;
            pw0Var.d.f40941n.f33818n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f46846n.h, pw0Var.d.f40941n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), pw0Var.d.f40941n.f33818n0.f46618f);
        }
        super.dispatchDraw(canvas);
    }
}
