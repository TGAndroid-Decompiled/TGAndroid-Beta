package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.fh0;
public final class r1 extends Drawable implements z5 {
    public final View f28495a;
    public final GradientDrawable f28496b;
    public final int f28497c;
    public final int d;
    public final e6 f28498e;

    public r1(fh0 fh0Var, int i3, int i10, int i11, e6 e6Var) {
        this.f28495a = fh0Var;
        this.f28497c = i10;
        this.d = i11;
        this.f28498e = e6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f28496b = gradientDrawable;
        gradientDrawable.setColor(i3);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f28495a;
        int width = view.getWidth();
        int i3 = this.f28497c;
        GradientDrawable gradientDrawable = this.f28496b;
        gradientDrawable.setBounds((int) ((width - i3) / 2.0f), (int) ((view.getHeight() - i3) / 2.0f), (int) ((view.getWidth() + i3) / 2.0f), (int) ((view.getHeight() + i3) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f28496b.getOpacity();
    }

    @Override
    public final void setAlpha(int i3) {
        this.f28496b.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28496b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i3 = this.d;
        if (i3 >= 0) {
            this.f28496b.setColor(k6.w0(i3, this.f28498e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
