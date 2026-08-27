package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

public class AnimatedArrowDrawable extends Drawable {

    public final Paint f26052a;

    public final Path f26053b = new Path();

    public float f26054c;
    public float d;

    public long f26055e;

    public final boolean f26056f;

    public final float f26057g;
    public final float h;

    public final float f26058i;

    public AnimatedArrowDrawable(int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.f26052a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f26056f = z10;
        b();
    }

    public final void a(float f10) {
        if (this.d == f10) {
            return;
        }
        this.d = f10;
        this.f26055e = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public final void b() {
        Path path = this.f26053b;
        path.reset();
        float f10 = (this.f26054c * 2.0f) - 1.0f;
        float f11 = this.f26057g;
        if (f11 > 0.0f) {
            float f12 = this.h;
            if (f12 > 0.0f) {
                float fDpf2 = AndroidUtilities.dpf2(this.f26058i) / 2.0f;
                float fDpf3 = AndroidUtilities.dpf2(f11) - fDpf2;
                float fDpf4 = AndroidUtilities.dpf2(f12) - fDpf2;
                float f13 = fDpf4 - fDpf2;
                path.moveTo(fDpf2, fDpf4 - (this.f26054c * f13));
                path.lineTo((fDpf2 + fDpf3) / 2.0f, (this.f26054c * f13) + fDpf2);
                path.lineTo(fDpf3, fDpf4 - (f13 * this.f26054c));
                return;
            }
        }
        if (this.f26056f) {
            path.moveTo(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f10));
            path.lineTo(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(2.0f) * f10) + AndroidUtilities.dp(6.0f));
            path.lineTo(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f10));
            return;
        }
        path.moveTo(AndroidUtilities.dp(4.5f), (AndroidUtilities.dp(2.0f) * this.f26054c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f10)));
        path.lineTo(AndroidUtilities.dp(13.0f), (AndroidUtilities.dp(2.0f) * this.f26054c) + (AndroidUtilities.dp(4.0f) * f10) + AndroidUtilities.dp(12.0f));
        path.lineTo(AndroidUtilities.dp(21.5f), (AndroidUtilities.dp(2.0f) * this.f26054c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f10)));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f26053b, this.f26052a);
        if (this.d != this.f26054c) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f26055e;
            this.f26055e = jElapsedRealtime;
            float f10 = this.f26054c;
            float f11 = this.d;
            if (f10 < f11) {
                float f12 = (j10 / 180.0f) + f10;
                this.f26054c = f12;
                if (f12 > f11) {
                    this.f26054c = f11;
                }
            } else {
                float f13 = f10 - (j10 / 180.0f);
                this.f26054c = f13;
                if (f13 < f11) {
                    this.f26054c = f11;
                }
            }
            b();
            invalidateSelf();
        }
    }

    public float getAnimationProgress() {
        return this.f26054c;
    }

    @Override
    public final int getIntrinsicHeight() {
        float f10 = this.h;
        return f10 > 0.0f ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        float f10 = this.f26057g;
        return f10 > 0.0f ? AndroidUtilities.dp(f10) : AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void setAnimationProgress(float f10) {
        this.f26054c = f10;
        this.d = f10;
        b();
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f26052a.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i10) {
        Paint paint = new Paint(1);
        this.f26052a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f26056f = true;
        this.f26057g = 12.66f;
        this.h = 6.16f;
        this.f26058i = 1.66f;
        b();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
