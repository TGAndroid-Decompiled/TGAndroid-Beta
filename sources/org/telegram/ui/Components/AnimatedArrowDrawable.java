package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public class AnimatedArrowDrawable extends Drawable {
    public final Paint f31072a;
    public final Path f31073b = new Path();
    public float f31074c;
    public float d;
    public long f31075e;
    public final boolean f31076f;
    public final float f31077g;
    public final float h;
    public final float f31078i;

    public AnimatedArrowDrawable(int i3, boolean z10) {
        Paint paint = new Paint(1);
        this.f31072a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(i3);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f31076f = z10;
        b();
    }

    public final void a(float f10) {
        if (this.d == f10) {
            return;
        }
        this.d = f10;
        this.f31075e = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public final void b() {
        Path path = this.f31073b;
        path.reset();
        float f10 = (this.f31074c * 2.0f) - 1.0f;
        float f11 = this.f31077g;
        if (f11 > 0.0f) {
            float f12 = this.h;
            if (f12 > 0.0f) {
                float N = org.telegram.messenger.g0.N(this.f31078i) / 2.0f;
                float N2 = org.telegram.messenger.g0.N(f11) - N;
                float N3 = org.telegram.messenger.g0.N(f12) - N;
                float f13 = N3 - N;
                path.moveTo(N, N3 - (this.f31074c * f13));
                path.lineTo((N + N2) / 2.0f, (this.f31074c * f13) + N);
                path.lineTo(N2, N3 - (f13 * this.f31074c));
                return;
            }
        }
        if (this.f31076f) {
            path.moveTo(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f) - (org.telegram.messenger.g0.L(2.0f) * f10));
            path.lineTo(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(2.0f) * f10) + org.telegram.messenger.g0.L(6.0f));
            path.lineTo(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(6.0f) - (org.telegram.messenger.g0.L(2.0f) * f10));
            return;
        }
        path.moveTo(org.telegram.messenger.g0.L(4.5f), (org.telegram.messenger.g0.L(2.0f) * this.f31074c) + (org.telegram.messenger.g0.L(12.0f) - (org.telegram.messenger.g0.L(4.0f) * f10)));
        path.lineTo(org.telegram.messenger.g0.L(13.0f), (org.telegram.messenger.g0.L(2.0f) * this.f31074c) + (org.telegram.messenger.g0.L(4.0f) * f10) + org.telegram.messenger.g0.L(12.0f));
        path.lineTo(org.telegram.messenger.g0.L(21.5f), (org.telegram.messenger.g0.L(2.0f) * this.f31074c) + (org.telegram.messenger.g0.L(12.0f) - (org.telegram.messenger.g0.L(4.0f) * f10)));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f31073b, this.f31072a);
        if (this.d != this.f31074c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f31075e;
            this.f31075e = elapsedRealtime;
            float f10 = this.f31074c;
            float f11 = this.d;
            if (f10 < f11) {
                float f12 = (((float) j10) / 180.0f) + f10;
                this.f31074c = f12;
                if (f12 > f11) {
                    this.f31074c = f11;
                }
            } else {
                float f13 = f10 - (((float) j10) / 180.0f);
                this.f31074c = f13;
                if (f13 < f11) {
                    this.f31074c = f11;
                }
            }
            b();
            invalidateSelf();
        }
    }

    public float getAnimationProgress() {
        return this.f31074c;
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
        float f10 = this.f31077g;
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
        this.f31074c = f10;
        this.d = f10;
        b();
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31072a.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i3) {
        Paint paint = new Paint(1);
        this.f31072a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(i3);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f31076f = true;
        this.f31077g = 12.66f;
        this.h = 6.16f;
        this.f31078i = 1.66f;
        b();
    }

    @Override
    public final void setAlpha(int i3) {
    }
}
