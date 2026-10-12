package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class t1 extends Drawable {
    public final int f21273a;
    public final GradientDrawable f21274b;
    public final a2 f21275c;

    public t1(a2 a2Var, GradientDrawable gradientDrawable) {
        this.f21275c = a2Var;
        this.f21274b = gradientDrawable;
        this.f21273a = AndroidUtilities.dp(52.0f) + a2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        a2 a2Var = this.f21275c;
        int width = a2Var.f20168k0.getWidth();
        int i10 = this.f21273a;
        GradientDrawable gradientDrawable = this.f21274b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((a2Var.f20168k0.getHeight() - i10) / 2.0f), (int) ((a2Var.f20168k0.getWidth() + i10) / 2.0f), (int) ((a2Var.f20168k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f21274b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f21274b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21274b.setColorFilter(colorFilter);
    }
}
