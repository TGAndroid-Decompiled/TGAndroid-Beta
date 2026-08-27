package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;

public final class u1 extends Drawable {

    public final int f23822a;

    public final GradientDrawable f23823b;

    public final b2 f23824c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.f23824c = b2Var;
        this.f23823b = gradientDrawable;
        this.f23822a = AndroidUtilities.dp(52.0f) + b2Var.U;
    }

    @Override
    public final void draw(Canvas canvas) {
        b2 b2Var = this.f23824c;
        int width = b2Var.f22753g0.getWidth();
        int i10 = this.f23822a;
        int i11 = (int) ((width - i10) / 2.0f);
        int height = (int) ((b2Var.f22753g0.getHeight() - i10) / 2.0f);
        int width2 = (int) ((b2Var.f22753g0.getWidth() + i10) / 2.0f);
        int height2 = (int) ((b2Var.f22753g0.getHeight() + i10) / 2.0f);
        GradientDrawable gradientDrawable = this.f23823b;
        gradientDrawable.setBounds(i11, height, width2, height2);
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f23823b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23823b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23823b.setColorFilter(colorFilter);
    }
}
