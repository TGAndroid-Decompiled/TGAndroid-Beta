package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class u1 extends Drawable {
    public final int f21756a;
    public final GradientDrawable f21757b;
    public final b2 f21758c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.f21758c = b2Var;
        this.f21757b = gradientDrawable;
        this.f21756a = AndroidUtilities.dp(52.0f) + b2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        b2 b2Var = this.f21758c;
        int width = b2Var.f20665k0.getWidth();
        int i10 = this.f21756a;
        GradientDrawable gradientDrawable = this.f21757b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((b2Var.f20665k0.getHeight() - i10) / 2.0f), (int) ((b2Var.f20665k0.getWidth() + i10) / 2.0f), (int) ((b2Var.f20665k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f21757b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f21757b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21757b.setColorFilter(colorFilter);
    }
}
