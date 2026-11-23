package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public class AnimatedArrowDrawable extends Drawable {
    public final Paint f32622a;
    public final Path f32623b = new Path();
    public float f32624c;
    public float d;
    public long f32625e;
    public final boolean f32626f;
    public final float f32627g;
    public final float h;
    public final float f32628i;

    public AnimatedArrowDrawable(int i7, boolean z10) {
        Paint paint = new Paint(1);
        this.f32622a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(i7);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f32626f = z10;
        b();
    }

    public final void a(float f10) {
        if (this.d == f10) {
            return;
        }
        this.d = f10;
        this.f32625e = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public final void b() {
        Path path = this.f32623b;
        path.reset();
        float f10 = (this.f32624c * 2.0f) - 1.0f;
        float f11 = this.f32627g;
        if (f11 > 0.0f) {
            float f12 = this.h;
            if (f12 > 0.0f) {
                float N = org.telegram.messenger.g0.N(this.f32628i) / 2.0f;
                float N2 = org.telegram.messenger.g0.N(f11) - N;
                float N3 = org.telegram.messenger.g0.N(f12) - N;
                float f13 = N3 - N;
                path.moveTo(N, N3 - (this.f32624c * f13));
                path.lineTo((N + N2) / 2.0f, (this.f32624c * f13) + N);
                path.lineTo(N2, N3 - (f13 * this.f32624c));
                return;
            }
        }
        if (this.f32626f) {
            path.moveTo(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f) - (org.telegram.messenger.g0.L(2.0f) * f10));
            path.lineTo(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(2.0f) * f10) + org.telegram.messenger.g0.L(6.0f));
            path.lineTo(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(6.0f) - (org.telegram.messenger.g0.L(2.0f) * f10));
            return;
        }
        path.moveTo(org.telegram.messenger.g0.L(4.5f), (org.telegram.messenger.g0.L(2.0f) * this.f32624c) + (org.telegram.messenger.g0.L(12.0f) - (org.telegram.messenger.g0.L(4.0f) * f10)));
        path.lineTo(org.telegram.messenger.g0.L(13.0f), (org.telegram.messenger.g0.L(2.0f) * this.f32624c) + (org.telegram.messenger.g0.L(4.0f) * f10) + org.telegram.messenger.g0.L(12.0f));
        path.lineTo(org.telegram.messenger.g0.L(21.5f), (org.telegram.messenger.g0.L(2.0f) * this.f32624c) + (org.telegram.messenger.g0.L(12.0f) - (org.telegram.messenger.g0.L(4.0f) * f10)));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f32623b, this.f32622a);
        if (this.d != this.f32624c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f32625e;
            this.f32625e = elapsedRealtime;
            float f10 = this.f32624c;
            float f11 = this.d;
            if (f10 < f11) {
                float f12 = (((float) j3) / 180.0f) + f10;
                this.f32624c = f12;
                if (f12 > f11) {
                    this.f32624c = f11;
                }
            } else {
                float f13 = f10 - (((float) j3) / 180.0f);
                this.f32624c = f13;
                if (f13 < f11) {
                    this.f32624c = f11;
                }
            }
            b();
            invalidateSelf();
        }
    }

    public float getAnimationProgress() {
        return this.f32624c;
    }

    @Override
    public final int getIntrinsicHeight() {
        float f10 = this.h;
        if (f10 > 0.0f) {
            return org.telegram.messenger.g0.L(f10);
        }
        return org.telegram.messenger.g0.L(26.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        float f10 = this.f32627g;
        if (f10 > 0.0f) {
            return org.telegram.messenger.g0.L(f10);
        }
        return org.telegram.messenger.g0.L(26.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void setAnimationProgress(float f10) {
        this.f32624c = f10;
        this.d = f10;
        b();
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32622a.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i7) {
        Paint paint = new Paint(1);
        this.f32622a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(i7);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f32626f = true;
        this.f32627g = 12.66f;
        this.h = 6.16f;
        this.f32628i = 1.66f;
        b();
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
