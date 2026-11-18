package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public final class ek0 extends View implements org.telegram.ui.ActionBar.c6 {
    public Paint f47248a;
    public Paint f47249b;
    public float f47250c;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.f47250c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f47249b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f47248a);
    }

    @Override
    public final void updateColors() {
        try {
            this.f47248a.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xi, false));
            this.f47249b.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
