package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class ov0 extends ScrollSlidingTextTabStrip {
    public Paint f29608p0;
    public int f29609q0;
    public final Rect f29610r0;
    public final cw0 f29611s0;

    public ov0(cw0 cw0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f29611s0 = cw0Var;
        this.f29609q0 = 0;
        this.f29610r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f29609q0 != 0) {
            if (this.f29608p0 == null) {
                this.f29608p0 = new Paint();
            }
            this.f29608p0.setColor(this.f29609q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f29610r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24318f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f29611s0.P(canvas, getY(), rect, this.f29608p0);
            } else {
                canvas.drawPaint(this.f29608p0);
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
        this.f29609q0 = i10;
        invalidate();
    }
}
