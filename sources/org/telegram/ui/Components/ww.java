package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ww extends FrameLayout {
    public final Paint f32861a;
    public final mz f32862b;

    public ww(mz mzVar, Context context) {
        super(context);
        this.f32862b = mzVar;
        this.f32861a = new Paint();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        mz mzVar = this.f32862b;
        vw vwVar = mzVar.f29343y0;
        float dp = AndroidUtilities.dp(50.0f) * mzVar.f29315q1.p();
        if (dp > getMeasuredHeight()) {
            return;
        }
        canvas.save();
        if (dp != 0.0f) {
            canvas.clipRect(0.0f, dp, getMeasuredWidth(), getMeasuredHeight());
        }
        int A = mzVar.A(org.telegram.ui.ActionBar.k6.He);
        Paint paint = this.f32861a;
        paint.setColor(A);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), vwVar.getExpandedOffset() + AndroidUtilities.dp(36.0f), paint);
        super.dispatchDraw(canvas);
        if (vwVar.f30444s != null) {
            canvas.save();
            float f10 = vwVar.W - vwVar.f30423a0;
            float f11 = vwVar.v;
            if (f11 > 0.0f) {
                f10 = ((vwVar.f30444s.getX() - vwVar.getScrollX()) * vwVar.v) + ((1.0f - f11) * f10);
            }
            canvas.translate(f10, 0.0f);
            vwVar.f30444s.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.f32862b.a0();
    }
}
