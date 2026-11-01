package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.fi0;
public final class w1 extends Drawable implements k6 {
    public final View f21430a;
    public final GradientDrawable f21431b;
    public final int f21432c;
    public final int d;
    public final p6 e;

    public w1(fi0 fi0Var, int i10, int i11, int i12, p6 p6Var) {
        this.f21430a = fi0Var;
        this.f21432c = i11;
        this.d = i12;
        this.e = p6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f21431b = gradientDrawable;
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f21430a;
        int width = view.getWidth();
        int i10 = this.f21432c;
        GradientDrawable gradientDrawable = this.f21431b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((view.getHeight() - i10) / 2.0f), (int) ((view.getWidth() + i10) / 2.0f), (int) ((view.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f21431b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f21431b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21431b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i10 = this.d;
        if (i10 >= 0) {
            this.f21431b.setColor(t6.w0(i10, this.e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
