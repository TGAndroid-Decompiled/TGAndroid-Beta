package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.ph0;
public final class t1 extends Drawable implements c6 {
    public final View f29993a;
    public final GradientDrawable f29994b;
    public final int f29995c;
    public final int d;
    public final i6 f29996e;

    public t1(ph0 ph0Var, int i7, int i10, int i11, i6 i6Var) {
        this.f29993a = ph0Var;
        this.f29995c = i10;
        this.d = i11;
        this.f29996e = i6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f29994b = gradientDrawable;
        gradientDrawable.setColor(i7);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f29993a;
        int width = view.getWidth();
        int i7 = this.f29995c;
        GradientDrawable gradientDrawable = this.f29994b;
        gradientDrawable.setBounds((int) ((width - i7) / 2.0f), (int) ((view.getHeight() - i7) / 2.0f), (int) ((view.getWidth() + i7) / 2.0f), (int) ((view.getHeight() + i7) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f29994b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f29994b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29994b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i7 = this.d;
        if (i7 >= 0) {
            this.f29994b.setColor(n6.w0(i7, this.f29996e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
