package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.fh0;
public final class s1 extends Drawable implements z5 {
    public final View f29582a;
    public final GradientDrawable f29583b;
    public final int f29584c;
    public final int d;
    public final e6 f29585e;

    public s1(fh0 fh0Var, int i7, int i10, int i11, e6 e6Var) {
        this.f29582a = fh0Var;
        this.f29584c = i10;
        this.d = i11;
        this.f29585e = e6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f29583b = gradientDrawable;
        gradientDrawable.setColor(i7);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f29582a;
        int width = view.getWidth();
        int i7 = this.f29584c;
        GradientDrawable gradientDrawable = this.f29583b;
        gradientDrawable.setBounds((int) ((width - i7) / 2.0f), (int) ((view.getHeight() - i7) / 2.0f), (int) ((view.getWidth() + i7) / 2.0f), (int) ((view.getHeight() + i7) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f29583b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f29583b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29583b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i7 = this.d;
        if (i7 >= 0) {
            this.f29583b.setColor(j6.w0(i7, this.f29585e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
