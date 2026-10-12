package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class t1 extends Drawable {
    public final int f20641a;
    public final GradientDrawable f20642b;
    public final a2 f20643c;

    public t1(a2 a2Var, GradientDrawable gradientDrawable) {
        this.f20643c = a2Var;
        this.f20642b = gradientDrawable;
        this.f20641a = AndroidUtilities.dp(52.0f) + a2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        a2 a2Var = this.f20643c;
        int width = a2Var.f19573k0.getWidth();
        int i10 = this.f20641a;
        GradientDrawable gradientDrawable = this.f20642b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((a2Var.f19573k0.getHeight() - i10) / 2.0f), (int) ((a2Var.f19573k0.getWidth() + i10) / 2.0f), (int) ((a2Var.f19573k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f20642b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f20642b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20642b.setColorFilter(colorFilter);
    }
}
