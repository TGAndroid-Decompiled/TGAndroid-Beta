package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class i2 extends Drawable {
    public final Paint f19763a;
    public boolean f19764b;
    public long f19765c;
    public float d;
    public float e;
    public int f19766f;
    public final boolean f19767g;
    public final DecelerateInterpolator h;
    public int f19768i;
    public int f19769j;
    public float f19770k;
    public int f19771l;

    public i2(boolean z4) {
        Paint paint = new Paint(1);
        this.f19763a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f19768i = -1;
        this.f19769j = -9079435;
        this.f19770k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.f19767g = z4;
    }

    public final void a(int i10) {
        this.f19768i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f19769j = i10;
        invalidateSelf();
    }

    public final void c(float f10, boolean z4) {
        this.f19765c = 0L;
        float f11 = this.e;
        if (f11 == 1.0f) {
            this.f19764b = true;
        } else if (f11 == 0.0f) {
            this.f19764b = false;
        }
        this.f19765c = 0L;
        if (z4) {
            if (f11 < f10) {
                this.f19766f = (int) (f11 * this.f19770k);
            } else {
                this.f19766f = (int) ((1.0f - f11) * this.f19770k);
            }
            this.f19765c = System.currentTimeMillis();
            this.d = f10;
        } else {
            this.e = f10;
            this.d = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        if (this.e != this.d) {
            if (this.f19765c != 0) {
                int currentTimeMillis = this.f19766f + ((int) (System.currentTimeMillis() - this.f19765c));
                this.f19766f = currentTimeMillis;
                float f10 = currentTimeMillis;
                float f11 = this.f19770k;
                if (f10 >= f11) {
                    this.e = this.d;
                } else {
                    float f12 = this.e;
                    float f13 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f12 < f13) {
                        this.e = decelerateInterpolator.getInterpolation(f10 / f11) * this.d;
                    } else {
                        this.e = 1.0f - decelerateInterpolator.getInterpolation(f10 / f11);
                    }
                }
            }
            this.f19765c = System.currentTimeMillis();
            invalidateSelf();
        }
        int d = i0.a.d(this.e, this.f19768i, this.f19769j);
        Paint paint = this.f19763a;
        paint.setColor(d);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i12 = this.f19771l;
        if (i12 != 0) {
            canvas.rotate(i12);
        }
        float f14 = this.e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (!this.f19767g) {
            float f15 = this.e;
            if (this.f19764b) {
                i11 = -225;
            } else {
                i11 = 135;
            }
            canvas.rotate(f15 * i11);
        } else {
            float f16 = this.e;
            if (this.f19764b) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate((f16 * i10) + 135.0f);
            f14 = 1.0f;
        }
        float f17 = 1.0f - f14;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f14)), 0.0f, AndroidUtilities.dp(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f17), 0.0f, paint);
        float dp = AndroidUtilities.dp(-0.25f);
        float dp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f14)) - ((paint.getStrokeWidth() / 4.0f) * f17);
        float dp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f14));
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
        this.f19763a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f19763a.setColorFilter(colorFilter);
    }
}
