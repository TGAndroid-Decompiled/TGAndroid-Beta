package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;

public class ComposeDrawable extends Drawable {
    private final Drawable background;
    private final Drawable icon;
    private int tx;
    private int ty;
    private final ArrayList views = new ArrayList();
    private boolean iconVisible = false;
    private final AnimatedFloat animatedIconVisible = new AnimatedFloat(new Runnable() {
        @Override
        public final void run() {
            this.f$0.invalidate();
        }
    }, 420, CubicBezierInterpolator.EASE_OUT_QUINT);
    private int alpha = 255;

    @Override
    public int getOpacity() {
        return -2;
    }

    public ComposeDrawable(Drawable drawable, Drawable drawable2) {
        this.background = drawable;
        this.icon = drawable2;
    }

    public void addView(View view) {
        this.views.add(view);
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

    @Override
    public void draw(Canvas canvas) {
        float f = this.animatedIconVisible.set(this.iconVisible);
        this.background.setAlpha(this.alpha);
        this.background.setBounds(getBounds());
        this.background.draw(canvas);
        if (f > 0.0f) {
            this.icon.setAlpha((int) (this.alpha * f));
            this.icon.setBounds(getBounds().left + this.tx, getBounds().top + this.ty, getBounds().left + this.tx + this.icon.getIntrinsicWidth(), getBounds().top + this.ty + this.icon.getIntrinsicHeight());
            float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, f);
            canvas.save();
            canvas.scale(fLerp, fLerp, this.icon.getBounds().centerX(), this.icon.getBounds().centerY());
            this.icon.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public int getIntrinsicWidth() {
        return this.background.getIntrinsicWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.background.getIntrinsicHeight();
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

    public void invalidate() {
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        invalidateSelf();
    }
}
