package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ct;
public final class s extends LinearLayout {
    public static final int f25258f = 0;
    public Paint f25259a;
    public Paint f25260b;
    public q f25261c;
    public TextView d;
    public float f25262e;

    public final void a(float f9) {
        this.f25262e = f9;
        TextView textView = this.d;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false);
        int i10 = org.telegram.ui.ActionBar.g6.I6;
        textView.setTextColor(i0.a.d(f9, w02, org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        Paint paint = this.f25259a;
        paint.setColor(i0.a.d(f9, i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.M6, false), 63), org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(AndroidUtilities.lerp(0.5f, 2.0f, f9))));
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        float f9;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        float f10 = this.f25262e;
        if (f9 == f10 && z11) {
            return;
        }
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(f10, f9).setDuration(250L);
            duration.setInterpolator(ct.f27567e);
            duration.addUpdateListener(new r(this, 0));
            duration.start();
            return;
        }
        a(f9);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f25259a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        q qVar = this.f25261c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f25260b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
    }
}
