package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class au0 extends kg.a2 {
    public final bu0 N;

    public au0(bu0 bu0Var, Context context) {
        super(context);
        this.N = bu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f11001r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            bu0 bu0Var = this.N;
            bu0Var.d.f36413n.f33713n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f11000n.h, bu0Var.d.f36413n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), bu0Var.d.f36413n.f33713n0.f11143f);
        }
        super.dispatchDraw(canvas);
    }
}
