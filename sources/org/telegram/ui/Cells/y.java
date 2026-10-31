package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;
public final class y extends RippleDrawable {
    @Override
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            super.draw(canvas);
        } catch (Exception e) {
            org.telegram.messenger.f8.e("probably forgot to put setCallback", e);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
