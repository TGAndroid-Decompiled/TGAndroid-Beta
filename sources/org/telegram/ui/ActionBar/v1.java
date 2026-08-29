package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class v1 extends Drawable {
    public final int f23868a;
    public final GradientDrawable f23869b;
    public final c2 f23870c;

    public v1(c2 c2Var, GradientDrawable gradientDrawable) {
        this.f23870c = c2Var;
        this.f23869b = gradientDrawable;
        this.f23868a = AndroidUtilities.dp(52.0f) + c2Var.U;
    }

    @Override
    public final void draw(Canvas canvas) {
        c2 c2Var = this.f23870c;
        int width = c2Var.f22789g0.getWidth();
        int i10 = this.f23868a;
        GradientDrawable gradientDrawable = this.f23869b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((c2Var.f22789g0.getHeight() - i10) / 2.0f), (int) ((c2Var.f22789g0.getWidth() + i10) / 2.0f), (int) ((c2Var.f22789g0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f23869b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f23869b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23869b.setColorFilter(colorFilter);
    }
}
