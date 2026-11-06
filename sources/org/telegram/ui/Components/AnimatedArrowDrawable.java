package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public class AnimatedArrowDrawable extends Drawable {
    public final Paint f30998a;
    public final Path f30999b = new Path();
    public float f31000c;
    public float d;
    public long f31001e;
    public final boolean f31002f;
    public final float f31003g;
    public final float h;
    public final float f31004i;

    public AnimatedArrowDrawable(int i7, boolean z9) {
        Paint paint = new Paint(1);
        this.f30998a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(i7);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f31002f = z9;
        b();
    }

    public final void a(float f10) {
        if (this.d == f10) {
            return;
        }
        this.d = f10;
        this.f31001e = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public final void b() {
        Path path = this.f30999b;
        path.reset();
        float f10 = (this.f31000c * 2.0f) - 1.0f;
        float f11 = this.f31003g;
        if (f11 > 0.0f) {
            float f12 = this.h;
            if (f12 > 0.0f) {
                float N = org.telegram.messenger.g0.N(this.f31004i) / 2.0f;
                float N2 = org.telegram.messenger.g0.N(f11) - N;
                float N3 = org.telegram.messenger.g0.N(f12) - N;
                float f13 = N3 - N;
                path.moveTo(N, N3 - (this.f31000c * f13));
                path.lineTo((N + N2) / 2.0f, (this.f31000c * f13) + N);
                path.lineTo(N2, N3 - (f13 * this.f31000c));
                return;
            }
        }
        if (this.f31002f) {
            path.moveTo(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f) - (org.telegram.messenger.g0.L(2.0f) * f10));
            path.lineTo(org.telegram.messenger.g0.L(8.0f), (org.telegram.messenger.g0.L(2.0f) * f10) + org.telegram.messenger.g0.L(6.0f));
            path.lineTo(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(6.0f) - (org.telegram.messenger.g0.L(2.0f) * f10));
            return;
        }
        path.moveTo(org.telegram.messenger.g0.L(4.5f), (org.telegram.messenger.g0.L(2.0f) * this.f31000c) + (org.telegram.messenger.g0.L(12.0f) - (org.telegram.messenger.g0.L(4.0f) * f10)));
        path.lineTo(org.telegram.messenger.g0.L(13.0f), (org.telegram.messenger.g0.L(2.0f) * this.f31000c) + (org.telegram.messenger.g0.L(4.0f) * f10) + org.telegram.messenger.g0.L(12.0f));
        path.lineTo(org.telegram.messenger.g0.L(21.5f), (org.telegram.messenger.g0.L(2.0f) * this.f31000c) + (org.telegram.messenger.g0.L(12.0f) - (org.telegram.messenger.g0.L(4.0f) * f10)));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f30999b, this.f30998a);
        if (this.d != this.f31000c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f31001e;
            this.f31001e = elapsedRealtime;
            float f10 = this.f31000c;
            float f11 = this.d;
            if (f10 < f11) {
                float f12 = (((float) j3) / 180.0f) + f10;
                this.f31000c = f12;
                if (f12 > f11) {
                    this.f31000c = f11;
                }
            } else {
                float f13 = f10 - (((float) j3) / 180.0f);
                this.f31000c = f13;
                if (f13 < f11) {
                    this.f31000c = f11;
                }
            }
            b();
            invalidateSelf();
        }
    }

    public float getAnimationProgress() {
        return this.f31000c;
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
        float f10 = this.f31003g;
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
        this.f31000c = f10;
        this.d = f10;
        b();
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30998a.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i7) {
        Paint paint = new Paint(1);
        this.f30998a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(i7);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f31002f = true;
        this.f31003g = 12.66f;
        this.h = 6.16f;
        this.f31004i = 1.66f;
        b();
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
