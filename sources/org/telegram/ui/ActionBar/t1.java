package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class t1 extends Drawable {
    public final int f21498a;
    public final GradientDrawable f21499b;
    public final a2 f21500c;

    public t1(a2 a2Var, GradientDrawable gradientDrawable) {
        this.f21500c = a2Var;
        this.f21499b = gradientDrawable;
        this.f21498a = AndroidUtilities.dp(52.0f) + a2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        a2 a2Var = this.f21500c;
        int width = a2Var.f20394k0.getWidth();
        int i10 = this.f21498a;
        GradientDrawable gradientDrawable = this.f21499b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((a2Var.f20394k0.getHeight() - i10) / 2.0f), (int) ((a2Var.f20394k0.getWidth() + i10) / 2.0f), (int) ((a2Var.f20394k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f21499b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f21499b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21499b.setColorFilter(colorFilter);
    }
}
