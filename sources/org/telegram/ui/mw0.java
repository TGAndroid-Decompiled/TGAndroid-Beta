package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mw0 extends eg.k2 {
    public final nw0 K;

    public mw0(nw0 nw0Var, Context context) {
        super(context);
        this.K = nw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f5341r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            nw0 nw0Var = this.K;
            nw0Var.d.f36994n.f31965k0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f5340n.h, nw0Var.d.f36994n.L);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), nw0Var.d.f36994n.f31965k0.f5457f);
        }
        super.dispatchDraw(canvas);
    }
}
