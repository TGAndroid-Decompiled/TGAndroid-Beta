package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class jv0 extends ScrollSlidingTextTabStrip {
    public Paint f26503p0;
    public int f26504q0;
    public final Rect f26505r0;
    public final xv0 f26506s0;

    public jv0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f26506s0 = xv0Var;
        this.f26504q0 = 0;
        this.f26505r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f26504q0 != 0) {
            if (this.f26503p0 == null) {
                this.f26503p0 = new Paint();
            }
            this.f26503p0.setColor(this.f26504q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f26505r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f23295f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f26506s0.P(canvas, getY(), rect, this.f26503p0);
            } else {
                canvas.drawPaint(this.f26503p0);
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
        this.f26504q0 = i10;
        invalidate();
    }
}
