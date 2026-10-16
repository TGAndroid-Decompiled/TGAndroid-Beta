package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nx0 extends sg.r1 {
    public final ox0 N;

    public nx0(ox0 ox0Var, Context context) {
        super(context);
        this.N = ox0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TextView textView = this.f45342r;
        if (textView.getVisibility() == 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
            ox0 ox0Var = this.N;
            ox0Var.d.f39026n.f32164n0.d(0, 0.0f, 0, getMeasuredWidth(), -this.f45341n.h, ox0Var.d.f39026n.O);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ox0Var.d.f39026n.f32164n0.f45117f);
        }
        super.dispatchDraw(canvas);
    }
}
