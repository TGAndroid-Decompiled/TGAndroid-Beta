package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class jj0 extends Drawable {
    public final int f28124a;
    public final int f28125b;
    public final kj0 f28126c;

    public jj0(kj0 kj0Var, int i10, int i11) {
        this.f28126c = kj0Var;
        this.f28124a = i10;
        this.f28125b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f10 = this.f28124a;
        int dp = centerX - (AndroidUtilities.dp(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f28125b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f11) / 2), (AndroidUtilities.dp(f10) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f11) / 2) + getBounds().centerY());
        kj0 kj0Var = this.f28126c;
        kj0Var.f28426c.setImageCoords(rect);
        kj0Var.f28426c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28126c.f28426c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28126c.f28426c.setColorFilter(colorFilter);
    }
}
