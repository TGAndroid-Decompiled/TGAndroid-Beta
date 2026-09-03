package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class ij0 extends Drawable {
    public final int f25729a;
    public final int f25730b;
    public final jj0 f25731c;

    public ij0(jj0 jj0Var, int i10, int i11) {
        this.f25731c = jj0Var;
        this.f25729a = i10;
        this.f25730b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f10 = this.f25729a;
        int dp = centerX - (AndroidUtilities.dp(f10) / 2);
        int centerY = getBounds().centerY();
        float f11 = this.f25730b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f11) / 2), (AndroidUtilities.dp(f10) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f11) / 2) + getBounds().centerY());
        jj0 jj0Var = this.f25731c;
        jj0Var.f25971c.setImageCoords(rect);
        jj0Var.f25971c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f25731c.f25971c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25731c.f25971c.setColorFilter(colorFilter);
    }
}
