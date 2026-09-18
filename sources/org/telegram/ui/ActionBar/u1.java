package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class u1 extends Drawable {
    public final int f19753a;
    public final GradientDrawable f19754b;
    public final b2 f19755c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.f19755c = b2Var;
        this.f19754b = gradientDrawable;
        this.f19753a = AndroidUtilities.dp(52.0f) + b2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        b2 b2Var = this.f19755c;
        int width = b2Var.f18662k0.getWidth();
        int i10 = this.f19753a;
        GradientDrawable gradientDrawable = this.f19754b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((b2Var.f18662k0.getHeight() - i10) / 2.0f), (int) ((b2Var.f18662k0.getWidth() + i10) / 2.0f), (int) ((b2Var.f18662k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f19754b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19754b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19754b.setColorFilter(colorFilter);
    }
}
