package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class oi0 extends Drawable {
    public final int f31388a;
    public final int f31389b;
    public final pi0 f31390c;

    public oi0(pi0 pi0Var, int i9, int i10) {
        this.f31390c = pi0Var;
        this.f31388a = i9;
        this.f31389b = i10;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f10 = this.f31388a;
        int dp = centerX - (AndroidUtilities.dp(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f31389b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f11) / 2), (AndroidUtilities.dp(f10) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f11) / 2) + getBounds().centerY());
        pi0 pi0Var = this.f31390c;
        pi0Var.f31673c.setImageCoords(rect);
        pi0Var.f31673c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.f31390c.f31673c.setAlpha(i9 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31390c.f31673c.setColorFilter(colorFilter);
    }
}
