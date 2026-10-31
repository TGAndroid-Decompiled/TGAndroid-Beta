package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.TextView;
public final class c extends TextView {
    public boolean f21752a;

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f21752a) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.U1);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f21752a;
        if (motionEvent.getAction() == 0) {
            this.f21752a = true;
        } else if (motionEvent.getAction() != 2) {
            this.f21752a = false;
        }
        if (z10 != this.f21752a) {
            invalidate();
        }
        if (!this.f21752a && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
