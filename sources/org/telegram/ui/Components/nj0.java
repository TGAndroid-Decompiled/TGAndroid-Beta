package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class nj0 extends Drawable {
    public final int f26721a;
    public final int f26722b;
    public final oj0 f26723c;

    public nj0(oj0 oj0Var, int i10, int i11) {
        this.f26723c = oj0Var;
        this.f26721a = i10;
        this.f26722b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int centerX = getBounds().centerX();
        float f7 = this.f26721a;
        int dp = centerX - (AndroidUtilities.dp(f7) / 2);
        int centerY = getBounds().centerY();
        float f10 = this.f26722b;
        rect.set(dp, centerY - (AndroidUtilities.dp(f10) / 2), (AndroidUtilities.dp(f7) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f10) / 2) + getBounds().centerY());
        oj0 oj0Var = this.f26723c;
        oj0Var.f27110c.setImageCoords(rect);
        oj0Var.f27110c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26723c.f27110c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26723c.f27110c.setColorFilter(colorFilter);
    }
}
