package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;
public final class b2 extends Drawable implements b6 {
    public final View f20725a;
    public final GradientDrawable f20726b;
    public final int f20727c;
    public final int d;
    public final g6 e;

    public b2(bk0 bk0Var, int i10, int i11, int i12, g6 g6Var) {
        this.f20725a = bk0Var;
        this.f20727c = i11;
        this.d = i12;
        this.e = g6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f20726b = gradientDrawable;
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f20725a;
        int width = view.getWidth();
        int i10 = this.f20727c;
        GradientDrawable gradientDrawable = this.f20726b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((view.getHeight() - i10) / 2.0f), (int) ((view.getWidth() + i10) / 2.0f), (int) ((view.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f20726b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f20726b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20726b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i10 = this.d;
        if (i10 >= 0) {
            this.f20726b.setColor(k6.w0(i10, this.e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
