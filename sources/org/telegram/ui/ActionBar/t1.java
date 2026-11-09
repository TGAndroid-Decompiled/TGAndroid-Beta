package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.dh0;
public final class t1 extends Drawable implements b6 {
    public final View f28509a;
    public final GradientDrawable f28510b;
    public final int f28511c;
    public final int d;
    public final g6 f28512e;

    public t1(dh0 dh0Var, int i7, int i10, int i11, g6 g6Var) {
        this.f28509a = dh0Var;
        this.f28511c = i10;
        this.d = i11;
        this.f28512e = g6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f28510b = gradientDrawable;
        gradientDrawable.setColor(i7);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f28509a;
        int width = view.getWidth();
        int i7 = this.f28511c;
        GradientDrawable gradientDrawable = this.f28510b;
        gradientDrawable.setBounds((int) ((width - i7) / 2.0f), (int) ((view.getHeight() - i7) / 2.0f), (int) ((view.getWidth() + i7) / 2.0f), (int) ((view.getHeight() + i7) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f28510b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f28510b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28510b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i7 = this.d;
        if (i7 >= 0) {
            this.f28510b.setColor(l6.w0(i7, this.f28512e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
