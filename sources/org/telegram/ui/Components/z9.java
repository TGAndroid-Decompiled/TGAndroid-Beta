package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
public final class z9 extends Drawable {
    public TextPaint f33102a;
    public final Paint f33103b;
    public final Paint f33104c;
    public final Paint d;
    public final float f33105e;
    public float f33106f;
    public float f33107g;
    public final RectF h;
    public ValueAnimator f33108i;

    public z9() {
        Paint paint = new Paint(1);
        this.f33103b = paint;
        this.f33104c = new Paint(1);
        this.d = new Paint(1);
        this.f33105e = 1.0f;
        this.f33106f = 0.0f;
        this.f33107g = 1.0f;
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(float f7, boolean z10) {
        float max = Math.max(Math.min(f7, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.f33108i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f33108i = null;
        }
        if (!z10) {
            this.f33107g = max;
            invalidateSelf();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f33107g, max);
        this.f33108i = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 5));
        this.f33108i.addListener(new org.telegram.ui.ActionBar.z0(this, max, 4));
        this.f33108i.setInterpolator(pr.h);
        this.f33108i.setDuration(200L);
        this.f33108i.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (getBounds() != null) {
            int i10 = getBounds().left;
            int i11 = getBounds().top + ((int) this.f33106f);
            int width = getBounds().width();
            int height = getBounds().height();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY() + ((int) this.f33106f);
            TextPaint textPaint = this.f33102a;
            Paint paint = this.d;
            Paint paint2 = this.f33104c;
            Paint paint3 = this.f33103b;
            if (textPaint != null) {
                int color = textPaint.getColor();
                paint3.setColor(color);
                paint2.setColor(color);
                paint.setColor(color);
            }
            if (this.f33105e != 1.0f) {
                canvas.save();
                float f7 = this.f33105e;
                canvas.scale(f7, f7, centerX, centerY);
            }
            paint3.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
            float f10 = i10;
            float f11 = width;
            float f12 = i11;
            float f13 = height;
            RectF rectF = this.h;
            rectF.set((((f11 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f10) - AndroidUtilities.dpf2(1.33f), ((f13 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f12, (((AndroidUtilities.dpf2(16.33f) + f11) / 2.0f) + f10) - AndroidUtilities.dpf2(1.33f), ((AndroidUtilities.dpf2(10.33f) + f13) / 2.0f) + f12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), paint3);
            rectF.set((((f11 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f10) - AndroidUtilities.dpf2(1.66f), ((f13 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f12, Math.max(AndroidUtilities.dpf2(1.1f), this.f33107g * AndroidUtilities.dpf2(13.0f)) + ((((f11 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f10) - AndroidUtilities.dpf2(1.66f)), ((AndroidUtilities.dpf2(7.33f) + f13) / 2.0f) + f12);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), paint);
            float f14 = centerY;
            rectF.set((((AndroidUtilities.dpf2(17.5f) + f11) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f10, f14 - AndroidUtilities.dpf2(2.65f), ((AndroidUtilities.dpf2(4.66f) + (AndroidUtilities.dpf2(17.5f) + f11)) / 2.0f) + f10, AndroidUtilities.dpf2(2.65f) + f14);
            canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
            if (this.f33105e != 1.0f) {
                canvas.restore();
            }
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f33105e * 24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f33105e * 24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33103b.setAlpha(i10);
        this.f33104c.setAlpha(i10);
        this.d.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f33103b.setColorFilter(colorFilter);
        this.f33104c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }

    public z9(float f7, int i10) {
        this();
        a(f7, false);
        this.f33103b.setColor(-1);
        this.f33104c.setColor(-1);
        this.d.setColor(i10);
        this.f33105e = 1.3f;
        invalidateSelf();
    }
}
