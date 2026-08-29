package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class l5 extends Drawable {
    public final int f23668a;
    public final int f23669b;

    public l5(int i10, int i11) {
        this.f23668a = i10;
        this.f23669b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f23668a;
        int i11 = this.f23669b;
        canvas.drawCircle((bounds.centerX() - i10) + i11, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i10 + i11, g6.f23443z);
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
