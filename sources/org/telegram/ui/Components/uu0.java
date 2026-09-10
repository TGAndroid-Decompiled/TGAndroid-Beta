package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class uu0 extends ScrollSlidingTextTabStrip {
    public Paint f27749p0;
    public int f27750q0;
    public final Rect f27751r0;
    public final iv0 f27752s0;

    public uu0(iv0 iv0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f27752s0 = iv0Var;
        this.f27750q0 = 0;
        this.f27751r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f27750q0 != 0) {
            if (this.f27749p0 == null) {
                this.f27749p0 = new Paint();
            }
            this.f27749p0.setColor(this.f27750q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f27751r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f21260f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f27752s0.P(canvas, getY(), rect, this.f27749p0);
            } else {
                canvas.drawPaint(this.f27749p0);
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
        this.f27750q0 = i10;
        invalidate();
    }
}
