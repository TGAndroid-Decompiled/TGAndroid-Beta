package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class ov0 extends ScrollSlidingTextTabStrip {
    public Paint f29640p0;
    public int f29641q0;
    public final Rect f29642r0;
    public final cw0 f29643s0;

    public ov0(cw0 cw0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f29643s0 = cw0Var;
        this.f29641q0 = 0;
        this.f29642r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f29641q0 != 0) {
            if (this.f29640p0 == null) {
                this.f29640p0 = new Paint();
            }
            this.f29640p0.setColor(this.f29641q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f29642r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24342f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f29643s0.P(canvas, getY(), rect, this.f29640p0);
            } else {
                canvas.drawPaint(this.f29640p0);
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
        this.f29641q0 = i10;
        invalidate();
    }
}
