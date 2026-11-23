package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class q6 extends View implements org.telegram.ui.ActionBar.b6 {
    public Paint f51087a;
    public Paint f51088b;
    public float f51089c;
    public org.telegram.ui.Components.d6 d;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.f51088b);
        rectF.set(0.0f, 0.0f, this.d.e(false, this.f51089c) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.f51087a);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.f51087a;
            int i7 = org.telegram.ui.ActionBar.m6.N6;
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            this.f51088b.setColor(org.telegram.ui.ActionBar.m6.r1(0.2f, org.telegram.ui.ActionBar.m6.x0(null, i7, false)));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
