package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import hi.s3;
import org.telegram.ui.Components.kr;
public final class r0 extends Drawable {
    public static final float[][] h = {new float[]{7.0f, 9.5f, 10.25f}, new float[]{12.0f, 17.0f, 10.25f}, new float[]{7.0f, 13.0f, 13.75f}, new float[]{15.5f, 17.0f, 13.75f}};
    public final Paint f41165a;
    public final Paint f41166b;
    public final RectF f41167c;
    public float d;
    public boolean f41168e;
    public ValueAnimator f41169f;
    public int f41170g;

    public r0(boolean z10) {
        float f10;
        Paint paint = new Paint(1);
        this.f41165a = paint;
        Paint paint2 = new Paint(1);
        this.f41166b = paint2;
        this.f41167c = new RectF();
        this.f41170g = 255;
        this.f41168e = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = f10;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final void a(boolean z10, boolean z11) {
        long j3;
        float f10;
        float f11 = 0.0f;
        if (this.f41168e == z10) {
            if (this.f41169f == null) {
                float f12 = this.d;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                if (f12 == f10) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f41168e = z10;
        ValueAnimator valueAnimator = this.f41169f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f41169f = null;
        }
        if (!z11) {
            if (z10) {
                f11 = 1.0f;
            }
            this.d = f11;
            invalidateSelf();
            return;
        }
        float f13 = this.d;
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f41169f = ofFloat;
        if (z10) {
            j3 = 420;
        } else {
            j3 = 340;
        }
        ofFloat.setDuration(j3);
        this.f41169f.setInterpolator(kr.h);
        this.f41169f.addUpdateListener(new s3(this, 18));
        this.f41169f.start();
    }

    @Override
    public final void draw(android.graphics.Canvas r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.r0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f41170g = i7;
        invalidateSelf();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f41165a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
