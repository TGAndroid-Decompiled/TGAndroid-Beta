package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;
import org.telegram.messenger.FileLog;
public final class z extends RippleDrawable {
    @Override
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            super.draw(canvas);
        } catch (Exception e) {
            FileLog.e("probably forgot to put setCallback", e);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
