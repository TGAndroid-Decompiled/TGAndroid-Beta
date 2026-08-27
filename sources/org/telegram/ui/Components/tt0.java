package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;

public abstract class tt0 extends ScrollSlidingTextTabStrip {

    public Paint f32886l0;
    public int m0;

    public final Rect f32887n0;

    public final hu0 f32888o0;

    public tt0(hu0 hu0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f32888o0 = hu0Var;
        this.m0 = 0;
        this.f32887n0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.m0 != 0) {
            if (this.f32886l0 == null) {
                this.f32886l0 = new Paint();
            }
            this.f32886l0.setColor(this.m0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f32887n0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f26511b0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f32888o0.P(canvas, getY(), rect, this.f32886l0);
            } else {
                canvas.drawPaint(this.f32886l0);
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
        this.m0 = i10;
        invalidate();
    }
}
