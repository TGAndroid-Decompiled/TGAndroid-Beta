package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ak0;
public final class b2 extends Drawable implements b6 {
    public final View f20726a;
    public final GradientDrawable f20727b;
    public final int f20728c;
    public final int d;
    public final g6 e;

    public b2(ak0 ak0Var, int i10, int i11, int i12, g6 g6Var) {
        this.f20726a = ak0Var;
        this.f20728c = i11;
        this.d = i12;
        this.e = g6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f20727b = gradientDrawable;
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f20726a;
        int width = view.getWidth();
        int i10 = this.f20728c;
        GradientDrawable gradientDrawable = this.f20727b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((view.getHeight() - i10) / 2.0f), (int) ((view.getWidth() + i10) / 2.0f), (int) ((view.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f20727b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f20727b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20727b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i10 = this.d;
        if (i10 >= 0) {
            this.f20727b.setColor(k6.w0(i10, this.e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
