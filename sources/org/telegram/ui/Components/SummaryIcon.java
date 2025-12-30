package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.R;

public class SummaryIcon extends Drawable {
    private int alpha = 255;
    private final Drawable arrow;
    private boolean on;
    private final AnimatedFloat progress;
    private final Drawable stars;

    @Override
    public int getOpacity() {
        return -2;
    }

    public SummaryIcon(View view) {
        this.progress = new AnimatedFloat(view, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.arrow = view.getContext().getResources().getDrawable(R.drawable.summary_arrow);
        this.stars = view.getContext().getResources().getDrawable(R.drawable.summary_stars);
    }

    @Override
    public void draw(Canvas canvas) {
        this.stars.setBounds(getBounds());
        this.stars.setAlpha(this.alpha);
        this.stars.draw(canvas);
        float f = this.progress.set(this.on);
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        float fWidth = getBounds().width();
        canvas.save();
        if (f < 0.5f) {
            float fAbs = Math.abs(f - 0.5f) + 0.5f;
            canvas.scale(fAbs, fAbs, fCenterX, fCenterY);
        }
        canvas.save();
        if (f > 0.5f) {
            float fAbs2 = Math.abs(f - 0.5f) + 0.5f;
            float f2 = -fAbs2;
            float f3 = fWidth * 0.32f;
            canvas.scale(f2, f2, getBounds().left + f3, getBounds().bottom - f3);
            float f4 = 1.0f - fAbs2;
            canvas.translate((-fWidth) * f4 * 0.4f, f4 * fWidth * 0.4f);
        }
        this.arrow.setBounds(getBounds());
        this.arrow.setAlpha(this.alpha);
        this.arrow.draw(canvas);
        canvas.restore();
        canvas.save();
        if (f > 0.5f) {
            float f5 = -(Math.abs(f - 0.5f) + 0.5f);
            float f6 = 0.32f * fWidth;
            canvas.scale(f5, f5, getBounds().right - f6, getBounds().top + f6);
        }
        canvas.rotate(180.0f, fCenterX, fCenterY);
        if (f > 0.5f) {
            float fAbs3 = 1.0f - (Math.abs(f - 0.5f) + 0.5f);
            canvas.translate((-fWidth) * fAbs3 * 0.4f, fWidth * fAbs3 * 0.4f);
        }
        this.arrow.setBounds(getBounds());
        this.arrow.setAlpha(this.alpha);
        this.arrow.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void set(boolean z) {
        set(z, true);
    }

    public void set(boolean z, boolean z2) {
        this.on = z;
        if (z2) {
            return;
        }
        this.progress.set(z);
    }

    @Override
    public int getIntrinsicWidth() {
        return this.arrow.getIntrinsicWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        return this.arrow.getIntrinsicHeight();
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.arrow.setColorFilter(colorFilter);
        this.stars.setColorFilter(colorFilter);
    }
}
