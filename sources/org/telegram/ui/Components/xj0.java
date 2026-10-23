package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class xj0 extends Drawable {
    public final int f32444a;
    public final int f32445b;
    public final yj0 f32446c;

    public xj0(yj0 yj0Var, int i10, int i11) {
        this.f32446c = yj0Var;
        this.f32444a = i10;
        this.f32445b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f7 = this.f32444a;
        int dp = centerX - (AndroidUtilities.dp(f7) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.f32445b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f10) / 2), (AndroidUtilities.dp(f7) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f10) / 2) + getBounds().centerY());
        yj0 yj0Var = this.f32446c;
        yj0Var.f32670c.setImageCoords(rect);
        yj0Var.f32670c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f32446c.f32670c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32446c.f32670c.setColorFilter(colorFilter);
    }
}
