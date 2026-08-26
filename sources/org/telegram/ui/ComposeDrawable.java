package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class ComposeDrawable extends Drawable {
    private final Drawable background;
    private final Drawable icon;
    private int tx;
    private int ty;
    private final ArrayList<View> views = new ArrayList<>();
    private boolean iconVisible = false;
    private final AnimatedFloat animatedIconVisible = new AnimatedFloat(new IntroActivity$$ExternalSyntheticLambda5(this, 13), 420, CubicBezierInterpolator.EASE_OUT_QUINT);
    private int alpha = 255;

    public ComposeDrawable(Drawable drawable, Drawable drawable2) {
        this.background = drawable;
        this.icon = drawable2;
    }

    public void invalidate() {
        ArrayList<View> arrayList = this.views;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            View view = arrayList.get(i);
            i++;
            view.invalidate();
        }
        invalidateSelf();
    }

    public void addView(View view) {
        this.views.add(view);
    }

    @Override
    public void draw(Canvas canvas) {
        float f = this.animatedIconVisible.set(this.iconVisible);
        this.background.setAlpha(this.alpha);
        this.background.setBounds(getBounds());
        this.background.draw(canvas);
        if (f > 0.0f) {
            this.icon.setAlpha((int) (this.alpha * f));
            this.icon.setBounds(getBounds().left + this.tx, getBounds().top + this.ty, this.icon.getIntrinsicWidth() + getBounds().left + this.tx, this.icon.getIntrinsicHeight() + getBounds().top + this.ty);
            float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, f);
            canvas.save();
            canvas.scale(fLerp, fLerp, this.icon.getBounds().centerX(), this.icon.getBounds().centerY());
            this.icon.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public int getIntrinsicHeight() {
        return this.background.getIntrinsicHeight();
    }

    @Override
    public int getIntrinsicWidth() {
        return this.background.getIntrinsicWidth();
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.background.setColorFilter(colorFilter);
        this.icon.setColorFilter(colorFilter);
    }

    public void setIconTranslate(int i, int i2) {
        this.tx = i;
        this.ty = i2;
    }

    public void setIconVisible(boolean z) {
        setIconVisible(z, true);
    }

    public void setIconVisible(boolean z, boolean z2) {
        if (this.iconVisible == z) {
            return;
        }
        this.iconVisible = z;
        if (!z2) {
            this.animatedIconVisible.force(z);
        }
        invalidate();
    }
}
