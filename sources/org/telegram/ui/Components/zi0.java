package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class zi0 extends Drawable {
    public final int f33161a;
    public final int f33162b;
    public final aj0 f33163c;

    public zi0(aj0 aj0Var, int i10, int i11) {
        this.f33163c = aj0Var;
        this.f33161a = i10;
        this.f33162b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f7 = this.f33161a;
        int dp = centerX - (AndroidUtilities.dp(f7) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.f33162b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f10) / 2), (AndroidUtilities.dp(f7) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f10) / 2) + getBounds().centerY());
        aj0 aj0Var = this.f33163c;
        aj0Var.f24407c.setImageCoords(rect);
        aj0Var.f24407c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33163c.f24407c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33163c.f24407c.setColorFilter(colorFilter);
    }
}
