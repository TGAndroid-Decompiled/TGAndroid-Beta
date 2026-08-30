package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
public class AnimatedArrowDrawable extends Drawable {
    public final Paint f22713a;
    public final Path f22714b = new Path();
    public float f22715c;
    public float d;
    public long e;
    public final boolean f22716f;
    public final float f22717g;
    public final float h;
    public final float f22718i;

    public AnimatedArrowDrawable(int i10, boolean z4) {
        Paint paint = new Paint(1);
        this.f22713a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f22716f = z4;
        b();
    }

    public final void a(float f10) {
        if (this.d == f10) {
            return;
        }
        this.d = f10;
        this.e = SystemClock.elapsedRealtime();
        invalidateSelf();
    }

    public final void b() {
        Path path = this.f22714b;
        path.reset();
        float f10 = (this.f22715c * 2.0f) - 1.0f;
        float f11 = this.f22717g;
        if (f11 > 0.0f) {
            float f12 = this.h;
            if (f12 > 0.0f) {
                float dpf2 = AndroidUtilities.dpf2(this.f22718i) / 2.0f;
                float dpf22 = AndroidUtilities.dpf2(f11) - dpf2;
                float dpf23 = AndroidUtilities.dpf2(f12) - dpf2;
                float f13 = dpf23 - dpf2;
                path.moveTo(dpf2, dpf23 - (this.f22715c * f13));
                path.lineTo((dpf2 + dpf22) / 2.0f, (this.f22715c * f13) + dpf2);
                path.lineTo(dpf22, dpf23 - (f13 * this.f22715c));
                return;
            }
        }
        if (this.f22716f) {
            path.moveTo(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f10));
            path.lineTo(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(2.0f) * f10) + AndroidUtilities.dp(6.0f));
            path.lineTo(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.0f) - (AndroidUtilities.dp(2.0f) * f10));
            return;
        }
        path.moveTo(AndroidUtilities.dp(4.5f), (AndroidUtilities.dp(2.0f) * this.f22715c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f10)));
        path.lineTo(AndroidUtilities.dp(13.0f), (AndroidUtilities.dp(2.0f) * this.f22715c) + (AndroidUtilities.dp(4.0f) * f10) + AndroidUtilities.dp(12.0f));
        path.lineTo(AndroidUtilities.dp(21.5f), (AndroidUtilities.dp(2.0f) * this.f22715c) + (AndroidUtilities.dp(12.0f) - (AndroidUtilities.dp(4.0f) * f10)));
    }

    @Override
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f22714b, this.f22713a);
        if (this.d != this.f22715c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.e;
            this.e = elapsedRealtime;
            float f10 = this.f22715c;
            float f11 = this.d;
            if (f10 < f11) {
                float f12 = (((float) j10) / 180.0f) + f10;
                this.f22715c = f12;
                if (f12 > f11) {
                    this.f22715c = f11;
                }
            } else {
                float f13 = f10 - (((float) j10) / 180.0f);
                this.f22715c = f13;
                if (f13 < f11) {
                    this.f22715c = f11;
                }
            }
            b();
            invalidateSelf();
        }
    }

    public float getAnimationProgress() {
        return this.f22715c;
    }

    @Override
    public final int getIntrinsicHeight() {
        float f10 = this.h;
        if (f10 > 0.0f) {
            return AndroidUtilities.dp(f10);
        }
        return AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        float f10 = this.f22717g;
        if (f10 > 0.0f) {
            return AndroidUtilities.dp(f10);
        }
        return AndroidUtilities.dp(26.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public void setAnimationProgress(float f10) {
        this.f22715c = f10;
        this.d = f10;
        b();
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f22713a.setColorFilter(colorFilter);
    }

    public AnimatedArrowDrawable(int i10) {
        Paint paint = new Paint(1);
        this.f22713a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.66f));
        paint.setColor(i10);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.f22716f = true;
        this.f22717g = 12.66f;
        this.h = 6.16f;
        this.f22718i = 1.66f;
        b();
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
