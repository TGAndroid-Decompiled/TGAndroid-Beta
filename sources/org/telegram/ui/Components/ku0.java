package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class ku0 extends ScrollSlidingTextTabStrip {
    public Paint m0;
    public int f26399n0;
    public final Rect f26400o0;
    public final yu0 f26401p0;

    public ku0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f26401p0 = yu0Var;
        this.f26399n0 = 0;
        this.f26400o0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f26399n0 != 0) {
            if (this.m0 == null) {
                this.m0 = new Paint();
            }
            this.m0.setColor(this.f26399n0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f26400o0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f23131c0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f26401p0.P(canvas, getY(), rect, this.m0);
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
        this.f26399n0 = i10;
        invalidate();
    }
}
