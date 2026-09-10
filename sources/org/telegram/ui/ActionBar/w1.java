package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class w1 extends Drawable {
    public final int f18714a;
    public final GradientDrawable f18715b;
    public final d2 f18716c;

    public w1(d2 d2Var, GradientDrawable gradientDrawable) {
        this.f18716c = d2Var;
        this.f18715b = gradientDrawable;
        this.f18714a = AndroidUtilities.dp(52.0f) + d2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        d2 d2Var = this.f18716c;
        int width = d2Var.f17625k0.getWidth();
        int i10 = this.f18714a;
        GradientDrawable gradientDrawable = this.f18715b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((d2Var.f17625k0.getHeight() - i10) / 2.0f), (int) ((d2Var.f17625k0.getWidth() + i10) / 2.0f), (int) ((d2Var.f17625k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f18715b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f18715b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18715b.setColorFilter(colorFilter);
    }
}
