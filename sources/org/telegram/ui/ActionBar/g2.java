package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class g2 extends Drawable {
    public final Paint f20636a;
    public boolean f20637b;
    public long f20638c;
    public float d;
    public float f20639e;
    public int f20640f;
    public final boolean f20641g;
    public final DecelerateInterpolator h;
    public int f20642i;
    public int f20643j;
    public float f20644k;
    public int f20645l;

    public g2(boolean z10) {
        Paint paint = new Paint(1);
        this.f20636a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f20642i = -1;
        this.f20643j = -9079435;
        this.f20644k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.f20641g = z10;
    }

    public final void a(int i10) {
        this.f20642i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f20643j = i10;
        invalidateSelf();
    }

    public final void c(float f7, boolean z10) {
        this.f20638c = 0L;
        float f10 = this.f20639e;
        if (f10 == 1.0f) {
            this.f20637b = true;
        } else if (f10 == 0.0f) {
            this.f20637b = false;
        }
        this.f20638c = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20640f = (int) (f10 * this.f20644k);
            } else {
                this.f20640f = (int) ((1.0f - f10) * this.f20644k);
            }
            this.f20638c = System.currentTimeMillis();
            this.d = f7;
        } else {
            this.f20639e = f7;
            this.d = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        if (this.f20639e != this.d) {
            if (this.f20638c != 0) {
                int currentTimeMillis = this.f20640f + ((int) (System.currentTimeMillis() - this.f20638c));
                this.f20640f = currentTimeMillis;
                float f7 = currentTimeMillis;
                float f10 = this.f20644k;
                if (f7 >= f10) {
                    this.f20639e = this.d;
                } else {
                    int i12 = (this.f20639e > this.d ? 1 : (this.f20639e == this.d ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i12 < 0) {
                        this.f20639e = decelerateInterpolator.getInterpolation(f7 / f10) * this.d;
                    } else {
                        this.f20639e = 1.0f - decelerateInterpolator.getInterpolation(f7 / f10);
                    }
                }
            }
            this.f20638c = System.currentTimeMillis();
            invalidateSelf();
        }
        int d = i0.a.d(this.f20639e, this.f20642i, this.f20643j);
        Paint paint = this.f20636a;
        paint.setColor(d);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i13 = this.f20645l;
        if (i13 != 0) {
            canvas.rotate(i13);
        }
        float f11 = this.f20639e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (!this.f20641g) {
            float f12 = this.f20639e;
            if (this.f20637b) {
                i11 = -225;
            } else {
                i11 = 135;
            }
            canvas.rotate(f12 * i11);
        } else {
            float f13 = this.f20639e;
            if (this.f20637b) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate((f13 * i10) + 135.0f);
            f11 = 1.0f;
        }
        float f14 = 1.0f - f11;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f11)), 0.0f, AndroidUtilities.dp(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f14), 0.0f, paint);
        float dp = AndroidUtilities.dp(-0.25f);
        float dp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f11)) - ((paint.getStrokeWidth() / 4.0f) * f14);
        float dp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f11));
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
        this.f20636a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20636a.setColorFilter(colorFilter);
    }
}
