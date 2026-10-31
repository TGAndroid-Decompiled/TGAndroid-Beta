package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
public final class bu0 extends kg.a2 {
    public final cu0 N;

    public bu0(cu0 cu0Var, Context context) {
        super(context);
        this.N = cu0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f11000r;
        if (textView.getVisibility() == 0) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            cu0 cu0Var = this.N;
            cu0Var.d.f36836n.f33706n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f10999n.h, cu0Var.d.f36836n.O);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), cu0Var.d.f36836n.f33706n0.f11142f);
        }
        super.dispatchDraw(canvas);
    }
}
