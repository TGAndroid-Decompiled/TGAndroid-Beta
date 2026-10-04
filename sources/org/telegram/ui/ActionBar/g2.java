package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class g2 extends Drawable {
    public final Paint f20640a;
    public boolean f20641b;
    public long f20642c;
    public float d;
    public float f20643e;
    public int f20644f;
    public final boolean f20645g;
    public final DecelerateInterpolator h;
    public int f20646i;
    public int f20647j;
    public float f20648k;
    public int f20649l;

    public g2(boolean z10) {
        Paint paint = new Paint(1);
        this.f20640a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f20646i = -1;
        this.f20647j = -9079435;
        this.f20648k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.f20645g = z10;
    }

    public final void a(int i10) {
        this.f20646i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f20647j = i10;
        invalidateSelf();
    }

    public final void c(float f7, boolean z10) {
        this.f20642c = 0L;
        float f10 = this.f20643e;
        if (f10 == 1.0f) {
            this.f20641b = true;
        } else if (f10 == 0.0f) {
            this.f20641b = false;
        }
        this.f20642c = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20644f = (int) (f10 * this.f20648k);
            } else {
                this.f20644f = (int) ((1.0f - f10) * this.f20648k);
            }
            this.f20642c = System.currentTimeMillis();
            this.d = f7;
        } else {
            this.f20643e = f7;
            this.d = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        if (this.f20643e != this.d) {
            if (this.f20642c != 0) {
                int currentTimeMillis = this.f20644f + ((int) (System.currentTimeMillis() - this.f20642c));
                this.f20644f = currentTimeMillis;
                float f7 = currentTimeMillis;
                float f10 = this.f20648k;
                if (f7 >= f10) {
                    this.f20643e = this.d;
                } else {
                    float f11 = this.f20643e;
                    float f12 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f11 < f12) {
                        this.f20643e = decelerateInterpolator.getInterpolation(f7 / f10) * this.d;
                    } else {
                        this.f20643e = 1.0f - decelerateInterpolator.getInterpolation(f7 / f10);
                    }
                }
            }
            this.f20642c = System.currentTimeMillis();
            invalidateSelf();
        }
        int d = i0.a.d(this.f20643e, this.f20646i, this.f20647j);
        Paint paint = this.f20640a;
        paint.setColor(d);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i12 = this.f20649l;
        if (i12 != 0) {
            canvas.rotate(i12);
        }
        float f13 = this.f20643e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (!this.f20645g) {
            float f14 = this.f20643e;
            if (this.f20641b) {
                i11 = -225;
            } else {
                i11 = 135;
            }
            canvas.rotate(f14 * i11);
        } else {
            float f15 = this.f20643e;
            if (this.f20641b) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate((f15 * i10) + 135.0f);
            f13 = 1.0f;
        }
        float f16 = 1.0f - f13;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f13)), 0.0f, AndroidUtilities.dp(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f16), 0.0f, paint);
        float dp = AndroidUtilities.dp(-0.25f);
        float dp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f13)) - ((paint.getStrokeWidth() / 4.0f) * f16);
        float dp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f13));
        canvas.drawLine(dp3, -dp, 0.0f, -dp2, paint);
        canvas.drawLine(dp3, dp, 0.0f, dp2, paint);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f20640a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20640a.setColorFilter(colorFilter);
    }
}
