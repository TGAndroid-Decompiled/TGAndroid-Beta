package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.Components.qh0;
public final class s1 extends Drawable implements c6 {
    public final View f30039a;
    public final GradientDrawable f30040b;
    public final int f30041c;
    public final int d;
    public final i6 f30042e;

    public s1(qh0 qh0Var, int i7, int i10, int i11, i6 i6Var) {
        this.f30039a = qh0Var;
        this.f30041c = i10;
        this.d = i11;
        this.f30042e = i6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f30040b = gradientDrawable;
        gradientDrawable.setColor(i7);
        gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f30039a;
        int width = view.getWidth();
        int i7 = this.f30041c;
        GradientDrawable gradientDrawable = this.f30040b;
        gradientDrawable.setBounds((int) ((width - i7) / 2.0f), (int) ((view.getHeight() - i7) / 2.0f), (int) ((view.getWidth() + i7) / 2.0f), (int) ((view.getHeight() + i7) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f30040b.getOpacity();
    }

    @Override
    public final void setAlpha(int i7) {
        this.f30040b.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30040b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i7 = this.d;
        if (i7 >= 0) {
            this.f30040b.setColor(n6.w0(i7, this.f30042e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
