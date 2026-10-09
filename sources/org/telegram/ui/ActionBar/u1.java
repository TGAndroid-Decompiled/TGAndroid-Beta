package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class u1 extends Drawable {
    public final int f21546a;
    public final GradientDrawable f21547b;
    public final b2 f21548c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.f21548c = b2Var;
        this.f21547b = gradientDrawable;
        this.f21546a = AndroidUtilities.dp(52.0f) + b2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        b2 b2Var = this.f21548c;
        int width = b2Var.f20424k0.getWidth();
        int i10 = this.f21546a;
        GradientDrawable gradientDrawable = this.f21547b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((b2Var.f20424k0.getHeight() - i10) / 2.0f), (int) ((b2Var.f20424k0.getWidth() + i10) / 2.0f), (int) ((b2Var.f20424k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f21547b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f21547b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21547b.setColorFilter(colorFilter);
    }
}
