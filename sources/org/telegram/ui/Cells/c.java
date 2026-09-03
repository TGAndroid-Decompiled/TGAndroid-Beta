package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c extends TextView {
    public boolean f20863a;

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f20863a) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.j6.U1);
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4 = this.f20863a;
        if (motionEvent.getAction() == 0) {
            this.f20863a = true;
        } else if (motionEvent.getAction() != 2) {
            this.f20863a = false;
        }
        if (z4 != this.f20863a) {
            invalidate();
        }
        if (!this.f20863a && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
