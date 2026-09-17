package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class yw extends FrameLayout {
    public final Paint f33046a;
    public final kz f33047b;

    public yw(kz kzVar, Context context) {
        super(context);
        this.f33047b = kzVar;
        this.f33046a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kz kzVar = this.f33047b;
        xw xwVar = kzVar.B0;
        float dp = AndroidUtilities.dp(50.0f) * kzVar.f28014t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = kzVar.A(org.telegram.ui.ActionBar.j6.He);
        Paint paint = this.f33046a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), xwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (xwVar.f27216s != null) {
            canvas.save();
            float f7 = xwVar.f27197c0 - xwVar.f27198d0;
            float f10 = xwVar.v;
            if (f10 > 0.0f) {
                f7 = ((xwVar.f27216s.getX() - xwVar.getScrollX()) * xwVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            xwVar.f27216s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f33047b.a0();
    }
}
