package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class zj0 extends Drawable {
    public final int f35346a;
    public final int f35347b;
    public final ak0 f35348c;

    public zj0(ak0 ak0Var, int i10, int i11) {
        this.f35348c = ak0Var;
        this.f35346a = i10;
        this.f35347b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f7 = this.f35346a;
        int dp = centerX - (AndroidUtilities.dp(f7) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.f35347b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f10) / 2), (AndroidUtilities.dp(f7) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f10) / 2) + getBounds().centerY());
        ak0 ak0Var = this.f35348c;
        ak0Var.f26518c.setImageCoords(rect);
        ak0Var.f26518c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f35348c.f26518c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f35348c.f26518c.setColorFilter(colorFilter);
    }
}
