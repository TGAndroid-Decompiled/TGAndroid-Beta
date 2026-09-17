package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class lu0 extends ScrollSlidingTextTabStrip {
    public Paint f25971p0;
    public int f25972q0;
    public final Rect f25973r0;
    public final zu0 f25974s0;

    public lu0(zu0 zu0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f25974s0 = zu0Var;
        this.f25972q0 = 0;
        this.f25973r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f25972q0 != 0) {
            if (this.f25971p0 == null) {
                this.f25971p0 = new Paint();
            }
            this.f25971p0.setColor(this.f25972q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f25973r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f22185f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f25974s0.P(canvas, getY(), rect, this.f25971p0);
            } else {
                canvas.drawPaint(this.f25971p0);
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
        this.f25972q0 = i10;
        invalidate();
    }
}
