package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class wu0 extends ScrollSlidingTextTabStrip {
    public Paint f30170p0;
    public int f30171q0;
    public final Rect f30172r0;
    public final kv0 f30173s0;

    public wu0(kv0 kv0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f30173s0 = kv0Var;
        this.f30171q0 = 0;
        this.f30172r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f30171q0 != 0) {
            if (this.f30170p0 == null) {
                this.f30170p0 = new Paint();
            }
            this.f30170p0.setColor(this.f30171q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f30172r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f22361f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f30173s0.P(canvas, getY(), rect, this.f30170p0);
            } else {
                canvas.drawPaint(this.f30170p0);
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
        this.f30171q0 = i10;
        invalidate();
    }
}
