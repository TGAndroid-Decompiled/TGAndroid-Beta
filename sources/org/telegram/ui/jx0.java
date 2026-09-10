package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class jx0 extends qg.r1 {
    public final kx0 N;

    public jx0(kx0 kx0Var, Context context) {
        super(context);
        this.N = kx0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f40890r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            kx0 kx0Var = this.N;
            kx0Var.d.f34805n.f30284n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f40889n.h, kx0Var.d.f34805n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), kx0Var.d.f34805n.f30284n0.f40690f);
        }
        super.dispatchDraw(canvas);
    }
}
