package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.rh0;
public final class s1 extends Drawable implements b6 {
    public final View f29974a;
    public final GradientDrawable f29975b;
    public final int f29976c;
    public final int d;
    public final h6 f29977e;

    public s1(rh0 rh0Var, int i7, int i10, int i11, h6 h6Var) {
        this.f29974a = rh0Var;
        this.f29976c = i10;
        this.d = i11;
        this.f29977e = h6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f29975b = gradientDrawable;
        gradientDrawable.setColor(i7);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f29974a;
        int width = view.getWidth();
        int i7 = this.f29976c;
        GradientDrawable gradientDrawable = this.f29975b;
        gradientDrawable.setBounds((int) ((width - i7) / 2.0f), (int) ((view.getHeight() - i7) / 2.0f), (int) ((view.getWidth() + i7) / 2.0f), (int) ((view.getHeight() + i7) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f29975b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f29975b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29975b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i7 = this.d;
        if (i7 >= 0) {
            this.f29975b.setColor(m6.w0(i7, this.f29977e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
