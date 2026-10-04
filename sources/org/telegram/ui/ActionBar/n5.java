package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class n5 extends Drawable {
    public final int f21433a;
    public final int f21434b;

    public n5(int i10, int i11) {
        this.f21433a = i10;
        this.f21434b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f21433a;
        int i11 = this.f21434b;
        canvas.drawCircle((bounds.centerX() - i10) + i11, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i10 + i11, i6.f21221z);
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
