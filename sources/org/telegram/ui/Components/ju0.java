package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class ju0 extends ScrollSlidingTextTabStrip {
    public Paint f27598p0;
    public int f27599q0;
    public final Rect f27600r0;
    public final xu0 f27601s0;

    public ju0(xu0 xu0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f27601s0 = xu0Var;
        this.f27599q0 = 0;
        this.f27600r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f27599q0 != 0) {
            if (this.f27598p0 == null) {
                this.f27598p0 = new Paint();
            }
            this.f27598p0.setColor(this.f27599q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f27600r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24151f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f27601s0.P(canvas, getY(), rect, this.f27598p0);
            } else {
                canvas.drawPaint(this.f27598p0);
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
        this.f27599q0 = i10;
        invalidate();
    }
}
