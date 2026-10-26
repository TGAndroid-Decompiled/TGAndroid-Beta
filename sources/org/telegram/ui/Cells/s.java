package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ut;
public final class s extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public static final int h = 0;
    public Paint f25010a;
    public Paint f25011b;
    public q f25012c;
    public TextView d;
    public float e;
    public boolean f25013f;

    public final void a(float f7) {
        this.e = f7;
        this.f25013f = true;
        TextView textView = this.d;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false);
        int i10 = org.telegram.ui.ActionBar.y6.I6;
        textView.setTextColor(i0.a.f(f7, x02, org.telegram.ui.ActionBar.y6.x0(null, i10, false)));
        Paint paint = this.f25010a;
        paint.setColor(i0.a.f(f7, i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.M6, false), 63), org.telegram.ui.ActionBar.y6.x0(null, i10, false)));
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
            duration.setInterpolator(ut.e);
            duration.addUpdateListener(new r(this, 0));
            duration.start();
            return;
        }
        a(f7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f25010a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        q qVar = this.f25012c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f25011b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f25013f && this.d != null) {
                a(this.e);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
