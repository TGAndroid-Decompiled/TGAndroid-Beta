package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class u1 extends Drawable {
    public final int f19562a;
    public final GradientDrawable f19563b;
    public final b2 f19564c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.f19564c = b2Var;
        this.f19563b = gradientDrawable;
        this.f19562a = AndroidUtilities.dp(52.0f) + b2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        b2 b2Var = this.f19564c;
        int width = b2Var.f18475k0.getWidth();
        int i10 = this.f19562a;
        GradientDrawable gradientDrawable = this.f19563b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((b2Var.f18475k0.getHeight() - i10) / 2.0f), (int) ((b2Var.f18475k0.getWidth() + i10) / 2.0f), (int) ((b2Var.f18475k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f19563b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19563b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19563b.setColorFilter(colorFilter);
    }
}
