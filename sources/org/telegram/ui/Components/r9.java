package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class r9 extends Drawable {
    public TextPaint f28427a;
    public final Paint f28428b;
    public final Paint f28429c;
    public final Paint d;
    public final float e;
    public float f28430f;
    public float f28431g;
    public final RectF h;
    public ValueAnimator f28432i;

    public r9() {
        Paint paint = new Paint(1);
        this.f28428b = paint;
        this.f28429c = new Paint(1);
        this.d = new Paint(1);
        this.e = 1.0f;
        this.f28430f = 0.0f;
        this.f28431g = 1.0f;
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(float f10, boolean z4) {
        float max = Math.max(Math.min(f10, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.f28432i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f28432i = null;
        }
        if (!z4) {
            this.f28431g = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f28431g, max);
        this.f28432i = ofFloat;
        ofFloat.addUpdateListener(new f6(this, 5));
        this.f28432i.addListener(new org.telegram.ui.ActionBar.a1(this, max, 4));
        this.f28432i.setInterpolator(mr.h);
        this.f28432i.setDuration(200L);
        this.f28432i.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (getBounds() != null) {
            int i10 = getBounds().left;
            int i11 = getBounds().top + ((int) this.f28430f);
            int width = getBounds().width();
            int height = getBounds().height();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY() + ((int) this.f28430f);
            TextPaint textPaint = this.f28427a;
            Paint paint = this.d;
            Paint paint2 = this.f28429c;
            Paint paint3 = this.f28428b;
            if (textPaint != null) {
                int color = textPaint.getColor();
                paint3.setColor(color);
                paint2.setColor(color);
                paint.setColor(color);
            }
            if (this.e != 1.0f) {
                canvas.save();
                float f10 = this.e;
                canvas.scale(f10, f10, centerX, centerY);
            }
            paint3.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
            float f11 = i10;
            float f12 = width;
            float f13 = i11;
            float f14 = height;
            RectF rectF = this.h;
            rectF.set((((f12 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f), ((f14 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f13, (((AndroidUtilities.dpf2(16.33f) + f12) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f), ((AndroidUtilities.dpf2(10.33f) + f14) / 2.0f) + f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), paint3);
            rectF.set((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f), ((f14 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f13, Math.max(AndroidUtilities.dpf2(1.1f), this.f28431g * AndroidUtilities.dpf2(13.0f)) + ((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f)), ((AndroidUtilities.dpf2(7.33f) + f14) / 2.0f) + f13);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), paint);
            float f15 = centerY;
            rectF.set((((AndroidUtilities.dpf2(17.5f) + f12) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f11, f15 - AndroidUtilities.dpf2(2.65f), ((AndroidUtilities.dpf2(4.66f) + (AndroidUtilities.dpf2(17.5f) + f12)) / 2.0f) + f11, AndroidUtilities.dpf2(2.65f) + f15);
            canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
            if (this.e != 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.e * 24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.e * 24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28428b.setAlpha(i10);
        this.f28429c.setAlpha(i10);
        this.d.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28428b.setColorFilter(colorFilter);
        this.f28429c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }

    public r9(float f10, int i10) {
        this();
        a(f10, false);
        this.f28428b.setColor(-1);
        this.f28429c.setColor(-1);
        this.d.setColor(i10);
        this.e = 1.3f;
        invalidateSelf();
    }
}
