package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ij0 extends Drawable {
    public final int f25732a;
    public final int f25733b;
    public final jj0 f25734c;

    public ij0(jj0 jj0Var, int i10, int i11) {
        this.f25734c = jj0Var;
        this.f25732a = i10;
        this.f25733b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f10 = this.f25732a;
        int dp = centerX - (AndroidUtilities.dp(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f25733b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f11) / 2), (AndroidUtilities.dp(f10) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f11) / 2) + getBounds().centerY());
        jj0 jj0Var = this.f25734c;
        jj0Var.f25996c.setImageCoords(rect);
        jj0Var.f25996c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25734c.f25996c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25734c.f25996c.setColorFilter(colorFilter);
    }
}
