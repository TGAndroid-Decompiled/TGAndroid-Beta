package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.TextView;
public final class c extends TextView {
    public boolean f28947a;

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f28947a) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.U1);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9 = this.f28947a;
        if (motionEvent.getAction() == 0) {
            this.f28947a = true;
        } else if (motionEvent.getAction() != 2) {
            this.f28947a = false;
        }
        if (z9 != this.f28947a) {
            invalidate();
        }
        if (!this.f28947a && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
