package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class zi0 extends Drawable {
    public final int f35353a;
    public final int f35354b;
    public final aj0 f35355c;

    public zi0(aj0 aj0Var, int i10, int i11) {
        this.f35355c = aj0Var;
        this.f35353a = i10;
        this.f35354b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f9 = this.f35353a;
        int dp = centerX - (AndroidUtilities.dp(f9) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.f35354b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f10) / 2), (AndroidUtilities.dp(f9) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f10) / 2) + getBounds().centerY());
        aj0 aj0Var = this.f35355c;
        aj0Var.f26789c.setImageCoords(rect);
        aj0Var.f26789c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f35355c.f26789c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35355c.f26789c.setColorFilter(colorFilter);
    }
}
