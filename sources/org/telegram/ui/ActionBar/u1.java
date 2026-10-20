package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class u1 extends Drawable {
    public final int f21760a;
    public final GradientDrawable f21761b;
    public final b2 f21762c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.f21762c = b2Var;
        this.f21761b = gradientDrawable;
        this.f21760a = AndroidUtilities.dp(52.0f) + b2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        b2 b2Var = this.f21762c;
        int width = b2Var.f20669k0.getWidth();
        int i10 = this.f21760a;
        GradientDrawable gradientDrawable = this.f21761b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((b2Var.f20669k0.getHeight() - i10) / 2.0f), (int) ((b2Var.f20669k0.getWidth() + i10) / 2.0f), (int) ((b2Var.f20669k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f21761b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f21761b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21761b.setColorFilter(colorFilter);
    }
}
