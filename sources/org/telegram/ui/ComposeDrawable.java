package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class ComposeDrawable extends Drawable {
    public final Drawable background;
    public final Drawable icon;
    public int tx;
    public int ty;
    public final ArrayList views = new ArrayList();
    public boolean iconVisible = false;
    public final AnimatedFloat animatedIconVisible = new AnimatedFloat(new ComposeDrawable$$ExternalSyntheticLambda0(this, 0), 420, CubicBezierInterpolator.EASE_OUT_QUINT);
    public int alpha = 255;

    public ComposeDrawable(Drawable drawable, Drawable drawable2) {
        this.background = drawable;
        this.icon = drawable2;
    }

    @Override
    public final void draw(Canvas canvas) {
        float f = this.animatedIconVisible.set(this.iconVisible);
        int i = this.alpha;
        Drawable drawable = this.background;
        drawable.setAlpha(i);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (f > 0.0f) {
            int i2 = (int) (this.alpha * f);
            Drawable drawable2 = this.icon;
            drawable2.setAlpha(i2);
            drawable2.setBounds(getBounds().left + this.tx, getBounds().top + this.ty, drawable2.getIntrinsicWidth() + getBounds().left + this.tx, drawable2.getIntrinsicHeight() + getBounds().top + this.ty);
            float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, f);
            canvas.save();
            canvas.scale(fLerp, fLerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.background.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.background.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.background.setColorFilter(colorFilter);
        this.icon.setColorFilter(colorFilter);
    }

    public final void setIconTranslate(int i, int i2) {
        this.tx = i;
        this.ty = i2;
    }

    public final void setIconVisible(boolean z) {
        if (this.iconVisible == z) {
            return;
        }
        this.iconVisible = z;
        ArrayList arrayList = this.views;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).invalidate();
        }
        invalidateSelf();
    }
}
