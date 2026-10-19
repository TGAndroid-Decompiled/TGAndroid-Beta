package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class fv0 extends ScrollSlidingTextTabStrip {
    public Paint f26383p0;
    public int f26384q0;
    public final Rect f26385r0;
    public final tv0 f26386s0;

    public fv0(tv0 tv0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f26386s0 = tv0Var;
        this.f26384q0 = 0;
        this.f26385r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f26384q0 != 0) {
            if (this.f26383p0 == null) {
                this.f26383p0 = new Paint();
            }
            this.f26383p0.setColor(this.f26384q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f26385r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24351f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f26386s0.P(canvas, getY(), rect, this.f26383p0);
            } else {
                canvas.drawPaint(this.f26383p0);
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
        this.f26384q0 = i10;
        invalidate();
    }
}
