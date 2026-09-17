package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class ju0 extends ScrollSlidingTextTabStrip {
    public Paint f27599p0;
    public int f27600q0;
    public final Rect f27601r0;
    public final xu0 f27602s0;

    public ju0(xu0 xu0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f27602s0 = xu0Var;
        this.f27600q0 = 0;
        this.f27601r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f27600q0 != 0) {
            if (this.f27599p0 == null) {
                this.f27599p0 = new Paint();
            }
            this.f27599p0.setColor(this.f27600q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f27601r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24152f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f27602s0.P(canvas, getY(), rect, this.f27599p0);
            } else {
                canvas.drawPaint(this.f27599p0);
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
        this.f27600q0 = i10;
        invalidate();
    }
}
