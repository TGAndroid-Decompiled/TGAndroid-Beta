package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class iv0 extends ScrollSlidingTextTabStrip {
    public Paint f27492p0;
    public int f27493q0;
    public final Rect f27494r0;
    public final wv0 f27495s0;

    public iv0(wv0 wv0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f27495s0 = wv0Var;
        this.f27493q0 = 0;
        this.f27494r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f27493q0 != 0) {
            if (this.f27492p0 == null) {
                this.f27492p0 = new Paint();
            }
            this.f27492p0.setColor(this.f27493q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f27494r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24501f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f27495s0.Q(canvas, getY(), rect, this.f27492p0);
            } else {
                canvas.drawPaint(this.f27492p0);
            }
            canvas.translate(-getScrollX(), 0.0f);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f27493q0 = i10;
        invalidate();
    }
}
