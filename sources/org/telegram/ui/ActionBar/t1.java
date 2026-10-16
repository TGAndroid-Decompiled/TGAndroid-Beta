package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class t1 extends Drawable {
    public final int f20341a;
    public final GradientDrawable f20342b;
    public final a2 f20343c;

    public t1(a2 a2Var, GradientDrawable gradientDrawable) {
        this.f20343c = a2Var;
        this.f20342b = gradientDrawable;
        this.f20341a = AndroidUtilities.dp(52.0f) + a2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        a2 a2Var = this.f20343c;
        int width = a2Var.f19273k0.getWidth();
        int i10 = this.f20341a;
        GradientDrawable gradientDrawable = this.f20342b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((a2Var.f19273k0.getHeight() - i10) / 2.0f), (int) ((a2Var.f19273k0.getWidth() + i10) / 2.0f), (int) ((a2Var.f19273k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f20342b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f20342b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20342b.setColorFilter(colorFilter);
    }
}
