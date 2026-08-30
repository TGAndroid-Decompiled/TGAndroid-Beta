package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class w1 extends Drawable {
    public final int f20674a;
    public final GradientDrawable f20675b;
    public final d2 f20676c;

    public w1(d2 d2Var, GradientDrawable gradientDrawable) {
        this.f20676c = d2Var;
        this.f20675b = gradientDrawable;
        this.f20674a = AndroidUtilities.dp(52.0f) + d2Var.V;
    }

    @Override
    public final void draw(Canvas canvas) {
        d2 d2Var = this.f20676c;
        int width = d2Var.f19595h0.getWidth();
        int i10 = this.f20674a;
        GradientDrawable gradientDrawable = this.f20675b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((d2Var.f19595h0.getHeight() - i10) / 2.0f), (int) ((d2Var.f19595h0.getWidth() + i10) / 2.0f), (int) ((d2Var.f19595h0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f20675b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f20675b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20675b.setColorFilter(colorFilter);
    }
}
