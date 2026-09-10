package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class i2 extends Drawable {
    public final Paint f17819a;
    public boolean f17820b;
    public long f17821c;
    public float d;
    public float e;
    public int f17822f;
    public final boolean f17823g;
    public final DecelerateInterpolator h;
    public int f17824i;
    public int f17825j;
    public float f17826k;
    public int f17827l;

    public i2(boolean z10) {
        Paint paint = new Paint(1);
        this.f17819a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f17824i = -1;
        this.f17825j = -9079435;
        this.f17826k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.f17823g = z10;
    }

    public final void a(int i10) {
        this.f17824i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f17825j = i10;
        invalidateSelf();
    }

    public final void c(float f7, boolean z10) {
        this.f17821c = 0L;
        float f10 = this.e;
        if (f10 == 1.0f) {
            this.f17820b = true;
        } else if (f10 == 0.0f) {
            this.f17820b = false;
        }
        this.f17821c = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f17822f = (int) (f10 * this.f17826k);
            } else {
                this.f17822f = (int) ((1.0f - f10) * this.f17826k);
            }
            this.f17821c = System.currentTimeMillis();
            this.d = f7;
        } else {
            this.e = f7;
            this.d = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        if (this.e != this.d) {
            if (this.f17821c != 0) {
                int currentTimeMillis = this.f17822f + ((int) (System.currentTimeMillis() - this.f17821c));
                this.f17822f = currentTimeMillis;
                float f7 = currentTimeMillis;
                float f10 = this.f17826k;
                if (f7 >= f10) {
                    this.e = this.d;
                } else {
                    float f11 = this.e;
                    float f12 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f11 < f12) {
                        this.e = decelerateInterpolator.getInterpolation(f7 / f10) * this.d;
                    } else {
                        this.e = 1.0f - decelerateInterpolator.getInterpolation(f7 / f10);
                    }
                }
            }
            this.f17821c = System.currentTimeMillis();
            invalidateSelf();
        }
        int d = i0.a.d(this.e, this.f17824i, this.f17825j);
        Paint paint = this.f17819a;
        paint.setColor(d);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i12 = this.f17827l;
        if (i12 != 0) {
            canvas.rotate(i12);
        }
        float f13 = this.e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (!this.f17823g) {
            float f14 = this.e;
            if (this.f17820b) {
                i11 = -225;
            } else {
                i11 = 135;
            }
            canvas.rotate(f14 * i11);
        } else {
            float f15 = this.e;
            if (this.f17820b) {
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
        this.f17819a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17819a.setColorFilter(colorFilter);
    }
}
