package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class e6 extends Drawable {
    public final int f22606a;
    public final int f22607b;

    public e6(int i10, int i11) {
        this.f22606a = i10;
        this.f22607b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f22606a;
        int i11 = this.f22607b;
        canvas.drawCircle((bounds.centerX() - i10) + i11, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i10 + i11, y6.f23758z);
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
