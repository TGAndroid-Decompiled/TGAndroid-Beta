package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class lw0 extends sg.r1 {
    public final mw0 N;

    public lw0(mw0 mw0Var, Context context) {
        super(context);
        this.N = mw0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f46409r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            mw0 mw0Var = this.N;
            mw0Var.d.f39695n.f33508n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f46408n.h, mw0Var.d.f39695n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), mw0Var.d.f39695n.f33508n0.f46184f);
        }
        super.dispatchDraw(canvas);
    }
}
