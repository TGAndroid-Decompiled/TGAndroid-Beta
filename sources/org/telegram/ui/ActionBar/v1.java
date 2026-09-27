package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class v1 extends Drawable {
    public final int f19804a;
    public final GradientDrawable f19805b;
    public final c2 f19806c;

    public v1(c2 c2Var, GradientDrawable gradientDrawable) {
        this.f19806c = c2Var;
        this.f19805b = gradientDrawable;
        this.f19804a = AndroidUtilities.dp(52.0f) + c2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        c2 c2Var = this.f19806c;
        int width = c2Var.f18733k0.getWidth();
        int i10 = this.f19804a;
        GradientDrawable gradientDrawable = this.f19805b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((c2Var.f18733k0.getHeight() - i10) / 2.0f), (int) ((c2Var.f18733k0.getWidth() + i10) / 2.0f), (int) ((c2Var.f18733k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f19805b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19805b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19805b.setColorFilter(colorFilter);
    }
}
