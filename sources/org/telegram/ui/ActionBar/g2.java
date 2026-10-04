package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class g2 extends Drawable {
    public final Paint f20645a;
    public boolean f20646b;
    public long f20647c;
    public float d;
    public float f20648e;
    public int f20649f;
    public final boolean f20650g;
    public final DecelerateInterpolator h;
    public int f20651i;
    public int f20652j;
    public float f20653k;
    public int f20654l;

    public g2(boolean z10) {
        Paint paint = new Paint(1);
        this.f20645a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f20651i = -1;
        this.f20652j = -9079435;
        this.f20653k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.f20650g = z10;
    }

    public final void a(int i10) {
        this.f20651i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f20652j = i10;
        invalidateSelf();
    }

    public final void c(float f7, boolean z10) {
        this.f20647c = 0L;
        float f10 = this.f20648e;
        if (f10 == 1.0f) {
            this.f20646b = true;
        } else if (f10 == 0.0f) {
            this.f20646b = false;
        }
        this.f20647c = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20649f = (int) (f10 * this.f20653k);
            } else {
                this.f20649f = (int) ((1.0f - f10) * this.f20653k);
            }
            this.f20647c = System.currentTimeMillis();
            this.d = f7;
        } else {
            this.f20648e = f7;
            this.d = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        if (this.f20648e != this.d) {
            if (this.f20647c != 0) {
                int currentTimeMillis = this.f20649f + ((int) (System.currentTimeMillis() - this.f20647c));
                this.f20649f = currentTimeMillis;
                float f7 = currentTimeMillis;
                float f10 = this.f20653k;
                if (f7 >= f10) {
                    this.f20648e = this.d;
                } else {
                    float f11 = this.f20648e;
                    float f12 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f11 < f12) {
                        this.f20648e = decelerateInterpolator.getInterpolation(f7 / f10) * this.d;
                    } else {
                        this.f20648e = 1.0f - decelerateInterpolator.getInterpolation(f7 / f10);
                    }
                }
            }
            this.f20647c = System.currentTimeMillis();
            invalidateSelf();
        }
        int d = i0.a.d(this.f20648e, this.f20651i, this.f20652j);
        Paint paint = this.f20645a;
        paint.setColor(d);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i12 = this.f20654l;
        if (i12 != 0) {
            canvas.rotate(i12);
        }
        float f13 = this.f20648e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (!this.f20650g) {
            float f14 = this.f20648e;
            if (this.f20646b) {
                i11 = -225;
            } else {
                i11 = 135;
            }
            canvas.rotate(f14 * i11);
        } else {
            float f15 = this.f20648e;
            if (this.f20646b) {
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
        this.f20645a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20645a.setColorFilter(colorFilter);
    }
}
