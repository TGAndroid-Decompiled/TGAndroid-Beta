package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class qx extends FrameLayout {
    public final Paint f29944a;
    public final d00 f29945b;

    public qx(d00 d00Var, Context context) {
        super(context);
        this.f29945b = d00Var;
        this.f29944a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        d00 d00Var = this.f29945b;
        px pxVar = d00Var.B0;
        float dp = AndroidUtilities.dp(50.0f) * d00Var.f25134t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = d00Var.A(org.telegram.ui.ActionBar.h6.He);
        Paint paint = this.f29944a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), pxVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (pxVar.f31231s != null) {
            canvas.save();
            float f7 = pxVar.f31212c0 - pxVar.f31213d0;
            float f10 = pxVar.v;
            if (f10 > 0.0f) {
                f7 = ((pxVar.f31231s.getX() - pxVar.getScrollX()) * pxVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            pxVar.f31231s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29945b.Y();
    }
}
