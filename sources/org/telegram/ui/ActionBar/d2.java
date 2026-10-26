package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ak0;
public final class d2 extends Drawable implements p6 {
    public final View f22538a;
    public final GradientDrawable f22539b;
    public final int f22540c;
    public final int d;
    public final u6 e;

    public d2(ak0 ak0Var, int i10, int i11, int i12, u6 u6Var) {
        this.f22538a = ak0Var;
        this.f22540c = i11;
        this.d = i12;
        this.e = u6Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f22539b = gradientDrawable;
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(AndroidUtilities.dp(128.0f));
    }

    @Override
    public final void draw(Canvas canvas) {
        View view = this.f22538a;
        int width = view.getWidth();
        int i10 = this.f22540c;
        GradientDrawable gradientDrawable = this.f22539b;
        gradientDrawable.setBounds((int) ((width - i10) / 2.0f), (int) ((view.getHeight() - i10) / 2.0f), (int) ((view.getWidth() + i10) / 2.0f), (int) ((view.getHeight() + i10) / 2.0f));
        gradientDrawable.draw(canvas);
    }

    @Override
    public final int getOpacity() {
        return this.f22539b.getOpacity();
    }

    @Override
    public final void setAlpha(int i10) {
        this.f22539b.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22539b.setColorFilter(colorFilter);
    }

    @Override
    public final void updateColors() {
        int i10 = this.d;
        if (i10 >= 0) {
            this.f22539b.setColor(y6.w0(i10, this.e));
            invalidateSelf();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
