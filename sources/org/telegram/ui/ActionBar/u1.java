package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class u1 extends Drawable {
    public final int f19800a;
    public final GradientDrawable f19801b;
    public final b2 f19802c;

    public u1(b2 b2Var, GradientDrawable gradientDrawable) {
        this.f19802c = b2Var;
        this.f19801b = gradientDrawable;
        this.f19800a = AndroidUtilities.dp(52.0f) + b2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        b2 b2Var = this.f19802c;
        int width = b2Var.f18709k0.getWidth();
        int i10 = this.f19800a;
        GradientDrawable gradientDrawable = this.f19801b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((b2Var.f18709k0.getHeight() - i10) / 2.0f), (int) ((b2Var.f18709k0.getWidth() + i10) / 2.0f), (int) ((b2Var.f18709k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f19801b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19801b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19801b.setColorFilter(colorFilter);
    }
}
