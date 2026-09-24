package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class t1 extends Drawable {
    public final int f19740a;
    public final GradientDrawable f19741b;
    public final a2 f19742c;

    public t1(a2 a2Var, GradientDrawable gradientDrawable) {
        this.f19742c = a2Var;
        this.f19741b = gradientDrawable;
        this.f19740a = AndroidUtilities.dp(52.0f) + a2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        a2 a2Var = this.f19742c;
        int width = a2Var.f18672k0.getWidth();
        int i10 = this.f19740a;
        GradientDrawable gradientDrawable = this.f19741b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((a2Var.f18672k0.getHeight() - i10) / 2.0f), (int) ((a2Var.f18672k0.getWidth() + i10) / 2.0f), (int) ((a2Var.f18672k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f19741b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19741b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19741b.setColorFilter(colorFilter);
    }
}
