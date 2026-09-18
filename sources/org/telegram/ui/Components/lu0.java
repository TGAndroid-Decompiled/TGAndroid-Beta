package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class lu0 extends ScrollSlidingTextTabStrip {
    public Paint f25974p0;
    public int f25975q0;
    public final Rect f25976r0;
    public final zu0 f25977s0;

    public lu0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f25977s0 = zu0Var;
        this.f25975q0 = 0;
        this.f25976r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f25975q0 != 0) {
            if (this.f25974p0 == null) {
                this.f25974p0 = new Paint();
            }
            this.f25974p0.setColor(this.f25975q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f25976r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f22188f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f25977s0.P(canvas, getY(), rect, this.f25974p0);
            } else {
                canvas.drawPaint(this.f25974p0);
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
        this.f25975q0 = i10;
        invalidate();
    }
}
