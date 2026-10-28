package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;
public final class d2 extends Drawable implements p6 {
    public final View f22539a;
    public final GradientDrawable f22540b;
    public final int f22541c;
    public final int d;
    public final u6 e;

    public d2(bk0 bk0Var, int i10, int i11, int i12, u6 u6Var) {
        this.f22539a = bk0Var;
        this.f22541c = i11;
        this.d = i12;
        this.e = u6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f22540b = gradientDrawable;
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f22539a;
        int width = view.getWidth();
        int i10 = this.f22541c;
        GradientDrawable gradientDrawable = this.f22540b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((view.getHeight() - i10) / 2.0f), (int) ((view.getWidth() + i10) / 2.0f), (int) ((view.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f22540b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f22540b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22540b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i10 = this.d;
        if (i10 >= 0) {
            this.f22540b.setColor(y6.w0(i10, this.e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
