package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jt;
public final class s extends LinearLayout {
    public static final int f23606f = 0;
    public Paint f23607a;
    public Paint f23608b;
    public q f23609c;
    public TextView d;
    public float f23610e;

    public final void a(float f10) {
        this.f23610e = f10;
        TextView textView = this.d;
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false);
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        textView.setTextColor(i0.a.d(f10, w02, org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        Paint paint = this.f23607a;
        paint.setColor(i0.a.d(f10, i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.M6, false), 63), org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(AndroidUtilities.lerp(0.5f, 2.0f, f10))));
        invalidate();
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float f11 = this.f23610e;
        if (f10 == f11 && z10) {
            return;
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(f11, f10).setDuration(250L);
            duration.setInterpolator(jt.f28179e);
            duration.addUpdateListener(new r(this, 0));
            duration.start();
            return;
        }
        a(f10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f23607a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        q qVar = this.f23609c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f23608b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
    }
}
