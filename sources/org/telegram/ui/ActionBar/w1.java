package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class w1 extends Drawable {
    public final int f20649a;
    public final GradientDrawable f20650b;
    public final d2 f20651c;

    public w1(d2 d2Var, GradientDrawable gradientDrawable) {
        this.f20651c = d2Var;
        this.f20650b = gradientDrawable;
        this.f20649a = AndroidUtilities.dp(52.0f) + d2Var.V;
    }

    @Override
    public final void draw(Canvas canvas) {
        d2 d2Var = this.f20651c;
        int width = d2Var.f19570h0.getWidth();
        int i10 = this.f20649a;
        GradientDrawable gradientDrawable = this.f20650b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((d2Var.f19570h0.getHeight() - i10) / 2.0f), (int) ((d2Var.f19570h0.getWidth() + i10) / 2.0f), (int) ((d2Var.f19570h0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f20650b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f20650b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20650b.setColorFilter(colorFilter);
    }
}
