package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ow0 extends fg.j2 {
    public final pw0 K;

    public ow0(pw0 pw0Var, Context context) {
        super(context);
        this.K = pw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f6361r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            pw0 pw0Var = this.K;
            pw0Var.d.f40712n.f34495k0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f6360n.h, pw0Var.d.f40712n.L);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), pw0Var.d.f40712n.f34495k0.f6490f);
        }
        super.dispatchDraw(canvas);
    }
}
