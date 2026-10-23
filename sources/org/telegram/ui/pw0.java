package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class pw0 extends sg.r1 {
    public final qw0 N;

    public pw0(qw0 qw0Var, Context context) {
        super(context);
        this.N = qw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f46848r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            qw0 qw0Var = this.N;
            qw0Var.d.f41263n.f33816n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f46847n.h, qw0Var.d.f41263n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), qw0Var.d.f41263n.f33816n0.f46619f);
        }
        super.dispatchDraw(canvas);
    }
}
