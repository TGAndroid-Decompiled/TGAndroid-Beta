package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.ks;
public final class s extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public static final int h = 0;
    public Paint f30225a;
    public Paint f30226b;
    public q f30227c;
    public TextView d;
    public float f30228e;
    public boolean f30229f;

    public final void a(float f10) {
        this.f30228e = f10;
        this.f30229f = true;
        TextView textView = this.d;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        int i7 = org.telegram.ui.ActionBar.k6.I6;
        textView.setTextColor(i0.a.f(f10, x02, org.telegram.ui.ActionBar.k6.x0(null, i7, false)));
        Paint paint = this.f30225a;
        paint.setColor(i0.a.f(f10, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.M6, false), 63), org.telegram.ui.ActionBar.k6.x0(null, i7, false)));
        paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(0.5f, 2.0f, f10))));
        invalidate();
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float f11 = this.f30228e;
        if (f10 == f11 && z10) {
            return;
        }
        if (z10) {
            ValueAnimator duration = ValueAnimator.ofFloat(f11, f10).setDuration(250L);
            duration.setInterpolator(ks.f35403e);
            duration.addUpdateListener(new r(this, 0));
            duration.start();
            return;
        }
        a(f10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint = this.f30225a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = org.telegram.messenger.g0.P;
        q qVar = this.f30227c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.f30226b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f30229f && this.d != null) {
                a(this.f30228e);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
