package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class vu0 extends ScrollSlidingTextTabStrip {
    public Paint f29811p0;
    public int f29812q0;
    public final Rect f29813r0;
    public final jv0 f29814s0;

    public vu0(jv0 jv0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f29814s0 = jv0Var;
        this.f29812q0 = 0;
        this.f29813r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f29812q0 != 0) {
            if (this.f29811p0 == null) {
                this.f29811p0 = new Paint();
            }
            this.f29811p0.setColor(this.f29812q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f29813r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f22398f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f29814s0.P(canvas, getY(), rect, this.f29811p0);
            } else {
                canvas.drawPaint(this.f29811p0);
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
        this.f29812q0 = i10;
        invalidate();
    }
}
