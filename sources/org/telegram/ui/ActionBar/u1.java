package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class u1 extends Drawable {
    public final int f21533a;
    public final GradientDrawable f21534b;
    public final b2 f21535c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.f21535c = b2Var;
        this.f21534b = gradientDrawable;
        this.f21533a = AndroidUtilities.dp(52.0f) + b2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        b2 b2Var = this.f21535c;
        int width = b2Var.f20426k0.getWidth();
        int i10 = this.f21533a;
        GradientDrawable gradientDrawable = this.f21534b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((b2Var.f20426k0.getHeight() - i10) / 2.0f), (int) ((b2Var.f20426k0.getWidth() + i10) / 2.0f), (int) ((b2Var.f20426k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f21534b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f21534b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21534b.setColorFilter(colorFilter);
    }
}
