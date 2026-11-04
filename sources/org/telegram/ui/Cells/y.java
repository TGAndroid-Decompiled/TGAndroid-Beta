package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;
public final class y extends RippleDrawable {
    @Override
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            super.draw(canvas);
        } catch (Exception e10) {
            org.telegram.messenger.a8.e("probably forgot to put setCallback", e10);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
