package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class jv0 extends ScrollSlidingTextTabStrip {
    public Paint f27764p0;
    public int f27765q0;
    public final Rect f27766r0;
    public final xv0 f27767s0;

    public jv0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f27767s0 = xv0Var;
        this.f27765q0 = 0;
        this.f27766r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f27765q0 != 0) {
            if (this.f27764p0 == null) {
                this.f27764p0 = new Paint();
            }
            this.f27764p0.setColor(this.f27765q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f27766r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24500f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f27767s0.Q(canvas, getY(), rect, this.f27764p0);
            } else {
                canvas.drawPaint(this.f27764p0);
            }
            canvas.translate(-getScrollX(), 0.0f);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f27765q0 = i10;
        invalidate();
    }
}
