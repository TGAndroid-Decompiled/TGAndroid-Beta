package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class kj0 extends Drawable {
    public final int f28402a;
    public final int f28403b;
    public final lj0 f28404c;

    public kj0(lj0 lj0Var, int i10, int i11) {
        this.f28404c = lj0Var;
        this.f28402a = i10;
        this.f28403b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f10 = this.f28402a;
        int dp = centerX - (AndroidUtilities.dp(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f28403b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f11) / 2), (AndroidUtilities.dp(f10) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f11) / 2) + getBounds().centerY());
        lj0 lj0Var = this.f28404c;
        lj0Var.f28755c.setImageCoords(rect);
        lj0Var.f28755c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28404c.f28755c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28404c.f28755c.setColorFilter(colorFilter);
    }
}
