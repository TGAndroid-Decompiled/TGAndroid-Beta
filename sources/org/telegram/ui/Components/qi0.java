package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

public final class qi0 extends Drawable {

    public final int f31912a;

    public final int f31913b;

    public final ri0 f31914c;

    public qi0(ri0 ri0Var, int i10, int i11) {
        this.f31914c = ri0Var;
        this.f31912a = i10;
        this.f31913b = i11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = AndroidUtilities.rectTmp2;
        int iCenterX = getBounds().centerX();
        float f10 = this.f31912a;
        int iDp = iCenterX - (AndroidUtilities.dp(f10) / 2);
        int iCenterY = getBounds().centerY();
        float f11 = this.f31913b;
        rect.set(iDp, iCenterY - (AndroidUtilities.dp(f11) / 2), (AndroidUtilities.dp(f10) / 2) + getBounds().centerX(), (AndroidUtilities.dp(f11) / 2) + getBounds().centerY());
        ri0 ri0Var = this.f31914c;
        ri0Var.f32189c.setImageCoords(rect);
        ri0Var.f32189c.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f31914c.f32189c.setAlpha(i10 / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31914c.f32189c.setColorFilter(colorFilter);
    }
}
