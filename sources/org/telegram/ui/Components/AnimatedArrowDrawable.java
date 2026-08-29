package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public class AnimatedArrowDrawable extends Drawable {
    public final Paint f26067a;
    public final Path f26068b = new Path();
    public float f26069c;
    public float d;
    public long f26070e;
    public final boolean f26071f;
    public final float f26072g;
    public final float h;
    public final float f26073i;

    public AnimatedArrowDrawable(int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.f26067a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f26071f = z10;
        b();
    }

    public final void a(float f9) {
        if (this.d == f9) {
            return;
        }
        this.d = f9;
        this.f26070e = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public final void b() {
        Path path = this.f26068b;
        path.reset();
        float f9 = (this.f26069c * 2.0f) - 1.0f;
        float f10 = this.f26072g;
        if (f10 > 0.0f) {
            float f11 = this.h;
            if (f11 > 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(this.f26073i) / 2.0f;
                float dpf22 = AndroidUtilities.dpf2(f10) - dpf2;
                float dpf23 = AndroidUtilities.dpf2(f11) - dpf2;
                float f12 = dpf23 - dpf2;
                path.moveTo(dpf2, dpf23 - (this.f26069c * f12));
                path.lineTo((dpf2 + dpf22) / 2.0f, (this.f26069c * f12) + dpf2);
                path.lineTo(dpf22, dpf23 - (f12 * this.f26069c));
                return;
            }
        }
        if (this.f26071f) {
            path.moveTo(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f9));
            path.lineTo(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(2.0f) * f9) + AndroidUtilities.dp(6.0f));
            path.lineTo(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f9));
            return;
        }
        path.moveTo(AndroidUtilities.dp(4.5f), (AndroidUtilities.dp(2.0f) * this.f26069c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f9)));
        path.lineTo(AndroidUtilities.dp(13.0f), (AndroidUtilities.dp(2.0f) * this.f26069c) + (AndroidUtilities.dp(4.0f) * f9) + AndroidUtilities.dp(12.0f));
        path.lineTo(AndroidUtilities.dp(21.5f), (AndroidUtilities.dp(2.0f) * this.f26069c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f9)));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f26068b, this.f26067a);
        if (this.d != this.f26069c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f26070e;
            this.f26070e = elapsedRealtime;
            float f9 = this.f26069c;
            float f10 = this.d;
            if (f9 < f10) {
                float f11 = (((float) j10) / 180.0f) + f9;
                this.f26069c = f11;
                if (f11 > f10) {
                    this.f26069c = f10;
                }
            } else {
                float f12 = f9 - (((float) j10) / 180.0f);
                this.f26069c = f12;
                if (f12 < f10) {
                    this.f26069c = f10;
                }
            }
            b();
            invalidateSelf();
        }
    }

    public float getAnimationProgress() {
        return this.f26069c;
    }

    @Override
    public final int getIntrinsicHeight() {
        float f9 = this.h;
        if (f9 > 0.0f) {
            return AndroidUtilities.dp(f9);
        }
        return AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        float f9 = this.f26072g;
        if (f9 > 0.0f) {
            return AndroidUtilities.dp(f9);
        }
        return AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void setAnimationProgress(float f9) {
        this.f26069c = f9;
        this.d = f9;
        b();
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26067a.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i10) {
        Paint paint = new Paint(1);
        this.f26067a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f26071f = true;
        this.f26072g = 12.66f;
        this.h = 6.16f;
        this.f26073i = 1.66f;
        b();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
