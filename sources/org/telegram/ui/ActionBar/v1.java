package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import org.telegram.messenger.AndroidUtilities;
public final class v1 extends Drawable {
    public final int f19594a;
    public final GradientDrawable f19595b;
    public final c2 f19596c;

    public v1(c2 c2Var, GradientDrawable gradientDrawable) {
        this.f19596c = c2Var;
        this.f19595b = gradientDrawable;
        this.f19594a = AndroidUtilities.dp(52.0f) + c2Var.Y;
    }

    @Override
    public final void draw(Canvas canvas) {
        c2 c2Var = this.f19596c;
        int width = c2Var.f18507k0.getWidth();
        int i10 = this.f19594a;
        GradientDrawable gradientDrawable = this.f19595b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((c2Var.f18507k0.getHeight() - i10) / 2.0f), (int) ((c2Var.f18507k0.getWidth() + i10) / 2.0f), (int) ((c2Var.f18507k0.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f19595b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f19595b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19595b.setColorFilter(colorFilter);
    }
}
