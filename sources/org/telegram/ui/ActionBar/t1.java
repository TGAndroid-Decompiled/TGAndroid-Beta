package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class t1 extends Drawable {
    public final int f19755a;
    public final GradientDrawable f19756b;
    public final a2 f19757c;

    public t1(a2 a2Var, GradientDrawable gradientDrawable) {
        this.f19757c = a2Var;
        this.f19756b = gradientDrawable;
        this.f19755a = AndroidUtilities.dp(52.0f) + a2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        a2 a2Var = this.f19757c;
        int width = a2Var.f18687k0.getWidth();
        int i10 = this.f19755a;
        GradientDrawable gradientDrawable = this.f19756b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((a2Var.f18687k0.getHeight() - i10) / 2.0f), (int) ((a2Var.f18687k0.getWidth() + i10) / 2.0f), (int) ((a2Var.f18687k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f19756b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19756b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19756b.setColorFilter(colorFilter);
    }
}
