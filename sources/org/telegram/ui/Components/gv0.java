package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.messenger.SharedConfig;
public abstract class gv0 extends ScrollSlidingTextTabStrip {
    public Paint f26669p0;
    public int f26670q0;
    public final Rect f26671r0;
    public final uv0 f26672s0;

    public gv0(uv0 uv0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.f26672s0 = uv0Var;
        this.f26670q0 = 0;
        this.f26671r0 = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f26670q0 != 0) {
            if (this.f26669p0 == null) {
                this.f26669p0 = new Paint();
            }
            this.f26669p0.setColor(this.f26670q0);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f26671r0;
            rect.set(0, 0, measuredWidth, measuredHeight);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.clipPath(this.f24354f0);
            if (SharedConfig.chatBlurEnabled()) {
                this.f26672s0.P(canvas, getY(), rect, this.f26669p0);
            } else {
                canvas.drawPaint(this.f26669p0);
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
        this.f26670q0 = i10;
        invalidate();
    }
}
