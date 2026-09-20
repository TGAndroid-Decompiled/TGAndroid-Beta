package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class u1 extends Drawable {
    public final int f19785a;
    public final GradientDrawable f19786b;
    public final b2 f19787c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.f19787c = b2Var;
        this.f19786b = gradientDrawable;
        this.f19785a = AndroidUtilities.dp(52.0f) + b2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        b2 b2Var = this.f19787c;
        int width = b2Var.f18694k0.getWidth();
        int i10 = this.f19785a;
        GradientDrawable gradientDrawable = this.f19786b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((b2Var.f18694k0.getHeight() - i10) / 2.0f), (int) ((b2Var.f18694k0.getWidth() + i10) / 2.0f), (int) ((b2Var.f18694k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f19786b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19786b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19786b.setColorFilter(colorFilter);
    }
}
