package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.TextView;
public final class c extends TextView {
    public boolean f30500a;

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f30500a) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.U1);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f30500a;
        if (motionEvent.getAction() == 0) {
            this.f30500a = true;
        } else if (motionEvent.getAction() != 2) {
            this.f30500a = false;
        }
        if (z10 != this.f30500a) {
            invalidate();
        }
        if (!this.f30500a && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
