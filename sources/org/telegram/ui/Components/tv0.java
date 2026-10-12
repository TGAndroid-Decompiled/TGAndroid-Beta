package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class tv0 extends ScrollSlidingTextTabStrip {
    public Paint f30979p0;
    public int f30980q0;
    public final Rect f30981r0;
    public final hw0 f30982s0;

    public tv0(hw0 hw0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.f30982s0 = hw0Var;
        this.f30980q0 = 0;
        this.f30981r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f30980q0 != 0) {
            if (this.f30979p0 == null) {
                this.f30979p0 = new Paint();
            }
            this.f30979p0.setColor(this.f30980q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f30981r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24092f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f30982s0.P(canvas, getY(), rect, this.f30979p0);
            } else {
                canvas.drawPaint(this.f30979p0);
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
        this.f30980q0 = i10;
        invalidate();
    }
}
