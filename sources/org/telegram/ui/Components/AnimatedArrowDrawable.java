package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public class AnimatedArrowDrawable extends Drawable {
    public final Paint f25829a;
    public final Path f25830b = new Path();
    public float f25831c;
    public float d;
    public long e;
    public final boolean f25832f;
    public final float f25833g;
    public final float h;
    public final float f25834i;

    public AnimatedArrowDrawable(int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.f25829a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f25832f = z10;
        b();
    }

    public final void a(float f7) {
        if (this.d == f7) {
            return;
        }
        this.d = f7;
        this.e = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public final void b() {
        Path path = this.f25830b;
        path.reset();
        float f7 = (this.f25831c * 2.0f) - 1.0f;
        float f10 = this.f25833g;
        if (f10 > 0.0f) {
            float f11 = this.h;
            if (f11 > 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(this.f25834i) / 2.0f;
                float dpf22 = AndroidUtilities.dpf2(f10) - dpf2;
                float dpf23 = AndroidUtilities.dpf2(f11) - dpf2;
                float f12 = dpf23 - dpf2;
                path.moveTo(dpf2, dpf23 - (this.f25831c * f12));
                path.lineTo((dpf2 + dpf22) / 2.0f, (this.f25831c * f12) + dpf2);
                path.lineTo(dpf22, dpf23 - (f12 * this.f25831c));
                return;
            }
        }
        if (this.f25832f) {
            path.moveTo(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f7));
            path.lineTo(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(2.0f) * f7) + AndroidUtilities.dp(6.0f));
            path.lineTo(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f7));
            return;
        }
        path.moveTo(AndroidUtilities.dp(4.5f), (AndroidUtilities.dp(2.0f) * this.f25831c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f7)));
        path.lineTo(AndroidUtilities.dp(13.0f), (AndroidUtilities.dp(2.0f) * this.f25831c) + (AndroidUtilities.dp(4.0f) * f7) + AndroidUtilities.dp(12.0f));
        path.lineTo(AndroidUtilities.dp(21.5f), (AndroidUtilities.dp(2.0f) * this.f25831c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f7)));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f25830b, this.f25829a);
        if (this.d != this.f25831c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.e;
            this.e = elapsedRealtime;
            float f7 = this.f25831c;
            float f10 = this.d;
            if (f7 < f10) {
                float f11 = (((float) j10) / 180.0f) + f7;
                this.f25831c = f11;
                if (f11 > f10) {
                    this.f25831c = f10;
                }
            } else {
                float f12 = f7 - (((float) j10) / 180.0f);
                this.f25831c = f12;
                if (f12 < f10) {
                    this.f25831c = f10;
                }
            }
            b();
            invalidateSelf();
        }
    }

    public float getAnimationProgress() {
        return this.f25831c;
    }

    @Override
    public final int getIntrinsicHeight() {
        float f7 = this.h;
        if (f7 > 0.0f) {
            return AndroidUtilities.dp(f7);
        }
        return AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        float f7 = this.f25833g;
        if (f7 > 0.0f) {
            return AndroidUtilities.dp(f7);
        }
        return AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void setAnimationProgress(float f7) {
        this.f25831c = f7;
        this.d = f7;
        b();
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f25829a.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i10) {
        Paint paint = new Paint(1);
        this.f25829a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f25832f = true;
        this.f25833g = 12.66f;
        this.h = 6.16f;
        this.f25834i = 1.66f;
        b();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
