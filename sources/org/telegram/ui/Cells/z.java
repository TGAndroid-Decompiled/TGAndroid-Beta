package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;
import org.telegram.messenger.FileLog;

public final class z extends RippleDrawable {
    @Override
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            super.draw(canvas);
        } catch (Exception e9) {
            FileLog.e("probably forgot to put setCallback", e9);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
