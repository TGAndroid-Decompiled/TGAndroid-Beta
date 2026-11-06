package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.ch0;
public final class t1 extends Drawable implements a6 {
    public final View f28501a;
    public final GradientDrawable f28502b;
    public final int f28503c;
    public final int d;
    public final f6 f28504e;

    public t1(ch0 ch0Var, int i7, int i10, int i11, f6 f6Var) {
        this.f28501a = ch0Var;
        this.f28503c = i10;
        this.d = i11;
        this.f28504e = f6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f28502b = gradientDrawable;
        gradientDrawable.setColor(i7);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f28501a;
        int width = view.getWidth();
        int i7 = this.f28503c;
        GradientDrawable gradientDrawable = this.f28502b;
        gradientDrawable.setBounds((int) ((width - i7) / 2.0f), (int) ((view.getHeight() - i7) / 2.0f), (int) ((view.getWidth() + i7) / 2.0f), (int) ((view.getHeight() + i7) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f28502b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f28502b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28502b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i7 = this.d;
        if (i7 >= 0) {
            this.f28502b.setColor(k6.w0(i7, this.f28504e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
