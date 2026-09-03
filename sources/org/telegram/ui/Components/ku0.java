package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class ku0 extends ScrollSlidingTextTabStrip {
    public Paint m0;
    public int f28499n0;
    public final Rect f28500o0;
    public final yu0 f28501p0;

    public ku0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f28501p0 = yu0Var;
        this.f28499n0 = 0;
        this.f28500o0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f28499n0 != 0) {
            if (this.m0 == null) {
                this.m0 = new Paint();
            }
            this.m0.setColor(this.f28499n0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f28500o0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f25017c0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f28501p0.P(canvas, getY(), rect, this.m0);
            } else {
                canvas.drawPaint(this.m0);
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
        this.f28499n0 = i10;
        invalidate();
    }
}
