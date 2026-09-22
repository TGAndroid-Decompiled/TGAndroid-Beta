package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class ku0 extends ScrollSlidingTextTabStrip {
    public Paint f25677p0;
    public int f25678q0;
    public final Rect f25679r0;
    public final yu0 f25680s0;

    public ku0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f25680s0 = yu0Var;
        this.f25678q0 = 0;
        this.f25679r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f25678q0 != 0) {
            if (this.f25677p0 == null) {
                this.f25677p0 = new Paint();
            }
            this.f25677p0.setColor(this.f25678q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f25679r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f22172f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f25680s0.P(canvas, getY(), rect, this.f25677p0);
            } else {
                canvas.drawPaint(this.f25677p0);
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
        this.f25678q0 = i10;
        invalidate();
    }
}
