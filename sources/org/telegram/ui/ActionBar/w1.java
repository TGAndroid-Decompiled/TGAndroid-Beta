package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class w1 extends Drawable {
    public final int f22372a;
    public final GradientDrawable f22373b;
    public final d2 f22374c;

    public w1(d2 d2Var, GradientDrawable gradientDrawable) {
        this.f22374c = d2Var;
        this.f22373b = gradientDrawable;
        this.f22372a = AndroidUtilities.dp(52.0f) + d2Var.V;
    }

    @Override
    public final void draw(Canvas canvas) {
        d2 d2Var = this.f22374c;
        int width = d2Var.f21249h0.getWidth();
        int i10 = this.f22372a;
        GradientDrawable gradientDrawable = this.f22373b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((d2Var.f21249h0.getHeight() - i10) / 2.0f), (int) ((d2Var.f21249h0.getWidth() + i10) / 2.0f), (int) ((d2Var.f21249h0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f22373b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f22373b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22373b.setColorFilter(colorFilter);
    }
}
