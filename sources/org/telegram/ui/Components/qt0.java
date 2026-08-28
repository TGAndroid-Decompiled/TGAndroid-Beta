package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class qt0 extends ScrollSlidingTextTabStrip {
    public Paint f32023l0;
    public int m0;
    public final Rect f32024n0;
    public final eu0 f32025o0;

    public qt0(eu0 eu0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.f32025o0 = eu0Var;
        this.m0 = 0;
        this.f32024n0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.m0 != 0) {
            if (this.f32023l0 == null) {
                this.f32023l0 = new Paint();
            }
            this.f32023l0.setColor(this.m0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f32024n0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f26515b0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f32025o0.P(canvas, getY(), rect, this.f32023l0);
            } else {
                canvas.drawPaint(this.f32023l0);
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
    public void setBackgroundColor(int i9) {
        this.m0 = i9;
        invalidate();
    }
}
