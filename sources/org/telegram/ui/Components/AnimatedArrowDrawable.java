package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
public class AnimatedArrowDrawable extends Drawable {
    public final Paint f23664a;
    public final Path f23665b = new Path();
    public float f23666c;
    public float d;
    public long e;
    public final boolean f23667f;
    public final float f23668g;
    public final float h;
    public final float f23669i;

    public AnimatedArrowDrawable(int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.f23664a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f23667f = z10;
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
        Path path = this.f23665b;
        path.reset();
        float f7 = (this.f23666c * 2.0f) - 1.0f;
        float f10 = this.f23668g;
        if (f10 > 0.0f) {
            float f11 = this.h;
            if (f11 > 0.0f) {
                float N = org.telegram.messenger.i0.N(this.f23669i) / 2.0f;
                float N2 = org.telegram.messenger.i0.N(f10) - N;
                float N3 = org.telegram.messenger.i0.N(f11) - N;
                float f12 = N3 - N;
                path.moveTo(N, N3 - (this.f23666c * f12));
                path.lineTo((N + N2) / 2.0f, (this.f23666c * f12) + N);
                path.lineTo(N2, N3 - (f12 * this.f23666c));
                return;
            }
        }
        if (this.f23667f) {
            path.moveTo(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(6.0f) - (org.telegram.messenger.i0.L(2.0f) * f7));
            path.lineTo(org.telegram.messenger.i0.L(8.0f), (org.telegram.messenger.i0.L(2.0f) * f7) + org.telegram.messenger.i0.L(6.0f));
            path.lineTo(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(6.0f) - (org.telegram.messenger.i0.L(2.0f) * f7));
            return;
        }
        path.moveTo(org.telegram.messenger.i0.L(4.5f), (org.telegram.messenger.i0.L(2.0f) * this.f23666c) + (org.telegram.messenger.i0.L(12.0f) - (org.telegram.messenger.i0.L(4.0f) * f7)));
        path.lineTo(org.telegram.messenger.i0.L(13.0f), (org.telegram.messenger.i0.L(2.0f) * this.f23666c) + (org.telegram.messenger.i0.L(4.0f) * f7) + org.telegram.messenger.i0.L(12.0f));
        path.lineTo(org.telegram.messenger.i0.L(21.5f), (org.telegram.messenger.i0.L(2.0f) * this.f23666c) + (org.telegram.messenger.i0.L(12.0f) - (org.telegram.messenger.i0.L(4.0f) * f7)));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f23665b, this.f23664a);
        if (this.d != this.f23666c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.e;
            this.e = elapsedRealtime;
            float f7 = this.f23666c;
            float f10 = this.d;
            if (f7 < f10) {
                float f11 = (((float) j10) / 180.0f) + f7;
                this.f23666c = f11;
                if (f11 > f10) {
                    this.f23666c = f10;
                }
            } else {
                float f12 = f7 - (((float) j10) / 180.0f);
                this.f23666c = f12;
                if (f12 < f10) {
                    this.f23666c = f10;
                }
            }
            b();
            invalidateSelf();
        }
    }

    public float getAnimationProgress() {
        return this.f23666c;
    }

    @Override
    public final int getIntrinsicHeight() {
        float f7 = this.h;
        if (f7 > 0.0f) {
            return org.telegram.messenger.i0.L(f7);
        }
        return org.telegram.messenger.i0.L(26.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        float f7 = this.f23668g;
        if (f7 > 0.0f) {
            return org.telegram.messenger.i0.L(f7);
        }
        return org.telegram.messenger.i0.L(26.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void setAnimationProgress(float f7) {
        this.f23666c = f7;
        this.d = f7;
        b();
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23664a.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i10) {
        Paint paint = new Paint(1);
        this.f23664a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.66f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f23667f = true;
        this.f23668g = 12.66f;
        this.h = 6.16f;
        this.f23669i = 1.66f;
        b();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
