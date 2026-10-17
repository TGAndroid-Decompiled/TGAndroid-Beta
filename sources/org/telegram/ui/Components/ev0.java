package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class ev0 extends ScrollSlidingTextTabStrip {
    public Paint f26004p0;
    public int f26005q0;
    public final Rect f26006r0;
    public final sv0 f26007s0;

    public ev0(sv0 sv0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f26007s0 = sv0Var;
        this.f26005q0 = 0;
        this.f26006r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f26005q0 != 0) {
            if (this.f26004p0 == null) {
                this.f26004p0 = new Paint();
            }
            this.f26004p0.setColor(this.f26005q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f26006r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24350f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f26007s0.P(canvas, getY(), rect, this.f26004p0);
            } else {
                canvas.drawPaint(this.f26004p0);
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
        this.f26005q0 = i10;
        invalidate();
    }
}
