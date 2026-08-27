package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class l5 extends Drawable {

    public final int f23650a;

    public final int f23651b;

    public l5(int i10, int i11) {
        this.f23650a = i10;
        this.f23651b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int iMax = Math.max(bounds.width(), bounds.height()) / 2;
        int i10 = this.f23650a;
        int i11 = this.f23651b;
        canvas.drawCircle((bounds.centerX() - i10) + i11, bounds.centerY(), iMax + i10 + i11, g6.f23434z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
