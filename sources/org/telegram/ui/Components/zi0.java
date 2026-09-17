package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class zi0 extends Drawable {
    public final int f33162a;
    public final int f33163b;
    public final aj0 f33164c;

    public zi0(aj0 aj0Var, int i10, int i11) {
        this.f33164c = aj0Var;
        this.f33162a = i10;
        this.f33163b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f7 = this.f33162a;
        int dp = centerX - (AndroidUtilities.dp(f7) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.f33163b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f10) / 2), (AndroidUtilities.dp(f7) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f10) / 2) + getBounds().centerY());
        aj0 aj0Var = this.f33164c;
        aj0Var.f24408c.setImageCoords(rect);
        aj0Var.f24408c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33164c.f24408c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33164c.f24408c.setColorFilter(colorFilter);
    }
}
