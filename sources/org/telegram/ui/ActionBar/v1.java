package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class v1 extends Drawable {
    public final int f23848a;
    public final GradientDrawable f23849b;
    public final c2 f23850c;

    public v1(c2 c2Var, GradientDrawable gradientDrawable) {
        this.f23850c = c2Var;
        this.f23849b = gradientDrawable;
        this.f23848a = AndroidUtilities.dp(52.0f) + c2Var.U;
    }

    @Override
    public final void draw(Canvas canvas) {
        c2 c2Var = this.f23850c;
        int width = c2Var.f22772g0.getWidth();
        int i9 = this.f23848a;
        GradientDrawable gradientDrawable = this.f23849b;
        gradientDrawable.setBounds((int) ((width - i9) / 2.0f), (int) ((c2Var.f22772g0.getHeight() - i9) / 2.0f), (int) ((c2Var.f22772g0.getWidth() + i9) / 2.0f), (int) ((c2Var.f22772g0.getHeight() + i9) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f23849b.getOpacity();
    }

    @Override
    public final void setAlpha(int i9) {
        this.f23849b.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23849b.setColorFilter(colorFilter);
    }
}
