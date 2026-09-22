package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class xu0 extends ScrollSlidingTextTabStrip {
    public Paint f30413p0;
    public int f30414q0;
    public final Rect f30415r0;
    public final lv0 f30416s0;

    public xu0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f30416s0 = lv0Var;
        this.f30414q0 = 0;
        this.f30415r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f30414q0 != 0) {
            if (this.f30413p0 == null) {
                this.f30413p0 = new Paint();
            }
            this.f30413p0.setColor(this.f30414q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f30415r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f22412f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f30416s0.P(canvas, getY(), rect, this.f30413p0);
            } else {
                canvas.drawPaint(this.f30413p0);
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
        this.f30414q0 = i10;
        invalidate();
    }
}
