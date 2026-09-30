package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class m5 extends Drawable {
    public final int f19670a;
    public final int f19671b;

    public m5(int i10, int i11) {
        this.f19670a = i10;
        this.f19671b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f19670a;
        int i11 = this.f19671b;
        canvas.drawCircle((bounds.centerX() - i10) + i11, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i10 + i11, h6.f19471z);
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
