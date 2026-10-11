package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class pv0 extends ScrollSlidingTextTabStrip {
    public Paint f29850p0;
    public int f29851q0;
    public final Rect f29852r0;
    public final dw0 f29853s0;

    public pv0(dw0 dw0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f29853s0 = dw0Var;
        this.f29851q0 = 0;
        this.f29852r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f29851q0 != 0) {
            if (this.f29850p0 == null) {
                this.f29850p0 = new Paint();
            }
            this.f29850p0.setColor(this.f29851q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f29852r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24306f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f29853s0.P(canvas, getY(), rect, this.f29850p0);
            } else {
                canvas.drawPaint(this.f29850p0);
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
        this.f29851q0 = i10;
        invalidate();
    }
}
