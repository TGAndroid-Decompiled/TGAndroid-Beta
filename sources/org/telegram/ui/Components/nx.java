package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class nx extends FrameLayout {
    public final Paint f29296a;
    public final a00 f29297b;

    public nx(a00 a00Var, Context context) {
        super(context);
        this.f29297b = a00Var;
        this.f29296a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a00 a00Var = this.f29297b;
        mx mxVar = a00Var.B0;
        float dp = AndroidUtilities.dp(50.0f) * a00Var.f24455t1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int B = a00Var.B(org.telegram.ui.ActionBar.i6.He);
        Paint paint = this.f29296a;
        paint.setColor(B);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), mxVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (mxVar.f29542s != null) {
            canvas.save();
            float f7 = mxVar.f29523c0 - mxVar.f29524d0;
            float f10 = mxVar.v;
            if (f10 > 0.0f) {
                f7 = ((mxVar.f29542s.getX() - mxVar.getScrollX()) * mxVar.v) + ((1.0f - f10) * f7);
            }
            canvas.translate(f7, 0.0f);
            mxVar.f29542s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29297b.Y();
    }
}
