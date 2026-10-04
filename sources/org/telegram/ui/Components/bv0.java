package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class bv0 extends ScrollSlidingTextTabStrip {
    public Paint f25064p0;
    public int f25065q0;
    public final Rect f25066r0;
    public final pv0 f25067s0;

    public bv0(pv0 pv0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f25067s0 = pv0Var;
        this.f25065q0 = 0;
        this.f25066r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f25065q0 != 0) {
            if (this.f25064p0 == null) {
                this.f25064p0 = new Paint();
            }
            this.f25064p0.setColor(this.f25065q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f25066r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24311f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f25067s0.P(canvas, getY(), rect, this.f25064p0);
            } else {
                canvas.drawPaint(this.f25064p0);
            }
            canvas.translate(-getScrollX(), 0.0f);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f25065q0 = i10;
        invalidate();
    }
}
