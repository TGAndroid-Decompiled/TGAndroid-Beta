package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class t1 extends Drawable {
    public final int f21272a;
    public final GradientDrawable f21273b;
    public final a2 f21274c;

    public t1(a2 a2Var, GradientDrawable gradientDrawable) {
        this.f21274c = a2Var;
        this.f21273b = gradientDrawable;
        this.f21272a = AndroidUtilities.dp(52.0f) + a2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        a2 a2Var = this.f21274c;
        int width = a2Var.f20167k0.getWidth();
        int i10 = this.f21272a;
        GradientDrawable gradientDrawable = this.f21273b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((a2Var.f20167k0.getHeight() - i10) / 2.0f), (int) ((a2Var.f20167k0.getWidth() + i10) / 2.0f), (int) ((a2Var.f20167k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f21273b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f21273b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21273b.setColorFilter(colorFilter);
    }
}
