package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pt;
public final class s extends LinearLayout {
    public static final int f19912f = 0;
    public Paint f19913a;
    public Paint f19914b;
    public q f19915c;
    public TextView d;
    public float e;

    public final void a(float f7) {
        this.e = f7;
        TextView textView = this.d;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false);
        int i10 = org.telegram.ui.ActionBar.j6.I6;
        textView.setTextColor(i0.a.d(f7, w02, org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        Paint paint = this.f19913a;
        paint.setColor(i0.a.d(f7, i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.M6, false), 63), org.telegram.ui.ActionBar.j6.w0(null, i10, false)));
        paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(AndroidUtilities.lerp(0.5f, 2.0f, f7))));
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float f10 = this.e;
        if (f7 == f10 && z11) {
            return;
        }
        if (z11) {
            ValueAnimator duration = ValueAnimator.ofFloat(f10, f7).setDuration(250L);
            duration.setInterpolator(pt.e);
            duration.addUpdateListener(new r(this, 0));
            duration.start();
            return;
        }
        a(f7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f19913a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        q qVar = this.f19915c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f19914b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
    }
}
