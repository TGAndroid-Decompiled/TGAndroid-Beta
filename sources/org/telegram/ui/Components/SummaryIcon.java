package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.ChatMessageCell;

public final class SummaryIcon extends Drawable {
    public int alpha = 255;
    public final Drawable arrow;
    public boolean on;
    public final AnimatedFloat progress;
    public final Drawable stars;

    public SummaryIcon(ChatMessageCell chatMessageCell) {
        this.progress = new AnimatedFloat(420L, chatMessageCell, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.arrow = chatMessageCell.getContext().getResources().getDrawable(R.drawable.summary_arrow);
        this.stars = chatMessageCell.getContext().getResources().getDrawable(R.drawable.summary_stars);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = this.stars;
        drawable.setBounds(bounds);
        drawable.setAlpha(this.alpha);
        drawable.draw(canvas);
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
        Rect bounds2 = getBounds();
        Drawable drawable2 = this.arrow;
        drawable2.setBounds(bounds2);
        drawable2.setAlpha(this.alpha);
        drawable2.draw(canvas);
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
        drawable2.setBounds(getBounds());
        drawable2.setAlpha(this.alpha);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.arrow.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.arrow.getIntrinsicWidth();
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
        this.arrow.setColorFilter(colorFilter);
        this.stars.setColorFilter(colorFilter);
    }
}
