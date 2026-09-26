package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class t1 extends Drawable {
    public final int f19754a;
    public final GradientDrawable f19755b;
    public final a2 f19756c;

    public t1(a2 a2Var, GradientDrawable gradientDrawable) {
        this.f19756c = a2Var;
        this.f19755b = gradientDrawable;
        this.f19754a = AndroidUtilities.dp(52.0f) + a2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        a2 a2Var = this.f19756c;
        int width = a2Var.f18686k0.getWidth();
        int i10 = this.f19754a;
        GradientDrawable gradientDrawable = this.f19755b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((a2Var.f18686k0.getHeight() - i10) / 2.0f), (int) ((a2Var.f18686k0.getWidth() + i10) / 2.0f), (int) ((a2Var.f18686k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f19755b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19755b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19755b.setColorFilter(colorFilter);
    }
}
