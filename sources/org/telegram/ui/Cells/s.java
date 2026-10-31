package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.vs;
public final class s extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public static final int h = 0;
    public Paint f22886a;
    public Paint f22887b;
    public q f22888c;
    public TextView d;
    public float e;
    public boolean f22889f;

    public final void a(float f7) {
        this.e = f7;
        this.f22889f = true;
        TextView textView = this.d;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
        int i10 = org.telegram.ui.ActionBar.t6.I6;
        textView.setTextColor(i0.b.f(f7, x02, org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
        Paint paint = this.f22886a;
        paint.setColor(i0.b.f(f7, i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.M6, false), 63), org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
        paint.setStrokeWidth(Math.max(2, org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(0.5f, 2.0f, f7))));
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
            duration.setInterpolator(vs.e);
            duration.addUpdateListener(new r(this, 0));
            duration.start();
            return;
        }
        a(f7);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f22886a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = org.telegram.messenger.i0.P;
        q qVar = this.f22888c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.f22887b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), paint);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f22889f && this.d != null) {
                a(this.e);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
