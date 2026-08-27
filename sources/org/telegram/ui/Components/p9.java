package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

public final class p9 extends Drawable {

    public TextPaint f31564a;

    public final Paint f31565b;

    public final Paint f31566c;
    public final Paint d;

    public final float f31567e;

    public float f31568f;

    public float f31569g;
    public final RectF h;

    public ValueAnimator f31570i;

    public p9() {
        Paint paint = new Paint(1);
        this.f31565b = paint;
        this.f31566c = new Paint(1);
        this.d = new Paint(1);
        this.f31567e = 1.0f;
        this.f31568f = 0.0f;
        this.f31569g = 1.0f;
        this.h = new RectF();
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(float f10, boolean z10) {
        float fMax = Math.max(Math.min(f10, 1.0f), 0.0f);
        ValueAnimator valueAnimator = this.f31570i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31570i = null;
        }
        if (!z10) {
            this.f31569g = fMax;
            invalidateSelf();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f31569g, fMax);
        this.f31570i = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new e6(this, 5));
        this.f31570i.addListener(new org.telegram.ui.ActionBar.z0(this, fMax, 4));
        this.f31570i.setInterpolator(er.h);
        this.f31570i.setDuration(200L);
        this.f31570i.start();
    }

    @Override
    public final void draw(Canvas canvas) {
        if (getBounds() == null) {
            return;
        }
        int i10 = getBounds().left;
        int i11 = getBounds().top + ((int) this.f31568f);
        int iWidth = getBounds().width();
        int iHeight = getBounds().height();
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY() + ((int) this.f31568f);
        TextPaint textPaint = this.f31564a;
        Paint paint = this.d;
        Paint paint2 = this.f31566c;
        Paint paint3 = this.f31565b;
        if (textPaint != null) {
            int color = textPaint.getColor();
            paint3.setColor(color);
            paint2.setColor(color);
            paint.setColor(color);
        }
        if (this.f31567e != 1.0f) {
            canvas.save();
            float f10 = this.f31567e;
            canvas.scale(f10, f10, iCenterX, iCenterY);
        }
        paint3.setStrokeWidth(AndroidUtilities.dpf2(1.1f));
        float f11 = i10;
        float f12 = iWidth;
        float fDpf2 = (((f12 - AndroidUtilities.dpf2(16.33f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f);
        float f13 = i11;
        float f14 = iHeight;
        float fDpf3 = ((f14 - AndroidUtilities.dpf2(10.33f)) / 2.0f) + f13;
        float fDpf4 = (((AndroidUtilities.dpf2(16.33f) + f12) / 2.0f) + f11) - AndroidUtilities.dpf2(1.33f);
        float fDpf5 = ((AndroidUtilities.dpf2(10.33f) + f14) / 2.0f) + f13;
        RectF rectF = this.h;
        rectF.set(fDpf2, fDpf3, fDpf4, fDpf5);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(2.33f), paint3);
        rectF.set((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f), ((f14 - AndroidUtilities.dpf2(7.33f)) / 2.0f) + f13, Math.max(AndroidUtilities.dpf2(1.1f), this.f31569g * AndroidUtilities.dpf2(13.0f)) + ((((f12 - AndroidUtilities.dpf2(13.0f)) / 2.0f) + f11) - AndroidUtilities.dpf2(1.66f)), ((AndroidUtilities.dpf2(7.33f) + f14) / 2.0f) + f13);
        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.83f), AndroidUtilities.dpf2(0.83f), paint);
        float f15 = iCenterY;
        rectF.set((((AndroidUtilities.dpf2(17.5f) + f12) - AndroidUtilities.dpf2(4.66f)) / 2.0f) + f11, f15 - AndroidUtilities.dpf2(2.65f), ((AndroidUtilities.dpf2(4.66f) + (AndroidUtilities.dpf2(17.5f) + f12)) / 2.0f) + f11, AndroidUtilities.dpf2(2.65f) + f15);
        canvas.drawArc(rectF, -90.0f, 180.0f, false, paint2);
        if (this.f31567e != 1.0f) {
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f31567e * 24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f31567e * 24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f31565b.setAlpha(i10);
        this.f31566c.setAlpha(i10);
        this.d.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31565b.setColorFilter(colorFilter);
        this.f31566c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
    }

    public p9(float f10, int i10) {
        this();
        a(f10, false);
        this.f31565b.setColor(-1);
        this.f31566c.setColor(-1);
        this.d.setColor(i10);
        this.f31567e = 1.3f;
        invalidateSelf();
    }
}
